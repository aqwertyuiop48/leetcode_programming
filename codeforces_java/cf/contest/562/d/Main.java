import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 ? CompletableFuture.supplyAsync(() -> Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[r0.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] == 1 && (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer q && IntStream.rangeClosed(0, n + 1).toArray() instanceof int[] p && IntStream.rangeClosed(0, n + 1).toArray() instanceof int[] nx && IntStream.rangeClosed(0, n + 1).map(i -> 1).toArray() instanceof int[] sz && new StringBuilder() instanceof StringBuilder sb
            && new IntUnaryOperator[2] instanceof IntUnaryOperator[] f && (f[0] = x -> p[x] == x ? x : (p[x] = f[0].applyAsInt(p[x]))) != null && (f[1] = x -> nx[x] == x ? x : (nx[x] = f[1].applyAsInt(nx[x]))) != null
            && ((IntBinaryOperator) (a, b) -> f[0].applyAsInt(a) == f[0].applyAsInt(b) || (Integer) f[0].applyAsInt(a) instanceof Integer ra && (Integer) f[0].applyAsInt(b) instanceof Integer rb
                && (sz[ra] < sz[rb] ? (p[ra] = rb) + (sz[rb] += sz[ra]) > 0 : (p[rb] = ra) + (sz[ra] += sz[rb]) > 0) ? 1 : 0) instanceof IntBinaryOperator union
            && IntStream.range(0, q).allMatch(z -> (Integer) v[2 + 3 * z] instanceof Integer t && (Integer) v[3 + 3 * z] instanceof Integer x && (Integer) v[4 + 3 * z] instanceof Integer y
                && (t == 1 ? union.applyAsInt(x, y) >= 0
                    : t == 2 ? IntStream.iterate(f[1].applyAsInt(x), i -> i < y, i -> f[1].applyAsInt(i + 1)).filter(i -> union.applyAsInt(i, i + 1) >= 0 && (nx[i] = i + 1) > 0).count() >= 0
                    : sb.append(f[0].applyAsInt(x) == f[0].applyAsInt(y) ? "YES\n" : "NO\n") != null))
            ? sb.toString().trim() : "", r -> new Thread(null, r, "t", 1L << 28).start()).join() : "");
    }
}
