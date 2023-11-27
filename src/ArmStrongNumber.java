import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int originalNum, digit, cubeSum = 0,num;
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        originalNum = num;
        while (num != 0){
            digit = num % 10;
            cubeSum = cubeSum + digit*digit*digit;
            num = num/10;
        }
        if(cubeSum == originalNum){
            System.out.println("Given number is a armstrong number");
        }else
            System.out.println("Given number is not a armstrong number");


    }
}
