import java.util.Scanner;

public class AreOfIsocelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // using base and height (area = 1/2(b*h)
        System.out.println("Enter the value of base :: ");
        Double base = input.nextDouble();
        System.out.println("Enter the value of height :: ");
        Double height = input.nextDouble();
        Double area;
        area = 1*base*height/2;
        System.out.println("print the AreOfIsoscelesTriangle :: " +area);

        // using all three sides Area = ½[√(a2 − b2 ⁄4) × b] a is the measure of equal sides b is the base of triangle

    }
}
