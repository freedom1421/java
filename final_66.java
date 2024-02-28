import java.util.Scanner;

public class final_66 {
    public static void main(String[] args) {
        int sum_score_student = 0, sum = 0;
        double grade_student = 0;
        Scanner input = new Scanner(System.in);
        int student_value;
        System.out.println("Program Calculater Grade Student");
        line();
        System.out.print("Please enter value of students: ");
        student_value = input.nextInt();
        int score_value[][] = new int[student_value][5];

        for (int i = 0; i < student_value; i++) {
            sum = 0;
            grade_student = 0;
            sum = for_loop_student(i, score_value, sum, input);
            grade_student = if_else_student_grade(sum, grade_student);
            System.out.println("Total score for Student " + (i + 1) + ": " + sum + " grade: " + grade_student);
        }
        display(sum_score_student, student_value, score_value);
        line();
        input.close();
    }

    public static int for_loop_student(int studentIndex, int score_value[][], int sum, Scanner input) {
        int score = 0, check = 0;
        line();
        System.out.println("Enter scores for Student " + (studentIndex + 1));
        while (check < 5) {
            switch (check) {
                case 0:
                    System.out.print("Work scores      : ");
                    break;
                case 1:
                    System.out.print("Reward scores    : ");
                    break;
                case 2:
                    System.out.print("Mid-term score   : ");
                    break;
                case 3:
                    System.out.print("Final-term score : ");
                    break;
                case 4:
                    System.out.print("Attitude score   : ");
                    break;
            }

            score = input.nextInt();
            if (score > 20) {
                System.out.println("Invalid score! Score should be less 20.");
            } else if (score < 0) {
                System.out.println("Invalid score! Score should be more 0.");
            } else {
                score_value[studentIndex][check] = score;
                sum += score;
                check++;
            }
        }
        line();
        return sum;
    }

    public static double if_else_student_grade(int sum, double grade_student) {
        if (sum >= 80) {
            grade_student = 4.0;
        } else if (sum >= 75) {
            grade_student = 3.5;
        } else if (sum >= 70) {
            grade_student = 3.0;
        } else if (sum >= 65) {
            grade_student = 2.5;
        } else if (sum >= 60) {
            grade_student = 2.0;
        } else if (sum >= 55) {
            grade_student = 1.5;
        } else if (sum >= 50) {
            grade_student = 1.0;
        } else {
            grade_student = 0;
        }
        return grade_student;
    }

    public static void display(int sum_score_student, int student_value, int score_value[][]) {
        line();
        System.out.println("\t\t   |Work\t|Reward\t\t|Mid-term\t|Final-term\t|Attitude\t|");
        for (int e = 0; e < student_value; e++) {
            double grade_student = 0;
            sum_score_student = 0;
            System.out.print("Score for Student " + (e + 1) + "|\t");
            for (int x = 0; x < 5; x++) {
                System.out.print(score_value[e][x] + "\t" + "|" + "\t");
                sum_score_student += score_value[e][x];
            }
            grade_student = if_else_student_grade(sum_score_student, grade_student);
            System.out.print("Total score: " + sum_score_student + " \t");
            System.out.println("Grade: " + grade_student);

        }

    }

    public static void line() {
        System.out.println("======================================");
    }
}
