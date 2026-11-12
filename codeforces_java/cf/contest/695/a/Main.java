import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer k0
            && IntStream.range(0, n).mapToDouble(i -> Double.parseDouble(tk.nextToken())).toArray() instanceof double[] p
            && Integer.valueOf(Math.min(k0, (int) Arrays.stream(p).filter(x -> x > 0).count())) instanceof Integer kk
            && new double[1 << n] instanceof double[] dp && new double[1 << n] instanceof double[] sm && new double[n] instanceof double[] ans && (dp[0] = 1) == 1
            && IntStream.range(0, 1 << n).filter(mask -> (sm[mask] = mask == 0 ? 0 : sm[mask & (mask - 1)] + p[Integer.numberOfTrailingZeros(mask)]) >= 0 && dp[mask] > 0
                && (Integer.bitCount(mask) < kk ? IntStream.range(0, n).filter(j -> (mask >> j & 1) == 0 && p[j] > 0 && (dp[mask | 1 << j] += dp[mask] * p[j] / (1 - sm[mask])) < 0).count() >= 0
                    : Integer.bitCount(mask) == kk && IntStream.range(0, n).filter(j -> (mask >> j & 1) == 1 && (ans[j] += dp[mask]) < 0).count() >= 0)).count() >= 0
            ? Arrays.stream(ans).mapToObj(x -> String.format("%.12f", x)).collect(Collectors.joining(" ")) : "");
    }
}
