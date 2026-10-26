import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Long) Long.parseLong(tk.nextToken()) instanceof Long k
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> Integer.parseInt(tk.nextToken())).toArray()).toArray(int[][]::new) instanceof int[][] a
            && new int[m][n + 1] instanceof int[][] dq && new int[m] instanceof int[] hd && new int[m] instanceof int[] tl && new int[]{0, 0, 0} instanceof int[] st
            && new int[m] instanceof int[] best
            && IntStream.range(0, n).allMatch(r -> IntStream.range(0, m).allMatch(j ->
                    Stream.generate(() -> 0).takeWhile(z -> tl[j] > hd[j] && a[dq[j][tl[j] - 1]][j] <= a[r][j]).allMatch(z -> --tl[j] >= 0)
                    && (dq[j][tl[j]++] = r) >= 0)
                && Stream.generate(() -> 0).takeWhile(z -> IntStream.range(0, m).mapToLong(j -> tl[j] > hd[j] ? a[dq[j][hd[j]]][j] : 0).sum() > k).allMatch(z ->
                    ++st[0] > 0 && IntStream.range(0, m).allMatch(j -> hd[j] >= tl[j] || dq[j][hd[j]] >= st[0] || ++hd[j] > 0))
                && (r + 1 - st[0] <= st[1] || (st[1] = r + 1 - st[0]) >= 0 && IntStream.range(0, m).allMatch(j -> (best[j] = tl[j] > hd[j] ? a[dq[j][hd[j]]][j] : 0) >= 0)))
            ? Arrays.stream(best).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
