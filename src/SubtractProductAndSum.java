import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :: ");
        int num = input.nextInt();
        int difference;
         int  product =1;
         int sum =0;
         while (num>0) {
             product *= num % 10;
             sum += num%10;
             num = num/10;
         }
         difference = product-sum;
        System.out.println("print difference Subtract Product " +difference);
    }
}
