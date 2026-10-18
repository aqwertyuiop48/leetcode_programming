import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.LongSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Long) (s.nextLong() - 2000) instanceof Long y && (Integer) s.nextInt() instanceof Integer m && new int[n] instanceof int[] pred && IntStream.range(0, m).allMatch(i -> (Integer) (s.nextInt() - 1) instanceof Integer a && (Integer) (s.nextInt() - 1) instanceof Integer b && (pred[b] |= 1 << a) > 0) && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] valSeat && new int[n] instanceof int[] asg && ((LongSupplier) () -> new long[1 << n] instanceof long[] dp && (dp[0] = 1) > 0 && IntStream.range(0, 1 << n).allMatch(mask -> dp[mask] == 0 || Integer.bitCount(mask) == n || (valSeat[Integer.bitCount(mask)] >= 0 ? (mask >> valSeat[Integer.bitCount(mask)] & 1) != 0 || (pred[valSeat[Integer.bitCount(mask)]] & ~mask) != 0 || (dp[mask | 1 << valSeat[Integer.bitCount(mask)]] += dp[mask]) > 0 : IntStream.range(0, n).filter(q -> (mask >> q & 1) == 0 && asg[q] == 0 && (pred[q] & ~mask) == 0).allMatch(q -> (dp[mask | 1 << q] += dp[mask]) > 0))) ? dp[(1 << n) - 1] : 0L) instanceof LongSupplier cnt && new long[] {y} instanceof long[] k ? cnt.getAsLong() < y ? "The times have changed" : IntStream.range(0, n).allMatch(i -> IntStream.rangeClosed(1, n).anyMatch(v -> valSeat[v - 1] < 0 && (valSeat[v - 1] = i) >= 0 && (asg[i] = v) > 0 && (Long) cnt.getAsLong() instanceof Long c && (c >= k[0] || (k[0] -= c) > 0 && (valSeat[v - 1] = -1) < 0 && (asg[i] = 0) == 0 && false))) ? Arrays.stream(asg).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "" : "").ifPresent(System.out::println);
    }
}
