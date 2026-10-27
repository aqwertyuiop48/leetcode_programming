import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Stream.of(s.next(), s.next(), s.next()).toList() instanceof List<String> t
            && ((Function<String, int[]>) x -> x.getBytes() instanceof byte[] c
                && new int[c.length] instanceof int[] pi
                && new int[]{1, 0} instanceof int[] st
                && IntStream.range(0, 2 * c.length + 2).allMatch(q ->
                    st[0] >= c.length
                    || (st[1] > 0 && c[st[0]] != c[st[1]]
                        ? (st[1] = pi[st[1] - 1]) >= 0
                        : (c[st[0]] != c[st[1]] || ++st[1] > 0) && (pi[st[0]] = st[1]) >= 0 && ++st[0] > 0))
                ? pi : null) instanceof Function<String, int[]> pf
            && ((BinaryOperator<String>) (a, b) -> pf.apply(b + "\u0001" + a) instanceof int[] p
                && IntStream.of(p).max().getAsInt() >= b.length() ? a
                : IntStream.of(pf.apply(a + "\u0001" + b)).max().getAsInt() >= a.length() ? b
                : a + b.substring(pf.apply(b + "\u0001" + a)[a.length() + b.length()])) instanceof BinaryOperator<String> m
            ? Stream.of(new int[]{0, 1, 2}, new int[]{0, 2, 1}, new int[]{1, 0, 2}, new int[]{1, 2, 0}, new int[]{2, 0, 1}, new int[]{2, 1, 0})
                .mapToInt(q -> m.apply(m.apply(t.get(q[0]), t.get(q[1])), t.get(q[2])).length()).min().getAsInt()
            : 0));
    }
}


