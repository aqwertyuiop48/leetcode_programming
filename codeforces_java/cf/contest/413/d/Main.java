import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && (Integer) (1 << (k - 1)) instanceof Integer M && new int[][] {new int[M + 2], new int[M + 2]} instanceof int[][] buf && (buf[0][2] = 1) == 1
            && new long[n + 2] instanceof long[] p2 && (p2[0] = 1) == 1 && IntStream.rangeClosed(1, n + 1).allMatch(i -> (p2[i] = p2[i - 1] * 2 % 1000000007L) > 0)
            && new int[n + 1] instanceof int[] zafter && IntStream.range(0, n).map(i -> n - 1 - i).allMatch(i -> (zafter[i] = zafter[i + 1] + (a[i] == 0 ? 1 : 0)) >= 0)
            && new long[4] instanceof long[] st && (st[1] = 0) == 0 && (st[2] = 1) == 1
            && IntStream.range(0, n).allMatch(i -> buf[i & 1] instanceof int[] cur && buf[(i + 1) & 1] instanceof int[] nx
                && (Integer) (a[i] == 0 || a[i] == 2 ? 1 : 0) instanceof Integer c2 && (Integer) (a[i] == 0 || a[i] == 4 ? 1 : 0) instanceof Integer c4
                && (st[0] = (st[0] + ((long) c2 * cur[M + 1] + (long) c4 * cur[M]) % 1000000007L * p2[zafter[i + 1]]) % 1000000007L) >= 0
                && IntStream.range(2, M + 2).map(q -> nx[q] = (c2 * cur[q - 1] + (c4 & ~q & 1) * cur[q - 2]) >= 1000000007 ? (c2 * cur[q - 1] + (c4 & ~q & 1) * cur[q - 2]) - 1000000007 : (c2 * cur[q - 1] + (c4 & ~q & 1) * cur[q - 2])).asLongStream().sum() >= 0
                && (nx[4] = (int) ((nx[4] + (long) c4 * st[1]) % 1000000007L)) >= 0
                && (st[3] = (c2 * (st[1] - cur[M + 1] + 1000000007L) + c4 * (st[2] - cur[M] + st[1] + 1000000007L)) % 1000000007L) >= 0
                && (st[1] = c2 * st[2]) >= 0 && (st[2] = st[3]) >= 0)
            ? st[0] : 0);
    }
}

