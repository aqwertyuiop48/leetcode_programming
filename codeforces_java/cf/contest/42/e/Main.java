

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] tk
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf((int) tk[0]) instanceof Integer n
            && Integer.valueOf((int) tk[1]) instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> tk[4 + 3 * i] << 20 | i).sorted().toArray() instanceof long[] ks
            && IntStream.range(0, n).toArray() instanceof int[] p
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.generate(() -> Integer.MAX_VALUE).limit(n).toArray() instanceof int[] t
            && new long[m + 1] instanceof long[] ew
            && new long[2] instanceof long[] acc
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = x -> p[x] == x ? x : fh[0].applyAsInt(p[x])) instanceof IntUnaryOperator find
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] gh
            && (gh[0] = (a, b) -> a == b ? -1 : t[a] < t[b]
                    ? Math.max(t[a], gh[0].applyAsInt(p[a], b))
                    : Math.max(t[b], gh[0].applyAsInt(a, p[b]))) instanceof IntBinaryOperator g
            && LongStream.of(ks).allMatch(k ->
                Integer.valueOf((int) (k & 1048575L)) instanceof Integer i
                && Integer.valueOf(find.applyAsInt((int) tk[2 + 3 * i] - 1)) instanceof Integer ra
                && Integer.valueOf(find.applyAsInt((int) tk[3 + 3 * i] - 1)) instanceof Integer rb
                && ra - rb != 0
                && Integer.valueOf(sz[ra] < sz[rb] ? ra : rb) instanceof Integer lo
                && Integer.valueOf(sz[ra] < sz[rb] ? rb : ra) instanceof Integer hi
                && (p[lo] = hi) >= 0 && (t[lo] = (int) acc[1]) >= 0 && (ew[(int) acc[1]] = tk[4 + 3 * i]) >= 0
                && (sz[hi] += sz[lo]) > 0 && (acc[0] += tk[4 + 3 * i]) >= 0 && acc[1]++ >= 0 || true)
            && Integer.valueOf((int) tk[2 + 3 * m]) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(j ->
                Integer.valueOf((int) tk[3 + 3 * m + 2 * j] - 1) instanceof Integer a
                && Integer.valueOf((int) tk[4 + 3 * m + 2 * j] - 1) instanceof Integer b
                ? (n - acc[1] == 1
                    ? Integer.valueOf(g.applyAsInt(a, b)) instanceof Integer gi ? acc[0] - (gi < 0 ? 0L : ew[gi]) : 0L
                    : n - acc[1] == 2 && find.applyAsInt(a) != find.applyAsInt(b) ? acc[0] : -1L)
                : -1L).map(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}
