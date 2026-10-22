import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && new long[3][3] instanceof long[][] t
            && IntStream.range(0, 9).allMatch(p -> (t[p / 3][p % 3] = it.next()) >= 0)
            && Long.valueOf(it.next()) instanceof Long n && new long[(int) (n + 1)][3][3] instanceof long[][][] f
            && IntStream.rangeClosed(1, (int) (long) n).allMatch(k -> IntStream.range(0, 9).allMatch(p -> Integer.valueOf(p / 3) instanceof Integer a && Integer.valueOf(p % 3) instanceof Integer b && Integer.valueOf(3 - a - b) instanceof Integer c
                && (f[k][a][b] = a.equals(b) ? 0 : Math.min(f[k - 1][a][c] + t[a][b] + f[k - 1][c][b], 2 * f[k - 1][a][b] + f[k - 1][b][a] + t[a][c] + t[c][b])) >= 0))
            ? f[(int) (long) n][0][2] : "");
    }
}
