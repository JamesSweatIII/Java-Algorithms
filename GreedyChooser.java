import java.io.*;
import java.util.*;

public class GreedyChooser{

    public static int deadlines(ArrayList<Pair> input_list){
        // input: a list of pairs or doubles (completion time, due time)
        // output: index of the assignment to complete first
        int earliest_deadline_idx = 0;
        double earliest_deadline = Double.POSITIVE_INFINITY;
        for (int i = 0; i < input_list.size(); i++) {
            Pair task = input_list.get(i);
            double completion_time = task.first;
            double due_time = task.second;
            double deadline = due_time - completion_time;
            if (deadline < earliest_deadline) {
                earliest_deadline_idx = i;
                earliest_deadline = deadline;
            }
        }
        return earliest_deadline_idx;
    }

    public static int bakeoff(ArrayList<Pair> input_list) {
        // input: a list of pairs or floats (active time, passive time)
        // output: index of the component to make first
        int first_item_idx = 0;
        double fastest_component_time = 0;
        for (int i = 0; i < input_list.size(); i++) {
            Pair component = input_list.get(i);
            double active_time = component.first;
            double passive_time = component.second;
            double total_time = passive_time  / active_time;

            if (total_time > fastest_component_time) {
                first_item_idx = i;
                fastest_component_time = total_time;
            }
        }
        return first_item_idx;
    }
    
    
    
    
    
    

    public static int mileage(ArrayList<Pair> input_list){
        // input: a list of pairs or doubles (mpg, miles)
        // output: index of the car to deliver first
        int most_efficient_idx = 0;
        double most_efficient_mpg = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < input_list.size(); i++) {
            Pair car = input_list.get(i);
            double mpg = car.first;
            double miles = car.second;
            double efficiency = miles / mpg;
            if (efficiency > most_efficient_mpg) {
                most_efficient_idx = i;
                most_efficient_mpg = efficiency;
            }
        }
        return most_efficient_idx;
    }
}

