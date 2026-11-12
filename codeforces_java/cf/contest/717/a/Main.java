import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && Long.valueOf(tk.nextToken()) instanceof Long lo && Long.valueOf(tk.nextToken()) instanceof Long hi
            && Long.valueOf(lo + 2) instanceof Long lL && Long.valueOf(hi + 2) instanceof Long rR
            && ((BinaryOperator<long[]>) (x, y) -> new long[]{(x[0] * y[0] + 5 * (x[1] * y[1] % 1000000007L)) % 1000000007L, (x[0] * y[1] + x[1] * y[0]) % 1000000007L}) instanceof BinaryOperator<long[]> mul
            && ((BinaryOperator<long[]>) (x, y) -> new long[]{(x[0] + y[0]) % 1000000007L, (x[1] + y[1]) % 1000000007L}) instanceof BinaryOperator<long[]> add
            && ((BinaryOperator<long[]>) (x, y) -> new long[]{(x[0] - y[0] + 1000000007L) % 1000000007L, (x[1] - y[1] + 1000000007L) % 1000000007L}) instanceof BinaryOperator<long[]> sub
            && ((BiFunction<long[], Long, long[]>) (bb, ee) -> Stream.<long[][]>of(new long[][]{{1, 0}, bb, {ee}}).peek(st -> IntStream.range(0, 62).allMatch(z ->
                ((st[2][0] & 1) == 0 || (st[0] = mul.apply(st[0], st[1])) != null) && (st[1] = mul.apply(st[1], st[1])) != null && (st[2][0] >>= 1) >= 0 || true)).findFirst().get()[0]) instanceof BiFunction<long[], Long, long[]> pw
            && ((UnaryOperator<long[]>) x -> Long.valueOf(pw.apply(new long[]{(x[0] * x[0] - 5 * (x[1] * x[1] % 1000000007L) % 1000000007L + 1000000007L) % 1000000007L, 0}, 1000000005L)[0]) instanceof Long iv
                ? new long[]{x[0] * iv % 1000000007L, (1000000007L - x[1]) % 1000000007L * iv % 1000000007L} : null) instanceof UnaryOperator<long[]> inv
            && new long[]{500000004L, 500000004L} instanceof long[] phi && new long[]{500000004L, 500000003L} instanceof long[] psi
            && new long[]{0, 400000003L} instanceof long[] invs
            && new long[k + 1][] instanceof long[][] ph && new long[k + 1][] instanceof long[][] ps && (ph[0] = new long[]{1, 0}) != null && (ps[0] = new long[]{1, 0}) != null
            && IntStream.range(1, k + 1).allMatch(i -> (ph[i] = mul.apply(ph[i - 1], phi)) != null && (ps[i] = mul.apply(ps[i - 1], psi)) != null || true)
            && new long[k + 2] instanceof long[] c && (c[0] = 1) == 1
            && IntStream.range(0, k).allMatch(t -> IntStream.range(0, t + 2).map(u -> t + 1 - u).allMatch(j ->
                (c[j] = ((j > 0 ? c[j - 1] : 0) - (long) t * c[j] % 1000000007L + 1000000007L) % 1000000007L) >= 0 || true) || true)
            && new long[k + 1][k + 1] instanceof long[][] bn
            && IntStream.range(0, k + 1).allMatch(j -> (bn[j][0] = 1) == 1
                && IntStream.range(1, j + 1).allMatch(i -> (bn[j][i] = (bn[j - 1][i - 1] + bn[j - 1][i]) % 1000000007L) >= 0 || true) || true)
            && Long.valueOf(pw.apply(new long[]{LongStream.rangeClosed(1, k).reduce(1, (x, y) -> x * y % 1000000007L), 0}, 1000000005L)[0]) instanceof Long ifk
            && ((UnaryOperator<long[]>) ro -> ro[0] == 1 && ro[1] == 0 ? new long[]{(hi - lo + 1) % 1000000007L, 0}
                : mul.apply(sub.apply(pw.apply(ro, rR + 1), pw.apply(ro, lL)), inv.apply(sub.apply(ro, new long[]{1, 0})))) instanceof UnaryOperator<long[]> g
            ? IntStream.rangeClosed(0, k).mapToObj(j -> mul.apply(mul.apply(new long[]{c[j] * ifk % 1000000007L, 0}, pw.apply(invs, (long) j)),
                IntStream.rangeClosed(0, j).mapToObj(i -> mul.apply(g.apply(mul.apply(ph[i], ps[j - i])), new long[]{(j - i) % 2 == 0 ? bn[j][i] : 1000000007L - bn[j][i], 0}))
                    .reduce(new long[]{0, 0}, (x, y) -> add.apply(x, y)))).reduce(new long[]{0, 0}, (x, y) -> add.apply(x, y))[0] % 1000000007L : "");
    }
}
