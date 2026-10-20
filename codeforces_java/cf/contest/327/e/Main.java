import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1 + n]) instanceof Integer k
            && Arrays.copyOf(Arrays.copyOfRange(t, 1, 1 + n), 24) instanceof long[] a
            && Arrays.copyOf(LongStream.concat(Arrays.stream(t, 2 + n, 2 + n + k), LongStream.of(-1, -1)).toArray(), 2) instanceof long[] bad
            && IntStream.range(0, 4096).mapToLong(i -> IntStream.range(0, 12).filter(j -> (i >> j & 1) != 0).mapToLong(j -> a[j]).sum()).toArray() instanceof long[] lo
            && IntStream.range(0, 4096).mapToLong(i -> IntStream.range(0, 12).filter(j -> (i >> j & 1) != 0).mapToLong(j -> a[12 + j]).sum()).toArray() instanceof long[] hi
            && new int[1 << n] instanceof int[] dp && (dp[0] = 1) == 1
            && IntStream.range(1, 1 << n).allMatch(mask -> (dp[mask] = Long.valueOf(lo[mask & 4095] + hi[mask >> 12]) instanceof Long s && (s == bad[0] || s == bad[1]) ? 0
                : (int) (((long) ((mask & 1) != 0 ? dp[mask ^ 1] : 0) + ((mask & 2) != 0 ? dp[mask ^ 2] : 0) + ((mask & 4) != 0 ? dp[mask ^ 4] : 0) + ((mask & 8) != 0 ? dp[mask ^ 8] : 0) + ((mask & 16) != 0 ? dp[mask ^ 16] : 0) + ((mask & 32) != 0 ? dp[mask ^ 32] : 0) + ((mask & 64) != 0 ? dp[mask ^ 64] : 0) + ((mask & 128) != 0 ? dp[mask ^ 128] : 0) + ((mask & 256) != 0 ? dp[mask ^ 256] : 0) + ((mask & 512) != 0 ? dp[mask ^ 512] : 0) + ((mask & 1024) != 0 ? dp[mask ^ 1024] : 0) + ((mask & 2048) != 0 ? dp[mask ^ 2048] : 0) + ((mask & 4096) != 0 ? dp[mask ^ 4096] : 0) + ((mask & 8192) != 0 ? dp[mask ^ 8192] : 0) + ((mask & 16384) != 0 ? dp[mask ^ 16384] : 0) + ((mask & 32768) != 0 ? dp[mask ^ 32768] : 0) + ((mask & 65536) != 0 ? dp[mask ^ 65536] : 0) + ((mask & 131072) != 0 ? dp[mask ^ 131072] : 0) + ((mask & 262144) != 0 ? dp[mask ^ 262144] : 0) + ((mask & 524288) != 0 ? dp[mask ^ 524288] : 0) + ((mask & 1048576) != 0 ? dp[mask ^ 1048576] : 0) + ((mask & 2097152) != 0 ? dp[mask ^ 2097152] : 0) + ((mask & 4194304) != 0 ? dp[mask ^ 4194304] : 0) + ((mask & 8388608) != 0 ? dp[mask ^ 8388608] : 0)) % 1000000007L)) >= 0)
            ? dp[(1 << n) - 1] : "");
    }
}
