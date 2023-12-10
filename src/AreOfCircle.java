import java.util.Scanner;

public class AreOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a number :: ");
        int radius = input.nextInt();
        Double area;
        area = (radius * radius)*Math.PI;
        System.out.println("Area of a circle is" + area);
    }
}
