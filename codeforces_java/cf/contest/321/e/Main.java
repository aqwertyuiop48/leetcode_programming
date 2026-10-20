import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] bs
            && Integer.valueOf(IntStream.range(0, bs.length).filter(i -> bs[i] == '\n').findFirst().getAsInt()) instanceof Integer nl
            && Arrays.stream(new String(bs, 0, nl).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] nk
            && Integer.valueOf(nk[0]) instanceof Integer n && Integer.valueOf(nk[1]) instanceof Integer k && Integer.valueOf(n + 1) instanceof Integer w
            && new int[w * w] instanceof int[] ps && new int[]{0} instanceof int[] cur
            && IntStream.range(nl + 1, bs.length).filter(i -> bs[i] >= '0' && bs[i] <= '9')
                .filter(i -> Integer.valueOf(cur[0]++) instanceof Integer p && Integer.valueOf(p / n + 1) instanceof Integer r && Integer.valueOf(p % n + 1) instanceof Integer c
                    && (ps[r * w + c] = bs[i] - '0' + ps[(r - 1) * w + c] + ps[r * w + c - 1] - ps[(r - 1) * w + c - 1]) < 0).count() == 0
            && ((IntBinaryOperator) (l, r) -> (ps[r * w + r] - ps[(l - 1) * w + r] - ps[r * w + l - 1] + ps[(l - 1) * w + l - 1]) / 2) instanceof IntBinaryOperator cost
            && new int[k + 1][n + 1] instanceof int[][] dp && new int[1] instanceof int[] gh
            && IntStream.rangeClosed(1, n).map(i -> dp[1][i] = cost.applyAsInt(1, i)).max().orElse(0) >= 0
            && new AtomicReference<Function<int[], Integer>>() instanceof AtomicReference<Function<int[], Integer>> rec
            && rec.getAndSet(a -> a[0] > a[1] ? 0
                : Integer.valueOf((a[0] + a[1]) / 2) instanceof Integer mid
                && Long.valueOf(IntStream.rangeClosed(a[2], Math.min(mid - 1, a[3])).mapToLong(j -> ((long) (dp[gh[0] - 1][j] + cost.applyAsInt(j + 1, mid)) << 16) | j).min().getAsLong()) instanceof Long v
                && (dp[gh[0]][mid] = (int) (v >> 16)) >= 0 && Integer.valueOf((int) (v & 65535)) instanceof Integer bj
                ? rec.get().apply(new int[]{a[0], mid - 1, a[2], bj}) + rec.get().apply(new int[]{mid + 1, a[1], bj, a[3]}) : 0) == null
            && IntStream.rangeClosed(2, k).map(g -> (gh[0] = g) + rec.get().apply(new int[]{g, n, g - 1, n - 1})).max().orElse(0) >= 0
            ? dp[k][n] : "");
    }
}
