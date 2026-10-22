import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(1, n + 1).map(i -> Integer.parseInt(t[i])).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray() instanceof int[] s
            && Integer.valueOf(t[n + 1]) instanceof Integer m
            && new int[1 << m] instanceof int[] dp
            && IntStream.iterate((1 << m) - 1, k -> k >= 0, k -> k - 1).allMatch(mask -> Integer.valueOf(Integer.bitCount(mask)) instanceof Integer i
                && (dp[mask] = i == m ? 0 : Integer.valueOf(t[n + 3 + 2 * i].equals("1") ? 1 : -1) instanceof Integer sg
                    ? sg * IntStream.range(0, m).filter(j -> (mask >> j & 1) == 0).map(j -> sg * dp[mask | 1 << j] + (t[n + 2 + 2 * i].equals("p") ? s[j] : 0)).max().getAsInt() : 0) == dp[mask])
            ? dp[0] : "");
    }
}
