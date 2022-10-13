import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the second Number:");
        int number2 = sc.nextInt();
        System.out.println("Enter the operator:");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("sum: " + (number1 + number2));
                break;
            case '-':
                System.out.println("difference: " + (number1 - number2));
                break;
            case '*':
                System.out.println("product: " + (number1 * number2));
                break;
            case '/':
                System.out.println("division: " + (number1 / number2));
                break;
            case '%':
                System.out.println("remainder: " + (number1 % number2));
                break;
            default:
                System.out.println("Our Calculator is not advanced!");
        }
    }
}
