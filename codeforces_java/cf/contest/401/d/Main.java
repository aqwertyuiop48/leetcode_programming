import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next().chars().map(c -> c - '0').toArray() instanceof int[] d
            && (Integer) s.nextInt() instanceof Integer m
            && (Integer) d.length instanceof Integer n
            && Arrays.stream(d).sorted().toArray() instanceof int[] g
            && new long[(1 << n) * m] instanceof long[] dp
            && (dp[0] = 1) > 0
            && IntStream.range(0, 1 << n).allMatch(mask -> IntStream.range(0, n).allMatch(j ->
                (mask >> j & 1) == 1 || (j > 0 && g[j] == g[j - 1] && (mask >> (j - 1) & 1) == 0) || (mask == 0 && g[j] == 0)
                || IntStream.range(0, m).allMatch(r -> (dp[(mask | 1 << j) * m + (r * 10 + g[j]) % m] += dp[mask * m + r]) >= 0)))
            ? dp[((1 << n) - 1) * m] : 0);
    }
}
