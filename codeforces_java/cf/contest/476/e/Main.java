import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s
            && sc.next() instanceof String p
            && (Integer) s.length() instanceof Integer n
            && (Integer) p.length() instanceof Integer m
            && new int[n + 1][] instanceof int[][] pv
            && IntStream.rangeClosed(0, n).allMatch(k -> (pv[k] = k == 0
                ? IntStream.range(0, 26).map(c -> -1).toArray()
                : IntStream.range(0, 26).map(c -> c == s.charAt(k - 1) - 'a' ? k - 1 : pv[k - 1][c]).toArray()) != null)
            && new int[n] instanceof int[] st
            && IntStream.range(0, n).allMatch(i -> (st[i] = IntStream.range(0, m).reduce(i, (pos, t) ->
                pos < 0 ? -1 : t == 0 ? (s.charAt(i) == p.charAt(m - 1) ? i : -1) : pv[pos][p.charAt(m - 1 - t) - 'a'])) > -2)
            && new int[n + 1][] instanceof int[][] dp
            && (dp[0] = IntStream.rangeClosed(0, n).map(j -> j == 0 ? 0 : -1000000000).toArray()) != null
            && IntStream.rangeClosed(1, n).allMatch(r -> (dp[r] = IntStream.rangeClosed(0, n).map(j ->
                Math.max(Math.max(dp[r - 1][j], j > 0 ? dp[r - 1][j - 1] : -1000000000),
                    st[r - 1] >= 0 && j >= r - st[r - 1] - m ? dp[st[r - 1]][j - (r - st[r - 1] - m)] + 1 : -1000000000)).toArray()) != null)
            ? IntStream.rangeClosed(0, n).mapToObj(x -> String.valueOf(dp[n][x])).collect(Collectors.joining(" "))
            : "");
    }
}
