import java.util.Scanner;

public class RectangleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of length :: ");
        int length = input.nextInt();
        System.out.println("Enter the value of width :: ");
        int width = input.nextInt();
        int area;
        area = (length*width);
        System.out.println("print the value of area:" +area);
    }
}
