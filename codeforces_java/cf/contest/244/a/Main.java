import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, k).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.rangeClosed(1, n * k).filter(x -> Arrays.stream(a).noneMatch(y -> y == x)).toArray() instanceof int[] rest
            ? IntStream.range(0, k).mapToObj(i -> IntStream.concat(IntStream.of(a[i]), Arrays.stream(rest, i * (n - 1), (i + 1) * (n - 1))).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
