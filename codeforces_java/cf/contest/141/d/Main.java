import java.util.*;
import java.util.function.*;
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
            && Integer.valueOf((int) nums[1]) instanceof Integer L
            && ((IntPredicate) r -> nums[2 + 4 * r] - nums[5 + 4 * r] >= 0 && nums[2 + 4 * r] + nums[3 + 4 * r] <= L) instanceof IntPredicate ok
            && IntStream.concat(IntStream.of(0, L), IntStream.range(0, n).filter(ok).flatMap(r ->
                IntStream.of((int) (nums[2 + 4 * r] - nums[5 + 4 * r]), (int) (nums[2 + 4 * r] + nums[3 + 4 * r])))).sorted().distinct().toArray() instanceof int[] C
            && Integer.valueOf(C.length) instanceof Integer m
            && IntStream.range(0, n).map(r -> ok.test(r) ? Arrays.binarySearch(C, (int) (nums[2 + 4 * r] - nums[5 + 4 * r])) : -1).toArray() instanceof int[] sidx
            && IntStream.range(0, n).map(r -> ok.test(r) ? Arrays.binarySearch(C, (int) (nums[2 + 4 * r] + nums[3 + 4 * r])) : -1).toArray() instanceof int[] eidx
            && IntStream.range(0, m).map(i -> -1).toArray() instanceof int[] head
            && new int[n] instanceof int[] nxt
            && IntStream.range(0, n).filter(ok).allMatch(r -> (nxt[r] = head[sidx[r]]) >= -1 && (head[sidx[r]] = r) >= 0)
            && LongStream.range(0, m).map(i -> Long.MAX_VALUE).toArray() instanceof long[] dist
            && new int[m] instanceof int[] prev
            && IntStream.range(0, m).map(i -> -1).toArray() instanceof int[] pr
            && (dist[0] = 0) == 0
            && new PriorityQueue<long[]>((a, b) -> Long.compare(a[0], b[0])) instanceof PriorityQueue<long[]> pq
            && pq.add(new long[]{0, 0})
            && ((Predicate<long[]>) a ->
                a[3] < dist[(int) a[1]]
                && (dist[(int) a[1]] = a[3]) >= 0
                && (prev[(int) a[1]] = (int) a[0]) >= 0
                && (pr[(int) a[1]] = (int) a[2]) >= -1
                && pq.add(new long[]{a[3], a[1]})) instanceof Predicate<long[]> rel
            && IntStream.iterate(0, i -> !pq.isEmpty(), i -> i + 1).allMatch(i ->
                pq.poll() instanceof long[] top
                && (top[0] > dist[(int) top[1]]
                    || ((Integer) (int) top[1] instanceof Integer u
                        && (u == 0 || rel.test(new long[]{u, u - 1, -1, top[0] + C[u] - C[u - 1]}) || true)
                        && (u == m - 1 || rel.test(new long[]{u, u + 1, -1, top[0] + C[u + 1] - C[u]}) || true)
                        && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                            rel.test(new long[]{u, eidx[e], e, top[0] + nums[4 + 4 * e] + nums[5 + 4 * e]}) || true))))
            && Stream.iterate(m - 1, v -> v != 0, v -> prev[v]).map(v -> pr[v]).filter(r -> r >= 0).toList() instanceof List<Integer> rs
            ? dist[m - 1] + "\n" + rs.size() + "\n"
                + IntStream.range(0, rs.size()).mapToObj(i -> String.valueOf(rs.get(rs.size() - 1 - i) + 1)).collect(Collectors.joining(" "))
            : "");
    }
}

