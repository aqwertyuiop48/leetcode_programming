import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] a
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((a[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) (int) a[0] instanceof Integer n
            && (Integer) (int) a[1] instanceof Integer m
            && new int[n + 2] instanceof int[] head
            && IntStream.range(0, 2 * m).allMatch(k -> head[(int) a[4 + 3 * (k % m) + (k < m ? 0 : 1)]]++ >= 0)
            && IntStream.range(0, n).allMatch(v -> (head[v + 1] += head[v]) >= 0)
            && new int[2 * m] instanceof int[] to
            && new long[2 * m] instanceof long[] wt
            && IntStream.range(0, 2 * m).allMatch(k ->
                (Integer) ((int) a[4 + 3 * (k % m) + (k < m ? 0 : 1)] - 1) instanceof Integer f
                && (Integer) head[f]++ instanceof Integer pos
                && (to[pos] = (int) a[4 + 3 * (k % m) + (k < m ? 1 : 0)] - 1) >= 0
                && (wt[pos] = a[6 + 3 * (k % m)]) > 0)
            && IntStream.range(0, n).allMatch(i -> (head[n - i] = head[n - 1 - i]) >= 0)
            && (head[0] = 0) == 0
            && new long[n] instanceof long[] best
            && new long[n] instanceof long[] d
            && new boolean[n] instanceof boolean[] fin
            && IntStream.range(0, n).allMatch(i -> (best[i] = Long.MAX_VALUE / 2) > 0)
            && (best[(int) a[2] - 1] = 0) == 0
            && (IntStream.range(0, n).allMatch(round ->
                IntStream.range(0, n).filter(i -> !fin[i] && best[i] < Long.MAX_VALUE / 2).mapToLong(i -> (best[i] << 10) | i).min() instanceof OptionalLong mn
                && mn.isPresent()
                && (Integer) (int) (mn.getAsLong() & 1023) instanceof Integer u
                && (fin[u] = true)
                && IntStream.range(0, n).allMatch(i -> (d[i] = Long.MAX_VALUE / 2) > 0)
                && (d[u] = 0) == 0
                && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq
                && pq.add((long) u)
                && (IntStream.range(0, Integer.MAX_VALUE).allMatch(z ->
                    pq.poll() instanceof Long key
                    && (Integer) (int) (key & 1023) instanceof Integer x
                    && (Long) (key >> 10) instanceof Long dx
                    && (dx > d[x] || (IntStream.range(head[x], head[x + 1]).allMatch(e ->
                        dx + wt[e] < d[to[e]] && dx + wt[e] <= a[4 + 3 * m + 2 * u]
                            ? (d[to[e]] = dx + wt[e]) > 0 && pq.add((d[to[e]] << 10) | to[e])
                            : true)
                        || true))) || true)
                && IntStream.range(0, n).allMatch(j ->
                    d[j] > a[4 + 3 * m + 2 * u] || best[u] + a[5 + 3 * m + 2 * u] >= best[j] || (best[j] = best[u] + a[5 + 3 * m + 2 * u]) >= 0)) || true)
            ? best[(int) a[3] - 1] >= Long.MAX_VALUE / 2 ? -1 : best[(int) a[3] - 1]
            : 0L);
    }
}
