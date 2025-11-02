import java.util.Scanner;
public class Ans3 {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("\nEnter first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        System.out.print("Enter third number: ");
        int n3 = input.nextInt();

        int result1 = multiply(num1, num2);
        System.out.println("\nMultiplication of two numbers: " + result1);

        int result2 = multiply(n1, n2, n3);
        System.out.println("Multiplication of three numbers: " + result2);

        input.close();
    }
}
