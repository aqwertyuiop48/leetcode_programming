import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            && w[0].chars().map(ch -> "RGB".indexOf(ch)).toArray() instanceof int[] sc && w[1].chars().map(ch -> "RGB".indexOf(ch)).toArray() instanceof int[] tc
            && Integer.valueOf(sc.length) instanceof Integer n && Integer.valueOf(tc.length) instanceof Integer m && Integer.valueOf(1 << 21) instanceof Integer BIG
            && new int[n + 1] instanceof int[] g && new int[n + 1] instanceof int[] h && new int[3][m + 2] instanceof int[][] nx && new int[9][m + 1] instanceof int[][] P
            && IntStream.range(0, 3).allMatch(c -> (nx[c][m + 1] = BIG) > 0)
            && IntStream.range(0, 3 * m).allMatch(f -> (nx[f % 3][m - f / 3] = tc[m - f / 3 - 1] == f % 3 ? m - f / 3 : nx[f % 3][m - f / 3 + 1]) > 0)
            && IntStream.range(0, 9 * m).allMatch(f -> (P[f % 9][f / 9 + 1] = P[f % 9][f / 9] + (f / 9 >= 1 && tc[f / 9 - 1] * 3 + tc[f / 9] == f % 9 ? 1 : 0)) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(k -> (g[k] = g[k - 1] + (g[k - 1] < m && tc[g[k - 1]] == sc[k - 1] ? 1 : 0)) >= 0
                && (h[k] = h[k - 1] >= m ? BIG : nx[sc[k - 1]][h[k - 1] + 1]) > 0)
            ? IntStream.rangeClosed(1, n).mapToLong(x -> Integer.valueOf(g[x - 1] + 1) instanceof Integer lo && Integer.valueOf(Math.min(h[x], m)) instanceof Integer hi
                ? lo > hi ? 0L : hi - lo + 1 - (x >= 2 && sc[x - 2] != sc[x - 1] ? P[sc[x - 1] * 3 + sc[x - 2]][hi] - P[sc[x - 1] * 3 + sc[x - 2]][lo - 1] : 0) : 0L).sum() : "");
    }
}
