import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[s.nextInt()] instanceof int[] t
                && new long[t.length] instanceof long[] c
                && IntStream.range(0, t.length).allMatch(i -> (t[i] = s.nextInt()) >= 0 && (c[i] = s.nextLong()) == c[i])
                && new long[t.length + 1] instanceof long[] dp
                && IntStream.rangeClosed(1, t.length).allMatch(j -> (dp[j] = Long.MAX_VALUE / 2) > 0)
                && IntStream.range(0, t.length).allMatch(i ->
                    IntStream.iterate(t.length, j -> j >= 0, j -> j - 1).allMatch(j ->
                        (dp[Math.min(j + t[i] + 1, t.length)] = Math.min(dp[Math.min(j + t[i] + 1, t.length)], dp[j] + c[i])) >= 0))
                ? dp[t.length]
                : 0L));
    }
}





