import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[n] instanceof int[] bs && new int[n] instanceof int[] bf && new int[n] instanceof int[] bt
            && IntStream.range(0, n).allMatch(i -> (bs[i] = Integer.parseInt(tk.nextToken())) > 0 && (bf[i] = Integer.parseInt(tk.nextToken())) > 0 && (bt[i] = Integer.parseInt(tk.nextToken())) > 0)
            && new int[m] instanceof int[] pl && new int[m] instanceof int[] pr && new int[m] instanceof int[] pb
            && IntStream.range(0, m).allMatch(i -> (pl[i] = Integer.parseInt(tk.nextToken())) > 0 && (pr[i] = Integer.parseInt(tk.nextToken())) > 0 && (pb[i] = Integer.parseInt(tk.nextToken())) > 0)
            && IntStream.range(0, n).mapToLong(i -> (long) bt[i] << 20 | i).sorted().mapToInt(x -> (int) (x & 1048575)).toArray() instanceof int[] ordT
            && new int[n] instanceof int[] rank && IntStream.range(0, n).allMatch(r -> (rank[ordT[r]] = r) >= 0)
            && IntStream.range(0, n).map(r -> bt[ordT[r]]).toArray() instanceof int[] ts
            && IntStream.range(0, n).mapToLong(i -> (long) (2000000000 - bf[i]) << 20 | i).sorted().mapToInt(x -> (int) (x & 1048575)).toArray() instanceof int[] ordF
            && IntStream.range(0, m).mapToLong(i -> (long) (2000000000 - pr[i]) << 20 | i).sorted().mapToInt(x -> (int) (x & 1048575)).toArray() instanceof int[] ordP
            && (Integer) Integer.highestOneBit(Math.max(1, 2 * n - 1)) instanceof Integer sz0 && (Integer) (sz0 < n ? 2 * sz0 : sz0) instanceof Integer sz
            && new int[2 * sz] instanceof int[] tr && IntStream.range(0, 2 * sz).allMatch(i -> (tr[i] = Integer.MAX_VALUE) > 0)
            && new int[m] instanceof int[] ans && new int[]{0, 0} instanceof int[] st
            && IntStream.range(0, m).allMatch(z -> (Integer) ordP[z] instanceof Integer j
                && IntStream.iterate(st[0], y -> y < n && bf[ordF[y]] >= pr[j], y -> y + 1).allMatch(y -> (Integer) ordF[y] instanceof Integer b && (st[0] = y + 1) > 0
                    && IntStream.iterate(sz + rank[b], i -> i >= 1, i -> i >> 1).allMatch(i -> tr[i] > bs[b] && (tr[i] = bs[b]) > 0) || true)
                && (Integer) Arrays.binarySearch(ts, pb[j]) instanceof Integer bsr && (Integer) (bsr >= 0 ? bsr : -bsr - 1) instanceof Integer lo0
                && (Integer) IntStream.iterate(lo0 >= n ? 0 : lo0 + sz, v -> v == 0 ? 0 : tr[v] <= pl[j] ? v < sz ? tr[2 * v] <= pl[j] ? 2 * v : 2 * v + 1 : v
                        : (v >>> Integer.numberOfTrailingZeros(~v)) == 0 ? 0 : (v >>> Integer.numberOfTrailingZeros(~v)) + 1)
                    .filter(v -> v == 0 || v >= sz && tr[v] <= pl[j]).findFirst().getAsInt() instanceof Integer res
                && (ans[j] = res == 0 ? -1 : ordT[res - sz] + 1) != Integer.MIN_VALUE)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }


}
