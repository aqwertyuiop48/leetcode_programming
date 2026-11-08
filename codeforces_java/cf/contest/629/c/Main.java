import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(n - m) instanceof Integer len
            && (t.length > 2 ? t[2] : "") instanceof String s
            && new int[]{0, 0} instanceof int[] bm
            && s.chars().allMatch(c -> (bm[0] += c == '(' ? 1 : -1) * 0 == 0 && (bm[1] = Math.min(bm[1], bm[0])) <= 0)
            && new long[len + 1][] instanceof long[][] dp
            && Stream.of(0).peek(z -> Arrays.setAll(dp, i -> i == 0
                ? IntStream.range(0, len + 2).mapToLong(j -> j == 0 ? 1 : 0).toArray()
                : IntStream.range(0, len + 2).mapToLong(j -> ((j > 0 ? dp[i - 1][j - 1] : 0) + (j + 1 < len + 2 ? dp[i - 1][j + 1] : 0)) % 1000000007L).toArray())).findFirst().isPresent()
            ? (n % 2 == 1 ? 0L : IntStream.rangeClosed(0, len).mapToLong(i -> IntStream.rangeClosed(Math.max(0, -bm[1]), len + 1)
                .filter(j -> j + bm[0] >= 0 && j + bm[0] <= len + 1).mapToLong(j -> dp[i][j] * dp[len - i][j + bm[0]] % 1000000007L).sum() % 1000000007L).sum() % 1000000007L) : "");
    }
}
