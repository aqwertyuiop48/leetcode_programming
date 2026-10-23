import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new String(raw, 0, Math.min(raw.length, 12)).trim().split("[ \r\n]+")[0] instanceof String ns && (Integer) Integer.parseInt(ns) instanceof Integer n && new int[n * n + 3] instanceof int[] v && new int[3] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[1]) >= 0 && (st[1] = st[2] = 0) == 0) || true)
                && IntStream.range(0, n).allMatch(i -> v[1 + i * n + i] == 0 && IntStream.range(0, n).allMatch(j -> i == j || (v[1 + i * n + j] > 0 && v[1 + i * n + j] == v[1 + j * n + i])))
                && new int[n] instanceof int[] key && new int[n] instanceof int[] par && new boolean[n] instanceof boolean[] used && new int[n] instanceof int[] ord
                && (used[0] = true) && IntStream.range(0, n).allMatch(j -> (key[j] = v[1 + j]) >= 0)
                && IntStream.range(1, n).allMatch(t -> (Integer) IntStream.range(0, n).filter(j -> !used[j]).reduce((x, y) -> key[x] <= key[y] ? x : y).getAsInt() instanceof Integer u && (ord[t] = u) >= 0 && (used[u] = true) && IntStream.range(0, t).allMatch(s -> (long) v[1 + u * n + ord[s]] == (long) v[1 + par[u] * n + ord[s]] + key[u]) && IntStream.range(0, n).filter(j -> !used[j]).allMatch(j -> v[1 + u * n + j] >= key[j] || ((key[j] = v[1 + u * n + j]) >= 0 && (par[j] = u) >= 0))) ? "YES" : "NO");
    }
}
