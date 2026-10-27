import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(IntStream.range(1, n).mapToLong(k -> ((long) k * (k + 1) / 2) % n + 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")))));
    }
}





