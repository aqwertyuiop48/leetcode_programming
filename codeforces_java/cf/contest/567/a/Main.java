import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] == 45 ? (st[3] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[3] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[2] = 0) + (st[3] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && Arrays.copyOfRange(nums, 1, n + 1) instanceof int[] x
            ? IntStream.range(0, n).mapToObj(i -> (i == 0 ? x[1] - x[0] : i == n - 1 ? x[i] - x[i - 1] : Math.min(x[i] - x[i - 1], x[i + 1] - x[i]))
                + " " + Math.max(x[i] - x[0], x[n - 1] - x[i])).collect(Collectors.joining("\n"))
            : "");
    }
}
