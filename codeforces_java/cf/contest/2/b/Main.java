import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : st[2] == 0 || ((nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> f5
            && f5.getAndSet(x -> x % 5 == 0 ? 1 + f5.get().applyAsInt(x / 5) : 0) == null
            && IntStream.range(0, n * n).map(k -> nums[1 + k] == 0 ? 1_000_000 : Integer.numberOfTrailingZeros((int) nums[1 + k])).toArray() instanceof int[] cnt2
            && IntStream.range(0, n * n).map(k -> nums[1 + k] == 0 ? 1_000_000 : f5.get().applyAsInt((int) nums[1 + k])).toArray() instanceof int[] cnt5
            && new long[n * n] instanceof long[] dp2
            && new long[n * n] instanceof long[] dp5
            && new boolean[n * n] instanceof boolean[] left2
            && new boolean[n * n] instanceof boolean[] left5
            && IntStream.range(0, n * n).allMatch(k ->
                (dp2[k] = k == 0 ? cnt2[k] : k < n ? dp2[k - 1] + cnt2[k] : k % n == 0 ? dp2[k - n] + cnt2[k] : Math.min(dp2[k - 1], dp2[k - n]) + cnt2[k]) >= 0
                & (left2[k] = k < n || (k % n != 0 && dp2[k - 1] <= dp2[k - n]))
                | true
                & (dp5[k] = k == 0 ? cnt5[k] : k < n ? dp5[k - 1] + cnt5[k] : k % n == 0 ? dp5[k - n] + cnt5[k] : Math.min(dp5[k - 1], dp5[k - n]) + cnt5[k]) >= 0
                & (left5[k] = k < n || (k % n != 0 && dp5[k - 1] <= dp5[k - n]))
                | true)
            && IntStream.range(0, n * n).filter(k -> nums[1 + k] == 0).findFirst() instanceof OptionalInt zeroOpt
            && (Boolean) (dp2[n * n - 1] <= dp5[n * n - 1]) instanceof Boolean use2
            && new long[]{Math.min(dp2[n * n - 1], dp5[n * n - 1])} instanceof long[] bestArr
            && new long[]{zeroOpt.isPresent() ? 1 : Long.MAX_VALUE} instanceof long[] zeroAns
            ? Math.min(bestArr[0], zeroAns[0]) + "\n" + (zeroAns[0] < bestArr[0]
                ? "D".repeat(zeroOpt.getAsInt() / n) + "R".repeat(n - 1) + "D".repeat(n - 1 - zeroOpt.getAsInt() / n)
                : new StringBuilder(Stream.iterate(n * n - 1, k -> k != 0, k -> (use2 ? left2[k] : left5[k]) ? k - 1 : k - n)
                    .map(k -> (use2 ? left2[k] : left5[k]) ? "R" : "D")
                    .collect(Collectors.joining())).reverse().toString())
            : "");
    }
}
