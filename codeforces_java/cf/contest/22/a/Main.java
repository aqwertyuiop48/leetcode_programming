import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToLong(i -> s.nextLong()).sorted().distinct().toArray() instanceof long[] d
                && d.length >= 2
                ? String.valueOf(d[1])
                : "NO")));
    }
}

