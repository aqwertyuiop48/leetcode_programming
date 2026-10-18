import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextLong()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(k ->
            System.out.println(
                new boolean[409 * 409] instanceof boolean[] vis
                && IntStream.range(0, k).allMatch(i -> (vis[(s.nextInt() + 204) * 409 + s.nextInt() + 204] = true))
                && (vis[204 * 409 + 204] = true)
                && IntStream.range(0, 8).map(mv -> new int[]{1, 1, -1, -1, 2, 2, -2, -2}[mv] * 409 + new int[]{2, -2, 2, -2, 1, -1, 1, -1}[mv]).toArray() instanceof int[] off
                && new long[101] instanceof long[] cnt
                && (cnt[0] = 1) == 1
                && new int[1][] instanceof int[][] fr
                && (fr[0] = new int[]{204 * 409 + 204}) != null
                && IntStream.rangeClosed(1, 100).allMatch(t ->
                    (fr[0] = IntStream.of(fr[0]).flatMap(c -> IntStream.of(off).map(o -> c + o)).filter(c2 -> !vis[c2] && (vis[c2] = true)).toArray()) != null
                    && (cnt[t] = cnt[t - 1] + fr[0].length) > 0)
                ? (n <= 100
                    ? BigInteger.valueOf(cnt[(int) (long) n])
                    : BigInteger.valueOf(cnt[100]).add(BigInteger.valueOf(n - 100).multiply(BigInteger.valueOf(cnt[100] - cnt[99])))
                        .add(BigInteger.valueOf((cnt[100] - cnt[99]) - (cnt[99] - cnt[98])).multiply(BigInteger.valueOf(n - 100)).multiply(BigInteger.valueOf(n - 99)).shiftRight(1)))
                : BigInteger.ZERO))));
    }
}




