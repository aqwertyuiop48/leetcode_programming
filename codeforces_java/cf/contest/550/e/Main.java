import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && ((java.util.function.Function<List<String>, String>) l -> l.subList(0, l.size() - 1).stream().map(x -> "(" + x + "->").collect(Collectors.joining()) + l.get(l.size() - 1) + ")".repeat(l.size() - 1)) instanceof java.util.function.Function<List<String>, String> chain
            ? a[n - 1] == 1 ? "NO" : n == 1 ? "YES\n0"
                : a[n - 2] == 1 ? "YES\n(" + chain.apply(IntStream.range(0, n - 1).mapToObj(i -> String.valueOf(a[i])).toList()) + ")->0"
                : IntStream.range(0, n - 2).filter(i -> a[i] == 0).findFirst() instanceof OptionalInt k && k.isPresent()
                    ? "YES\n(" + chain.apply(Stream.concat(IntStream.range(0, k.getAsInt()).mapToObj(i -> String.valueOf(a[i])),
                        Stream.of("(0->" + chain.apply(IntStream.range(k.getAsInt() + 1, n - 1).mapToObj(i -> String.valueOf(a[i])).toList()) + ")")).toList()) + ")->0" : "NO" : "");
    }
}
