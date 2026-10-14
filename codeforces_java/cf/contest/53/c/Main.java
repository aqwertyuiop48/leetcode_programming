import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(IntStream.range(0, n).map(i -> i % 2 == 0 ? i / 2 + 1 : n - i / 2).mapToObj(String::valueOf).collect(Collectors.joining(" ")))));
    }
}
