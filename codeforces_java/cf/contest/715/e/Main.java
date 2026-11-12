import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] all && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((all[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf(all[0]) instanceof Integer n
            && Arrays.copyOfRange(all, 1, 1 + n) instanceof int[] p && Arrays.copyOfRange(all, 1 + n, 1 + 2 * n) instanceof int[] q
            && new int[n + 1] instanceof int[] posP && new int[n + 1] instanceof int[] posQ
            && IntStream.range(0, n + 1).allMatch(i -> (posP[i] = -1) < 0 && (posQ[i] = -1) < 0)
            && IntStream.range(0, n).allMatch(i -> (p[i] == 0 || (posP[p[i]] = i) >= 0) && (q[i] == 0 || (posQ[q[i]] = i) >= 0))
            && IntStream.range(0, n).map(i -> q[i] != 0 && posP[q[i]] >= 0 ? posP[q[i]] : -1).toArray() instanceof int[] nxt
            && new boolean[n] instanceof boolean[] vis && new int[4] instanceof int[] cnt
            && IntStream.range(0, n).filter(s -> !(p[s] != 0 && posQ[p[s]] >= 0))
                .allMatch(s -> Integer.valueOf(IntStream.iterate(s, i -> i >= 0, i -> nxt[i]).peek(i -> vis[i] = true).reduce((x, y) -> y).getAsInt()) instanceof Integer e
                    && cnt[(p[s] == 0 ? 2 : 0) + (q[e] == 0 ? 1 : 0)]++ >= 0)
            && Long.valueOf(IntStream.range(0, n).filter(i -> !vis[i]).filter(i -> !vis[i] && IntStream.iterate(i, j -> !vis[j], j -> nxt[j]).peek(j -> vis[j] = true).count() > 0).count()) instanceof Long cyc0
            && Integer.valueOf(cnt[0] + (int) IntStream.rangeClosed(1, n).filter(v -> posP[v] < 0 && posQ[v] < 0).count()) instanceof Integer d
            && Integer.valueOf(cnt[3]) instanceof Integer c
            && new long[251][251] instanceof long[][] s && new long[251][251] instanceof long[][] C && new long[252] instanceof long[] fact && new long[n + 2] instanceof long[] rs
            && (s[0][0] = 1) == 1 && (C[0][0] = 1) == 1 && (fact[0] = 1) == 1 && (rs[0] = 1) == 1
            && IntStream.rangeClosed(1, 250).allMatch(i -> (fact[i] = fact[i - 1] * i % 1000000007L) > 0 && (C[i][0] = 1) == 1
                && IntStream.rangeClosed(1, i).allMatch(k -> (s[i][k] = (s[i - 1][k - 1] + (i - 1) * s[i - 1][k]) % 1000000007L) >= 0 && (C[i][k] = (C[i - 1][k - 1] + C[i - 1][k]) % 1000000007L) >= 0))
            && IntStream.rangeClosed(1, n + 1).allMatch(e -> (rs[e] = rs[e - 1] * (c + e - 1) % 1000000007L) >= 0)
            && ((IntFunction<long[]>) a -> IntStream.rangeClosed(0, a).mapToLong(i -> IntStream.rangeClosed(i, a).mapToLong(t -> C[a][t] * s[t][i] % 1000000007L * rs[a - t] % 1000000007L).sum() % 1000000007L).toArray()) instanceof IntFunction<long[]> F
            && ((BinaryOperator<long[]>) (x, y) -> IntStream.range(0, x.length + y.length - 1).mapToLong(k -> IntStream.rangeClosed(Math.max(0, k - y.length + 1), Math.min(k, x.length - 1)).mapToLong(i -> x[i] * y[k - i] % 1000000007L).sum() % 1000000007L).toArray()) instanceof BinaryOperator<long[]> conv
            && conv.apply(conv.apply(F.apply(cnt[1]), F.apply(cnt[2])), IntStream.rangeClosed(0, c).mapToLong(l -> fact[c] * s[c][l] % 1000000007L).toArray()) instanceof long[] tot
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(n - i + 1 - cyc0 >= 0 && n - i + 1 - cyc0 < tot.length ? tot[(int) (n - i + 1 - cyc0)] : 0)).collect(Collectors.joining(" "))
            : "");
    }
}
