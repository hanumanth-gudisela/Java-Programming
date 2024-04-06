package Interface;

public class CDPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("start music");
    }

    @Override
    public void stop() {
        System.out.println("stop music");

    }
}
