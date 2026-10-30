import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && new boolean[1000001] instanceof boolean[] has
            && new int[1000001] instanceof int[] dp
            && IntStream.range(1, nums[0] + 1).filter(i -> (has[nums[i]] = true)).count() >= 0
            && IntStream.rangeClosed(1, 1000000).filter(x -> has[x] && (dp[x] += 1) > 0
                && IntStream.iterate(2 * x, m -> m <= 1000000, m -> m + x).filter(m -> (dp[m] = Math.max(dp[m], dp[x])) >= 0 || true).count() >= 0 || true).count() >= 0
            ? Arrays.stream(dp).max().getAsInt()
            : 0);
    }
}
