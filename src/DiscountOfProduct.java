import java.util.Scanner;

public class DiscountOfProduct {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Market Price is :: ");
        Double marketPrice = input.nextDouble();
        System.out.println("Enter the sellingPrice Price is :: ");
        Double sellingPrice = input.nextDouble();
        Double discount;
        discount= marketPrice-sellingPrice;
        System.out.println("Discount price of a product is :: " +discount);
        Double discountPercentage;
        discountPercentage= discount/marketPrice*100;
        System.out.println("Discount percentage of a product is :: " +discountPercentage);

    }
}
