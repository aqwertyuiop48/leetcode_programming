import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk ? CompletableFuture.supplyAsync(() -> true && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[m] instanceof int[] nxt && new int[m] instanceof int[] to
            && IntStream.range(0, m).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (to[i] = Integer.parseInt(tk.nextToken())) > 0 && (nxt[i] = head[a]) >= -1 && (head[a] = i) >= 0)
            && new boolean[n + 1] instanceof boolean[] vis && new StringBuilder() instanceof StringBuilder sb && new Object[1] instanceof Object[] ref
            && (ref[0] = (IntPredicate) v -> (vis[v] = true) && Stream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> vis[to[e]] || ((IntPredicate) ref[0]).test(to[e])) && sb.append(v).append(' ') != null) != null
            && IntStream.rangeClosed(1, n).allMatch(v -> vis[v] || ((IntPredicate) ref[0]).test(v))
            ? sb.toString().trim() : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
