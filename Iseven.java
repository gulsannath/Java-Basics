import java.util.Scanner;
public class Iseven {

    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check even or not:");
        int number = sc.nextInt();
        System.out.print("is even:"+isEven(number));
    }
}
