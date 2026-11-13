import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && new boolean[n] instanceof boolean[] red && new int[n] instanceof int[] r && new int[n] instanceof int[] b
            && IntStream.range(0, n).allMatch(i -> sc.next().charAt(0) == 'R' ? (red[i] = true) && (r[i] = sc.nextInt()) >= 0 && (b[i] = sc.nextInt()) >= 0 : (r[i] = sc.nextInt()) >= 0 && (b[i] = sc.nextInt()) >= 0)
            && Integer.valueOf(IntStream.range(0, n).filter(i -> red[i]).map(i -> 1 << i).sum()) instanceof Integer redMask
            && Integer.valueOf(n * (n - 1) / 2 + 1) instanceof Integer w
            && new int[(1 << n) * w] instanceof int[] dp
            && IntStream.range(0, dp.length).allMatch(i -> (dp[i] = -1) < 0)
            && (dp[0] = 0) == 0
            && IntStream.range(0, 1 << n).filter(mask -> Integer.valueOf(Integer.bitCount(mask & redMask)) instanceof Integer ra && Integer.valueOf(Integer.bitCount(mask) - ra) instanceof Integer ba
                && IntStream.range(0, n).filter(i -> (mask >> i & 1) == 0).filter(i -> Integer.valueOf(Math.min(r[i], ra)) instanceof Integer dr && Integer.valueOf(Math.min(b[i], ba)) instanceof Integer db
                    && Integer.valueOf(mask * w) instanceof Integer from && Integer.valueOf((mask | 1 << i) * w + dr) instanceof Integer to
                    && IntStream.range(0, w - dr).filter(s -> dp[from + s] >= 0).filter(s -> (dp[to + s] = Math.max(dp[to + s], dp[from + s] + db)) < 0).count() >= 0).count() >= 0).count() >= 0
            ? IntStream.range(0, w).filter(s -> dp[((1 << n) - 1) * w + s] >= 0).map(s -> Math.max(IntStream.of(r).sum() - s, IntStream.of(b).sum() - dp[((1 << n) - 1) * w + s]) + n).min().getAsInt() : "");
    }
}
