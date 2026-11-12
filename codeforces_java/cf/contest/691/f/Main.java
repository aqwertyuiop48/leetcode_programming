import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw
            && new int[b0.length / 2 + 2] instanceof int[] nums && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (st[3] = raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) * 0 : st[1] == 1 ? (nums[st[2]++] = st[0]) * 0 + (st[0] = 0) * 0 + (st[1] = 0) * 0 : 0) > 5).count() >= 0
            && Integer.valueOf(nums[0]) instanceof Integer n && Integer.valueOf(3000000) instanceof Integer M && new int[M + 1] instanceof int[] cnt
            && IntStream.rangeClosed(1, n).filter(i -> cnt[nums[i]]++ < 0).count() >= 0
            && new long[M + 1] instanceof long[] pre
            && IntStream.rangeClosed(1, 1732).filter(x -> cnt[x] > 0 && IntStream.rangeClosed(x, M / x).filter(y -> cnt[y] > 0 && (pre[x * y] += x == y ? (long) cnt[x] * (cnt[x] - 1) : 2L * cnt[x] * cnt[y]) < 0).count() >= 0).count() >= 0
            && IntStream.rangeClosed(1, M).filter(v -> (pre[v] += pre[v - 1]) < 0).count() >= 0
            && Long.valueOf((long) n * (n - 1)) instanceof Long tot
            ? IntStream.range(0, nums[n + 1]).collect(StringBuilder::new, (sb, j) -> sb.append(tot - pre[nums[n + 2 + j] - 1]).append('\n'), StringBuilder::append).toString().trim() : "");
    }
}
