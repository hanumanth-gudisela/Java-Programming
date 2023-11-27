import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number ::");
        int num1 = input.nextInt();

        if (num1%2 == 0){
            System.out.println("Given number is Even");
        }else {
            System.out.println("Given number not an Even number");
        }
    }
}
