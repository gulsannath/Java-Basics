import java.util.Scanner;
public class reverse_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int rev = 0;

        while(num > 0){
            int lastdigit = num%10;
            rev = (rev*10)+lastdigit;
            num /= 10;
        }
        System.out.print("The reverse of the given number is:"+rev);
    }
}
