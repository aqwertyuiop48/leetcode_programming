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
                && Stream.generate(() -> 0).takeWhile(y -> st[0] < n && bf[ordF[st[0]]] >= pr[j]).allMatch(y -> (Integer) ordF[st[0]++] instanceof Integer b
                    && (tr[sz + rank[b]] = bs[b]) > 0 && IntStream.iterate((sz + rank[b]) >> 1, i -> i >= 1, i -> i >> 1).allMatch(i -> (tr[i] = Math.min(tr[2 * i], tr[2 * i + 1])) > 0))
                && (Integer) Arrays.binarySearch(ts, pb[j]) instanceof Integer bsr && (Integer) (bsr >= 0 ? bsr : -bsr - 1) instanceof Integer lo0
                && (st[1] = lo0 >= n ? 0 : lo0 + sz) >= 0
                && Stream.generate(() -> 0).takeWhile(y -> st[1] > 0 && tr[st[1]] > pl[j]).allMatch(y -> Stream.generate(() -> 0).takeWhile(w -> (st[1] & 1) == 1).allMatch(w -> (st[1] >>= 1) >= 0) && (st[1] == 0 || ++st[1] > 0))
                && (Integer) Stream.iterate(st[1], i -> i < sz, i -> tr[2 * i] <= pl[j] ? 2 * i : 2 * i + 1).reduce(-1, (a, b2) -> b2) instanceof Integer last
                && (ans[j] = st[1] == 0 ? -1 : ordT[(last < 0 ? st[1] : tr[2 * last] <= pl[j] ? 2 * last : 2 * last + 1) - sz] + 1) != Integer.MIN_VALUE)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

