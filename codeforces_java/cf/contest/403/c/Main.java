import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[5] instanceof int[] st
            && new boolean[2000 * 2000] instanceof boolean[] adj
            && IntStream.rangeClosed(0, raw.length).allMatch(p -> p < raw.length && raw[p] >= '0'
                ? (st[1] = 1) > 0 && (st[4] = st[4] * 10 + raw[p] - '0') >= 0
                : st[1] == 0 || ((st[0] == 0 ? (st[3] = st[4]) >= 0 : st[4] == 0 || (adj[(st[0] - 1) / st[3] * 2000 + (st[0] - 1) % st[3]] = true))
                    && ++st[0] > 0 && (st[1] = 0) == 0 && (st[4] = 0) == 0))
            && st[3] > 0
            && ((IntUnaryOperator) dir -> new boolean[st[3]] instanceof boolean[] vis && new int[st[3]] instanceof int[] q && new int[]{1} instanceof int[] tl
                && (vis[0] = true)
                && (IntStream.range(0, st[3]).allMatch(h -> h < tl[0] && IntStream.range(0, st[3]).allMatch(v -> vis[v]
                    || !(dir == 0 ? adj[q[h] * 2000 + v] : adj[v * 2000 + q[h]]) || ((vis[v] = true) && (q[tl[0]++] = v) >= 0))) || true) ? tl[0] : 0) instanceof IntUnaryOperator bfs
            && bfs.applyAsInt(0) == st[3] && bfs.applyAsInt(1) == st[3] ? "YES" : "NO");
    }
}
