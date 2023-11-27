import java.util.Scanner;

public class RupeesIntoDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rupees : ");
         long rupees = input.nextLong();
         float USD = rupees/81;
         System.out.println(USD);
    }
}
