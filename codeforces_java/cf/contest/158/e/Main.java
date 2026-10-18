import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.rangeClosed(1, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> c
            && IntStream.rangeClosed(0, n).mapToObj(i -> IntStream.rangeClosed(0, k).map(j -> 1 << 29).toArray()).toArray(int[][]::new) instanceof int[][] dp
            && (dp[0][0] = 0) == 0
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(0, k).allMatch(j ->
                (dp[i][j] = Math.min(j > 0 ? dp[i - 1][j - 1] : 1 << 29, Math.max(dp[i - 1][j], c.get(i - 1)[0] - 1) + c.get(i - 1)[1])) >= 0))
            ? IntStream.rangeClosed(0, n).map(a -> IntStream.rangeClosed(0, k).map(j -> Math.max(0, (a + 1 + k - j >= n + 1 ? 86401 : c.get(a + k - j)[0]) - 1 - dp[a][j])).max().getAsInt()).max().getAsInt()
            : 0);
    }
}
