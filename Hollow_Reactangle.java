import java.util.Scanner;
public class Hollow_Reactangle {

    public static void hollowRectangle(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || j==1 || i==row || j==col){
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
        System.out.print("Enter the no. of Columns:");
        int columns = sc.nextInt();
        hollowRectangle(rows,columns);
    }
}
