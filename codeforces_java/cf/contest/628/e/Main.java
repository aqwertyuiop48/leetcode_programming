import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Integer.valueOf(IntStream.range(0, raw.length).filter(k -> raw[k] == 10).findFirst().getAsInt()) instanceof Integer nl
            && new String(raw, 0, nl).trim().split("\\s+") instanceof String[] hh && Integer.valueOf(hh[0]) instanceof Integer n && Integer.valueOf(hh[1]) instanceof Integer m
            && Integer.valueOf(m + (raw[nl - 1] == 13 ? 2 : 1)) instanceof Integer w && Integer.valueOf(nl + 1) instanceof Integer base
            && new short[n * m] instanceof short[] Ls && new short[n * m] instanceof short[] Rs
            && IntStream.range(0, n).filter(i -> IntStream.range(0, m).filter(j -> (Ls[i * m + j] = (short) (raw[base + i * w + j] == 122 ? 1 + (j > 0 ? Ls[i * m + j - 1] : 0) : 0)) >= 0).count() >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> IntStream.iterate(m - 1, j -> j >= 0, j -> j - 1).filter(j -> (Rs[i * m + j] = (short) (raw[base + i * w + j] == 122 ? 1 + (j < m - 1 ? Rs[i * m + j + 1] : 0) : 0)) >= 0).count() >= 0).count() >= 0
            && new int[n + 4] instanceof int[] bit && new int[n + 3] instanceof int[] head && new int[n + 3] instanceof int[] nx && new int[n + 3] instanceof int[] ur && new int[]{0, 0, 0, 0, n + 3, 0} instanceof int[] g
            && new IntUnaryOperator[3] instanceof IntUnaryOperator[] f
            && (f[0] = p -> (g[5] = p) * 0 + ++bit[Math.min(g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])] + ++bit[Math.min(g[5] += g[5] & -g[5], g[4])]) != null
            && (f[1] = p -> p <= 0 ? 0 : (g[5] = p) * 0 + bit[g[5]] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1] + bit[g[5] &= g[5] - 1]) != null
            && (f[2] = a -> a < 0 ? 0 : f[0].applyAsInt(a - g[0] + 1) + (++g[3]) * 0 + f[2].applyAsInt(nx[a])) != null
            ? IntStream.range(0, n + m - 1).mapToLong(s -> Integer.valueOf(Math.max(0, s - m + 1)) instanceof Integer lo && Integer.valueOf(Math.min(n - 1, s)) instanceof Integer hi
                && (g[0] = lo) >= 0 && (g[1] = hi) >= 0 && (g[2] = hi - lo + 1) > 0 && (g[3] = 0) == 0
                && IntStream.rangeClosed(0, hi - lo + 2).filter(p -> (bit[p] = 0) > 0).count() == 0 && IntStream.rangeClosed(lo, hi + 1).filter(t -> (head[t] = -1) > 0).count() == 0
                ? IntStream.rangeClosed(lo, hi).mapToLong(b -> Integer.valueOf(b * m + s - b) instanceof Integer id && Integer.valueOf(b - lo + 1) instanceof Integer pb && f[2].applyAsInt(head[b]) >= 0
                    && (ur[b] = raw[base + b * w + s - b] == 122 ? 1 + (b > lo ? ur[b - 1] : 0) : 0) >= 0
                    ? (raw[base + b * w + s - b] == 122
                        ? (Integer.valueOf(b + Ls[id]) instanceof Integer t && (t <= hi ? (nx[b] = head[t]) >= -1 & (head[t] = b) >= 0 : true)
                            && Integer.valueOf(Math.max(lo, b - Math.min(Rs[id], ur[b]) + 1)) instanceof Integer sb
                            ? (long) (b - sb + 1) - (g[3] - f[1].applyAsInt(sb - lo)) : 0L)
                        : 0L) : 0L).sum() : 0L).sum() : -1L);
    }
}
