import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.generate(s::nextInt).limit(n).toArray() instanceof int[] a
            && Long.valueOf(IntStream.of(a).asLongStream().sum()) instanceof Long t
            && IntStream.range(0, n).filter(i -> (long) a[i] * n == t).map(i -> i + 1).toArray() instanceof int[] r
            ? r.length + "\n" + Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}

