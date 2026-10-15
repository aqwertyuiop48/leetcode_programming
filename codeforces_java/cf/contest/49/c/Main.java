import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(n % 2 == 0
                ? IntStream.rangeClosed(1, n).map(i -> i % n + 1).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : IntStream.rangeClosed(1, n).map(i -> i == 1 ? 1 : i == n ? 2 : i + 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")))));
    }
}



