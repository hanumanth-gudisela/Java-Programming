package ExtendsDemo2;

public interface A {

    //static interface methods should always have abody
   // call via the interface name
    static void greeting(){
        System.out.println("i'm static");
    }
    default void fun(){
        System.out.println("Hi, I'm in A");
    }
}
