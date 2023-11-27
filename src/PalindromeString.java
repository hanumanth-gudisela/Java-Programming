import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        String reverse ="";
        System.out.println("Enter the String : ");
        str = input.nextLine();
        for ( int i = str.length() - 1; i >= 0; i-- )
            reverse = reverse + str.charAt(i);
        if (str.equalsIgnoreCase(reverse))
            System.out.println("Given string is a palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}
