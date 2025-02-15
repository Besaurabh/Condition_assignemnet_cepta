import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for Hindi, English, Math, Physics, and Chemistry (out of 100 each):");
        int hindi = sc.nextInt();
        int english = sc.nextInt();
        int math = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();

        int totalMarks = hindi + english + math + physics + chemistry;
        double percentage = (totalMarks / 500.0) * 100;

        System.out.print("Grade: ");
        if (percentage >= 85) 
          System.out.println("Excellent");
        else if (percentage >= 70) 
          System.out.println("Very Good");
        else if (percentage >= 55) 
          System.out.println("Good");
        else if (percentage >= 40) 
          System.out.println("Poor");
        else System.out.println("Very Poor");

    }
}
