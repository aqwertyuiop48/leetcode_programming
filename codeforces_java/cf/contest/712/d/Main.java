import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[3] * t[2]) instanceof Integer T && Integer.valueOf(2 * T + 1) instanceof Integer W
            && new long[W] instanceof long[] f && new long[W + 1] instanceof long[] pre && (f[T] = 1) == 1
            && IntStream.range(0, t[3]).allMatch(s -> Integer.valueOf(T - s * t[2]) instanceof Integer lo && Integer.valueOf(T + (s + 1) * t[2]) instanceof Integer nhi
                && IntStream.rangeClosed(lo, nhi).filter(i -> (pre[i + 1] = (pre[i] + f[i]) % 1000000007L) >= 0).count() >= 0
                && IntStream.rangeClosed(lo - t[2], nhi).filter(i -> (f[i] = (pre[Math.min(nhi + 1, i + t[2] + 1)] - pre[Math.max(0, i - t[2])] + 1000000007L) % 1000000007L) >= 0).count() >= 0)
            && IntStream.range(0, W).filter(i -> (pre[i + 1] = (pre[i] + f[i]) % 1000000007L) >= 0).count() >= 0
            ? IntStream.range(0, W).mapToLong(i -> f[i] * pre[Math.min(W, Math.max(0, i + t[0] - t[1]))] % 1000000007L).reduce(0L, (x, y) -> (x + y) % 1000000007L) : "");
    }
}
