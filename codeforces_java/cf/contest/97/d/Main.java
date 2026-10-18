import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] h
            && IntStream.range(0, h[0]).mapToObj(i -> s.next()).collect(Collectors.joining()) instanceof String g
            && s.next() instanceof String cm
            && ((Function<IntPredicate, BigInteger>) cond ->
                new BigInteger(IntStream.range(0, h[0] * h[1]).mapToObj(k -> cond.test(h[0] * h[1] - 1 - k) ? "1" : "0")
                    .collect(Collectors.joining()), 2)) instanceof Function<IntPredicate, BigInteger> bm
            && IntStream.range(0, 4).mapToObj(d -> bm.apply(i ->
                g.charAt(i) != '#'
                && (d == 0 ? i >= h[1] && g.charAt(i - h[1]) != '#'
                    : d == 1 ? i / h[1] < h[0] - 1 && g.charAt(i + h[1]) != '#'
                    : d == 2 ? i % h[1] > 0 && g.charAt(i - 1) != '#'
                    : i % h[1] < h[1] - 1 && g.charAt(i + 1) != '#')))
                .toArray(BigInteger[]::new) instanceof BigInteger[] mk
            && new int[]{-h[1], h[1], -1, 1} instanceof int[] sh
            && BigInteger.ONE.shiftLeft(g.indexOf('E')) instanceof BigInteger ex
            && new BigInteger[]{bm.apply(i -> g.charAt(i) != '#')} instanceof BigInteger[] cur
            ? String.valueOf(IntStream.rangeClosed(0, cm.length()).filter(t ->
                (t == 0 || (cur[0] = cur[0].and(mk["UDLR".indexOf(cm.charAt(t - 1))]).shiftLeft(sh["UDLR".indexOf(cm.charAt(t - 1))])
                    .or(cur[0].andNot(mk["UDLR".indexOf(cm.charAt(t - 1))]))) != null)
                && cur[0].equals(ex)).findFirst().orElse(-1))
            : "");
    }
}




