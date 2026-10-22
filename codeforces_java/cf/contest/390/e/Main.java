import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[1] instanceof int[] ps
            && ((IntSupplier) () -> new int[1] instanceof int[] r
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> buf[ps[0]] < '0' && ++ps[0] > 0)
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> ps[0] < buf.length && buf[ps[0]] >= '0' && (r[0] = r[0] * 10 + buf[ps[0]++] - '0') >= 0)
                ? r[0] : 0) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer m && Integer.valueOf(nx.getAsInt()) instanceof Integer w
            && new long[2][n + 2] instanceof long[][] R && new long[2][m + 2] instanceof long[][] C && new long[1] instanceof long[] total
            && ((BiPredicate<long[][], long[]>) (T, a) -> IntStream.iterate((int) a[0], j -> j < T[0].length, j -> j + (j & -j)).allMatch(j -> (T[0][j] += a[1]) * 0 == 0 && (T[1][j] += a[2]) * 0 == 0)) instanceof BiPredicate<long[][], long[]> pt
            && ((BiPredicate<long[][], long[]>) (T, a) -> pt.test(T, new long[]{a[0], a[2], a[2] * (a[0] - 1)}) && pt.test(T, new long[]{a[1] + 1, -a[2], -a[2] * a[1]})) instanceof BiPredicate<long[][], long[]> add
            && ((ToLongBiFunction<long[][], Integer>) (T, i) -> i * IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).mapToLong(j -> T[0][j]).sum() - IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).mapToLong(j -> T[1][j]).sum()) instanceof ToLongBiFunction<long[][], Integer> pref
            ? IntStream.range(0, w).mapToObj(o -> Integer.valueOf(nx.getAsInt()) instanceof Integer ty
                && Integer.valueOf(nx.getAsInt()) instanceof Integer x0 && Integer.valueOf(nx.getAsInt()) instanceof Integer y0
                && Integer.valueOf(nx.getAsInt()) instanceof Integer x1 && Integer.valueOf(nx.getAsInt()) instanceof Integer y1
                ? ty == 0 ? Long.valueOf(nx.getAsInt()) instanceof Long v
                        && add.test(R, new long[]{x0, x1, v * (y1 - y0 + 1)}) && add.test(C, new long[]{y0, y1, v * (x1 - x0 + 1)}) && (total[0] += v * (x1 - x0 + 1) * (y1 - y0 + 1)) * 0 == 0 ? (String) null : null
                    : String.valueOf(pref.applyAsLong(R, x1) - pref.applyAsLong(R, x0 - 1) + pref.applyAsLong(C, y1) - pref.applyAsLong(C, y0 - 1) - total[0]) : null)
                .filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
