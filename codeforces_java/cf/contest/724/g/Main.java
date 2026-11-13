import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m
            && LongStream.generate(() -> Long.parseLong(tk.nextToken())).limit(3L * m).toArray() instanceof long[] e
            && new int[n + 1] instanceof int[] head && new int[2 * m] instanceof int[] nxt && new int[2 * m] instanceof int[] to && new long[2 * m] instanceof long[] wt
            && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (to[2 * i] = (int) e[3 * i + 1]) > 0 && (wt[2 * i] = e[3 * i + 2]) >= 0 && (nxt[2 * i] = head[(int) e[3 * i]]) > -5 && (head[(int) e[3 * i]] = 2 * i) >= 0
                && (to[2 * i + 1] = (int) e[3 * i]) > 0 && (wt[2 * i + 1] = e[3 * i + 2]) >= 0 && (nxt[2 * i + 1] = head[(int) e[3 * i + 1]]) > -5 && (head[(int) e[3 * i + 1]] = 2 * i + 1) >= 0)
            && new boolean[n + 1] instanceof boolean[] vis && new long[n + 1] instanceof long[] d && new int[n + 1] instanceof int[] q
            && new int[2] instanceof int[] tail && new long[1] instanceof long[] ans
            && IntStream.rangeClosed(1, n).allMatch(s -> vis[s] || (new long[60] instanceof long[] bs && new int[1] instanceof int[] r && new long[1] instanceof long[] orr
                && Integer.valueOf(tail[0]) instanceof Integer c0 && (vis[s] = true) && (q[tail[0]++] = s) > 0 && (tail[1] = c0) >= 0
                && (IntStream.iterate(0, z -> tail[1] < tail[0], z -> z + 1).allMatch(z -> Integer.valueOf(q[tail[1]++]) instanceof Integer u
                    && IntStream.iterate(head[u], ed -> ed >= 0, ed -> nxt[ed]).allMatch(ed -> Integer.valueOf(to[ed]) instanceof Integer v
                        && (vis[v] ? new long[]{d[u] ^ d[v] ^ wt[ed]} instanceof long[] x
                            && (x[0] == 0 || IntStream.iterate(59, b -> b >= 0, b -> b - 1).allMatch(b -> ((x[0] >> b & 1) == 0)
                                || (bs[b] != 0 ? (x[0] ^= bs[b]) >= 0 : !((bs[b] = x[0]) >= 0 && ++r[0] > 0 && (orr[0] |= x[0]) >= 0))) || true)
                            : (vis[v] = true) && (d[v] = d[u] ^ wt[ed]) >= 0 && (q[tail[0]++] = v) > 0))) || true)
                && Long.valueOf(tail[0] - c0) instanceof Long sz
                && ((IntToLongFunction) b -> IntStream.range(c0, tail[0]).filter(i -> (d[q[i]] >> b & 1) == 1).count()) instanceof IntToLongFunction ones
                && (ans[0] = (ans[0] + IntStream.range(0, 60).mapToLong(b -> ((orr[0] >> b & 1) == 1 ? (sz * (sz - 1) / 2 % 1000000007L) * ((1L << (r[0] - 1)) % 1000000007L) % 1000000007L
                    : ones.applyAsLong(b) * (sz - ones.applyAsLong(b)) % 1000000007L * ((1L << r[0]) % 1000000007L) % 1000000007L) * ((1L << b) % 1000000007L) % 1000000007L).sum()) % 1000000007L) >= 0)
                )
            ? ans[0] : "");
    }
}
