import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && tk.nextToken() instanceof String str && tk.nextToken() instanceof String pat
            && (Integer) ((n - m + 64) >> 6) instanceof Integer wp
            && new long[4][(n >> 6) + 4] instanceof long[][] tb && new long[wp] instanceof long[] rs
            && IntStream.range(0, wp).allMatch(w -> (rs[w] = -1L) == -1L)
            && IntStream.range(0, 4).allMatch(c -> new int[n + 1] instanceof int[] pre && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + (str.charAt(i) == "ACGT".charAt(c) ? 1 : 0)) >= 0)
                && IntStream.range(0, n).filter(p -> pre[Math.min(n, p + k + 1)] - pre[Math.max(0, p - k)] > 0).peek(p -> tb[c][p >> 6] |= 1L << (p & 63)).count() >= 0)
            && new long[4][64][(n >> 6) + 3] instanceof long[][][] ts
            && IntStream.range(0, 256).allMatch(u -> IntStream.range(0, (n >> 6) + 3).allMatch(w -> (ts[u >> 6][u & 63][w] = (tb[u >> 6][w] >>> (u & 63)) | (tb[u >> 6][w + 1] << 1 << (63 - (u & 63)))) != 5L || true))
            && IntStream.range(0, m).allMatch(j -> ts["ACGT".indexOf(pat.charAt(j))][j & 63] instanceof long[] row && (Integer) (j >> 6) instanceof Integer q
                && IntStream.of(0).peek(z -> IntStream.range(0, wp).forEach(w -> rs[w] &= row[w + q])).sum() == 0)
            ? IntStream.range(0, n - m + 1).filter(p -> ((rs[p >> 6] >>> (p & 63)) & 1) != 0).count() : 0);
    }
}
