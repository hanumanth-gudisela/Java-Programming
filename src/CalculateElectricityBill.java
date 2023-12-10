import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a units :: ");
        int units = input.nextInt();
        double billpay=0;

        if (units<=100){
            billpay = units*10;
            System.out.println("Total Electricity bill " + billpay);
        }
        else if (units<=200){
            billpay = 100*10+(units-100)*15;
            System.out.println("Total Electricity bill " + billpay);
        }
        else if (units<=300){
            billpay=(100*10)+(100*15)+(units-200)*20;
            System.out.println("Total Electricity bill " + billpay);
        }
        else if (units>300){
            billpay=(100*10)+(100*15)+(100*20)+(units-300)*25;
            System.out.println("Total Electricity bill " + billpay);
        }
        else
            System.out.println("None of the above");

    }
}
