import java.util.Scanner;

public class sum_even_sum_odd {
    public static void main(String args[]) {
        int sum_even = 0;
        int sum_odd = 0;
        System.out.print("Enter the Range you want to find the sum:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the value" + "-" + i + ":");
            int val = sc.nextInt();
            if (val % 2 == 0) {
                sum_even += val;
            }
            if (val % 2 != 0) {
                sum_odd += val;
            }
        }
        System.out.println("The sum of all even numbers entered is:" + sum_even);
        System.out.println("The sum of all odd numbers entered is:" + sum_odd);
    }
}