import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(new String(raw).indexOf('\n')) instanceof Integer nl
            && new StringTokenizer(new String(raw, 0, nl)) instanceof StringTokenizer hd
            && Integer.valueOf(hd.nextToken()) instanceof Integer h && Integer.valueOf(hd.nextToken()) instanceof Integer w
            && Integer.valueOf(h * w) instanceof Integer N && Integer.valueOf(14) instanceof Integer T
            && new boolean[N] instanceof boolean[] g && new int[1] instanceof int[] pos
            && IntStream.range(nl, raw.length).allMatch(i -> raw[i] < 48 || raw[i] > 49 || ((g[pos[0]++] = raw[i] == 49) || true))
            && ((IntBinaryOperator) (p, d) -> p % w + d % 3 - 1 < 0 || p % w + d % 3 - 1 >= w || p / w + d / 3 - 1 < 0 || p / w + d / 3 - 1 >= h ? -1 : p + (d / 3 - 1) * w + d % 3 - 1) instanceof IntBinaryOperator nb
            && new boolean[N] instanceof boolean[] e && new boolean[N] instanceof boolean[] o
            && IntStream.range(0, N).allMatch(i -> ((e[i] = g[i] && IntStream.range(0, 25).allMatch(k -> (k % 5 - 2) * (k % 5 - 2) + (k / 5 - 2) * (k / 5 - 2) > 5 || (i % w + k % 5 - 2 >= 0 && i % w + k % 5 - 2 < w && i / w + k / 5 - 2 >= 0 && i / w + k / 5 - 2 < h && g[i + (k / 5 - 2) * w + k % 5 - 2]))) || true))
            && IntStream.range(0, N).filter(i -> e[i]).allMatch(i -> IntStream.range(0, 25).allMatch(k -> (k % 5 - 2) * (k % 5 - 2) + (k / 5 - 2) * (k / 5 - 2) > 5 || i % w + k % 5 - 2 < 0 || i % w + k % 5 - 2 >= w || i / w + k / 5 - 2 < 0 || i / w + k / 5 - 2 >= h || (o[i + (k / 5 - 2) * w + k % 5 - 2] = true)))
            && ((Function<boolean[], int[]>) mask -> new int[N] instanceof int[] lab && new int[N] instanceof int[] q && new int[2] instanceof int[] c
                && IntStream.range(0, N).allMatch(s -> !mask[s] || lab[s] != 0 || ((lab[s] = ++c[0]) > 0 && (q[0] = s) >= 0 && (c[1] = 1) > 0
                    && IntStream.iterate(0, k -> k < c[1], k -> k + 1).allMatch(k -> IntStream.range(0, 9).map(d -> nb.applyAsInt(q[k], d)).filter(j -> j >= 0 && mask[j] && lab[j] == 0).allMatch(j -> (lab[j] = c[0]) > 0 && (q[c[1]++] = j) >= 0))))
                ? lab : new int[0]) instanceof Function<boolean[], int[]> label
            && label.apply(g) instanceof int[] lg && new boolean[N] instanceof boolean[] r
            && IntStream.range(0, N).allMatch(i -> ((r[i] = g[i] && !o[i]) || true))
            && label.apply(r) instanceof int[] lr
            && new int[N + 1] instanceof int[] sz && new int[N + 1] instanceof int[] rays && new boolean[N + 1] instanceof boolean[] seen
            && IntStream.range(0, N).filter(i -> r[i]).allMatch(i -> ++sz[lr[i]] > 0)
            && IntStream.range(0, N).filter(i -> r[i] && sz[lr[i]] >= T && !seen[lr[i]]).allMatch(i -> (seen[lr[i]] = true) && ++rays[lg[i]] > 0)
            && Integer.valueOf(Arrays.stream(lg).max().getAsInt()) instanceof Integer cnt
            ? cnt + "\n" + Arrays.stream(rays, 1, cnt + 1).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}


