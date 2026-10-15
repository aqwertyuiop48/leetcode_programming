import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).ifPresent(n -> System.out.println(LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b)));
    }
}


