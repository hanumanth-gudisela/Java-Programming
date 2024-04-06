package StaticExample;
// hthis is a demo to know initialization of static variables
public class StaticBlock {
    static int a =4;
    static int b;

    // static block will get executed exactly once, when the class is first loading for the first time
    static {
        System.out.println("I'm a static variable");
        b= a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+ " " +StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+ " " +StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+ " " +StaticBlock.b);

    }
}
