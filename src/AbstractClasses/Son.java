package AbstractClasses;

public class Son extends Parent{
    public Son(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I'm going to be a doctor");
    }
}
