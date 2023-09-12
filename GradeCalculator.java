import java.util.Scanner;

public class GradeCalculator {
    public static void totalMarks() {

        Scanner sc = new Scanner(System.in);

        int m, p, c, b, e, total = 0, avg;

        char grade = ' ';

        String txt = "";

        System.out.println("Enter marks for Maths");
        m = sc.nextInt();
        System.out.println("Enter marks for Physics");
        p = sc.nextInt();
        System.out.println("Enter marks for Chemistry");
        c = sc.nextInt();
        System.out.println("Enter marks for Biology");
        b = sc.nextInt();
        System.out.println("Enter marks for English");
        e = sc.nextInt();
        total = m + p + c + b + e;
        avg = total / 5;

        // calculating grade
        if (avg > 90) {
            grade = 'O';
        } else if (avg >= 81 && avg < 91) {
            grade = 'A';
        } else if (avg >= 71 && avg < 81) {
            grade = 'B';
        } else if (avg >= 61 && avg < 71) {
            grade = 'C';
        } else if (avg >= 51 && avg < 61) {
            grade = 'D';
        } else if (avg >= 40 && avg < 51) {
            grade = 'E';
        } else if (avg < 40) {
            grade = 'F';
        }

        switch (grade) {
            case 'O':
                txt = "Outstanding";
                System.out.println("-------------------------");
                System.out.println(txt + "\nTotal Marks: " + total + "\nAverage Percentage: " + avg + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");

                break;
            case 'A':
                txt = "Fabulous";
                System.out.println("-------------------------");
                System.out.println(txt + "\nTotal Marks: " + total + "\nAverage Percentage: " + avg + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");

                break;
            case 'B':
                txt = "Better";
                System.out.println("-------------------------");
                System.out.println(txt + "\nTotal Marks: " + total + "\nAverage Percentage: " + avg + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'C':
                txt = "Can do better";
                System.out.println("-------------------------");
                System.out.println(txt + "\nTotal Marks: " + total + "\nAverage Percentage: " + avg + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'D':
                txt = "Need to Study hard";
                System.out.println("-------------------------");
                System.out.println(txt + "\nTotal Marks: " + total + "\nAverage Percentage: " + avg + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'E':
                txt = "Very poor marks ";
                System.out.println("-------------------------");
                System.out.println(txt + "\nTotal Marks: " + total + "\nAverage Percentage: " + avg + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'F':
                txt = "You have failed this exam";
                System.out.println("-------------------------");
                System.out.println(txt + "\nTotal Marks: " + total + "\nAverage Percentage: " + avg + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            default:
                System.out.println(txt);
        }
    }

    public static void main(String[] args) {
        totalMarks();
    }


}
