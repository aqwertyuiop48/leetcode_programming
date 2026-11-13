import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            && Integer.valueOf(w[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] p
            && IntStream.range(0, n).filter(i -> (p[i + 1] = p[i] + Integer.parseInt(w[i + 1])) != Integer.MIN_VALUE).count() == n
            && new int[128 * 90 * 91] instanceof int[] dp
            && ((IntBinaryOperator) (key, y) -> -(p[n - ((key >> 7) / 100 + (key >> 7) % 100)] - p[n - ((key >> 7) / 100 + (key >> 7) % 100) - y])
                + (y <= 90 ? dp[((((key >> 7) / 100 + (key & 127)) & 127) * 90 + (key >> 7) % 100 + y - (key & 127)) * 91 + y] : 0)) instanceof IntBinaryOperator val
            && ((IntUnaryOperator) key -> n - 2 * ((key >> 7) / 100) - (key >> 7) % 100 - (key & 127) < (key & 127) ? 0
                : n - 2 * ((key >> 7) / 100) - (key >> 7) % 100 - (key & 127) < (key & 127) + 1 ? val.applyAsInt(key, key & 127)
                : Math.min(val.applyAsInt(key, key & 127), val.applyAsInt(key, (key & 127) + 1))) instanceof IntUnaryOperator ins
            && ((IntBinaryOperator) (ld, k) -> n - 2 * (ld / 100) - ld % 100 < k ? 0
                : n - 2 * (ld / 100) - ld % 100 < k + 1 ? p[ld / 100 + k] - p[ld / 100] + ins.applyAsInt(ld << 7 | k)
                : Math.max(p[ld / 100 + k] - p[ld / 100] + ins.applyAsInt(ld << 7 | k), p[ld / 100 + k + 1] - p[ld / 100] + ins.applyAsInt(ld << 7 | (k + 1)))) instanceof IntBinaryOperator top
            && IntStream.rangeClosed(0, n / 2).map(i -> n / 2 - i).allMatch(l -> IntStream.range(0, 8100).filter(idx -> idx / 90 < idx % 90 + 1)
                .filter(idx -> (dp[((l & 127) * 90 + idx / 90) * 91 + idx % 90 + 1] = top.applyAsInt(l * 100 + idx / 90, idx % 90 + 1)) != Integer.MIN_VALUE).count() > 0)
            ? dp[1] : "");
    }
}
