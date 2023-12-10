import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of b");
        int b = input.nextInt();
        System.out.println("Enter the value of h");
        int h = input.nextInt();
        double area;
        area = (b*h);
        System.out.println("Triangle : " + area);
    }
}
