import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] nums && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                : st[2] == 1 && (nums[st[1]++] = st[0]) >= 0 && (st[0] = 0) + (st[2] = 0) == 0).count() >= 0
            && new int[1000040] instanceof int[] cnt && IntStream.rangeClosed(1, nums[0]).filter(i -> cnt[nums[i]]++ >= 0).count() >= 0 && new int[2] instanceof int[] cr
            && IntStream.range(0, 1000040).filter(i -> (cr[1] += (cnt[i] + cr[0]) & 1) + (cr[0] = (cnt[i] + cr[0]) >> 1) >= 0).count() >= 0
            ? cr[1] : 0);
    }
}
