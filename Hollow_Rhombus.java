import java.util.Scanner;
public class Hollow_Rhombus {

    public static void hollowRhombus(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                if(i==1 || i==row || j==1 || j==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows:");
        int rows = sc.nextInt();
        hollowRhombus(rows);
    }
}
