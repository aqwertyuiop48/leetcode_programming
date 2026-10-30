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
            && (Integer) nums[1] instanceof Integer k
            && new HashMap<Integer, Long>() instanceof HashMap<Integer, Long> single
            && new HashMap<Integer, Long>() instanceof HashMap<Integer, Long> pair
            && new long[1] instanceof long[] ans
            && IntStream.range(0, n).map(i -> nums[2 + i]).filter(x -> (x % k == 0
                ? (ans[0] += pair.getOrDefault(x / k, 0L)) + pair.merge(x, single.getOrDefault(x / k, 0L), Long::sum)
                : 0L) + single.merge(x, 1L, Long::sum) > -1 || true).count() >= 0
            ? ans[0]
            : 0);
    }
}
