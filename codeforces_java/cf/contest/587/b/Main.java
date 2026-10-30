import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] nums && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                : st[2] == 1 && (nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) + (st[2] = 0) == 0).count() >= 0
            && (Integer) (int) nums[0] instanceof Integer n && (Long) nums[1] instanceof Long l && (Integer) (int) nums[2] instanceof Integer k
            && (Long) (l / n) instanceof Long m && (Integer) (int) (l % n) instanceof Integer r
            && LongStream.range(0, n).map(i -> (nums[3 + (int) i] << 20) | i).sorted().toArray() instanceof long[] srt
            && Arrays.stream(srt).mapToInt(v -> (int) (v & 1048575)).toArray() instanceof int[] order
            && new int[n] instanceof int[] ge
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> (ge[i] = i == n - 1 || (srt[i + 1] >> 20) != (srt[i] >> 20) ? i : ge[i + 1]) >= 0).count() >= 0
            && new int[2][n] instanceof int[][] ps && new long[1] instanceof long[] ans
            && IntStream.range(0, n * k).filter(p -> (Integer) (p / n) instanceof Integer x && (Integer) (p % n) instanceof Integer t
                && (Integer) (x == 0 ? 1 : ps[(x - 1) & 1][ge[t]]) instanceof Integer v
                && (ps[x & 1][t] = (int) (((t > 0 ? ps[x & 1][t - 1] : 0) + (long) v) % 1000000007L)) >= 0
                && (ans[0] = (ans[0] + ((x < m ? (m - x) % 1000000007L : 0) + (x <= m && order[t] < r ? 1 : 0)) % 1000000007L * v) % 1000000007L) >= 0).count() >= 0
            ? ans[0] : 0);
    }
}
