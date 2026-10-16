import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : st[2] == 0 || ((nums[(int) st[1]++] = (int) st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)))
            && Integer.valueOf(nums[0]) instanceof Integer n
            && IntStream.range(0, n * n).map(k -> nums[1 + k] == 0 ? 1_000_000 : Integer.numberOfTrailingZeros(nums[1 + k])).toArray() instanceof int[] cnt2
            && IntStream.range(0, n * n).map(k -> nums[1 + k] % 5 != 0 ? 0 : nums[1 + k] == 0 ? 1_000_000
                : nums[1 + k] % 25 != 0 ? 1 : nums[1 + k] % 125 != 0 ? 2 : nums[1 + k] % 625 != 0 ? 3 : nums[1 + k] % 3125 != 0 ? 4
                : nums[1 + k] % 15625 != 0 ? 5 : nums[1 + k] % 78125 != 0 ? 6 : nums[1 + k] % 390625 != 0 ? 7 : nums[1 + k] % 1953125 != 0 ? 8
                : nums[1 + k] % 9765625 != 0 ? 9 : nums[1 + k] % 48828125 != 0 ? 10 : nums[1 + k] % 244140625 != 0 ? 11 : 12).toArray() instanceof int[] cnt5
            && new long[n * n] instanceof long[] dp2
            && new long[n * n] instanceof long[] dp5
            && new boolean[n * n] instanceof boolean[] left2
            && new boolean[n * n] instanceof boolean[] left5
            && IntStream.range(0, n * n).allMatch(k ->
                (k == 0
                    ? (dp2[k] = cnt2[k]) >= 0 && (dp5[k] = cnt5[k]) >= 0
                    : k < n
                        ? (dp2[k] = dp2[k - 1] + cnt2[k]) >= 0 && (dp5[k] = dp5[k - 1] + cnt5[k]) >= 0 && (left2[k] = left5[k] = true)
                        : k % n == 0
                            ? (dp2[k] = dp2[k - n] + cnt2[k]) >= 0 && (dp5[k] = dp5[k - n] + cnt5[k]) >= 0
                            : (dp2[k] = Math.min(dp2[k - 1], dp2[k - n]) + cnt2[k]) >= 0 && (dp5[k] = Math.min(dp5[k - 1], dp5[k - n]) + cnt5[k]) >= 0
                                && (left2[k] = dp2[k - 1] <= dp2[k - n]) | true && (left5[k] = dp5[k - 1] <= dp5[k - n]) | true) | true)
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




