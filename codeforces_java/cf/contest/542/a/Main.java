import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && (Long) 1000000000L instanceof Long off && (Long) 1048575L instanceof Long mask
            && new long[n] instanceof long[] a && new long[n] instanceof long[] b
            && IntStream.range(0, n).allMatch(i -> (a[i] = Long.parseLong(tk.nextToken())) > Long.MIN_VALUE && (b[i] = Long.parseLong(tk.nextToken())) > Long.MIN_VALUE)
            && new long[m] instanceof long[] c && new long[m] instanceof long[] d && new long[m] instanceof long[] p
            && IntStream.range(0, m).allMatch(j -> (c[j] = Long.parseLong(tk.nextToken())) > Long.MIN_VALUE && (d[j] = Long.parseLong(tk.nextToken())) > Long.MIN_VALUE && (p[j] = Long.parseLong(tk.nextToken())) > 0)
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> a[i])).mapToInt(Integer::intValue).toArray() instanceof int[] byA
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> b[i])).mapToInt(Integer::intValue).toArray() instanceof int[] byB
            && IntStream.range(0, n).mapToLong(i -> a[byA[i]]).toArray() instanceof long[] aS && IntStream.range(0, n).mapToLong(i -> b[byB[i]]).toArray() instanceof long[] bS
            && ((LongUnaryOperator) x -> IntStream.iterate(1 << 19, s -> s > 0, s -> s >> 1).reduce(0, (pos, s) -> pos + s <= n && aS[pos + s - 1] < x ? pos + s : pos)) instanceof LongUnaryOperator lbA
            && ((LongUnaryOperator) x -> IntStream.iterate(1 << 19, s -> s > 0, s -> s >> 1).reduce(0, (pos, s) -> pos + s <= n && bS[pos + s - 1] < x ? pos + s : pos)) instanceof LongUnaryOperator lbB
            && new long[n + 1] instanceof long[] pm && IntStream.range(0, n).allMatch(i -> (pm[i + 1] = Math.max(pm[i], (b[byA[i]] + off) << 20 | byA[i])) >= 0)
            && new long[n + 1] instanceof long[] sm && (sm[n] = Long.MAX_VALUE) > 0 && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (sm[i] = Math.min(sm[i + 1], (a[byB[i]] + off) << 20 | byB[i])) > 0)
            && new int[n] instanceof int[] rankA && IntStream.range(0, n).allMatch(i -> (rankA[byA[i]] = i) >= 0)
            && new long[n + 1] instanceof long[] bit
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingLong((Integer j) -> d[j])).mapToInt(Integer::intValue).toArray() instanceof int[] byD
            && new int[]{0} instanceof int[] ptr && new long[]{0, -1, -1} instanceof long[] best
            && IntStream.range(0, m).allMatch(t -> (Integer) byD[t] instanceof Integer j
                && Stream.generate(() -> 0).takeWhile(z -> ptr[0] < n && bS[ptr[0]] <= d[j]).allMatch(z -> (Integer) byB[ptr[0]++] instanceof Integer ad
                    && IntStream.iterate(n - rankA[ad], i -> i <= n, i -> i + (i & -i)).peek(i -> bit[i] = Math.max(bit[i], (b[ad] - a[ad]) << 20 | ad)).count() >= 0)
                && new long[]{0, -1} instanceof long[] cand
                && (Integer) (int) lbA.applyAsLong(c[j] + 1) instanceof Integer k1
                && (k1 == 0 || (Long) (Math.min((pm[k1] >> 20) - off, d[j]) - c[j]) instanceof Long o1 && (o1 <= cand[0] || (cand[0] = o1) >= 0 && (cand[1] = pm[k1] & mask) >= 0))
                && (Integer) (int) lbB.applyAsLong(d[j]) instanceof Integer k2
                && (k2 >= n || (Long) (d[j] - Math.max((sm[k2] >> 20) - off, c[j])) instanceof Long o2 && (o2 <= cand[0] || (cand[0] = o2) >= 0 && (cand[1] = sm[k2] & mask) >= 0))
                && (Integer) (int) lbA.applyAsLong(c[j]) instanceof Integer k3
                && (Long) IntStream.iterate(n - k3, i -> i > 0, i -> i & (i - 1)).mapToLong(i -> bit[i]).max().orElse(0) instanceof Long ins
                && (ins >> 20 <= cand[0] || (cand[0] = ins >> 20) >= 0 && (cand[1] = ins & mask) >= 0)
                && (cand[0] * p[j] <= best[0] || (best[0] = cand[0] * p[j]) >= 0 && (best[1] = cand[1]) >= 0 && (best[2] = j) >= 0))
            ? best[0] <= 0 ? "0" : best[0] + "\n" + (best[1] + 1) + " " + (best[2] + 1) : "");
    }
}
