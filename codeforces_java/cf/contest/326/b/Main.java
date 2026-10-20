import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).toArray(String[]::new) instanceof String[] w
            && w[0] instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && s.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())) instanceof Map<Integer, Long> cnt
            ? (cnt.entrySet().stream().filter(e -> e.getValue() >= 100).findFirst() instanceof Optional<Map.Entry<Integer, Long>> big && big.isPresent()
                ? String.valueOf((char) big.get().getKey().intValue()).repeat(100)
                : new int[n][n] instanceof int[][] dp
                && IntStream.range(0, n).allMatch(i -> (dp[i][i] = 1) > 0)
                && ((IntBinaryOperator) (i, j) -> i > j ? 0 : dp[i][j]) instanceof IntBinaryOperator get
                && IntStream.rangeClosed(2, n).allMatch(len -> IntStream.rangeClosed(0, n - len).allMatch(i -> Integer.valueOf(i + len - 1) instanceof Integer j
                    && (dp[i][j] = s.charAt(i) == s.charAt(j) ? get.applyAsInt(i + 1, j - 1) + 2 : Math.max(get.applyAsInt(i + 1, j), get.applyAsInt(i, j - 1))) > 0))
                && new int[]{0, n - 1} instanceof int[] st && new StringBuilder() instanceof StringBuilder left && new char[1] instanceof char[] mid
                && IntStream.iterate(0, x -> st[0] <= st[1], x -> x + 1).allMatch(x -> st[0] == st[1] ? (mid[0] = s.charAt(st[0])) > 0 && st[0]++ >= 0
                    : s.charAt(st[0]) == s.charAt(st[1]) ? left.append(s.charAt(st[0])) != null && st[0]++ >= 0 && st[1]-- >= 0
                    : get.applyAsInt(st[0] + 1, st[1]) >= get.applyAsInt(st[0], st[1] - 1) ? st[0]++ >= 0 : st[1]-- >= 0)
                ? (2 * left.length() + (mid[0] > 0 ? 1 : 0) >= 100 ? left.substring(0, 50) + new StringBuilder(left.substring(0, 50)).reverse()
                    : left.toString() + (mid[0] > 0 ? String.valueOf(mid[0]) : "") + new StringBuilder(left).reverse()) : "") : "");
    }
}
