import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number :: ");
        int num = input.nextInt();
        for (int i=1; i<=num;i++){
            if (num%i==0){
                System.out.println("Print the factors of 60 are" + i);
            }
        }
    }
}
