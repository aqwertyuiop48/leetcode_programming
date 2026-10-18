import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> names && new int[n] instanceof int[] conf && IntStream.range(0, m).allMatch(i -> (Integer) names.indexOf(s.next()) instanceof Integer a && (Integer) names.indexOf(s.next()) instanceof Integer b && (conf[a] |= 1 << b) > 0 && (conf[b] |= 1 << a) > 0) && IntStream.range(0, 1 << n).filter(mask -> IntStream.range(0, n).allMatch(i -> (mask >> i & 1) == 0 || (conf[i] & mask) == 0)).boxed().reduce((p, q) -> Integer.bitCount(q) > Integer.bitCount(p) ? q : p).get() instanceof Integer best ? Integer.bitCount(best) + "\n" + IntStream.range(0, n).filter(i -> (best >> i & 1) == 1).mapToObj(names::get).sorted().collect(Collectors.joining("\n")) : "").ifPresent(System.out::println);
    }
}
