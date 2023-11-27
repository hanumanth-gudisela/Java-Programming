import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the FibonacciSeries number :");
        int number =input.nextInt();
        System.out.println("Fibonacci Numbers ... :");
        int num1=0;
        int num2 = 1;
        int num3 = 0;
        for (int i=1;i<=number;i++){
            System.out.println(num3);
            num1 =num2;
            num2 = num3;
            num3 = num1+num2;
        }

    }

}
