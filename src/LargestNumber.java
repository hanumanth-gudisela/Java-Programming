import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = input.nextInt();

        if (num1>num2){
            System.out.println("Given number is Largest number");
        }else{
            System.out.println("Given number is not Largest number");

        }
    }
}
