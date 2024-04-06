package ExceptionHandling;

public class Demo2 {

    public static void main(String[] args) {
        int a = 3;
        int b = 1;

        try {
            int c= a/b;
           // System.gc();
             } catch (ArithmeticException e) {
            System.out.println("exited" +e);
        }
        finally {
            System.out.println("Always executes");
        }
    }
}
