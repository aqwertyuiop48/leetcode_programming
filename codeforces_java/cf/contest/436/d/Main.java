import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.concat(IntStream.of(0), IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).sorted()).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] sp
            && new int[200002] instanceof int[] pref && IntStream.of(sp).allMatch(x -> (pref[x] = 1) == 1) && IntStream.rangeClosed(1, 200001).allMatch(x -> (pref[x] += pref[x - 1]) >= 0)
            && new boolean[n + 1] instanceof boolean[] isB && IntStream.rangeClosed(0, n).allMatch(j -> (isB[j] = j == 0 || j == n || a[j + 1] != a[j] + 1) || true)
            && new int[n + 1] instanceof int[] prevB && IntStream.rangeClosed(0, n).allMatch(j -> (prevB[j] = isB[j] ? j : prevB[j - 1]) >= 0)
            && new int[n + 2] instanceof int[] nextB && IntStream.rangeClosed(0, n).map(j -> n - j).allMatch(j -> (nextB[j] = isB[j] ? j : nextB[j + 1]) >= 0)
            && new int[n + 1] instanceof int[] dp
            && ((java.util.function.IntBinaryOperator) (l, r) -> pref[Math.min(Math.max(r, 0), 200001)] - pref[Math.min(Math.max(l - 1, 0), 200001)]) instanceof java.util.function.IntBinaryOperator cnt
            && IntStream.rangeClosed(1, n).filter(s -> isB[s - 1]).allMatch(s -> (Integer) nextB[s] instanceof Integer e && (Integer) a[s] instanceof Integer P && (Integer) a[e] instanceof Integer Q
                && new int[]{dp[s - 1] + cnt.applyAsInt(P, Q)} instanceof int[] D
                && (Integer) (Arrays.binarySearch(sp, P) >= 0 ? Arrays.binarySearch(sp, P) : -Arrays.binarySearch(sp, P) - 1) instanceof Integer idxL
                && IntStream.iterate(idxL - 1, q -> q >= 0 && P - sp[q] <= s - 1, q -> q - 1).allMatch(q -> (Integer) prevB[s - 1 - (P - sp[q])] instanceof Integer j && (D[0] = Math.max(D[0], dp[j] + cnt.applyAsInt(P - (s - 1 - j), Q))) >= 0)
                && (dp[e] = Math.max(dp[e], Math.max(D[0], dp[s - 1]))) >= 0
                && (Integer) (Arrays.binarySearch(sp, Q) >= 0 ? Arrays.binarySearch(sp, Q) + 1 : -Arrays.binarySearch(sp, Q) - 1) instanceof Integer idxR
                && IntStream.range(idxR, m).takeWhile(q -> sp[q] - Q <= n - e).allMatch(q -> (Integer) nextB[e + sp[q] - Q] instanceof Integer i && (dp[i] = Math.max(dp[i], D[0] + cnt.applyAsInt(Q + 1, Q + i - e))) >= 0))
            ? dp[n] : 0);
    }
}
