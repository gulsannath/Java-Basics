import java.util.Scanner;
public class Prime_Range_Optimized {

    public static boolean isPrime(int number){
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range upto which you want to find Prime numbers:");
        int range = sc.nextInt();
        primeInRange(range);
    }
}
