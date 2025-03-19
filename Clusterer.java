import java.io.*;
import java.util.*;

public class Clusterer{

    public static void cluster_cost(int k, double[][] distances) {
        int n = distances.length;
    
        // Initialize each item to its own cluster
        List<Set<Integer>> clusters = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> cluster = new HashSet<>();
            cluster.add(i);
            clusters.add(cluster);
        }
    
        // Merge clusters until we have k clusters
        while (clusters.size() > k) {
            // Find the closest pair of clusters
            double minDist = Double.POSITIVE_INFINITY;
            int mergeIdx1 = 0;
            int mergeIdx2 = 0;
            for (int i = 0; i < clusters.size(); i++) {
                for (int j = i + 1; j < clusters.size(); j++) {
                    double dist = closestPairDistance(clusters.get(i), clusters.get(j), distances);
                    if (dist < minDist) {
                        minDist = dist;
                        mergeIdx1 = i;
                        mergeIdx2 = j;
                    }
                }
            }
    
            // Merge the closest pair of clusters
            Set<Integer> mergedCluster = new HashSet<>();
            mergedCluster.addAll(clusters.get(mergeIdx1));
            mergedCluster.addAll(clusters.get(mergeIdx2));
            clusters.remove(mergeIdx2);
            clusters.set(mergeIdx1, mergedCluster);
        }
    
        // Calculate the cost of the clustering
        double cost = Double.POSITIVE_INFINITY;
        for (int i = 0; i < clusters.size(); i++) {
            for (int j = i + 1; j < clusters.size(); j++) {
                double dist = closestPairDistance(clusters.get(i), clusters.get(j), distances);
                if (dist < cost) {
                    cost = dist;
                }
            }
        }
    
        System.out.println(cost);
    }
    
    private static double closestPairDistance(Set<Integer> cluster1, Set<Integer> cluster2, double[][] distances) {
        double minDist = Double.POSITIVE_INFINITY;
        for (int i : cluster1) {
            for (int j : cluster2) {
                if (distances[i][j] < minDist) {
                    minDist = distances[i][j];
                }
            }
        }
        return minDist;
    }
}

class Pair implements Comparable<Pair>{
    public double weight;
    public int node;
    public Pair(int n, double w) {
        weight = w;
        node = n;
    }

    public boolean equals(Pair other){
        return (this.weight == other.weight) && (this.node == other.node);
    }

    public int hashCode(){
        return this.node ^ (int)this.weight;
    }

    public int compareTo(Pair other){
        if (this.weight != other.weight){
            return (int)(this.weight - other.weight);
        }
        return this.node - other.node;
    }

    public String toString(){
        return "(" + this.node + "," + this.weight + ")";
    }
}

