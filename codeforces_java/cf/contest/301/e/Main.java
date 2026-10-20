import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Integer.valueOf(101 * 51 * 51) instanceof Integer SZ && Long.valueOf(1000000007L) instanceof Long MOD
            && new int[101][101] instanceof int[][] cb
            && IntStream.range(0, 101).allMatch(a -> IntStream.range(0, 101).allMatch(b -> (cb[a][b] = b == 0 ? 1 : a == 0 ? 0 : Math.min(51, cb[a - 1][b - 1] + cb[a - 1][b])) >= 0))
            ? IntStream.rangeClosed(1, n / 2).mapToLong(c1 -> Stream.iterate(new long[SZ + 2] instanceof long[] z && (z[(c1 * 51 + c1) * 51 + 1] = 1) > 0 && (z[SZ + 1] = 1) > 0 ? z : null,
                    (UnaryOperator<long[]>) prev -> new long[SZ + 2] instanceof long[] nx && (nx[SZ + 1] = prev[SZ + 1] + 1) > 0
                        && IntStream.range(0, SZ).filter(i -> prev[i] != 0).allMatch(i -> Integer.valueOf(i % 51) instanceof Integer s && Integer.valueOf(i / 51 % 51) instanceof Integer f && Integer.valueOf(i / 2601) instanceof Integer l
                            && IntStream.rangeClosed(0, n - l - f).allMatch(g -> Integer.valueOf(f + g) instanceof Integer c && Integer.valueOf(s * cb[c - 1][f - 1]) instanceof Integer s2 && Integer.valueOf(l + c) instanceof Integer l2
                                && (s2 > 50 || s2 * l2 > k * c1 || (g > 0 && l2 + g > n) || (g == 0
                                    ? (s2 * l2 / c1 > k || m - prev[SZ + 1] <= 0 || (nx[SZ] = (nx[SZ] + prev[i] * (m - prev[SZ + 1])) % MOD) > -1)
                                    : (nx[(l2 * 51 + g) * 51 + s2] = (nx[(l2 * 51 + g) * 51 + s2] + prev[i]) % MOD) > -1)) || true))
                        ? nx : prev)
                .takeWhile(layer -> Arrays.stream(layer).limit(SZ + 1).anyMatch(v -> v != 0)).limit(Math.min(m, n / 2 + 1)).mapToLong(layer -> layer[SZ]).sum() % MOD).sum() % MOD : "");
    }
}
