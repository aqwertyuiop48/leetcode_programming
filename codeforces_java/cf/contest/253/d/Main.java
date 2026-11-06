import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new StringTokenizer(new String(io.getKey())) instanceof StringTokenizer sc
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer m && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer r
            && IntStream.range(0, n).mapToObj(i -> sc.nextToken()).collect(Collectors.joining()).getBytes() instanceof byte[] g
            && new int[(n + 1) * m] instanceof int[] P
            && IntStream.range(0, n * m).allMatch(i -> (P[i + m] = P[i] + (g[i] == 'a' ? 1 : 0)) >= 0)
            && new int[2 * m + 2] instanceof int[] DUM && new int[3] instanceof int[] st && new int[26] instanceof int[] cnt && new long[1] instanceof long[] ans
            && IntStream.range(1, n).allMatch(b -> Integer.valueOf(b * m) instanceof Integer bm && Integer.valueOf((b + 1) * m) instanceof Integer b1m
                && IntStream.range(0, b).allMatch(t -> Integer.valueOf(t * m) instanceof Integer tm
                    && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0
                    && Stream.of(0).peek(z0 -> Arrays.fill(cnt, 0)).findFirst().isPresent()
                    && Stream.of(0).peek(z0 -> Arrays.setAll(DUM, z -> st[0] < m
                        && (st[2] + (P[b1m + st[0]] - P[tm + st[0]]) > r
                            ? (st[1] < st[0]
                                ? (st[2] -= P[b1m + st[1]] - P[tm + st[1]]) >= 0 && (g[bm + st[1]] != g[tm + st[1]] || --cnt[g[tm + st[1]] - 'a'] >= 0) && ++st[1] > 0 && false
                                : (st[1] = ++st[0]) > 0 && false)
                            : (g[bm + st[0]] != g[tm + st[0]] || ((ans[0] += cnt[g[tm + st[0]] - 'a']) >= 0 && ++cnt[g[tm + st[0]] - 'a'] > 0))
                                && (st[2] += P[b1m + st[0]] - P[tm + st[0]]) >= 0 && ++st[0] > 0 && false) ? 1 : 0)).findFirst().isPresent()))
            ? ans[0] : ""));
    }
}
