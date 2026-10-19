import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer stz
            && IntStream.range(0, 3).map(i -> Integer.parseInt(stz.nextToken())).toArray() instanceof int[] hd
            && Integer.valueOf(hd[0]) instanceof Integer n && Long.valueOf(hd[1]) instanceof Long vx && Long.valueOf(hd[2]) instanceof Long vy
            && IntStream.range(0, n * n).map(i -> Integer.parseInt(stz.nextToken())).toArray() instanceof int[] h
            && IntStream.range(0, (n + 1) * (n + 1)).mapToLong(c -> (long) (c / (n + 1)) * vy - (long) (c % (n + 1)) * vx).sorted().distinct().toArray() instanceof long[] cs
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, cs.length - 1) * 2 - 1)) instanceof Integer S
            && new int[2 * S] instanceof int[] t && new int[2 * S] instanceof int[] m && new int[1] instanceof int[] hv
            && IntStream.range(S + cs.length - 1, 2 * S).allMatch(i -> (m[i] = Integer.MAX_VALUE) > 0)
            && IntStream.iterate(S - 1, i -> i > 0, i -> i - 1).allMatch(i -> (m[i] = Math.min(m[2 * i], m[2 * i + 1])) >= 0)
            && (IntPredicate) (x -> (t[x] = Math.max(t[x], hv[0])) >= 0 && (m[x] = Math.max(m[x], hv[0])) >= 0) instanceof IntPredicate ap
            && (IntPredicate) (x -> IntStream.iterate(x >> 1, i -> i > 0, i -> i >> 1).allMatch(i -> (m[i] = Math.max(t[i], Math.min(m[2 * i], m[2 * i + 1]))) >= 0)) instanceof IntPredicate rb
            && LongStream.range(0, (long) n * n).map(c -> ((((c / n) * 2 + 1) * vx + ((c % n) * 2 + 1) * vy + (1L << 40)) << 20) | c).sorted().toArray() instanceof long[] ord
            && new long[1] instanceof long[] total
            && Arrays.stream(ord).allMatch(code -> Integer.valueOf((int) (code & ((1L << 20) - 1))) instanceof Integer c
                && Integer.valueOf(c / n) instanceof Integer i && Integer.valueOf(c % n) instanceof Integer j
                && Long.valueOf((long) i * vy - (long) j * vx) instanceof Long base
                && Integer.valueOf(Arrays.binarySearch(cs, base + Math.min(0, vy) + Math.min(0, -vx)) + S) instanceof Integer L
                && Integer.valueOf(Arrays.binarySearch(cs, base + Math.max(0, vy) + Math.max(0, -vx)) + S) instanceof Integer R
                && (hv[0] = h[c]) >= 0
                && new int[]{L, R, Integer.MAX_VALUE, Integer.MAX_VALUE} instanceof int[] q
                && IntStream.iterate(0, z -> q[0] < q[1], z -> z + 1).allMatch(z -> ((q[0] & 1) == 0 || (q[2] = Math.min(q[2], m[q[0]++])) >= 0) && ((q[1] & 1) == 0 || (q[3] = Math.min(q[3], m[--q[1]])) >= 0)
                    && (q[0] >>= 1) >= 0 && (q[1] >>= 1) >= 0 && (q[2] = Math.max(q[2], t[Math.max(q[0] - 1, 0)])) >= 0 && (q[3] = Math.max(q[3], t[q[1]])) >= 0)
                && IntStream.iterate(Math.max(q[0] - 1, 0) >> 1, a -> a > 0, a -> a >> 1).allMatch(a -> (q[2] = Math.max(q[2], t[a])) >= 0)
                && IntStream.iterate(q[1] >> 1, a -> a > 0, a -> a >> 1).allMatch(a -> (q[3] = Math.max(q[3], t[a])) >= 0)
                && (total[0] += Math.max(0, h[c] - Math.min(q[2], q[3]))) >= 0
                && new int[]{L, R} instanceof int[] u
                && IntStream.iterate(0, z -> u[0] < u[1], z -> z + 1).allMatch(z -> ((u[0] & 1) == 0 || ap.test(u[0]++)) && ((u[1] & 1) == 0 || ap.test(--u[1])) && (u[0] >>= 1) >= 0 && (u[1] >>= 1) >= 0)
                && rb.test(L) && rb.test(R - 1))
            ? total[0] : "");
    }
}
