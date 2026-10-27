import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).map(n -> IntStream.range(0, n).map(i -> s.nextInt() - 1).toArray()).ifPresent(p ->
                System.out.println(IntStream.range(0, p.length)
                    .map(i -> (int) Stream.iterate(i, v -> v >= 0, v -> p[v]).count())
                    .max().getAsInt())));
    }
}

