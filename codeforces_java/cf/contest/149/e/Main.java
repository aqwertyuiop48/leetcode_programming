import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && new StringBuilder(s).reverse().toString() instanceof String sr && ((BiFunction<String, String, int[]>) (sx, px) -> Integer.valueOf(px.length()) instanceof Integer m && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> g && new int[m] instanceof int[] f && new int[1] instanceof int[] cur && IntStream.rangeClosed(0, m).map(q -> 1000000000).toArray() instanceof int[] e && g.compareAndSet(null, (k, c) -> k == m || (k > 0 && px.charAt(k) != c) ? g.get().applyAsInt(f[k - 1], c) : px.charAt(k) == c ? k + 1 : 0) && IntStream.range(1, m).allMatch(i -> (f[i] = g.get().applyAsInt(f[i - 1], px.charAt(i))) >= 0) && IntStream.range(0, sx.length()).allMatch(j -> (cur[0] = g.get().applyAsInt(cur[0], sx.charAt(j))) >= 0 && (e[cur[0]] = Math.min(e[cur[0]], j)) >= 0) && IntStream.iterate(m, k -> k >= 1, k -> k - 1).allMatch(k -> (e[f[k - 1]] = Math.min(e[f[k - 1]], e[k])) >= 0) ? e : null) instanceof BiFunction<String, String, int[]> fe && Integer.valueOf(sc.next()) instanceof Integer cnt ? Stream.generate(sc::next).limit(cnt).filter(p -> p.length() > 1 && fe.apply(s, p) instanceof int[] ef && fe.apply(sr, new StringBuilder(p).reverse().toString()) instanceof int[] er && IntStream.range(1, p.length()).anyMatch(i -> ef[i] < s.length() - 1 - er[p.length() - i])).count() : -1);
    }
}
