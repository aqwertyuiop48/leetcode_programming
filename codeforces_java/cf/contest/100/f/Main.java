import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(Stream.generate(s::nextInt).limit(n).reduce(new long[]{1}, (p, a) -> IntStream.rangeClosed(0, p.length).mapToLong(i -> (i > 0 ? p[i - 1] : 0) + (i < p.length ? a * p[i] : 0)).toArray(), (x, y) -> x)).ifPresent(c -> System.out.print(IntStream.rangeClosed(0, n).map(i -> n - i).filter(d -> c[d] != 0).mapToObj(d -> (c[d] < 0 ? "-" : d == n ? "" : "+") + (d == 0 ? "" + Math.abs(c[d]) : (Math.abs(c[d]) == 1 ? "" : Math.abs(c[d]) + "*") + "X" + (d > 1 ? "^" + d : ""))).collect(Collectors.joining())))));
    }
}

