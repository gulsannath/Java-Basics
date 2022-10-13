import java.util.Scanner;
public class Decimal_To_Binary {

    public static void decimalToBinary(int decimal){
        int myNum = decimal;
        int binary = 0;
        int pow = 0;
        while(decimal > 0){
            int rem = decimal%2;
            binary += (rem * (int)Math.pow(10,pow));

            decimal /= 2;
            pow++;
        }
        System.out.print("The binary equivalent of "+myNum+" is:"+binary);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal Number for which you want to find the bianry equivalent:");
        int decimal_number = sc.nextInt();
        decimalToBinary(decimal_number);
    }
}
