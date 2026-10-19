import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && Long.valueOf(777777777L) instanceof Long M
            && new long[n + 1][n + 1] instanceof long[][] C
            && IntStream.rangeClosed(0, n).allMatch(i -> (C[i][0] = 1) > 0 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % M) >= 0))
            && new long[n + 1] instanceof long[] g && (g[0] = 1) == 1
            && IntStream.rangeClosed(1, n).allMatch(l -> g.clone() instanceof long[] prev
                && IntStream.rangeClosed(0, n).allMatch(j -> (g[j] = IntStream.rangeClosed(0, j).filter(c -> l == k ? c == n - k : c != n - l).mapToLong(c -> prev[j - c] * C[j][c] % M).sum() % M) >= 0))
            ? g[n] : "");
    }
}
