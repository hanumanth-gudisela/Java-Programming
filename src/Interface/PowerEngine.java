package Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start PowerEngine");
    }

    @Override
    public void stop() {
        System.out.println("I stop PowerEngine");

    }

    @Override
    public void acc() {
        System.out.println("I accelerated PowerEngine");

    }
}
