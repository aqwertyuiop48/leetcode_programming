import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.generate(s::nextInt).limit(n).toArray() instanceof int[] a
                && IntStream.range(0, n).filter(i -> a[i] != i + 1).toArray() instanceof int[] d
                && d.length > 0
                && IntStream.rangeClosed(d[0], d[d.length - 1]).allMatch(i -> a[d[0] + d[d.length - 1] - i] == i + 1)
                ? (d[0] + 1) + " " + (d[d.length - 1] + 1)
                : "0 0")));
    }
}




