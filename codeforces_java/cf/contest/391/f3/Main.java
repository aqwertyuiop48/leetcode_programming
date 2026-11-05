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
            && new long[n] instanceof long[] a && new long[3] instanceof long[] q
            && IntStream.range(ps[0], buf.length + 1).allMatch(i -> (i < buf.length ? buf[i] : (char) 10) >= '0'
                ? (q[0] = q[0] * 10 + buf[i] - '0') >= 0 && (q[2] = 1) > 0
                : q[2] == 0 || ((a[(int) q[1]++] = q[0]) >= 0 && (q[0] = 0) == 0 && (q[2] = 0) == 0))
            && new long[n / 2 + 2] instanceof long[] sv && new long[n / 2 + 2] instanceof long[] sp && new long[n / 2 + 2] instanceof long[] pr
            && new int[]{1, 0, 0, 0, 0} instanceof int[] z && new long[3] instanceof long[] w
            && IntStream.range(0, 3 * n + 3).allMatch(t -> z[4] == 1
                ? z[1] > 0 && w[1] < sv[z[1] - 1]
                    ? (pr[z[2]++] = sp[z[1] - 1] - sv[z[1] - 1]) >= 0 && --z[1] >= 0
                    : z[1] > 0 && w[2] >= sp[z[1] - 1]
                        ? (pr[z[2]++] = sp[z[1] - 1] - w[1]) >= 0 && (w[1] = sv[z[1] - 1]) >= 0 && --z[1] >= 0
                        : (sv[z[1]] = w[1]) >= 0 && (sp[z[1]++] = w[2]) >= 0 && (z[4] = 0) == 0
                : z[0] < n
                    ? (a[z[0]] > a[z[0] - 1] ? z[3] == 1 || ((w[0] = a[z[0] - 1]) >= 0 && (z[3] = 1) > 0)
                        : a[z[0]] < a[z[0] - 1] ? z[3] == 0 || ((w[1] = w[0]) >= 0 && (w[2] = a[z[0] - 1]) >= 0 && (z[3] = 0) == 0 && (z[4] = 1) > 0)
                        : true) && ++z[0] > 0
                    : z[0] == n
                        ? (z[3] == 0 || ((w[1] = w[0]) >= 0 && (w[2] = a[n - 1]) >= 0 && (z[3] = 0) == 0 && (z[4] = 1) > 0)) && ++z[0] > 0
                        : z[1] > 0 && (pr[z[2]++] = sp[z[1] - 1] - sv[z[1] - 1]) >= 0 && --z[1] >= 0) | true
            ? Arrays.stream(pr, 0, z[2]).sorted().skip(Math.max(0L, z[2] - k)).sum() : "");
    }
}

