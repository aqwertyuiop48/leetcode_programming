import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.of(a).max().getAsInt() - IntStream.of(a).min().getAsInt() > k ? "NO"
                : "YES\n" + IntStream.of(a).mapToObj(x -> IntStream.range(0, x).mapToObj(j -> String.valueOf(j % k + 1)).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
            : "");
    }
}
