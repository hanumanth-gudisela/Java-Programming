import java.util.Scanner;

public class SurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of area :: ");
        Double area = input.nextDouble();
        area = 6*(area*area);
        System.out.println("print the Surface Area Cube  :: " +area);
    }
}
