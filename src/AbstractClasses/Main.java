package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Parent obj = new Son(32);
        obj.career();
        Parent.hello();
        obj.normal();
    }
}
