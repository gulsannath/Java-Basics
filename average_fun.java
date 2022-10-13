import java.util.Scanner;
public class average_fun {

    public static float average(int a,int b,int c){
        float average = (float)(a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int num_1 = sc.nextInt();
        System.out.print("Enter the second Number:");
        int num_2 = sc.nextInt();
        System.out.print("Enter the third Number:");
        int num_3 = sc.nextInt();
        float avg = average(num_1, num_2, num_3);
        System.out.print("The average of three numbers is:"+avg);
    }
    
}
