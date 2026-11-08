import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer k && Integer.valueOf((int) tk[2]) instanceof Integer q
            && Integer.valueOf((int) Arrays.stream(tk, 3, 3 + n + q).max().getAsLong()) instanceof Integer M
            && new int[M + 1] instanceof int[] spf && new int[M + 1] instanceof int[] cnt && new int[256] instanceof int[] dv && new int[256] instanceof int[] ph && new long[5] instanceof long[] sv
            && IntStream.rangeClosed(2, Math.min(M, (int) Math.sqrt(M) + 1)).filter(p -> spf[p] == 0).mapToLong(p -> IntStream.iterate(p * p, j -> j <= M, j -> j + p).filter(j -> spf[j] == 0 && (spf[j] = p) > 0).count()).sum() >= 0
            && Integer.valueOf(n + q + 1) instanceof Integer N && new long[N + 1] instanceof long[] fact && new long[N + 1] instanceof long[] invf && (fact[0] = 1) == 1
            && IntStream.rangeClosed(1, N).filter(i -> (fact[i] = fact[i - 1] * i % 1000000007L) > 0).count() >= 0
            && (invf[N] = BigInteger.valueOf(fact[N]).modInverse(BigInteger.valueOf(1000000007L)).longValue()) > 0
            && IntStream.iterate(N, i -> i > 0, i -> i - 1).filter(i -> (invf[i - 1] = invf[i] * i % 1000000007L) > 0).count() >= 0
            && new long[N + 1] instanceof long[] g && IntStream.rangeClosed(0, N).filter(c -> (g[c] = c < k - 1 ? 0L : fact[c] * invf[k - 1] % 1000000007L * invf[c - k + 1] % 1000000007L) >= 0).count() >= 0
            ? IntStream.range(0, n + q).mapToObj(idx -> Integer.valueOf((int) tk[3 + idx]) instanceof Integer x
                && (dv[0] = 1) > 0 && (ph[0] = 1) > 0 && (sv[0] = 1) > 0 && (sv[1] = 0) == 0 && (sv[2] = 0) == 0 && (sv[3] = x) > 0
                && IntStream.range(0, 20).allMatch(z -> sv[3] == 1 || Integer.valueOf(spf[(int) sv[3]] == 0 ? (int) sv[3] : spf[(int) sv[3]]) instanceof Integer p
                    && Integer.valueOf(p == sv[2] ? (int) sv[1] : 0) instanceof Integer from && Integer.valueOf(p == sv[2] ? p : p - 1) instanceof Integer mu && Integer.valueOf((int) sv[0]) instanceof Integer sz
                    && IntStream.range(from, sz).filter(j -> (dv[sz + j - from] = dv[j] * p) > 0 & (ph[sz + j - from] = ph[j] * mu) > 0).count() >= 0
                    && (sv[1] = sz) >= 0 && (sv[0] = sz + sz - from) > 0 && (sv[2] = p) > 0 && (sv[3] /= p) > 0)
                && IntStream.range(0, (int) sv[0]).filter(j -> (sv[4] += ph[j] * g[cnt[dv[j]]]) >= 0 && ++cnt[dv[j]] > 0).count() >= 0 && (sv[4] %= 1000000007L) >= 0
                ? idx >= n ? String.valueOf(sv[4]) : null : null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
