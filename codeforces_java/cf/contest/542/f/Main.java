import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((tk[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer T
            && IntStream.range(0, n).boxed().sorted((a, b) -> tk[2 + 2 * a] != tk[2 + 2 * b] ? tk[2 + 2 * a] - tk[2 + 2 * b] : tk[3 + 2 * b] - tk[3 + 2 * a]).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[n] instanceof int[] P && new int[T + 2] instanceof int[] cnt && new int[T + 2] instanceof int[] st
            && IntStream.range(0, n).allMatch(p -> Integer.valueOf(tk[2 + 2 * ord[p]]) instanceof Integer t
                && (P[p] = tk[3 + 2 * ord[p]] + (p > 0 && tk[2 + 2 * ord[p - 1]] == t ? P[p - 1] : 0)) >= 0
                && (p > 0 && tk[2 + 2 * ord[p - 1]] == t || (st[t] = p) >= 0) && ++cnt[t] > 0)
            && new int[n + 2] instanceof int[] f && new int[n + 2] instanceof int[] h
            && IntStream.range(0, n + 2).allMatch(x -> (f[x] = x == 0 ? 0 : -1000000000) <= 0)
            && IntStream.rangeClosed(1, T).allMatch(t -> IntStream.range(0, n + 2).allMatch(x -> (h[x] = -1000000000) < 0)
                && IntStream.rangeClosed(0, n).allMatch(c -> IntStream.rangeClosed(0, Math.min(cnt[t], n - c)).allMatch(k -> (h[c + k] = Math.max(h[c + k], f[c] + (k == 0 ? 0 : P[st[t] + k - 1]))) <= 1000000000))
                && IntStream.range(0, n + 2).allMatch(x -> (f[x] = -1000000000) < 0)
                && IntStream.rangeClosed(0, n).allMatch(c -> (f[t < T ? (c + 1) / 2 : c] = Math.max(f[t < T ? (c + 1) / 2 : c], h[c])) <= 1000000000))
            ? Math.max(f[0], f[1]) : "");
    }
}
