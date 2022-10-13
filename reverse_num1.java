import java.util.Scanner;
public class reverse_num1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int number = sc.nextInt();
        int rev = 0;

        while(number > 0){
            int last_digit = number % 10;
            rev = (rev*10) + last_digit;
            number /= 10;
        }
        System.out.println("The reverse of the given number is:"+rev);
    }
}
