import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && Integer.valueOf((int) a[1]) instanceof Integer n && Long.valueOf(a[2]) instanceof Long p && Long.valueOf(a[3]) instanceof Long t
            && new long[n + 1] instanceof long[] cV && new long[n + 1] instanceof long[] eV && new int[]{0, 0} instanceof int[] st && new long[]{0, 0} instanceof long[] g
            && IntStream.range(0, n).allMatch(i -> Long.valueOf(a[4 + 2 * i]) instanceof Long l && Long.valueOf(a[5 + 2 * i]) instanceof Long r
                && (IntStream.iterate(0, z -> st[1] < st[0] && eV[st[1]] + t <= l, z -> z + 1).allMatch(z -> (g[0] = Math.max(g[0], cV[st[1]++])) >= 0) || true)
                && Stream.<long[]>of(r - l >= p ? new long[]{g[0] + (r - l) / p, l + (r - l) / p * p} : null,
                        st[1] < st[0] && r - Math.max(l, eV[st[1]] + t) >= p
                            ? new long[]{cV[st[1]] + (r - Math.max(l, eV[st[1]] + t)) / p, Math.max(l, eV[st[1]] + t) + (r - Math.max(l, eV[st[1]] + t)) / p * p} : null)
                    .filter(Objects::nonNull).max(Comparator.<long[]>comparingLong(x -> x[0]).thenComparingLong(x -> -x[1])) instanceof Optional<long[]> o
                && (o.isEmpty() || ((cV[st[0]] = o.get()[0]) >= 0 && (eV[st[0]++] = o.get()[1]) >= 0 && (g[1] = Math.max(g[1], o.get()[0])) >= 0)))
            ? g[1] : "");
    }
}
