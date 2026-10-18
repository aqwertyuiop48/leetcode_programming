import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            ? IntStream.range(0, n * m)
                .filter(p -> IntStream.range(0, m).filter(j -> g[p / m].charAt(j) == g[p / m].charAt(p % m)).count() == 1
                    && IntStream.range(0, n).filter(i -> g[i].charAt(p % m) == g[p / m].charAt(p % m)).count() == 1)
                .mapToObj(p -> String.valueOf(g[p / m].charAt(p % m)))
                .collect(Collectors.joining())
            : ""));
    }
}




