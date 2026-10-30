import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] vals && new long[3] instanceof long[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[(int) pr[1]++] = (int) pr[0]) >= 0 && (pr[0] = 0) == 0 && (pr[2] = 0) == 0))
            && Integer.valueOf(vals[0]) instanceof Integer n && Integer.valueOf(vals[1]) instanceof Integer m && Integer.valueOf(vals[2]) instanceof Integer k
            && new long[n + 2][m + 2] instanceof long[][] a && new long[n + 2][m + 2] instanceof long[][] D1 && new long[n + 2][m + 2] instanceof long[][] D2
            && IntStream.range(0, n * m).allMatch(f -> Integer.valueOf(f / m + 1) instanceof Integer i && Integer.valueOf(f % m + 1) instanceof Integer j
                && (a[i][j] = vals[3 + f]) >= 0 && (D1[i][j] = a[i][j] + D1[i - 1][j - 1]) >= 0 && (D2[i][j] = a[i][j] + D2[i - 1][j + 1]) >= 0)
            && new long[]{IntStream.rangeClosed(1, 2 * k - 1).mapToLong(r -> LongStream.rangeClosed(k - (k - 1 - Math.abs(r - k)), k + (k - 1 - Math.abs(r - k))).map(c -> a[r][(int) c]).sum()).sum(), 0, -1, 0, 0} instanceof long[] st
            && IntStream.rangeClosed(k, n - k + 1).allMatch(x -> (x == k || (st[0] += (D1[x + k - 1][k] - D1[x - 1][k - k] + D2[x + k - 1][k] - D2[x - 1][k + k] - a[x + k - 1][k]) - (D2[x - 1][k - k + 1] - D2[x - 1 - k][k + 1] + D1[x - 1][k + k - 1] - D1[x - 1 - k][k - 1] - a[x - 1 - k + 1][k])) >= 0) && (st[1] = st[0]) >= 0
                && (st[1] <= st[2] || (st[2] = st[1]) >= 0 && (st[3] = x) > 0 && (st[4] = k) > 0)
                && IntStream.rangeClosed(k + 1, m - k + 1).allMatch(y -> (st[1] += (D1[x][y + k - 1] - D1[x - k][y - 1] + D2[x + k - 1][y] - D2[x - 1][y + k] - a[x][y + k - 1]) - (D2[x][y - 1 - k + 1] - D2[x - k][y - 1 + 1] + D1[x + k - 1][y - 1] - D1[x - 1][y - 1 - k] - a[x][y - 1 - k + 1])) >= 0 && (st[1] <= st[2] || (st[2] = st[1]) >= 0 && (st[3] = x) > 0 && (st[4] = y) > 0)))
            ? st[3] + " " + st[4] : "");
    }
}
