import java.util.Scanner;
public class Inverted_Half_Pyramid {

    public static void invertedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows:");
        int row = sc.nextInt();
        invertedHalfPyramid(row);
    }
}
