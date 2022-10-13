import java.util.Scanner;
public class Binary_To_Decimal {

    public static void binaryToDecimalConverter(int binary){
        int myNum = binary;
        int pow = 0;
        int decimal = 0;
        while(binary > 0){
            int lastdigit = binary%10;
            decimal += (lastdigit * (int)Math.pow(2,pow));
            binary /= 10;
            pow++;
        }
        System.out.print("The equivalent decimal number of "+myNum+" is:"+decimal);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Bianry Number:");
        int binary_number = sc.nextInt();
        binaryToDecimalConverter(binary_number);
    }
    
}
