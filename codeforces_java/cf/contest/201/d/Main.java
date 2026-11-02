import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new HashMap<String, Integer>() instanceof HashMap<String, Integer> id && IntStream.range(0, n).allMatch(i -> id.put(tk.nextToken(), i) == null)
            && (Integer) (n * (n - 1) / 2 + 1) instanceof Integer inv0 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.rangeClosed(1, m).mapToObj(idx -> IntStream.range(0, Integer.parseInt(tk.nextToken())).mapToObj(i -> tk.nextToken()).map(id::get).filter(Objects::nonNull).mapToInt(Integer::intValue).toArray()).toArray(int[][]::new) instanceof int[][] arcs
            && new int[(1 << n) * inv0] instanceof int[] dp && new int[]{inv0} instanceof int[] g && new int[1] instanceof int[] cn && new int[1 << n] instanceof int[] lo && new int[1 << n] instanceof int[] hi
            && new int[1 << n] instanceof int[] F && IntStream.range(1, 1 << n).allMatch(mk -> (F[mk] = F[mk ^ Integer.highestOneBit(mk)] + 32 - Integer.numberOfLeadingZeros(mk) - Integer.bitCount(mk)) >= 0)
            ? IntStream.rangeClosed(1, 4).map(e -> Math.min(inv0, 1 << 2 * e)).distinct().mapToObj(bound -> (Integer) (g[0] = bound) instanceof Integer bb
                ? IntStream.rangeClosed(1, m).mapToObj(idx -> arcs[idx - 1] instanceof int[] arr
                && (Integer) arr.length instanceof Integer len
                && IntStream.range(0, n).allMatch(j -> IntStream.of(arr).anyMatch(x -> x == j))
                && new int[(len + 1) * n] instanceof int[] nxt
                && IntStream.range(0, n).allMatch(j -> (nxt[len * n + j] = len) >= 0)
                && IntStream.iterate(len - 1, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.range(0, n).allMatch(j -> (nxt[i * n + j] = arr[i] == j ? i : nxt[(i + 1) * n + j]) >= 0))
                && (Integer) (cn[0] += 1024) instanceof Integer base && Stream.of(0).peek(z -> Arrays.fill(lo, inv0)).peek(z -> Arrays.fill(hi, -1)).findFirst().isPresent() && (dp[0] = base) > 0 && (lo[0] = 0) == 0 && (hi[0] = 0) == 0
                && IntStream.range(0, 1 << n).allMatch(mask -> hi[mask] < 0 || IntStream.range(lo[mask] << 4, Math.max(lo[mask], Math.min(hi[mask] + 1, g[0] - F[mask])) << 4).allMatch(t -> (t & 15) >= n || (mask >> (t & 15) & 1) == 1
                    || (t >> 4) + Integer.bitCount(mask >> ((t & 15) + 1)) + F[(mask | 1 << (t & 15))] >= g[0] || dp[mask * inv0 + (t >> 4)] < base || nxt[(dp[mask * inv0 + (t >> 4)] - base) * n + (t & 15)] >= len
                    || (dp[(mask | 1 << (t & 15)) * inv0 + Integer.bitCount(mask >> ((t & 15) + 1)) + (t >> 4)] = Math.min(dp[(mask | 1 << (t & 15)) * inv0 + Integer.bitCount(mask >> ((t & 15) + 1)) + (t >> 4)] < base ? Integer.MAX_VALUE : dp[(mask | 1 << (t & 15)) * inv0 + Integer.bitCount(mask >> ((t & 15) + 1)) + (t >> 4)], base + nxt[(dp[mask * inv0 + (t >> 4)] - base) * n + (t & 15)] + 1)) > 0
                        && (lo[(mask | 1 << (t & 15))] = Math.min(lo[(mask | 1 << (t & 15))], (t >> 4) + Integer.bitCount(mask >> ((t & 15) + 1)))) >= 0 && (hi[(mask | 1 << (t & 15))] = Math.max(hi[(mask | 1 << (t & 15))], (t >> 4) + Integer.bitCount(mask >> ((t & 15) + 1)))) >= 0))
                && (Integer) IntStream.range(0, inv0).filter(iv -> dp[((1 << n) - 1) * inv0 + iv] >= base).findFirst().orElse(-1) instanceof Integer x && x >= 0 && (g[0] = Math.min(g[0], x)) >= 0
                ? new int[]{idx, n * (n - 1) / 2 - x + 1} : null)
                .filter(Objects::nonNull).max(Comparator.<int[]>comparingInt(r -> r[1]).thenComparingInt(r -> -r[0]))
                : Optional.<int[]>empty()).filter(Optional::isPresent).findFirst().map(o -> o.get()).map(r -> r[0] + "\n[:" + "|".repeat(r[1]) + ":]").orElse("Brand new problem!") : "");
    }
}
