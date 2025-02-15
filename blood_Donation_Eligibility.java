import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You must be at least 18 years old to donate blood.");
        } else {
            System.out.println("Enter your weight (in kg):");
            double weight = sc.nextDouble();

            if (weight < 50.0) {
                System.out.println("You must weigh at least 50 kilograms to donate blood.");
            } else {
                System.out.println("You are eligible to donate blood.");
            }
        }

        sc.close();
    }
}
