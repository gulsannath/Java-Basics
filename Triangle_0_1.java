import java.util.Scanner;
public class Triangle_0_1 {

    public static void triangle01(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows:");
        int row = sc.nextInt();
        triangle01(row);
    }
    
}
