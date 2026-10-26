import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Long) Long.parseLong(tk.nextToken()) instanceof Long t && (Long) Long.parseLong(tk.nextToken()) instanceof Long tt
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new long[n] instanceof long[] l && new long[n] instanceof long[] r
            && IntStream.range(0, n).allMatch(i -> (l[i] = Long.parseLong(tk.nextToken())) >= 0 && (r[i] = Long.parseLong(tk.nextToken())) >= 0)
            && (Long) LongStream.of(r).min().getAsLong() instanceof Long mnr && (Long) LongStream.of(l).max().getAsLong() instanceof Long mxl
            && (Long) (mnr + mxl < t ? t - mnr : mxl) instanceof Long n2 && (Long) (mnr + n2 > tt ? tt - n2 : mnr) instanceof Long n1
            && new int[2 * m] instanceof int[] to && new int[2 * m] instanceof int[] nxt && new int[n] instanceof int[] head && IntStream.range(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer a && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer b
                && (to[2 * i] = b) >= 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) >= 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[n] instanceof int[] col && IntStream.range(0, n).allMatch(i -> (col[i] = -1) < 0) && new int[n] instanceof int[] comp && new boolean[n] instanceof boolean[] ok1 && new boolean[n] instanceof boolean[] ok2
            && IntStream.range(0, n).allMatch(i -> (ok1[i] = true) && (ok2[i] = true)) && new boolean[]{true} instanceof boolean[] good
            && IntStream.range(0, n).filter(v -> col[v] < 0).allMatch(s -> (col[s] = 0) == 0 && (comp[s] = s) >= 0 && new ArrayDeque<Integer>(List.of(s)) instanceof ArrayDeque<Integer> q
                && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                    col[to[e]] < 0 ? (col[to[e]] = 1 - col[u]) >= 0 && (comp[to[e]] = s) >= 0 && q.add(to[e]) : (col[to[e]] != col[u] || (good[0] = false) || true))))
            && IntStream.range(0, n).allMatch(v -> ((col[v] == 0 ? l[v] <= n1 && n1 <= r[v] : l[v] <= n2 && n2 <= r[v]) || (ok1[comp[v]] = false) || true)
                && ((col[v] == 0 ? l[v] <= n2 && n2 <= r[v] : l[v] <= n1 && n1 <= r[v]) || (ok2[comp[v]] = false) || true))
            ? good[0] && n1 >= 0 && IntStream.range(0, n).allMatch(v -> ok1[comp[v]] || ok2[comp[v]])
                ? "POSSIBLE\n" + n1 + " " + n2 + "\n" + IntStream.range(0, n).mapToObj(v -> ok1[comp[v]] ? (col[v] == 0 ? "1" : "2") : (col[v] == 0 ? "2" : "1")).collect(Collectors.joining()) : "IMPOSSIBLE" : "");
    }
}
