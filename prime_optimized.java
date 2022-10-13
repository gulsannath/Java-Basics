import java.util.Scanner;
public class prime_optimized {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for which you want to check prime:");
        int number = sc.nextInt();
        System.out.print(isPrime(number));
    }
}
