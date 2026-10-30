import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf((n + 1) / 2) instanceof Integer m && Integer.valueOf(m - 1) instanceof Integer h
            && IntStream.range(0, n).mapToObj(i -> IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(n).toArray()).toArray(int[][]::new) instanceof int[][] a
            && new int[Math.max(1, h * h) * 8] instanceof int[] best
            && IntStream.range(0, h * h * 8).map(x -> Integer.valueOf(x / 8 / h) instanceof Integer i && Integer.valueOf(x / 8 % h) instanceof Integer j
                && Integer.valueOf(x / 4 % 2) instanceof Integer r && Integer.valueOf(x / 2 % 2) instanceof Integer c && Integer.valueOf(x % 2) instanceof Integer z
                ? best[x] = IntStream.of(0, 1).map(f -> a[i][j] * (1 - 2 * f) + a[i][j + m] * (1 - 2 * (f ^ c)) + a[i + m][j] * (1 - 2 * (f ^ r))
                    + a[i + m][j + m] * (1 - 2 * (f ^ r ^ c ^ z))).max().getAsInt() : 0).max().orElse(0) >= 0
            && Integer.valueOf(Math.min(h, 8)) instanceof Integer lb
            && new int[Math.max(1, h) * 4 * 256] instanceof int[] LT && new int[Math.max(1, h) * 4 * 256] instanceof int[] HT && new int[2 * 256] instanceof int[] RT && new int[2 * 256] instanceof int[] RH
            && IntStream.range(0, h * 4 * 256).map(x -> Integer.valueOf(x / 1024) instanceof Integer i && Integer.valueOf(x / 512 % 2) instanceof Integer c
                && Integer.valueOf(x / 256 % 2) instanceof Integer z && Integer.valueOf(x % 256) instanceof Integer mk
                ? (LT[x] = IntStream.range(0, lb).map(j -> best[((i * h + j) * 2 + (mk >> j & 1)) * 4 + c * 2 + z]).sum())
                    + (HT[x] = IntStream.range(8, Math.max(8, h)).map(j -> best[((i * h + j) * 2 + (mk >> (j - 8) & 1)) * 4 + c * 2 + z]).sum()) : 0).max().orElse(0) >= 0
            && IntStream.range(0, 512).map(x -> Integer.valueOf(x / 256) instanceof Integer z && Integer.valueOf(x % 256) instanceof Integer mk
                ? (RT[x] = IntStream.range(0, lb).map(j -> a[h][j] * (1 - 2 * (mk >> j & 1)) + a[h][j + m] * (1 - 2 * ((mk >> j & 1) ^ z))).sum())
                    + (RH[x] = IntStream.range(8, Math.max(8, h)).map(j -> a[h][j] * (1 - 2 * (mk >> (j - 8) & 1)) + a[h][j + m] * (1 - 2 * ((mk >> (j - 8) & 1) ^ z))).sum()) : 0).max().orElse(0) >= 0
            ? String.valueOf(IntStream.range(0, 1 << m).map(mask -> Integer.valueOf(mask >> h & 1) instanceof Integer z && Integer.valueOf((mask & ((1 << h) - 1)) & 255) instanceof Integer lm
                && Integer.valueOf((mask & ((1 << h) - 1)) >> 8) instanceof Integer hm
                ? a[h][h] * (1 - 2 * z) + RT[z * 256 + lm] + RH[z * 256 + hm]
                    + IntStream.range(0, h).map(i -> Math.max(a[i][h] + a[i + m][h] * (1 - 2 * z) + LT[((i * 2) * 2 + z) * 256 + lm] + HT[((i * 2) * 2 + z) * 256 + hm],
                        -a[i][h] + a[i + m][h] * (1 - 2 * (1 ^ z)) + LT[((i * 2 + 1) * 2 + z) * 256 + lm] + HT[((i * 2 + 1) * 2 + z) * 256 + hm])).sum() : 0).max().getAsInt()) : "");
    }
}
