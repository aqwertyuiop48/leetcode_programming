import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).collect(Collectors.joining()).toCharArray() instanceof char[] g
            && new boolean[n * m] instanceof boolean[] lf && new boolean[n * m] instanceof boolean[] rt && new boolean[n * m] instanceof boolean[] up && new boolean[n * m] instanceof boolean[] dn
            && IntStream.range(0, n * m).allMatch(i -> (lf[i] = g[i] == '.' && (i % m == 0 || lf[i - 1])) || true)
            && IntStream.range(0, n * m).allMatch(i -> (up[i] = g[i] == '.' && (i < m || up[i - m])) || true)
            && IntStream.iterate(n * m - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (rt[i] = g[i] == '.' && (i % m == m - 1 || rt[i + 1])) || true)
            && IntStream.iterate(n * m - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (dn[i] = g[i] == '.' && (i >= (n - 1) * m || dn[i + m])) || true)
            && new long[m] instanceof long[] colS && new int[m] instanceof int[] pl && new int[m] instanceof int[] pr && new long[4] instanceof long[] hs
            ? IntStream.range(1, n - 1).filter(r -> lf[r * m + m - 1]).count() + IntStream.range(1, m - 1).filter(c -> up[(n - 1) * m + c]).count()
                + IntStream.range(0, n * m).filter(i -> i / m >= 1 && i / m <= n - 2 && i % m >= 1 && i % m <= m - 2).mapToLong(i -> (Integer) (i / m) instanceof Integer r && (Integer) (i % m) instanceof Integer c
                    && (Integer) ((lf[i] ? 1 : 0)) instanceof Integer l && (Integer) ((rt[i] ? 1 : 0)) instanceof Integer rr && (Integer) ((up[i] ? 1 : 0)) instanceof Integer u && (Integer) ((dn[i] ? 1 : 0)) instanceof Integer d
                    ? (c == 1 ? (hs[0] = 0) + (hs[1] = 0) + (hs[2] = 0) : 0)
                        + (g[i] != '.' ? (colS[c] = 0) + (pl[c] = 0) + (pr[c] = 0) + (hs[0] = 0) + (hs[1] = 0) + (hs[2] = 0)
                            : (long) (l + rr) * (u + d) + (l + rr) * colS[c] - (l * pl[c] + rr * pr[c]) + (u + d) * hs[0] - (u * hs[1] + d * hs[2])
                                + 0 * ((colS[c] += l + rr) + (pl[c] = l) + (pr[c] = rr) + (hs[0] += u + d) + (hs[1] = u) + (hs[2] = d))) : 0).sum()
            : 0);
    }
}
