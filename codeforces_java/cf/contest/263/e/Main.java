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
            && Integer.valueOf(n + m + 3) instanceof Integer S
            && new long[S][S] instanceof long[][] P && new long[S][S] instanceof long[][] Dg && new long[S][S] instanceof long[][] Ad
            && IntStream.range(0, n * m).allMatch(f -> Integer.valueOf(f / m + 1) instanceof Integer i && Integer.valueOf(f % m + 1) instanceof Integer j && (P[i + j + 1][i - j + m + 1] = vals[3 + f]) >= 0)
            && IntStream.range(1, S).allMatch(u -> IntStream.range(1, S).allMatch(v -> (P[u][v] += P[u - 1][v] + P[u][v - 1] - P[u - 1][v - 1]) >= 0))
            && IntStream.range(0, S).allMatch(u -> IntStream.range(0, S).allMatch(v -> (Dg[u][v] = P[u][v] + (u > 0 && v > 0 ? Dg[u - 1][v - 1] : 0)) >= 0 && (Ad[u][v] = P[u][v] + (u > 0 && v + 1 < S ? Ad[u - 1][v + 1] : 0)) >= 0))
            && new long[]{-1, 0, 0} instanceof long[] best
            && IntStream.rangeClosed(k, n - k + 1).allMatch(x -> IntStream.rangeClosed(k, m - k + 1).allMatch(y -> Integer.valueOf(x + y + 1) instanceof Integer U && Integer.valueOf(x - y + m + 1) instanceof Integer V
                && Long.valueOf(Dg[U + k - 1][V + k - 1] - Dg[U - k - 1][V - k - 1] + Ad[U - 1 - k][V + k] - Ad[U + k - 1][V - k]) instanceof Long f
                && (f <= best[0] || ((best[0] = f) >= 0 && (best[1] = x) > 0 && (best[2] = y) > 0))))
            ? best[1] + " " + best[2] : "");
    }
}

