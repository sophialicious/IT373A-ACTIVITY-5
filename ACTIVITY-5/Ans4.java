import java.util.Scanner;

public class Ans4 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Is " + num1 + " even? " + isEven(num1));
        System.out.println("Is " + num2 + " even? " + isEven(num2));

        input.close();
    }
}
