import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && new long[k + 2][n + 2] instanceof long[][] bit && new long[]{0} instanceof long[] res
            && IntStream.range(0, n).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x
                && IntStream.rangeClosed(1, k + 1).allMatch(l -> (Long) (l == 1 ? 1L : IntStream.iterate(x - 1, j -> j > 0, j -> j - (j & -j)).mapToLong(j -> bit[l - 1][j]).sum()) instanceof Long v
                    && IntStream.iterate(x, j -> j <= n, j -> j + (j & -j)).allMatch(j -> (bit[l][j] += v) != 0 || true)
                    && ((l == k + 1 ? (res[0] += v) : 0) >= 0)))
            ? res[0] : 0);
    }
}
