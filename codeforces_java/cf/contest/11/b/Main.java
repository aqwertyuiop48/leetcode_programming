import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(Math.abs(s.nextLong())).ifPresent(x ->
            System.out.println(
                Stream.iterate(0L, n -> true, n -> n + 1)
                    .filter(n -> n * (n + 1) / 2 >= x && (n * (n + 1) / 2 - x) % 2 == 0)
                    .findFirst()
                    .orElse(0L))));
    }
}



