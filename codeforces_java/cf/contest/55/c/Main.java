import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(m -> Optional.of(s.nextInt()).ifPresent(k ->
            System.out.println(IntStream.range(0, k).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()})
                .anyMatch(p -> Math.min(Math.min(p[0] - 1, n - p[0]), Math.min(p[1] - 1, m - p[1])) <= 4) ? "YES" : "NO")))));
    }
}




