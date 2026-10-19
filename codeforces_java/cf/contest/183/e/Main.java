import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : (st[2] != 1 || ((nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0)) && (st[2] = 0) == 0)
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Integer.valueOf((int) nums[1]) instanceof Integer m
            && new long[1] instanceof long[] sm
            ? IntStream.rangeClosed(1, m / n).mapToLong(t ->
                (Long) ((long) t * (t - 1) / 2 * n) instanceof Long base
                && (Long) ((long) t * (m - (long) t * n)) instanceof Long tm
                && (Long) ((long) m - (long) t * n) instanceof Long mm
                && (Long) IntStream.rangeClosed(1, n).mapToLong(i ->
                    i < n ? nums[1 + i] - (long) t * i - base : Math.min(nums[1 + i] - (long) t * i - base, tm)).min().getAsLong() instanceof Long q
                && q >= 0
                && (sm[0] = Long.MAX_VALUE) > 0
                ? (long) t * n * ((long) t * n + 1) / 2 + n * q
                    + IntStream.range(0, n - 1).mapToLong(j ->
                        Math.min(mm, (sm[0] = Math.min(sm[0], j > 0 ? nums[1 + n - j] - (long) t * (n - j) - base : Math.min(nums[1 + n - j] - (long) t * (n - j) - base, tm))) - q)).sum()
                : 0L).takeWhile(v -> v > 0).max().orElse(0L)
            : 0L);
    }
}
