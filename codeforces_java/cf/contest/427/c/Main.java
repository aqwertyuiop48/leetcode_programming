import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk ? CompletableFuture.supplyAsync(() -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] c && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[m] instanceof int[] nxt && new int[m] instanceof int[] to
            && IntStream.range(0, m).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (to[i] = Integer.parseInt(tk.nextToken())) > 0 && (nxt[i] = head[a]) >= -1 && (head[a] = i) >= 0)
            && new int[n + 1] instanceof int[] idx && new int[n + 1] instanceof int[] low && new int[n + 1] instanceof int[] pos && new int[n + 1] instanceof int[] stack && new boolean[n + 1] instanceof boolean[] onst
            && new int[2] instanceof int[] st && new long[]{0, 1} instanceof long[] res && new Object[1] instanceof Object[] ref
            && (ref[0] = (IntPredicate) v -> (idx[v] = low[v] = ++st[0]) > 0 && (pos[v] = st[1]) >= 0 && (stack[st[1]++] = v) >= 0 && (onst[v] = true)
                && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> idx[to[e]] == 0 ? ((IntPredicate) ref[0]).test(to[e]) && (low[v] = Math.min(low[v], low[to[e]])) >= 0 : !onst[to[e]] || (low[v] = Math.min(low[v], idx[to[e]])) >= 0)
                && (low[v] != idx[v] || (Integer) IntStream.range(pos[v], st[1]).map(i -> c[stack[i] - 1]).min().getAsInt() instanceof Integer mn && (res[0] += mn) >= 0
                    && (res[1] = res[1] * IntStream.range(pos[v], st[1]).filter(i -> c[stack[i] - 1] == mn).count() % 1000000007L) >= 0
                    && IntStream.range(pos[v], st[1]).allMatch(i -> !(onst[stack[i]] = false)) && (st[1] = pos[v]) >= 0)) != null
            && IntStream.rangeClosed(1, n).allMatch(v -> idx[v] != 0 || ((IntPredicate) ref[0]).test(v))
            ? res[0] + " " + res[1] : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
