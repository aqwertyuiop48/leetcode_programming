import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[3] instanceof long[] st
            && (Integer) (int) IntStream.range(0, raw.length).filter(i -> raw[i] > 32 && (i == 0 || raw[i - 1] <= 32)).count() instanceof Integer tc
            && new long[tc] instanceof long[] tokH && new int[tc] instanceof int[] tokV
            && IntStream.range(0, raw.length).allMatch(i -> raw[i] <= 32 || ((st[0] = st[0] * 1000003L + raw[i]) | 1) != 0 && ((st[1] = st[1] * 10 + raw[i] - 48) | 1) != 0
                && ((i + 1 < raw.length && raw[i + 1] > 32) || ((tokH[(int) st[2]] = st[0]) | 1) != 0 && (tokV[(int) st[2]] = (int) st[1]) >= Integer.MIN_VALUE && ++st[2] > 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0))
            && (Integer) tokV[0] instanceof Integer n
            && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> id && IntStream.range(0, n).allMatch(i -> id.put(tokH[i + 1], i) == null)
            && (Integer) (n * (n - 1) / 2 + 1) instanceof Integer inv0 && (Integer) tokV[n + 1] instanceof Integer m
            && new int[m + 2] instanceof int[] sp && (sp[1] = n + 2) > 0 && IntStream.rangeClosed(1, m).allMatch(i -> (sp[i + 1] = sp[i] + tokV[sp[i]] + 1) > 0)
            && IntStream.rangeClosed(1, m).mapToObj(idx -> IntStream.range(sp[idx] + 1, sp[idx + 1]).map(p -> id.getOrDefault(tokH[p], -1)).filter(v -> v >= 0).toArray()).toArray(int[][]::new) instanceof int[][] arcs
            && new int[(1 << n) * inv0] instanceof int[] dp && new int[]{inv0} instanceof int[] g && new int[1] instanceof int[] cn && new int[1 << n] instanceof int[] lo && new int[1 << n] instanceof int[] hi
            && new int[]{0, inv0} instanceof int[] best
            && new int[1 << n] instanceof int[] F && IntStream.range(1, 1 << n).allMatch(mk -> (F[mk] = F[mk ^ Integer.highestOneBit(mk)] + 32 - Integer.numberOfLeadingZeros(mk) - Integer.bitCount(mk)) >= 0)
            && IntStream.rangeClosed(1, m).allMatch(idx -> (best[1] > 0 && arcs[idx - 1] instanceof int[] arr
                && (Integer) arr.length instanceof Integer len
                && new int[(len + 1) * n] instanceof int[] nxt
                && IntStream.range(0, n).allMatch(j -> (nxt[len * n + j] = len) >= 0)
                && IntStream.range(0, len * n).allMatch(r -> (Integer) (len * n - 1 - r) instanceof Integer q && (nxt[q] = arr[q / n] == q % n ? q / n : nxt[q + n]) >= 0)
                && IntStream.range(0, n).allMatch(j -> nxt[j] < len)
                && IntStream.of(4, 16, 64, inv0).anyMatch(bound -> (Integer) (g[0] = Math.min(bound, best[1])) instanceof Integer bb
                    && (Integer) (cn[0] += 524288) instanceof Integer base && Stream.of(0).peek(z -> Arrays.fill(lo, inv0)).peek(z -> Arrays.fill(hi, -1)).findFirst().isPresent() && (dp[0] = base) > 0 && (lo[0] = 0) == 0 && (hi[0] = 0) == 0
                    && IntStream.range(0, 1 << n).allMatch(mask -> hi[mask] < 0 || IntStream.range(lo[mask] << 4, Math.max(lo[mask], Math.min(hi[mask] + 1, g[0] - F[mask])) << 4).allMatch(t -> (t & 15) >= n || (mask >> (t & 15) & 1) == 1
                        || (t >> 4) + Integer.bitCount(mask >> ((t & 15) + 1)) + F[(mask | 1 << (t & 15))] >= g[0] || dp[mask * inv0 + (t >> 4)] < base || nxt[(dp[mask * inv0 + (t >> 4)] - base) * n + (t & 15)] >= len
                        || (dp[(mask | 1 << (t & 15)) * inv0 + Integer.bitCount(mask >> ((t & 15) + 1)) + (t >> 4)] = Math.min(dp[(mask | 1 << (t & 15)) * inv0 + Integer.bitCount(mask >> ((t & 15) + 1)) + (t >> 4)] < base ? Integer.MAX_VALUE : dp[(mask | 1 << (t & 15)) * inv0 + Integer.bitCount(mask >> ((t & 15) + 1)) + (t >> 4)], base + nxt[(dp[mask * inv0 + (t >> 4)] - base) * n + (t & 15)] + 1)) > 0
                            && (lo[(mask | 1 << (t & 15))] = Math.min(lo[(mask | 1 << (t & 15))], (t >> 4) + Integer.bitCount(mask >> ((t & 15) + 1)))) >= 0 && (hi[(mask | 1 << (t & 15))] = Math.max(hi[(mask | 1 << (t & 15))], (t >> 4) + Integer.bitCount(mask >> ((t & 15) + 1)))) >= 0))
                    && (Integer) IntStream.range(0, inv0).filter(iv -> dp[((1 << n) - 1) * inv0 + iv] >= base).findFirst().orElse(-1) instanceof Integer x && x >= 0 && x < best[1] && (best[1] = x) >= 0 && (best[0] = idx) > 0
                    || bound >= best[1])) || true)
            ? (best[0] == 0 ? "Brand new problem!" : best[0] + "\n[:" + "|".repeat(n * (n - 1) / 2 - best[1] + 1) + ":]") : "");
    }
}
