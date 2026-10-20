import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && s.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() >= 100).findFirst() instanceof Optional<Map.Entry<Integer, Long>> big
            ? big.isPresent() ? String.valueOf((char) (int) big.get().getKey()).repeat(100)
                : new short[n + 1][n + 1] instanceof short[][] dp
                    && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (dp[i][i] = 1) > 0 && IntStream.range(i + 1, n).allMatch(j ->
                        (dp[i][j] = s.charAt(i) == s.charAt(j) ? (short) (dp[i + 1][j - 1] + 2) : (short) Math.max(dp[i + 1][j], dp[i][j - 1])) > 0))
                    && new int[]{0, n - 1} instanceof int[] st && new StringBuilder() instanceof StringBuilder left && new char[]{0} instanceof char[] mid
                    && IntStream.range(0, n).allMatch(z -> st[0] > st[1] || (st[0] == st[1] ? (mid[0] = s.charAt(st[0])) > 0 && (st[0] = n) > 0
                        : s.charAt(st[0]) == s.charAt(st[1]) ? left.append(s.charAt(st[0])) != null && ++st[0] > 0 && --st[1] >= -1
                        : dp[st[0] + 1][st[1]] >= dp[st[0]][st[1] - 1] ? ++st[0] > 0 : --st[1] >= -1))
                    && (left.length() >= 50 ? left.substring(0, 50) + new StringBuilder(left.substring(0, 50)).reverse() : left.toString() + (mid[0] == 0 ? "" : String.valueOf(mid[0])) + new StringBuilder(left).reverse()) instanceof String r
                    ? r : "" : "");
    }
}
