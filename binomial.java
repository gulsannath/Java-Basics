import java.util.Scanner;
public class binomial {
    public static int fact(int number){
        int f=1;
        for(int i=1;i<=number;i++){
            f *= i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of r:"); 
        int r = sc.nextInt();

        int binomial_coefficient = fact(n)/(fact(r)*fact(n-r));
        System.out.print("The binomial coefficient is:"+binomial_coefficient);
    }
}
