import java.util.Scanner;
public class palindrome_checking {
    public static int reverse(int num){
        int rev = 0 ;
        int rem = 0;

        while(num > 0){
            rem = num % 10;
            rev = (rev*10)+rem;

            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n){
        if(reverse(n) == n){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check for Palindrome or not:");
        int number = sc.nextInt();
        System.out.print("Is Palindrome:"+ isPalindrome(number));
    }
}
