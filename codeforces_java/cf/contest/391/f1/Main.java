import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[1] instanceof int[] ps
            && ((LongSupplier) () -> new long[1] instanceof long[] r
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> buf[ps[0]] < '0' && ++ps[0] > 0)
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> ps[0] < buf.length && buf[ps[0]] >= '0' && (r[0] = r[0] * 10 + buf[ps[0]++] - '0') >= 0)
                ? r[0] : 0L) instanceof LongSupplier nx
            && Integer.valueOf((int) nx.getAsLong()) instanceof Integer n && Long.valueOf(nx.getAsLong()) instanceof Long k
            && LongStream.generate(nx).limit(n).toArray() instanceof long[] a
            && new int[n + 1] instanceof int[] sv && new int[n + 1] instanceof int[] sp && new long[n + 2] instanceof long[] pr
            && new int[]{0, -1, 0, 0} instanceof int[] s
            && (IntStream.iterate(0, z -> s[1] < n - 1, z -> z + 1).allMatch(z -> (s[0] = s[1] + 1) >= 0
                && IntStream.iterate(0, y -> s[0] < n - 1 && a[s[0]] >= a[s[0] + 1], y -> y + 1).allMatch(y -> ++s[0] > 0)
                && (s[1] = s[0]) >= 0
                && IntStream.iterate(0, y -> s[1] < n - 1 && a[s[1]] <= a[s[1] + 1], y -> y + 1).allMatch(y -> ++s[1] > 0)
                && IntStream.iterate(0, y -> s[2] > 0 && a[s[0]] < a[sv[s[2] - 1]], y -> y + 1).allMatch(y -> (pr[s[3]++] = a[sp[s[2] - 1]] - a[sv[s[2] - 1]]) >= 0 && --s[2] >= 0)
                && IntStream.iterate(0, y -> s[2] > 0 && a[s[1]] >= a[sp[s[2] - 1]], y -> y + 1).allMatch(y -> (pr[s[3]++] = a[sp[s[2] - 1]] - a[s[0]]) >= 0 && (s[0] = sv[s[2] - 1]) >= 0 && --s[2] >= 0)
                && (sv[s[2]] = s[0]) >= 0 && (sp[s[2]] = s[1]) >= 0 && ++s[2] > 0) || true)
            && IntStream.range(0, s[2]).allMatch(i -> (pr[s[3]++] = a[sp[i]] - a[sv[i]]) >= 0)
            ? Arrays.stream(pr, 0, s[3]).sorted().skip(Math.max(0L, s[3] - k)).sum() : "");
    }
}
