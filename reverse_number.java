import java.util.Scanner;
public class reverse_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // for(;number>0;){
        //     int rem = number % 10;
        //     System.out.print(rem);
        //     number = number / 10;
        // }
        while(number > 0){
            int lastdigit = number%10;
            System.out.print(lastdigit);
            number /= 10;
        }
    }
}
