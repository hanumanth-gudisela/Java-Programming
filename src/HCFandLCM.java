import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = 1;
        for (int i=1;i<=num1;i++){
            if (num1%i==0 && num2%i==0) //9%3 && 18%3
                gcd=i; //0
        }
        System.out.println(gcd);
    }
}
