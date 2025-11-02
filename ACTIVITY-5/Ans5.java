import java.util.Scanner;
public class Ans5 {
    public static void findTwoLargest(int a, int b, int c) {
        int firstMax, secondMax;

        if (a >= b && a >= c) {
            firstMax = a;
            secondMax = Math.max(b, c);
        } else if (b >= a && b >= c) {
            firstMax = b;
            secondMax = Math.max(a, c);
        } else {
            firstMax = c;
            secondMax = Math.max(a, b);
        }

        System.out.println("\nThe largest number is: " + firstMax);
        System.out.println("The largest number is: " + secondMax);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        findTwoLargest(num1, num2, num3);

        input.close();
    }
}
