import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[2 * m + 1] instanceof int[] nxt && new int[2 * m + 1] instanceof int[] to
            && IntStream.range(0, m).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] color && new int[n + 1] instanceof int[] q && new int[]{0, 0, 0} instanceof int[] st && new long[2] instanceof long[] c
            && (Long) IntStream.rangeClosed(1, n).filter(s -> color[s] < 0).mapToLong(s -> (color[s] = 0) == 0 && (q[0] = s) >= 0 && (st[0] = 1) > 0 && (c[0] = 1) > 0 && (c[1] = 0) == 0
                && IntStream.iterate(0, i -> i < st[0], i -> i + 1).filter(i -> IntStream.iterate(head[q[i]], e -> e >= 0, e -> nxt[e])
                    .filter(e -> color[to[e]] < 0 && (color[to[e]] = 1 - color[q[i]]) >= 0 && (q[st[0]++] = to[e]) >= 0 && ++c[color[to[e]]] > 0 || color[to[e]] == color[q[i]] && (st[1] = 1) > 0).count() >= 0).count() >= 0
                && (st[2] |= c[0] + c[1] >= 3 ? 1 : 0) >= 0 ? c[0] * (c[0] - 1) / 2 + c[1] * (c[1] - 1) / 2 : 0L).sum() instanceof Long w
            ? m == 0 ? "3 " + (long) n * (n - 1) * (n - 2) / 6 : st[1] == 1 ? "0 1" : st[2] == 0 ? "2 " + (long) m * (n - 2) : "1 " + w : "");
    }
}
