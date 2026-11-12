import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k0
            && new double[n] instanceof double[] p && IntStream.range(0, n).filter(i -> (p[i] = Double.parseDouble(sc.next())) >= 0).count() >= 0
            && Integer.valueOf(Math.min(k0, (int) Arrays.stream(p).filter(v -> v > 0).count())) instanceof Integer k && Double.valueOf(Arrays.stream(p).sum()) instanceof Double tot
            && new double[1 << n] instanceof double[] dp && new double[1 << n] instanceof double[] sm && new double[n] instanceof double[] ans && (dp[0] = 1) == 1
            && IntStream.range(0, 1 << (n + 5)).filter(c -> ((c & 31) != 0 || (c >> 5) == 0 || (sm[c >> 5] = sm[(c >> 5) & ((c >> 5) - 1)] + p[Integer.numberOfTrailingZeros(c >> 5)]) >= 0)
                && (c & 31) < n && dp[c >> 5] > 0
                && (Integer.bitCount(c >> 5) == k ? (((c >> 5) >> (c & 31)) & 1) != 0 && (ans[c & 31] += dp[c >> 5]) >= 0
                    : (((c >> 5) >> (c & 31)) & 1) == 0 && p[c & 31] > 0 && (dp[(c >> 5) | (1 << (c & 31))] += dp[c >> 5] * p[c & 31] / (tot - sm[c >> 5])) >= 0)).count() >= 0
            ? Arrays.stream(ans).mapToObj(v -> String.format(Locale.ROOT, "%.10f", v)).collect(Collectors.joining(" ")) : "");
    }
}
