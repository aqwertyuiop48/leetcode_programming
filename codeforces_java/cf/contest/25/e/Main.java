import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Stream.of(s.next(), s.next(), s.next()).toList() instanceof List<String> t
            && ((Function<String, int[]>) x -> x.toCharArray() instanceof char[] c
                && new int[c.length] instanceof int[] pi
                && IntStream.range(1, c.length).allMatch(i -> (pi[i] = Optional.of(IntStream.iterate(pi[i - 1], j -> j > 0 && c[i] != c[j], j -> pi[j - 1]).boxed().reduce((p, q) -> q).map(j -> pi[j - 1]).orElse(pi[i - 1]))
                    .map(q -> q + (c[i] == c[q] ? 1 : 0)).get()) >= 0)
                ? pi : null) instanceof Function<String, int[]> pf
            && ((BinaryOperator<String>) (a, b) -> IntStream.of(pf.apply(b + "\u0001" + a)).max().getAsInt() >= b.length() ? a
                : IntStream.of(pf.apply(a + "\u0001" + b)).max().getAsInt() >= a.length() ? b
                : a + b.substring(pf.apply(b + "\u0001" + a)[a.length() + b.length()])) instanceof BinaryOperator<String> m
            ? Stream.of(new int[]{0, 1, 2}, new int[]{0, 2, 1}, new int[]{1, 0, 2}, new int[]{1, 2, 0}, new int[]{2, 0, 1}, new int[]{2, 1, 0})
                .mapToInt(q -> m.apply(m.apply(t.get(q[0]), t.get(q[1])), t.get(q[2])).length()).min().getAsInt()
            : 0));
    }
}
