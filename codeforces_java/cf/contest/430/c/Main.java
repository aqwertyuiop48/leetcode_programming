import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk ? CompletableFuture.supplyAsync(() -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] init && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] goal
            && new StringBuilder() instanceof StringBuilder sb && new int[]{0} instanceof int[] cnt && new Object[1] instanceof Object[] ref
            && (ref[0] = (Predicate<int[]>) q -> (Integer) (init[q[0] - 1] ^ q[2]) instanceof Integer val
                && (Integer) (val != goal[q[0] - 1] ? 1 : 0) instanceof Integer op
                && (op == 0 || (sb.append(q[0]).append('\n') != null && ++cnt[0] > 0))
                && IntStream.iterate(head[q[0]], e -> e >= 0, e -> nxt[e]).allMatch(e -> to[e] == q[1] || ((Predicate<int[]>) ref[0]).test(new int[]{to[e], q[0], q[3], q[2] ^ op}))) != null
            && ((Predicate<int[]>) ref[0]).test(new int[]{1, 0, 0, 0})
            ? cnt[0] + "\n" + sb.toString().trim() : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
