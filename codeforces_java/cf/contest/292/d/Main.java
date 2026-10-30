import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && new int[m + 2][] instanceof int[][] pre && new int[m + 2][] instanceof int[][] suf
            && ((BiFunction<int[], Integer, int[]>) (prev, e) -> Integer.valueOf(prev[v[2 + 2 * e] - 1]) instanceof Integer a && Integer.valueOf(prev[v[3 + 2 * e] - 1]) instanceof Integer b
                ? a.equals(b) ? prev : prev.clone() instanceof int[] c && IntStream.range(0, n).allMatch(u -> c[u] != b.intValue() || (c[u] = a) >= 0) ? c : null : null) instanceof BiFunction<int[], Integer, int[]> mg
            && (pre[0] = IntStream.range(0, n).toArray()) != null && (suf[m + 1] = pre[0]) != null
            && IntStream.rangeClosed(1, m).allMatch(i -> (pre[i] = mg.apply(pre[i - 1], i - 1)) != null)
            && IntStream.iterate(m, i -> i >= 1, i -> i - 1).allMatch(i -> (suf[i] = mg.apply(suf[i + 1], i - 1)) != null)
            && Integer.valueOf(v[2 + 2 * m]) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(v[3 + 2 * m + 2 * i]) instanceof Integer l && Integer.valueOf(v[4 + 2 * m + 2 * i]) instanceof Integer r && pre[l - 1].clone() instanceof int[] p
                && suf[r + 1] instanceof int[] sf && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
                && fr.compareAndSet(null, x -> p[x] == x ? x : (p[x] = fr.get().applyAsInt(p[x]))) && fr.get() instanceof IntUnaryOperator find
                && IntStream.range(0, n).allMatch(u -> sf[u] == u || (p[find.applyAsInt(u)] = find.applyAsInt(sf[u])) >= 0)
                ? "" + IntStream.range(0, n).filter(u -> p[u] == u).count() : "").collect(Collectors.joining("\n")) : "");
    }
}
