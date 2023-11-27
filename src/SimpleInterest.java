import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        Double principal = input.nextDouble();
        System.out.println("Enter the rate Amount: ");
        Double rate = input.nextDouble();
        System.out.println("Enter the time Amount: ");
        Double time = input.nextDouble();

        Double simpleInterest =(principal * rate * time)/100;
        System.out.println("For the given amount this is the interest: " + simpleInterest);
    }
}
