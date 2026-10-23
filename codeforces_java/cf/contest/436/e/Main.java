import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer w
            && new long[n] instanceof long[] a && new long[n] instanceof long[] b && IntStream.range(0, n).allMatch(i -> (a[i] = Long.parseLong(tk.nextToken())) >= 0 && (b[i] = Long.parseLong(tk.nextToken())) >= 0)
            && new int[n] instanceof int[] st && new long[1] instanceof long[] tot && (Long) (Long.MAX_VALUE / 8) instanceof Long INF
            && IntStream.range(0, 5).mapToObj(h -> new PriorityQueue<long[]>(Comparator.comparingLong(x -> x[0]))).toArray(PriorityQueue[]::new) instanceof PriorityQueue[] pq
            && IntStream.range(0, n).allMatch(i -> pq[0].add(new long[]{a[i], i, 0}) && pq[4].add(new long[]{b[i], i, 0}))
            && ((IntFunction<long[]>) h -> (Stream.generate(() -> (long[]) pq[h].peek()).takeWhile(top -> top != null && st[(int) top[1]] != top[2]).allMatch(top -> pq[h].poll() != null) || true) && pq[h].peek() instanceof long[] t ? t : new long[]{INF, -1, -1}) instanceof IntFunction<long[]> peek
            && IntStream.range(0, w).allMatch(step -> peek.apply(0) instanceof long[] tA && peek.apply(1) instanceof long[] tB && peek.apply(2) instanceof long[] tC && peek.apply(3) instanceof long[] tD && peek.apply(4) instanceof long[] tE
                && new long[]{tA[0], tB[0], Math.min(INF, tC[0] + tE[0]), Math.min(INF, tD[0] + tE[0])} instanceof long[] c
                && IntStream.range(0, 4).boxed().min(Comparator.comparingLong(k -> c[k])).get() instanceof Integer k
                && (k == 0 ? (st[(int) tA[1]] = 1) > 0 && (tot[0] += a[(int) tA[1]]) >= 0 && pq[1].add(new long[]{b[(int) tA[1]] - a[(int) tA[1]], tA[1], 1}) && pq[2].add(new long[]{-a[(int) tA[1]], tA[1], 1})
                    : k == 1 ? (st[(int) tB[1]] = 2) > 0 && (tot[0] += b[(int) tB[1]] - a[(int) tB[1]]) >= 0 && pq[3].add(new long[]{a[(int) tB[1]] - b[(int) tB[1]], tB[1], 2})
                    : (k == 2 ? (st[(int) tC[1]] = 0) == 0 && (tot[0] -= a[(int) tC[1]]) > Long.MIN_VALUE && pq[0].add(new long[]{a[(int) tC[1]], tC[1], 0}) && pq[4].add(new long[]{b[(int) tC[1]], tC[1], 0})
                        : (st[(int) tD[1]] = 1) > 0 && (tot[0] += a[(int) tD[1]] - b[(int) tD[1]]) > Long.MIN_VALUE && pq[1].add(new long[]{b[(int) tD[1]] - a[(int) tD[1]], tD[1], 1}) && pq[2].add(new long[]{-a[(int) tD[1]], tD[1], 1}))
                        && (st[(int) tE[1]] = 2) > 0 && (tot[0] += b[(int) tE[1]]) > Long.MIN_VALUE && pq[3].add(new long[]{a[(int) tE[1]] - b[(int) tE[1]], tE[1], 2})))
            ? tot[0] + "\n" + IntStream.of(st).mapToObj(String::valueOf).collect(Collectors.joining()) : "");
    }
}
