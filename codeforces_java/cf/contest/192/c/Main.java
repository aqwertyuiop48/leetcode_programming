import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> in
            && Integer.valueOf(Integer.parseInt(in.next().trim())) instanceof Integer n
            && new int[26][26] instanceof int[][] dp
            && Stream.generate(in::next).limit(n).map(String::trim).allMatch(s -> Integer.valueOf(s.charAt(0) - 'a') instanceof Integer f && Integer.valueOf(s.charAt(s.length() - 1) - 'a') instanceof Integer l
                && IntStream.range(0, 26).filter(x -> dp[x][f] > 0).map(x -> dp[x][f]).boxed().toList() instanceof List<Integer> unused
                && IntStream.range(0, 26).filter(x -> dp[x][f] > 0).boxed().toList() instanceof List<Integer> xs
                && xs.stream().map(x -> new int[]{x, dp[x][f] + s.length()}).toList() instanceof List<int[]> upd
                && upd.stream().allMatch(u -> (dp[u[0]][l] = Math.max(dp[u[0]][l], u[1])) >= 0)
                && (dp[f][l] = Math.max(dp[f][l], s.length())) >= 0)
            ? IntStream.range(0, 26).map(x -> dp[x][x]).max().getAsInt()
            : 0);
    }
}
