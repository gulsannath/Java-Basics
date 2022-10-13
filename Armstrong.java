import java.util.Scanner;
public class Armstrong {

    public static boolean isArmstrong(int n){
        int lastDigit = 0;
        int count = 0;

        int temp = n;
        
        while(temp > 0){
            lastDigit = temp%10;
            count++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;
        while(temp > 0){
            lastDigit = temp%10;
            sum += Math.pow(lastDigit,count);
            temp /= 10;
        }

        if(sum == n){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check for Palindrome:");
        int n = sc.nextInt();
        System.out.print(isArmstrong(n));
    }
}
