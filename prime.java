import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        if(n==2){
            System.out.println("prime");
        }else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    }
}
