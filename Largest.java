import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int largest = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        System.out.println("Largest number: " + largest);

        sc.close();
    }
}
