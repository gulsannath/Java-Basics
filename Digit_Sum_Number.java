import java.util.Scanner;
public class Digit_Sum_Number {

    public static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum += rem;

            n /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to calculate its sum of digits:");
        int number = sc.nextInt();
        System.out.print("The sum of the digits of a Number is:"+digitSum(number));
    }
    
}
