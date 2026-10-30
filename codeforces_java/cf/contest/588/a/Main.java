import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] nums && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                : st[2] == 1 && (nums[st[1]++] = st[0]) >= 0 && (st[0] = 0) + (st[2] = 0) == 0).count() >= 0
            && new long[]{1000, 0} instanceof long[] acc
            && IntStream.range(0, nums[0]).filter(i -> (acc[0] = Math.min(acc[0], nums[2 + 2 * i])) + (acc[1] += acc[0] * nums[1 + 2 * i]) >= 0).count() >= 0
            ? acc[1] : 0);
    }
}
