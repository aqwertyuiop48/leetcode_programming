import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : st[2] == 0 || ((nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Integer.valueOf((int) nums[1]) instanceof Integer m
            && Integer.valueOf((int) nums[2]) instanceof Integer s
            && Long.valueOf(nums[3 + 3 * m]) instanceof Long l
            && IntStream.rangeClosed(0, n).map(i -> -1).toArray() instanceof int[] head
            && new int[2 * m] instanceof int[] nxt
            && IntStream.range(0, 2 * m).allMatch(e ->
                (nxt[e] = head[(int) nums[3 + 3 * (e / 2) + e % 2]]) >= -1
                && (head[(int) nums[3 + 3 * (e / 2) + e % 2]] = e) >= 0)
            && LongStream.rangeClosed(0, n).map(i -> Long.MAX_VALUE).toArray() instanceof long[] d
            && (d[s] = 0) == 0
            && new PriorityQueue<long[]>((a, b) -> Long.compare(a[0], b[0])) instanceof PriorityQueue<long[]> pq
            && pq.add(new long[]{0, s})
            && IntStream.iterate(0, i -> !pq.isEmpty(), i -> i + 1).allMatch(i ->
                pq.poll() instanceof long[] top
                && (top[0] > d[(int) top[1]]
                    || IntStream.iterate(head[(int) top[1]], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                        Long.valueOf(top[0] + nums[5 + 3 * (e / 2)]) instanceof Long nd
                        && Integer.valueOf((int) nums[3 + 3 * (e / 2) + 1 - e % 2]) instanceof Integer v
                        && (nd >= d[v] || ((d[v] = nd) >= 0 && pq.add(new long[]{nd, v}))))))
            ? IntStream.rangeClosed(1, n).filter(v -> d[v] == l).count()
                + IntStream.range(0, m).mapToLong(e ->
                    Integer.valueOf((int) nums[3 + 3 * e]) instanceof Integer u
                    && Integer.valueOf((int) nums[4 + 3 * e]) instanceof Integer v
                    && Long.valueOf(nums[5 + 3 * e]) instanceof Long w
                    && Long.valueOf(l - d[u]) instanceof Long a
                    && Long.valueOf(l - d[v]) instanceof Long b
                        ? (a > 0 && a < w && d[v] + w - a > l ? 1 : 0)
                            + (b > 0 && b < w && d[u] + w - b > l ? 1 : 0)
                            + (a > 0 && b > 0 && a + b == w ? 1 : 0)
                        : 0).sum()
            : 0);
    }
}

