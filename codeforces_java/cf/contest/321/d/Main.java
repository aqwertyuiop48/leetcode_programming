import java.io.*;
import java.util.*;
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
            ? IntStream.range(0, 1 << m).map(mask -> Integer.valueOf(mask >> h & 1) instanceof Integer z
                ? a[h][h] * (1 - 2 * z)
                    + IntStream.range(0, h).map(j -> a[h][j] * (1 - 2 * (mask >> j & 1)) + a[h][j + m] * (1 - 2 * ((mask >> j & 1) ^ z))).sum()
                    + IntStream.range(0, h).map(i -> IntStream.of(0, 1).map(c -> a[i][h] * (1 - 2 * c) + a[i + m][h] * (1 - 2 * (c ^ z))
                        + IntStream.range(0, h).map(j -> best[((i * h + j) * 2 + (mask >> j & 1)) * 4 + c * 2 + z]).sum()).max().getAsInt()).sum() : 0).max().getAsInt() : "");
    }
}
