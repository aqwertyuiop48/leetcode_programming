import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && ((LongPredicate) D -> new int[n] instanceof int[] dp
                && IntStream.range(0, n).allMatch(i -> (dp[i] = Math.min(i, IntStream.range(0, i).filter(j -> Math.abs((long) a[i] - a[j]) <= D * (i - j)).map(j -> dp[j] + i - j - 1).min().orElse(i))) >= 0)
                && IntStream.range(0, n).map(i -> dp[i] + n - 1 - i).min().getAsInt() <= k) instanceof LongPredicate feas
            && new long[]{0, 2000000000L} instanceof long[] lh
            && IntStream.range(0, 33).allMatch(z -> Long.valueOf((lh[0] + lh[1]) / 2) instanceof Long mid && (lh[0] >= lh[1] || (feas.test(mid) ? (lh[1] = mid) : (lh[0] = mid + 1)) >= 0))
            ? lh[0] : "");
    }
}
