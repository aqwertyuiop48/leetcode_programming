import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Long.valueOf(1000000007L) instanceof Long M
            && new long[m + 3] instanceof long[] d && new long[m + 3] instanceof long[] p1 && new long[m + 3] instanceof long[] p2 && new long[m + 3] instanceof long[] ta && new long[m + 3] instanceof long[] td
            && new int[n + 2][m + 3] instanceof int[][] TA && new int[n + 2][m + 3] instanceof int[][] TD
            && IntStream.rangeClosed(1, n).allMatch(q -> IntStream.rangeClosed(1, m).allMatch(w -> (p1[w] = (p1[w - 1] + d[w]) % M) >= 0 && (p2[w] = (p2[w - 1] + d[w] * w) % M) >= 0)
                && IntStream.rangeClosed(2, m).allMatch(w -> Long.valueOf(q == 1 ? 1 : Math.floorMod((w + 1) * p1[w - 1] - p2[w - 1], M)) instanceof Long a && (d[w] = q == 1 ? 1 : Math.floorMod((w + 1) * p1[w] - p2[w], M)) >= 0
                    && (ta[w] = (ta[w] + a) % M) >= 0 && (td[w] = (td[w] + d[w]) % M) >= 0 && (TA[q][w] = (int) ta[w]) >= 0 && (TD[q][w] = (int) td[w]) >= 0))
            ? IntStream.rangeClosed(2, m).mapToLong(w -> (m - w + 1) * IntStream.rangeClosed(1, n).mapToLong(t -> (long) TA[t][w] * TD[n - t + 1][w] % M).sum() % M).sum() % M : "");
    }
}

