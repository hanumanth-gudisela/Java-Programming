import java.util.stream.IntStream;

public class Example3 {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .filter(i -> {
                    System.out.println("1");
                    return i % 2 == 0;
                })

                .filter(i->{
                    System.out.println("0");
                    return i>3;
                })
                .limit(1)
                .forEach(i->{
                    System.out.println(i);
                });

    }
}
