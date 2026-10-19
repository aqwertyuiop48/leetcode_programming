import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] g0
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf((int) g0[0]) instanceof Integer n
            && Long.valueOf(g0[1]) instanceof Long g
            && Long.valueOf(g0[2]) instanceof Long r
            && Long.valueOf(g + r) instanceof Long p
            && Long.valueOf(n + 1) instanceof Long inf
            && new long[n + 2] instanceof long[] d
            && IntStream.rangeClosed(0, n).allMatch(i -> (d[i + 1] = d[i] + g0[3 + i]) > 0)
            && new long[n + 1] instanceof long[] res
            && IntStream.rangeClosed(1, n).allMatch(i -> (res[i] = d[i] % p) >= 0)
            && Arrays.stream(res, 1, n + 1).sorted().distinct().toArray() instanceof long[] rs
            && Integer.valueOf(rs.length) instanceof Integer mm
            && new int[2 * mm] instanceof int[] tree
            && IntStream.range(0, 2 * mm).allMatch(i -> (tree[i] = n + 1) > 0)
            && (LongBinaryOperator) ((lo, hi) ->
                Integer.valueOf(Arrays.binarySearch(rs, lo)) instanceof Integer b1
                && Integer.valueOf(Arrays.binarySearch(rs, hi + 1)) instanceof Integer b2
                && Integer.valueOf(b1 < 0 ? -b1 - 1 : b1) instanceof Integer l
                && Integer.valueOf(b2 < 0 ? -b2 - 1 : b2) instanceof Integer r1
                && l < r1
                && new int[]{l + mm, r1 + mm, n + 1} instanceof int[] s
                && IntStream.range(0, 40).anyMatch(x ->
                    s[0] >= s[1]
                        || (((s[0] & 1) == 0 || (s[2] = Math.min(s[2], tree[s[0]++])) >= 0)
                            && ((s[1] & 1) == 0 || (s[2] = Math.min(s[2], tree[--s[1]])) >= 0)
                            && (s[0] >>= 1) >= 0
                            && (s[1] >>= 1) >= 0
                            && false))
                    ? (long) s[2] : (long) (n + 1)) instanceof LongBinaryOperator rq
            && (LongUnaryOperator) (a ->
                a + r - 1 < p
                    ? rq.applyAsLong(a, a + r - 1)
                    : Math.min(rq.applyAsLong(a, p - 1), rq.applyAsLong(0, a + r - 1 - p))) instanceof LongUnaryOperator cq
            && new long[n + 2] instanceof long[] f
            && IntStream.rangeClosed(1, n).map(i -> n + 1 - i).allMatch(j ->
                Integer.valueOf((int) cq.applyAsLong((res[j] + g) % p)) instanceof Integer nx
                && (f[j] = nx == n + 1 ? d[n + 1] - d[j] : ((d[nx] - d[j]) / p + 1) * p + f[nx]) >= 0
                && Integer.valueOf(Arrays.binarySearch(rs, res[j])) instanceof Integer rk
                && IntStream.iterate(rk + mm, i -> i >= 1, i -> i >> 1).allMatch(i -> (tree[i] = j) > 0))
            && Integer.valueOf((int) g0[4 + n]) instanceof Integer q
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).allMatch(z ->
                Long.valueOf(g0[5 + n + z]) instanceof Long t
                && Integer.valueOf((int) cq.applyAsLong(((g - t % p) % p + p) % p)) instanceof Integer k
                && sb.append(k == n + 1 ? t + d[n + 1] : ((t + d[k]) / p + 1) * p + f[k]).append('\n') != null)
            ? sb : "");
    }
}
