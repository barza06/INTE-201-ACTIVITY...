import java.util.Arrays; 
/*
*
@Author: Jheric S. Barza
*
*
*/
public class Main {
    public static void main(String[] args) {

        // Original grades
        int[] scores = {81, 85, 88, 90, 94, 75, 96, 72, 98};
        int target = 98;

        /* ================ Linear Search For The Target Value ================ */
        int found = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            System.out.println("Target value " + target + " found at index: " + found);
        } else {
            System.out.println("Target value " + target + " was not found in the array.");
        }

        /* ================ Sort a COPY of the Array using Arrays.sort ================ */
        
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        // Print both the original and sorted versions
        System.out.println("\nOriginal Array:       " + Arrays.toString(scores));
        System.out.println("Sorted Copy of Array: " + Arrays.toString(sortedScores));

        /*
         * Why does sorting a copy rather than the original matter?
         * Kasi if we had already performed a linear search, sorting the original array in place would shuffle all the elements around. If other parts of the program rely on the original sequence or index mapping, changing it directly could  cause unexpected bugs or alter the data
         */
    }
}
