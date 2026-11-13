import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Integer.valueOf(raw.length) instanceof Integer len
            && new int[len / 2 + 2] instanceof int[] t && new int[4] instanceof int[] f0
            && IntStream.range(0, len + 1).map(i -> Integer.valueOf(i < len ? raw[i] : 32) instanceof Integer c
                ? (c >= 48 && c <= 57 ? (f0[3] = f0[3] * 10 + c - 48) + (f0[1] = 1) : (f0[1] == 1 ? (t[f0[2]++] = f0[0] == 1 ? -f0[3] : f0[3]) + (f0[3] = 0) + (f0[0] = 0) + (f0[1] = 0) : 0)
                    + (c == 45 ? (f0[0] = 1) : 0)) * 0 : 0).sum() == 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Long.valueOf(1000000007L) instanceof Long MOD
            && new int[n] instanceof int[] l0 && new int[n] instanceof int[] l1 && new int[m + 1] instanceof int[] cnt
            && IntStream.generate(() -> -1).limit(m + 1).toArray() instanceof int[] o1 && IntStream.generate(() -> -1).limit(m + 1).toArray() instanceof int[] o2
            && new int[1] instanceof int[] pp && Integer.valueOf(pp[0] = 2) != null
            && IntStream.range(0, n).filter(c -> Integer.valueOf(t[pp[0]]) instanceof Integer k && (l0[c] = t[pp[0] + 1]) != 0 && (l1[c] = k == 2 ? t[pp[0] + 2] : 0) >= -1000000000
                && (cnt[Math.abs(l0[c])]++ == 0 ? (o1[Math.abs(l0[c])] = c) : (o2[Math.abs(l0[c])] = c)) >= -1
                && (k == 2 ? (cnt[Math.abs(l1[c])]++ == 0 ? (o1[Math.abs(l1[c])] = c) : (o2[Math.abs(l1[c])] = c)) : 0) >= -1
                && (pp[0] += 1 + k) < 0).count() >= 0
            && new boolean[n] instanceof boolean[] vis && new long[4] instanceof long[] f && new long[4] instanceof long[] nf && new long[2] instanceof long[] g && new long[2] instanceof long[] tot
            && Long.valueOf(tot[0] = 1) != null && new int[2] instanceof int[] iv && new int[2] instanceof int[] nc
            && ((IntUnaryOperator) c -> Integer.valueOf(iv[0]) instanceof Integer ivv
                && Integer.valueOf(ivv > 0 ? (Math.abs(l0[c]) == ivv ? 0 : 1) : l1[c] != 0 && cnt[Math.abs(l1[c])] == 1 ? 1 : cnt[Math.abs(l0[c])] == 1 ? 0 : -1) instanceof Integer inIdx
                && Integer.valueOf(inIdx == 0 ? l0[c] : inIdx == 1 ? l1[c] : 0) instanceof Integer inL
                && Integer.valueOf(inIdx == 1 ? l0[c] : inIdx == 0 ? l1[c] : l0[c]) instanceof Integer outL
                && Long.valueOf(ivv == 0 ? (f[2] = inIdx >= 0 ? 1 : 0) : 0) != null
                && IntStream.range(0, 4).filter(z -> (nf[z] = 0) != 0).count() == 0
                && IntStream.range(0, 8).filter(z -> Integer.valueOf((z >> 2) & 1) instanceof Integer v && Integer.valueOf((z >> 1) & 1) instanceof Integer p && Integer.valueOf(z & 1) instanceof Integer w
                    && f[v * 2 + p] != 0 && (outL != 0 || w == 0)
                    && Integer.valueOf(w * 2 + (p ^ ((inL == 0 ? 0 : inL > 0 ? v : 1 - v) | (outL == 0 ? 0 : outL > 0 ? w : 1 - w)))) instanceof Integer dst
                    && (nf[dst] = (nf[dst] + f[v * 2 + p]) % MOD) < 0).count() == 0
                && IntStream.range(0, 4).filter(z -> (f[z] = nf[z]) != 0).count() >= 0
                && Boolean.valueOf(vis[c] = true) != null
                && Integer.valueOf(outL != 0 && cnt[Math.abs(outL)] == 2 ? Math.abs(outL) : 0) instanceof Integer ov
                ? (iv[0] = ov) * 0 + (nc[0] = ov > 0 ? (o1[ov] == c ? o2[ov] : o1[ov]) : -1) * 0 : -1) instanceof IntUnaryOperator step
            && ((LongBinaryOperator) (g0, g1) -> Long.valueOf(tot[0] * g0 % MOD + tot[1] * g1 % MOD) instanceof Long n0 && Long.valueOf(tot[0] * g1 % MOD + tot[1] * g0 % MOD) instanceof Long n1
                ? (tot[0] = n0 % MOD) + (tot[1] = n1 % MOD) : -1L) instanceof LongBinaryOperator merge
            && IntStream.range(0, n).filter(c0 -> !vis[c0] && (cnt[Math.abs(l0[c0])] == 2 ? 1 : 0) + (l1[c0] != 0 && cnt[Math.abs(l1[c0])] == 2 ? 1 : 0) <= 1
                && IntStream.range(0, 4).filter(z -> (f[z] = z == 0 ? 1 : 0) < 0).count() == 0 && Integer.valueOf(iv[0] = 0) != null && Integer.valueOf(nc[0] = c0) != null
                && IntStream.iterate(c0, c -> c >= 0, c -> nc[0]).filter(c -> step.applyAsInt(c) < -1000).count() == 0
                && merge.applyAsLong((f[0] + f[2]) % MOD, (f[1] + f[3]) % MOD) >= 0).count() >= 0
            && IntStream.range(0, n).filter(c0 -> !vis[c0] && (g[0] = 0) == 0 && (g[1] = 0) == 0
                && IntStream.range(0, 2).filter(tt -> IntStream.range(0, 4).filter(z -> (f[z] = z == tt * 2 ? 1 : 0) < 0).count() == 0 && Integer.valueOf(iv[0] = Math.abs(l1[c0])) != null
                    && IntStream.iterate(c0, c -> c >= 0, c -> nc[0] == c0 ? -1 : nc[0]).filter(c -> step.applyAsInt(c) < -1000).count() == 0
                    && (g[0] += f[tt * 2]) >= 0 && (g[1] += f[tt * 2 + 1]) >= 0).count() >= 0
                && merge.applyAsLong(g[0] % MOD, g[1] % MOD) >= 0).count() >= 0
            ? tot[1] * LongStream.range(0, IntStream.rangeClosed(1, m).filter(v -> cnt[v] == 0).count()).reduce(1, (a, b) -> a * 2 % MOD) % MOD : "");
    }
}
