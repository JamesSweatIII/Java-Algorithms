import java.util.Arrays;

public class MedianFinder{
    
    public static double findMedian(Company company1, Company company2) {
      // Determine the size of each Company object.
    int size1 = company1.size;
    int size2 = company2.size;

    // If the size of the first Company object is greater than that of the second one, swap the companies.
    if (size1 > size2) {
        return findMedian(company2, company1);
    }

    // Initialize the left and right pointers for binary search.
    int leftPointer = 0;
    int rightPointer = size1;

    // Conduct binary search to find the median.
    while (leftPointer <= rightPointer) {
        // Calculate the middle index for the first array.
        int middleIndexOne = (leftPointer + rightPointer) / 2;
        // Calculate the corresponding middle index for the second array.
        int middleIndexTwo = (size1 + size2 + 1) / 2 - middleIndexOne;
        
        // Compute the median based on the current indices.
        double company1Left = (middleIndexOne == 0) ? Double.NEGATIVE_INFINITY : company1.request(middleIndexOne-1);
        double company1Right = (middleIndexOne == size1) ? Double.POSITIVE_INFINITY : company1.request(middleIndexOne);
        double company2Left = (middleIndexTwo == 0) ? Double.NEGATIVE_INFINITY : company2.request(middleIndexTwo-1);
        double company2Right = (middleIndexTwo == size2) ? Double.POSITIVE_INFINITY : company2.request(middleIndexTwo);


        // If we have found the correct partition, return the median.
        if (company1Left <= company2Right && company2Left <= company1Right) {
            if ((size1 + size2) % 2 == 0) {
                return (Math.max(company1Left, company2Left) + Math.min(company1Right, company2Right)) / 2;
            } else {
                return Math.max(company1Left, company2Left);
            }
        } 
        // If the partition is not correct, adjust the binary search range accordingly.
        else if (company1Left > company2Right) {
            rightPointer = middleIndexOne - 1;
        } else {
            leftPointer = middleIndexOne + 1;
        }
    }
    // If we reach here, it means the arrays are not sorted, so return -1.
    return -1;

    }
    

}
