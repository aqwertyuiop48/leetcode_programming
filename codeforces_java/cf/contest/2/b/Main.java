import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.generate(s::nextInt).limit(n * n).toArray() instanceof int[] a
                && new int[n * n] instanceof int[] cnt2
                && new int[n * n] instanceof int[] cnt5
                && IntStream.range(0, n * n).allMatch(k ->
                    (cnt2[k] = a[k] == 0 ? 1_000_000 : Integer.numberOfTrailingZeros(a[k])) >= 0
                    & (cnt5[k] = a[k] == 0 ? 1_000_000 : (int) Stream.iterate(a[k], x -> x % 5 == 0, x -> x / 5).count()) >= 0)
                && new long[n * n] instanceof long[] dp2
                && new long[n * n] instanceof long[] dp5
                && new int[n * n] instanceof int[] dir2
                && new int[n * n] instanceof int[] dir5
                && IntStream.range(0, n * n).allMatch(k ->
                    (dp2[k] = (k / n == 0 && k % n == 0) ? cnt2[k] : (k / n == 0) ? dp2[k - 1] + cnt2[k] : (k % n == 0) ? dp2[k - n] + cnt2[k] : Math.min(dp2[k - 1], dp2[k - n]) + cnt2[k]) >= 0
                    & (dir2[k] = (k / n == 0 && k % n == 0) ? -1 : (k / n == 0) ? 0 : (k % n == 0) ? 1 : (dp2[k - 1] <= dp2[k - n] ? 0 : 1)) >= -1
                    & (dp5[k] = (k / n == 0 && k % n == 0) ? cnt5[k] : (k / n == 0) ? dp5[k - 1] + cnt5[k] : (k % n == 0) ? dp5[k - n] + cnt5[k] : Math.min(dp5[k - 1], dp5[k - n]) + cnt5[k]) >= 0
                    & (dir5[k] = (k / n == 0 && k % n == 0) ? -1 : (k / n == 0) ? 0 : (k % n == 0) ? 1 : (dp5[k - 1] <= dp5[k - n] ? 0 : 1)) >= -1)
                && IntStream.range(0, n * n).filter(k -> a[k] == 0).findFirst() instanceof OptionalInt zeroOpt
                && new long[]{Math.min(dp2[n * n - 1], dp5[n * n - 1])} instanceof long[] bestArr
                && new long[]{zeroOpt.isPresent() ? 1 : Long.MAX_VALUE} instanceof long[] zeroAns
                ? Math.min(bestArr[0], zeroAns[0]) + "\n" + (zeroAns[0] < bestArr[0]
                    ? "D".repeat(zeroOpt.getAsInt() / n) + "R".repeat(n - 1) + "D".repeat(n - 1 - zeroOpt.getAsInt() / n)
                    : new StringBuilder(Stream.iterate(n * n - 1, k -> k != 0, k -> (dp2[n * n - 1] <= dp5[n * n - 1] ? dir2[k] : dir5[k]) == 0 ? k - 1 : k - n)
                        .map(k -> (dp2[n * n - 1] <= dp5[n * n - 1] ? dir2[k] : dir5[k]) == 0 ? "R" : "D")
                        .collect(Collectors.joining())).reverse().toString())
                : "")));
    }
}

