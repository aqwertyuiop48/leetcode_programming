import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer t
            ? IntStream.range(0, t).mapToObj(tc -> (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer k
                && IntStream.range(0, 3).mapToObj(r -> sc.next()).toArray(String[]::new) instanceof String[] g
                && new boolean[3][n + 8] instanceof boolean[][] dp
                && (dp[IntStream.range(0, 3).filter(r -> g[r].charAt(0) == 's').findFirst().getAsInt()][0] = true)
                && ((java.util.function.BiPredicate<Integer, Integer>) (r, c) -> c >= n || g[r].charAt(c) == '.' || g[r].charAt(c) == 's') instanceof java.util.function.BiPredicate<Integer, Integer> free
                && IntStream.iterate(0, c -> c < n, c -> c + 3).filter(c -> IntStream.range(0, 3).filter(r -> dp[r][c] && free.test(r, c + 1)
                    && IntStream.rangeClosed(Math.max(0, r - 1), Math.min(2, r + 1)).filter(q -> free.test(q, c + 1) && free.test(q, c + 2) && free.test(q, c + 3) && (dp[q][c + 3] = true)).count() >= 0).count() >= 0).count() >= 0
                    && (dp[0][n - 1] | dp[1][n - 1] | dp[2][n - 1] | IntStream.range(0, n + 8).filter(c -> c >= n - 1 && (dp[0][c] || dp[1][c] || dp[2][c])).count() > 0)
                ? "YES" : "NO").collect(Collectors.joining("\n")) : "");
    }
}
