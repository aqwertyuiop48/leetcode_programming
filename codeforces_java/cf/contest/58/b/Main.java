import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).ifPresent(n -> System.out.println(
            Stream.concat(
                Stream.iterate(n, x -> x > 1, x -> x / IntStream.rangeClosed(2, x).filter(d -> x % d == 0).findFirst().getAsInt()),
                Stream.of(1)).map(String::valueOf).collect(Collectors.joining(" "))));
    }
}


