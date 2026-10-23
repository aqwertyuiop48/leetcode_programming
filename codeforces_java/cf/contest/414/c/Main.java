import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) (1 << n) instanceof Integer N
            && IntStream.range(0, N).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] cur && new int[][]{cur, new int[N]} instanceof int[][] w
            && new long[2][n + 1] instanceof long[][] c && new int[4] instanceof int[] st
            && IntStream.rangeClosed(1, n).allMatch(l -> (Integer) (1 << (l - 1)) instanceof Integer h && (Integer) ((l & 1) == 1 ? 0 : 1) instanceof Integer sr
                && IntStream.range(0, N).allMatch(t -> ((t & (2 * h - 1)) != 0 || (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)
                    && (st[1] >= h || st[0] < h && w[sr][(t & -2 * h) + st[0]] <= w[sr][(t & -2 * h) + h + st[1]]
                        ? (w[1 - sr][t] = w[sr][(t & -2 * h) + st[0]++]) >= Integer.MIN_VALUE
                        : (c[0][l] += h - st[0]) >= 0 && (w[1 - sr][t] = w[sr][(t & -2 * h) + h + st[1]++]) >= Integer.MIN_VALUE)
                    && (st[3] >= h || st[2] < h && w[sr][(t & -2 * h) + st[2]] < w[sr][(t & -2 * h) + h + st[3]]
                        ? ++st[2] > 0 : (c[1][l] += st[2]) >= 0 && ++st[3] > 0)))
            ? IntStream.range(0, Integer.parseInt(tk.nextToken())).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
                && IntStream.rangeClosed(1, q).allMatch(l -> (c[0][l] ^= c[1][l]) >= 0 && (c[1][l] ^= c[0][l]) >= 0 && (c[0][l] ^= c[1][l]) >= 0)
                ? String.valueOf(IntStream.rangeClosed(1, n).mapToLong(l -> c[0][l]).sum()) : "").collect(Collectors.joining("\n")) : "");
    }
}
