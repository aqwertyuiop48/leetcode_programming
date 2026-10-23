import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && new long[n + 1] instanceof long[] dp && new long[n + 1] instanceof long[] nd && IntStream.rangeClosed(1, n).allMatch(j -> (dp[j] = 1) > 0)
            && IntStream.range(1, k).allMatch(r -> IntStream.rangeClosed(1, n).allMatch(j -> IntStream.iterate(j, x -> x <= n, x -> x + j).allMatch(x -> (nd[x] = (nd[x] + dp[j]) % 1000000007L) >= 0))
                && IntStream.rangeClosed(1, n).allMatch(j -> (dp[j] = nd[j]) >= 0 && (nd[j] = 0) == 0))
            ? LongStream.of(dp).sum() % 1000000007L : 0);
    }
}
