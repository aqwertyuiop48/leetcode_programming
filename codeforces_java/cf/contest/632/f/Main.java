import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(k -> raw[k] < 48).findFirst().orElse(raw.length)) instanceof Integer e
            && Integer.valueOf(Integer.parseInt(new String(raw, 0, e))) instanceof Integer n
            && new int[n * n + 1] instanceof int[] a && new int[]{0, 0} instanceof int[] st && new int[]{0} instanceof int[] ix
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : k > 0 && raw[k - 1] > 47 && (a[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            && (raw[raw.length - 1] < 48 || (a[ix[0]++] = st[0]) >= 0)
            && new int[n] instanceof int[] dist && new int[n] instanceof int[] par && new boolean[n] instanceof boolean[] used
            && IntStream.range(0, n).filter(i -> (dist[i] = i == 0 ? 0 : Integer.MAX_VALUE) + (par[i] = -1) < -5).count() >= 0
            ? IntStream.range(0, n).allMatch(i -> a[1 + i * n + i] == 0 && IntStream.range(0, i).allMatch(j -> a[1 + i * n + j] == a[1 + j * n + i])) && IntStream.range(0, n).allMatch(step -> Integer.valueOf(IntStream.range(0, n).filter(i -> !used[i]).reduce((x, y) -> dist[y] < dist[x] ? y : x).getAsInt()) instanceof Integer v
                && Integer.valueOf(par[v]) instanceof Integer p
                && (p < 0 || IntStream.range(0, n).allMatch(u -> !used[u] || u == p || a[1 + v * n + u] == Math.max(a[1 + p * n + u], a[1 + v * n + p])))
                && (used[v] = true)
                && IntStream.range(0, n).filter(u -> !used[u] && a[1 + v * n + u] < dist[u] && (dist[u] = a[1 + v * n + u]) + (par[u] = v) < -5).count() >= 0) ? "MAGIC" : "NOT MAGIC" : "");
    }
}
