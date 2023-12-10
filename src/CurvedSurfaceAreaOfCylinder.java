import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radius :: ");
        int radius = input.nextInt();
        System.out.println("Enter the value of height :: ");
        int height = input.nextInt();
        Double area;
        area = 2*(Math.PI)*height*radius;
        System.out.println("Curved Surface Area Of Cylinder :: " +area);

    }
}
