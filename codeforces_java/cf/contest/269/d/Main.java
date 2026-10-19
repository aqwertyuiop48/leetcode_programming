import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Long.valueOf(it.nextLong()) instanceof Long t
            && new long[n + 2] instanceof long[] H && new long[n + 2] instanceof long[] L && new long[n + 2] instanceof long[] R
            && IntStream.rangeClosed(1, n).allMatch(i -> (H[i] = it.nextLong()) >= 0 && (L[i] = it.nextLong()) > -1 << 40 && (R[i] = it.nextLong()) > -1 << 40)
            && (H[0] = t) == t && (L[0] = -4000000000L) < 0 && (R[0] = 4000000000L) > 0 && (L[n + 1] = -4000000000L) < 0 && (R[n + 1] = 4000000000L) > 0
            && IntStream.range(0, 2 * n).boxed().sorted(Comparator.comparingLong((Integer e) -> (e % 2 == 0 ? L[e / 2 + 1] : R[e / 2 + 1]) * 2 + (e % 2 == 1 ? 0 : 1))).mapToInt(x -> x).toArray() instanceof int[] ev
            && new TreeMap<Long, Integer>(Map.of(t, 0, 0L, n + 1)) instanceof TreeMap<Long, Integer> tm && new HashMap<Long, Long>() instanceof HashMap<Long, Long> edges
            && Long.valueOf(n + 2) instanceof Long K
            && Arrays.stream(ev).allMatch(e -> Integer.valueOf(e / 2 + 1) instanceof Integer p
                && (e % 2 == 1 ? tm.remove(H[p]) != null
                    : Integer.valueOf(tm.higherEntry(H[p]).getValue()) instanceof Integer u && Integer.valueOf(tm.lowerEntry(H[p]).getValue()) instanceof Integer lo
                        && (edges.remove(u * K + lo) != null || true)
                        && (Math.min(R[u], R[p]) - L[p] <= 0 || edges.put(u * K + p, Math.min(R[u], R[p]) - L[p]) == null || true)
                        && (Math.min(R[p], R[lo]) - L[p] <= 0 || edges.put(p * K + lo, Math.min(R[p], R[lo]) - L[p]) == null || true)
                        && tm.put(H[p], p) == null || true))
            && new long[n + 2] instanceof long[] dp && (dp[0] = Long.MAX_VALUE) > 0
            && edges.entrySet().stream().sorted(Comparator.comparingLong((Map.Entry<Long, Long> en) -> -H[(int) (en.getKey() / K)])).allMatch(en -> Integer.valueOf((int) (en.getKey() / K)) instanceof Integer u && Integer.valueOf((int) (en.getKey() % K)) instanceof Integer v
                && (dp[v] = Math.max(dp[v], Math.min(dp[u], en.getValue()))) >= 0)
            ? dp[n + 1] : "");
    }
}
