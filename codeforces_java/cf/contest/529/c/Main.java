import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && new int[k] instanceof int[] rx && new int[k] instanceof int[] ry
            && IntStream.range(0, k).allMatch(i -> (rx[i] = Integer.parseInt(tk.nextToken())) > 0 && (ry[i] = Integer.parseInt(tk.nextToken())) > 0)
            && new int[q] instanceof int[] x1 && new int[q] instanceof int[] y1 && new int[q] instanceof int[] x2 && new int[q] instanceof int[] y2
            && IntStream.range(0, q).allMatch(i -> (x1[i] = Integer.parseInt(tk.nextToken())) > 0 && (y1[i] = Integer.parseInt(tk.nextToken())) > 0
                && (x2[i] = Integer.parseInt(tk.nextToken())) > 0 && (y2[i] = Integer.parseInt(tk.nextToken())) > 0)
            && ((Function<int[][], boolean[]>) a -> new int[2 * a[6][0]] instanceof int[] tree && new boolean[q] instanceof boolean[] res
                && new int[a[6][1] + 2] instanceof int[] rh && new int[k] instanceof int[] rn && new int[a[6][1] + 2] instanceof int[] qh && new int[q] instanceof int[] qn
                && IntStream.range(0, a[6][1] + 2).allMatch(i -> (rh[i] = -1) < 0 && (qh[i] = -1) < 0)
                && IntStream.range(0, k).allMatch(i -> (rn[i] = rh[a[1][i]]) >= -1 && (rh[a[1][i]] = i) >= 0)
                && IntStream.range(0, q).allMatch(i -> (qn[i] = qh[a[5][i]]) >= -1 && (qh[a[5][i]] = i) >= 0)
                && IntStream.rangeClosed(1, a[6][1]).allMatch(c -> IntStream.iterate(rh[c], i -> i >= 0, i -> rn[i]).allMatch(i ->
                        (tree[a[6][0] + a[0][i] - 1] = c) > 0 && IntStream.iterate((a[6][0] + a[0][i] - 1) / 2, p -> p >= 1, p -> p / 2).allMatch(p -> (tree[p] = Math.min(tree[2 * p], tree[2 * p + 1])) >= 0))
                    && IntStream.iterate(qh[c], i -> i >= 0, i -> qn[i]).allMatch(i -> new int[]{a[2][i] - 1 + a[6][0], a[3][i] + a[6][0], Integer.MAX_VALUE} instanceof int[] lr
                        && Stream.generate(() -> 0).takeWhile(z -> lr[0] < lr[1]).allMatch(z -> ((lr[0] & 1) == 0 || (lr[2] = Math.min(lr[2], tree[lr[0]++])) >= 0)
                            && ((lr[1] & 1) == 0 || (lr[2] = Math.min(lr[2], tree[--lr[1]])) >= 0) && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0)
                        && ((res[i] = lr[2] >= a[4][i]) || true)))
                ? res : null) instanceof Function<int[][], boolean[]> pass
            && pass.apply(new int[][]{rx, ry, x1, x2, y1, y2, {n, m}}) instanceof boolean[] r1 && pass.apply(new int[][]{ry, rx, y1, y2, x1, x2, {m, n}}) instanceof boolean[] r2
            ? IntStream.range(0, q).mapToObj(i -> r1[i] || r2[i] ? "YES" : "NO").collect(Collectors.joining("\n")) : "");
    }
}
