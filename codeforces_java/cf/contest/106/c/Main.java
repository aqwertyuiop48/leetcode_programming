import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer c0 && (Integer) s.nextInt() instanceof Integer d0 && IntStream.range(0, m).mapToObj(i -> new int[] {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] st && new int[n + 1] instanceof int[] dp && java.util.Arrays.stream(st).flatMap(q -> Collections.nCopies(q[0] / q[1], q).stream()).allMatch(q -> IntStream.range(0, Math.max(0, n - q[2] + 1)).allMatch(t -> (dp[n - t] = Math.max(dp[n - t], dp[n - t - q[2]] + q[3])) >= 0)) && IntStream.rangeClosed(c0, n).allMatch(w -> (dp[w] = Math.max(dp[w], dp[w - c0] + d0)) >= 0) ? dp[n] : -1).ifPresent(System.out::println);
    }
}
