import java.util.Scanner;
public class prime_number_range {
    public static void primeRange(int n){
        int count = 0;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
            count = 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range upto which you want to print the prime numbers:");
        int range = sc.nextInt();
        primeRange(range);
    }
}
