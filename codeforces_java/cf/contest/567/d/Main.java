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
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && (Integer) nums[1] instanceof Integer k
            && (Integer) nums[2] instanceof Integer a
            && (Integer) nums[3] instanceof Integer m
            && new TreeSet<Integer>(List.of(0, n + 1)) instanceof TreeSet<Integer> set
            && new int[]{(n + 1) / (a + 1)} instanceof int[] cap
            ? IntStream.range(0, m).filter(i -> (Integer) nums[4 + i] instanceof Integer x
                && set.lower(x) instanceof Integer lo
                && set.higher(x) instanceof Integer hi
                && set.add(x)
                && (cap[0] += (x - lo) / (a + 1) + (hi - x) / (a + 1) - (hi - lo) / (a + 1)) < k).findFirst().orElse(-2) + 1
            : 0);
    }
}
