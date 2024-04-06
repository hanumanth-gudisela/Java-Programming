package AbstractClasses;

public abstract class Parent {

    int age;

    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("I'm a normal method");
    }
    abstract void career();
}
