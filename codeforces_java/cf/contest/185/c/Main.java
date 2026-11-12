
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && (Integer) t[0] instanceof Integer n
            && new int[n * n * n * n] instanceof int[] dp
            && new int[n * n * n * n] instanceof int[] bp
            && new int[n * n] instanceof int[] w
            && new int[n * n] instanceof int[] d
            && new int[(n + 1) * n] instanceof int[] bb
            && new AtomicReference<Function<int[], Integer>>() instanceof AtomicReference<Function<int[], Integer>> S
            && new AtomicReference<Function<int[], Integer>>() instanceof AtomicReference<Function<int[], Integer>> R
            && IntStream.range(0, n).map(i -> IntStream.range(0, n - i).map(j -> w[i * n + j] = t[n + 1 + i * n - i * (i - 1) / 2 + j]).sum()).max().isPresent()
            && S.getAndSet(a -> (Integer) Math.max(a[2], a[1]) instanceof Integer l && (Integer) Math.min(a[3], a[1] + a[0]) instanceof Integer r
                ? (l > r ? 0
                    : (Integer) (((a[0] * n + a[1]) * n + l) * n + r) instanceof Integer ix
                        ? (a[0] == 0 ? (dp[ix] = (t[1 + a[1]] >= w[a[1]] ? t[1 + a[1]] : 0) + 1) - 1
                            : dp[ix] > 0 ? dp[ix] - 1
                            : new int[]{0} instanceof int[] ret
                                && IntStream.rangeClosed(l - 1, r).map(k -> (Integer) (S.get().apply(new int[]{a[0] - 1, a[1], l, k}) + S.get().apply(new int[]{a[0] - 1, a[1] + 1, k + 1, r})) instanceof Integer tmp
                                    && tmp > ret[0] && (ret[0] = tmp) >= 0 && (bp[ix] = k) >= 0 ? 1 : 0).sum() >= 0
                                && (dp[ix] = (ret[0] < w[a[0] * n + a[1]] ? 0 : ret[0]) + 1) >= 0 ? dp[ix] - 1 : 0)
                        : 0)
                : 0) == null
            && R.getAndSet(b -> (Integer) Math.max(b[2], b[1]) instanceof Integer l && (Integer) Math.min(b[3], b[1] + b[0]) instanceof Integer r && l <= r
                && (Integer) (((b[0] * n + b[1]) * n + l) * n + r) instanceof Integer ix && dp[ix] - 1 != 0
                && (d[b[0] * n + b[1]] = b[4]) >= 0
                && (b[0] == 0 || (R.get().apply(new int[]{b[0] - 1, b[1], l, bp[ix], 2}) + R.get().apply(new int[]{b[0] - 1, b[1] + 1, bp[ix] + 1, r, 1})) >= 0) ? 0 : 0) == null
            && S.get().apply(new int[]{n - 1, 0, 0, n - 1}) != 0
            && R.get().apply(new int[]{n - 1, 0, 0, n - 1, 0}) >= 0
            && IntStream.range(0, n).map(i -> bb[i] = t[1 + i]).max().isPresent()
            && IntStream.range(0, n).map(i -> IntStream.range(0, n - i).map(j -> bb[i * n + j] < w[i * n + j] ? bb[i * n + j] = 0 : 0).sum()
                + IntStream.range(0, n - i).map(j -> d[i * n + j] == 1 ? bb[(i + 1) * n + j - 1] += bb[i * n + j] : d[i * n + j] == 2 ? bb[(i + 1) * n + j] += bb[i * n + j] : 0).sum()).max().isPresent()
            && bb[(n - 1) * n] > 0 ? "Cerealguy" : "Fat Rat");
    }
}



