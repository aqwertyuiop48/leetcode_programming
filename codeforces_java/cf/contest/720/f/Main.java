import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf((int) Long.parseLong(tk.nextToken())) instanceof Integer K
            && new long[n + 1] instanceof long[] P
            && IntStream.range(0, n).allMatch(i -> (P[i + 1] = P[i] + Long.parseLong(tk.nextToken())) > Long.MIN_VALUE)
            && Integer.valueOf(n * (n + 1) / 2) instanceof Integer m
            && new long[m] instanceof long[] keys && new int[1] instanceof int[] pos
            && IntStream.range(0, n).allMatch(l -> IntStream.range(l, n).allMatch(r -> (keys[pos[0]++] = ((P[r + 1] - P[l]) << 22) | (long) (l * n + r)) != Long.MIN_VALUE))
            && Arrays.stream(new int[]{0}).peek(z -> Arrays.sort(keys)).sum() == 0
            && new long[n + 1] instanceof long[] mp
            && IntStream.rangeClosed(0, n).allMatch(x -> (mp[x] = x == 0 ? P[0] : Math.min(mp[x - 1], P[x])) > Long.MIN_VALUE)
            && new int[n + 2] instanceof int[] cov && new boolean[n] instanceof boolean[] isU
            && new int[n] instanceof int[] lastU && new int[n] instanceof int[] nu
            && new long[n] instanceof long[] dp && new long[n + 1] instanceof long[] pre
            && new int[4] instanceof int[] st && new long[1] instanceof long[] top
            && new long[]{Long.MIN_VALUE} instanceof long[] best
            && Integer.valueOf(Math.max(0, K - n)) instanceof Integer j0
            && IntStream.rangeClosed(0, K).allMatch(j ->
                (j == 0 || Long.valueOf(keys[m - j]) instanceof Long key && Integer.valueOf((int) (key & 4194303L)) instanceof Integer id
                    && cov[id / n]++ > Integer.MIN_VALUE && cov[id % n + 1]-- > Integer.MIN_VALUE && (top[0] += key >> 22) > Long.MIN_VALUE)
                && (j < j0 || Integer.valueOf(K - j) instanceof Integer c && (st[0] = 0) == 0 && (st[1] = -1) == -1 && (st[2] = 0) == 0 && (st[3] = n) == n
                    && IntStream.range(0, n).allMatch(p -> (st[0] += cov[p]) > Integer.MIN_VALUE && ((isU[p] = st[0] == 0) || true)
                        && (st[1] = isU[p] ? p : st[1]) > -5 && (lastU[p] = st[1]) > -5 && (st[2] += isU[p] ? 1 : 0) >= 0)
                    && IntStream.range(0, n).allMatch(q -> Integer.valueOf(n - 1 - q) instanceof Integer p && (nu[p] = st[3]) > -5 && (st[3] = isU[p] ? p : st[3]) > -5)
                    && ((c > st[2] || c == 0 && st[2] > 0)
                        || (c == 0 ? ((best[0] = Math.max(best[0], top[0])) != 0 || true)
                            : IntStream.range(0, n).allMatch(r -> (dp[r] = r >= st[3] ? P[r + 1] - mp[st[3]] : Long.MIN_VALUE / 4) > Long.MIN_VALUE)
                            && IntStream.range(1, c).allMatch(t -> (pre[0] = Long.MIN_VALUE / 4) < 0
                                && IntStream.range(0, n).allMatch(r -> (pre[r + 1] = Math.max(pre[r], dp[r] > Long.MIN_VALUE / 8 && nu[r] < n ? dp[r] - mp[nu[r]] : Long.MIN_VALUE / 4)) > Long.MIN_VALUE)
                                && IntStream.range(0, n).allMatch(rp -> (dp[rp] = lastU[rp] >= 0 && pre[lastU[rp]] > Long.MIN_VALUE / 8 ? P[rp + 1] + pre[lastU[rp]] : Long.MIN_VALUE / 4) > Long.MIN_VALUE))
                            && IntStream.range(0, n).filter(r -> r >= lastU[n - 1] && dp[r] > Long.MIN_VALUE / 8).mapToLong(r -> dp[r]).max() instanceof OptionalLong o
                            && (!o.isPresent() || (best[0] = Math.max(best[0], top[0] + o.getAsLong())) != 0 || true))))
                || true)
            ? String.valueOf(best[0]) : "");
    }
}
