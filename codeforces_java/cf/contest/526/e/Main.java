import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && new long[2 * n + 1] instanceof long[] p && IntStream.range(0, 2 * n).allMatch(i -> (p[i + 1] = p[i] + (i < n ? Long.parseLong(tk.nextToken()) : p[i + 1 - n] - p[i - n])) > 0)
            && new int[n] instanceof int[] len
            ? IntStream.range(0, q).mapToObj(z -> (Long) Long.parseLong(tk.nextToken()) instanceof Long b && new int[]{0, 0} instanceof int[] ij
                && IntStream.range(0, 3 * n).allMatch(t -> ij[0] >= n || (ij[1] - ij[0] < n && p[ij[1] + 1] - p[ij[0]] <= b ? ++ij[1] > 0 : (len[ij[0]] = ij[1] - ij[0]) >= 0 && ++ij[0] > 0))
                && (Integer) IntStream.range(0, n).reduce((x, y) -> len[y] < len[x] ? y : x).getAsInt() instanceof Integer i0
                && new long[]{i0, i0, 0, Long.MAX_VALUE} instanceof long[] st
                && Stream.generate(() -> 0).takeWhile(t -> st[0] <= i0 + len[i0]).allMatch(t -> st[1] >= st[0] + n
                    ? (st[3] = Math.min(st[3], st[2])) > 0 && ++st[0] > 0 && (st[1] = st[0]) > 0 && (st[2] = 0) == 0
                    : (st[1] += len[(int) (st[1] % n)]) > 0 && ++st[2] > 0)
                ? String.valueOf(st[3]) : "").collect(Collectors.joining("\n")) : "");
    }
}
