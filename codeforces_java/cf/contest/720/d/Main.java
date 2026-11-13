import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m
            && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && new int[k] instanceof int[] a1 && new int[k] instanceof int[] b1 && new int[k] instanceof int[] a2 && new int[k] instanceof int[] b2
            && IntStream.range(0, k).allMatch(i -> (a1[i] = Integer.parseInt(tk.nextToken())) > 0 && (b1[i] = Integer.parseInt(tk.nextToken())) > 0
                && (a2[i] = Integer.parseInt(tk.nextToken())) > 0 && (b2[i] = Integer.parseInt(tk.nextToken())) > 0)
            && IntStream.range(0, k).mapToLong(i -> (long) a1[i] * 1048576L + i).sorted().mapToInt(z -> (int) (z & 1048575L)).toArray() instanceof int[] ord
            && new int[k + 1] instanceof int[] gEnd
            && IntStream.range(0, k).map(i -> k - 1 - i).allMatch(i -> (gEnd[i] = i + 1 < k && a1[ord[i + 1]] == a1[ord[i]] ? gEnd[i + 1] : i + 1) > 0)
            && new long[m + 2] instanceof long[] bit && new TreeMap<Integer, Long>() instanceof TreeMap<Integer, Long> nz
            && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> act
            && new PriorityQueue<int[]>((p, q) -> Integer.compare(p[0], q[0])) instanceof PriorityQueue<int[]> pq
            && ((BiPredicate<Integer, Long>) (pos, dl) -> IntStream.iterate(pos, i -> i <= m, i -> i + (i & -i)).allMatch(i -> (bit[i] = (bit[i] + dl) % 1000000007L) >= 0 || true)) instanceof BiPredicate<Integer, Long> bitAdd
            && ((IntToLongFunction) pos -> IntStream.iterate(pos, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> bit[i]).sum() % 1000000007L) instanceof IntToLongFunction bitSum
            && ((IntPredicate) th -> IntStream.generate(() -> pq.isEmpty() || pq.peek()[0] >= th ? -1 : act.remove(pq.poll()[1])).takeWhile(z -> z >= 0).count() >= 0) instanceof IntPredicate expire
            && nz.put(1, 1L) == null && bitAdd.test(1, 1L)
            && IntStream.iterate(0, i -> i < k, i -> gEnd[i]).allMatch(gi -> Integer.valueOf(a1[ord[gi]]) instanceof Integer cx
                && expire.test(cx - 1)
                && IntStream.range(gi, gEnd[gi]).mapToLong(t -> Integer.valueOf(b2[ord[t]]) instanceof Integer y2
                    && Integer.valueOf(act.floorKey(y2 + 1) == null ? 0 : act.get(act.floorKey(y2 + 1))) instanceof Integer fv
                    ? (cx == 1 || y2 >= m || fv >= y2 + 1 ? 0L : (bitSum.applyAsLong(y2) - bitSum.applyAsLong(fv) + 1000000007L) % 1000000007L) : 0L).toArray() instanceof long[] bon
                && expire.test(cx)
                && IntStream.range(gi, gEnd[gi]).allMatch(t -> act.put(b1[ord[t]], b2[ord[t]]) == null && pq.add(new int[]{a2[ord[t]], b1[ord[t]]})
                    && nz.subMap(b1[ord[t]], true, b2[ord[t]], true).entrySet().stream().allMatch(en -> bitAdd.test(en.getKey(), 1000000007L - en.getValue()) || true)
                    && (nz.subMap(b1[ord[t]], true, b2[ord[t]], true).keySet().removeIf(z -> true) || true))
                && IntStream.range(gi, gEnd[gi]).allMatch(t -> b2[ord[t]] >= m || bon[t - gi] == 0
                    || (act.floorKey(b2[ord[t]] + 1) != null && act.get(act.floorKey(b2[ord[t]] + 1)) >= b2[ord[t]] + 1)
                    || (nz.merge(b2[ord[t]] + 1, bon[t - gi], (u, v) -> (u + v) % 1000000007L) != null && bitAdd.test(b2[ord[t]] + 1, bon[t - gi]))) || true)
            && expire.test(n)
            ? (bitSum.applyAsLong(m) - bitSum.applyAsLong(act.floorKey(m) == null ? 0 : act.get(act.floorKey(m))) + 1000000007L) % 1000000007L : "");
    }
}
