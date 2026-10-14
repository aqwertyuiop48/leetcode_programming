import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                IntStream.range(0, 3).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
                && IntStream.range(0, 3).allMatch(r -> IntStream.range(0, 3).allMatch(c -> g[r].charAt(c) == g[2 - r].charAt(2 - c)))
                ? "YES"
                : "NO"));
    }
}

