import java.util.Scanner;

public class PrintLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, max=0;
        System.out.println("Enter a number :: ");
        num = input.nextInt();
        while (num !=0) {
            System.out.println("Enter a number :: ");
            num = input.nextInt();
            System.out.println("End a loop with o");
            if (num > max) {
                max = num;
            }
            System.out.print("The largest number entered by the user is: " +max);
        }

        }
}
