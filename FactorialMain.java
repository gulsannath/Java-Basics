import java.util.Scanner;

class FactorialMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the factorial:");
        int number = sc.nextInt();
        factorial o1 = new factorial();
        int ans = o1.fact(number);
        System.out.print("The factorial of "+number+" is:"+ans);
    }
}

class factorial {
    public int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
