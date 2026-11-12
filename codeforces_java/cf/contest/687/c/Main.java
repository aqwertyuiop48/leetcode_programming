import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer k
            && new long[(k + 1) * 8] instanceof long[] dp && (dp[0] = 1) == 1
            && IntStream.range(0, n).map(i -> v[2 + i]).filter(c -> IntStream.range(0, (k - c + 1) * 8).filter(t -> (dp[(k - t / 8) * 8 + t % 8] |= dp[(k - t / 8 - c) * 8 + t % 8] | ((t % 8 >= c >> 6 ? dp[(k - t / 8 - c) * 8 + t % 8 - (c >> 6)] << (c & 63) : 0L) | ((c & 63) > 0 && t % 8 > c >> 6 ? dp[(k - t / 8 - c) * 8 + t % 8 - (c >> 6) - 1] >>> (64 - (c & 63)) : 0L))) == 7L && false).count() < 0).count() == 0
            && IntStream.rangeClosed(0, k).filter(x -> (dp[k * 8 + (x >> 6)] >>> (x & 63) & 1) == 1).boxed().collect(Collectors.toList()) instanceof List<Integer> res
            ? res.size() + "\n" + res.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
