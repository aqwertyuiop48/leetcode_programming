import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Integer.valueOf((int) t[3 * n - 1]) instanceof Integer s
            && new int[n + 1] instanceof int[] head
            && new int[2 * n] instanceof int[] nxt
            && new int[2 * n] instanceof int[] to
            && new int[n + 1] instanceof int[] par
            && new int[n] instanceof int[] order
            && new int[]{1} instanceof int[] tl
            && new long[n + 1] instanceof long[] dp
            && new long[n + 1] instanceof long[] lf
            && ((IntFunction<IntStream>) v -> IntStream.iterate(head[v], e -> e > 0, e -> nxt[e]).map(e -> to[e]).filter(c -> c != par[v])) instanceof IntFunction<IntStream> ch
            && IntStream.range(0, n - 1).allMatch(j -> Integer.valueOf((int) t[n + 1 + 2 * j]) instanceof Integer a
                && Integer.valueOf((int) t[n + 2 + 2 * j]) instanceof Integer b
                && (to[2 * j + 1] = b) > 0 && (nxt[2 * j + 1] = head[a]) >= 0 && (head[a] = 2 * j + 1) > 0
                && (to[2 * j + 2] = a) > 0 && (nxt[2 * j + 2] = head[b]) >= 0 && (head[b] = 2 * j + 2) > 0)
            && (order[0] = s) > 0
            && IntStream.range(0, n).allMatch(i -> ch.apply(order[i]).allMatch(c -> (par[c] = order[i]) > 0 && (order[tl[0]++] = c) > 0))
            && IntStream.range(0, n).map(i -> order[n - 1 - i]).allMatch(v -> Long.valueOf(t[v] - (v == s ? 0 : 1)) instanceof Long kk
                && ch.apply(v).mapToLong(c -> dp[c]).boxed().sorted(Comparator.reverseOrder()).limit(kk).collect(Collectors.summarizingLong(x -> x)) instanceof LongSummaryStatistics S
                && Long.valueOf(ch.apply(v).mapToLong(c -> lf[c]).sum()) instanceof Long left
                && Long.valueOf(kk - S.getCount()) instanceof Long rem
                && Long.valueOf(Math.min(rem, left)) instanceof Long m
                && (lf[v] = rem - m) >= 0
                && (dp[v] = (v == s ? 0 : 1) + S.getSum() + S.getCount() + 2 * m) >= 0)
            ? dp[s] : 0L);
    }
}

