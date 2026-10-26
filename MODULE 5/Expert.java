public class Main {
/*
@Author: Jheric S. Barza
*/
    static class Student {
        String name;
        int[] quiz;
        double average;
// Student class holding a name and quiz scores
        public Student(String name, int[] quiz) {
            this.name = name;
            this.quiz = quiz;
            this.average = calculateAverage();
        }

        private double calculateAverage() {
            int sum = 0;
            for (int score : quiz) {
                sum += score;
            }
            return (double) sum / quiz.length;
        }
    }

    public static void main(String[] args) {
        System.out.println("==== CLASS RANKING SYSTEM ====");
//class ranking system name and scores
        String[] names = {"Mike", "Jheric", "Aldous", "Elgave", "Yo"};
        int[][] rawQuizData = {
            {86, 95, 89, 92},//Mike
            {80, 75, 90, 78},//Jheric
            {93, 92, 96, 99}, //Aldous
            {75, 90, 88, 92}, //Elgave
            {90, 75, 79, 88} //Yo
        };
 // Build an array of Student objects from raw data
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }
// Own sort algorithm to rank students by average (descending)
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
// Printing the leaderboard with proper tie handling
        System.out.println("\n ===== CLASS LEADERBOARD ====");
        System.out.printf("%-6s | %-14s | %-8s\n", "Rank", "Student Name", "Average");
        System.out.println("---------------------------------------");
// Handling if current average equals to the others students
        int displayRank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average == students[i - 1].average) {
            } else {
                displayRank = i + 1;
            }

            System.out.printf("%-6d | %-14s | %-8.2f\n", displayRank, students[i].name, students[i].average);
        }

        // Use custom linear search to find a student's rank by name
        String targetStudent = "Jheric";
        int found = findStudentRank(students, targetStudent);

        System.out.println("\n==== SEARCH RESULT ======");
            // Determine rank based on the highest grade
        if (found != -1) {
            System.out.println("Student '" + targetStudent + "' in Leaderboard Rank: " + found);
        } else {
            System.out.println("Student '" + targetStudent + "' was not found.");
        }
    }
//Printing the Ranking of the student based on the grades on quizzes
    public static int findStudentRank(Student[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {
                for (int j = 0; j <= i; j++) {
                    if (students[j].average == students[i].average) {
                        return j + 1;
                    }
                }
            }
        }
        return -1;//return
    }
}
