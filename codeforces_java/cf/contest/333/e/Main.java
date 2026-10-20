import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((n + 63) / 64) instanceof Integer w
            && IntStream.range(0, n).boxed().flatMapToLong(i -> IntStream.range(i + 1, n).mapToLong(j -> (((t[1 + 2 * i] - t[1 + 2 * j]) * (t[1 + 2 * i] - t[1 + 2 * j]) + (t[2 + 2 * i] - t[2 + 2 * j]) * (t[2 + 2 * i] - t[2 + 2 * j])) << 24) | ((long) i << 12) | j)).toArray() instanceof long[] e
            && Arrays.stream(e).sorted().toArray() instanceof long[] s
            && new long[n][w] instanceof long[][] b && new long[]{0} instanceof long[] res
            && IntStream.iterate(s.length - 1, i -> i >= 0, i -> i - 1).anyMatch(i -> Integer.valueOf((int) (s[i] >> 12 & 4095)) instanceof Integer u && Integer.valueOf((int) (s[i] & 4095)) instanceof Integer v
                && ((res[0] = s[i] >> 24) > 0 && IntStream.range(0, w).anyMatch(k -> (b[u][k] & b[v][k]) != 0)
                    || !((b[u][v >> 6] |= 1L << (v & 63)) == 0 & (b[v][u >> 6] |= 1L << (u & 63)) == 0 | true) && false))
            ? String.format("%.10f", Math.sqrt(res[0]) / 2) : "");
    }
}
