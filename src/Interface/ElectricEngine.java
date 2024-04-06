package Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start ElectricEngine");

    }

    @Override
    public void stop() {
        System.out.println("I stop ElectricEngine");

    }

    @Override
    public void acc() {
        System.out.println(" acc ElectricEngine");

    }
}
