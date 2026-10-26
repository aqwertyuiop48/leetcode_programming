import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toList() instanceof List<String> w
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> sc.nextInt()).toArray()).toList() instanceof List<int[]> c
            && IntStream.range(0, n * m).map(t -> (Integer) (t / m) instanceof Integer i && (Integer) (t % m) instanceof Integer j
                ? IntStream.range(0, n).filter(x -> w.get(x).charAt(j) == w.get(i).charAt(j)).map(x -> 1 << x).sum() : 0).toArray() instanceof int[] same
            && IntStream.range(0, n * m).map(t -> (Integer) (t / m) instanceof Integer i && (Integer) (t % m) instanceof Integer j
                ? IntStream.range(0, n).filter(x -> w.get(x).charAt(j) == w.get(i).charAt(j)).map(x -> c.get(x)[j]).sum() - IntStream.range(0, n).filter(x -> w.get(x).charAt(j) == w.get(i).charAt(j)).map(x -> c.get(x)[j]).max().getAsInt() : 0).toArray() instanceof int[] cost
            && new int[1 << n] instanceof int[] dp && IntStream.range(1, 1 << n).allMatch(i -> (dp[i] = Integer.MAX_VALUE) > 0)
            ? IntStream.range(0, (1 << n) - 1).allMatch(mask -> dp[mask] == Integer.MAX_VALUE || (Integer) Integer.numberOfTrailingZeros(~mask) instanceof Integer i
                && IntStream.range(0, m).allMatch(j -> (dp[mask | (1 << i)] = Math.min(dp[mask | (1 << i)], dp[mask] + c.get(i)[j])) > Integer.MIN_VALUE
                    && (dp[mask | same[i * m + j]] = Math.min(dp[mask | same[i * m + j]], dp[mask] + cost[i * m + j])) > Integer.MIN_VALUE)) ? dp[(1 << n) - 1] : 0 : "");
    }
}
