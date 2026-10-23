import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Long) Long.parseLong(tk.nextToken()) instanceof Long k && (Long) Long.parseLong(tk.nextToken()) instanceof Long p
            && IntStream.range(0, m + 1).map(i -> -1).toArray() instanceof int[] head && new int[2 * m] instanceof int[] nxt && new int[2 * m] instanceof int[] to
            && IntStream.range(0, m - 1).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[m + 1] instanceof int[] dep && new int[m + 1] instanceof int[] q && new int[]{1} instanceof int[] tl && (q[0] = 1) == 1
            && IntStream.range(0, m).allMatch(h -> IntStream.iterate(head[q[h]], e -> e >= 0, e -> nxt[e]).allMatch(e -> to[e] == 1 || dep[to[e]] != 0 || ((dep[to[e]] = dep[q[h]] + 1) > 0 && (q[tl[0]++] = to[e]) > 0)))
            && (Integer) IntStream.of(dep).max().getAsInt() instanceof Integer D && new long[D + 2] instanceof long[] cnt && IntStream.rangeClosed(2, m).allMatch(v -> ++cnt[dep[v]] > 0)
            && new long[D + 2] instanceof long[] P && new long[D + 2] instanceof long[] T && new int[]{1} instanceof int[] L
            ? IntStream.rangeClosed(1, D).mapToLong(d -> (P[d] = P[d - 1] + cnt[d]) >= 0 && (T[d] = T[d - 1] + cnt[d] * d) >= 0
                && (IntStream.range(0, D + 1).anyMatch(t -> !(L[0] < d && d * (P[d] - P[L[0] - 1]) - (T[d] - T[L[0] - 1]) > p && ++L[0] > 0)) || true)
                ? Math.min(k, P[d] - P[L[0] - 1] + (L[0] > 1 ? Math.min(cnt[L[0] - 1], (p - (d * (P[d] - P[L[0] - 1]) - (T[d] - T[L[0] - 1]))) / (d - L[0] + 1)) : 0)) : 0).max().getAsLong() : 0);
    }
}
