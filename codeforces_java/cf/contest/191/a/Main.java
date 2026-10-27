import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> in
            && Integer.valueOf(Integer.parseInt(in.next().trim())) instanceof Integer n
            && new int[26 * 26] instanceof int[] dp
            && Stream.generate(in::next).limit(n).allMatch(s -> (Integer) (s.trim().charAt(0) - 'a') instanceof Integer f && (Integer) (s.trim().charAt(s.trim().length() - 1) - 'a') instanceof Integer l && (Integer) s.trim().length() instanceof Integer len
                && IntStream.range(0, 26).map(x -> dp[x * 26 + f] > 0 ? (dp[x * 26 + l] = Math.max(dp[x * 26 + l], dp[x * 26 + f] + len)) : 0).sum() >= 0
                && (dp[f * 26 + l] = Math.max(dp[f * 26 + l], len)) >= 0)
            ? IntStream.range(0, 26).map(x -> dp[x * 27]).max().getAsInt()
            : 0);
    }
}

