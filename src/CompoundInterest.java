import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        Double principal = input.nextDouble();
        System.out.println("Enter the rate Amount: ");
        Double rate = input.nextDouble();
        System.out.println("Enter the time Amount: ");
        Double time = input.nextDouble();
        System.out.println("Enter number of times interest is compounded: ");
        int number = input.nextInt();
        double compountInterest = principal * (Math.pow((1 + rate / 100), (number * time))) - principal;

        // Double simpleInterest =(principal * rate * time)/100;
       // System.out.println("For the given amount this is the compountInterest: " + compountInterest);
        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Number of Time interest Compounded: " + number);
        System.out.println("Compound Interest: " + compountInterest);
    }
}
