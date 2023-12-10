import java.util.Scanner;

public class PrintSumOfAllNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            System.out.print("Enter an Integer Value: ");
            num = input.nextInt();
            System.out.print("Enter 0 to end the loop: ");
            sum = sum+num;
        }while (num>0);
        System.out.print(sum);

    }
}
