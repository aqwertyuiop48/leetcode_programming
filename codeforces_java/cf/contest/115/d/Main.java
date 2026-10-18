import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).ifPresent(s ->
            System.out.println(IntStream.range(0, s.length()).filter(i -> !Character.isDigit(s.charAt(i))).toArray() instanceof int[] ops
                && Character.isDigit(s.charAt(s.length() - 1))
                && Arrays.stream(ops).allMatch(i -> (i > 0 && Character.isDigit(s.charAt(i - 1))) || s.charAt(i) == '+' || s.charAt(i) == '-')
                ? Arrays.stream(Arrays.stream(ops).boxed().reduce(
                        IntStream.range(0, ops.length + 2).mapToLong(x -> x == 0 ? 1 : 0).toArray(),
                        (dp, i) -> i > 0 && Character.isDigit(s.charAt(i - 1))
                            ? new long[ops.length + 3] instanceof long[] suf
                                && IntStream.iterate(ops.length + 1, x -> x >= 0, x -> x - 1).allMatch(x -> (suf[x] = (suf[x + 1] + dp[x]) % 1000003) >= 0)
                                ? IntStream.range(0, ops.length + 2).mapToLong(x -> x == 0 ? 0 : suf[x - 1]).toArray() : dp
                            : IntStream.range(0, ops.length + 2).mapToLong(x -> x == 0 ? 0 : dp[x - 1]).toArray(),
                        (x, y) -> x)).sum() % 1000003
                : 0));
    }
}
