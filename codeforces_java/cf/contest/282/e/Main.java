import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && LongStream.range(0, n).map(i -> it.next()).toArray() instanceof long[] a
            && Long.valueOf(Arrays.stream(a).reduce(0, (x, y) -> x ^ y)) instanceof Long total
            && new int[2][41 * (n + 1) + 2] instanceof int[][] ch && new int[]{0, 0} instanceof int[] st
            && ((LongPredicate) v -> (st[0] = 0) == 0 && IntStream.iterate(40, b -> b >= 0, b -> b - 1).allMatch(b -> Integer.valueOf((int) ((v >> b) & 1)) instanceof Integer d
                && (ch[d][st[0]] != 0 || (ch[d][st[0]] = ++st[1]) > 0) && (st[0] = ch[d][st[0]]) >= 0)) instanceof LongPredicate ins
            && new long[1] instanceof long[] res
            && ((LongUnaryOperator) v -> (st[0] = 0) == 0 && (res[0] = 0) == 0 && IntStream.iterate(40, b -> b >= 0, b -> b - 1).allMatch(b -> Integer.valueOf((int) ((v >> b) & 1)) instanceof Integer d
                && (ch[1 - d][st[0]] != 0 ? (res[0] |= 1L << b) >= 0 && (st[0] = ch[1 - d][st[0]]) >= 0 : (st[0] = ch[d][st[0]]) >= 0)) ? res[0] : -1) instanceof LongUnaryOperator qry
            && new long[]{0, 0} instanceof long[] pre
            ? LongStream.rangeClosed(0, n).map(j -> ins.test(pre[0]) ? Math.max(0, qry.applyAsLong(total ^ pre[0])) + 0 * (pre[0] ^= j < n ? a[(int) j] : 0) : 0).max().getAsLong() : "");
    }
}
