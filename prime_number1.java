import java.util.Scanner;
public class prime_number1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = sc.nextInt();
        boolean isprime = true;
        
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number % i == 0){
                isprime = false;
                break;
            }
        }
        if(isprime == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not-Prime");
        }
    }
}
