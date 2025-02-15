import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your total income:");
        double income = sc.nextDouble();
        double tax = 0;

        if (income > 1000000) {
            tax += (income - 1000000) * 0.30; // 30% above 10L
            income = 1000000;
        }
        if (income > 500000) {
            tax += (income - 500000) * 0.20; // 20% between 5L-10L
            income = 500000;
        }
        if (income > 250000) {
            tax += (income - 250000) * 0.05; // 5% between 2.5L-5L
        }

        System.out.println("Income Tax to be paid: ₹" + tax);

        sc.close();
    }
}
