import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> bs
            && new int[2 * n + 1] instanceof int[] dp && IntStream.rangeClosed(1, 2 * n).allMatch(i -> (dp[i] = -1000000000) < 0)
            && bs.stream().allMatch(b -> IntStream.iterate(2 * n, T -> T >= b[0], T -> T - 1).allMatch(T -> (dp[T] = Math.max(dp[T], dp[T - b[0]] + b[0] + b[1])) > Integer.MIN_VALUE))
            ? IntStream.rangeClosed(0, 2 * n).filter(T -> dp[T] >= bs.stream().mapToInt(b -> b[1]).sum()).findFirst().getAsInt() : "");
    }
}

