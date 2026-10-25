public class Main {
    public static void main(String[] args) {
        // Declare an int array of at  8 student scores
        int[] scores = {81, 85, 88, 90, 94, 75, 96, 72, 98};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // computing the sum, highest, and lowest score
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        double average = (double) sum / scores.length;

        // Printing the output
        System.out.println("==== Class Statistics ===");
        System.out.println("Sum:    " + sum);
        System.out.println("Average:  " + average);
        System.out.println("Highest:  " + highest);
        System.out.println("Lowest:   " + lowest);
    }
}
