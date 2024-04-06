package Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.acc();
//        car.brake();
//        car.start();
//        car.stop();

//        MediaPlayer carMedia = new Car();
//        carMedia.stop();
        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startMusic();
        car1.upgradingEngine();
        car1.start();
    }
}
