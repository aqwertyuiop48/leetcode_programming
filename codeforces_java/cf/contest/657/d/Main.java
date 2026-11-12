import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(st.nextToken())).toArray() instanceof long[] p
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(st.nextToken())).toArray() instanceof long[] t
            && Long.valueOf(LongStream.of(t).sum()) instanceof Long T
            && IntStream.range(0, n).boxed().sorted((x, y) -> Long.compare(t[x] * p[y], t[y] * p[x])).mapToInt(Integer::intValue).toArray() instanceof int[] ord
            && new long[n + 1] instanceof long[] cum
            && IntStream.range(0, n).allMatch(k -> (cum[k + 1] = cum[k] + t[ord[k]]) > 0)
            && new int[n] instanceof int[] gs
            && new int[n] instanceof int[] ge
            && IntStream.range(0, n).allMatch(k -> (gs[k] = k > 0 && t[ord[k]] * p[ord[k - 1]] == t[ord[k - 1]] * p[ord[k]] ? gs[k - 1] : k) >= 0)
            && IntStream.range(0, n).allMatch(z -> (ge[n - 1 - z] = z > 0 && t[ord[n - 1 - z]] * p[ord[n - z]] == t[ord[n - z]] * p[ord[n - 1 - z]] ? ge[n - z] : n - 1 - z) >= 0)
            && new long[n] instanceof long[] xmin
            && new long[n] instanceof long[] xmax
            && IntStream.range(0, n).allMatch(k -> (xmin[ord[k]] = cum[gs[k]] + t[ord[k]]) > 0 && (xmax[ord[k]] = cum[ge[k] + 1]) > 0)
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> p[i])).mapToInt(Integer::intValue).toArray() instanceof int[] po
            && IntStream.range(0, n).mapToDouble(k -> p[po[k]]).toArray() instanceof double[] ps
            && IntStream.range(0, n).mapToDouble(k -> (double) p[po[k]] * xmin[po[k]] / T).toArray() instanceof double[] aa
            && IntStream.range(0, n).mapToDouble(k -> (double) p[po[k]] * xmax[po[k]] / T).toArray() instanceof double[] bb
            && ((DoublePredicate) c -> new double[]{-1e30, -1e30, -1} instanceof double[] s
                && IntStream.range(0, n).allMatch(k -> (ps[k] == s[2] || ((s[0] = Math.max(s[0], s[1])) < 1e300 && (s[1] = -1e30) < 0 && (s[2] = ps[k]) > 0))
                    && !(s[0] > ps[k] - c * bb[k])
                    && (s[1] = Math.max(s[1], ps[k] - c * aa[k])) < 1e300)) instanceof DoublePredicate noViol
            && new double[]{0, 1} instanceof double[] lh
            && IntStream.range(0, 60).allMatch(it -> (noViol.test((lh[0] + lh[1]) / 2) ? (lh[0] = (lh[0] + lh[1]) / 2) : (lh[1] = (lh[0] + lh[1]) / 2)) >= 0)
            ? String.format(Locale.US, "%.11f", lh[0])
            : "");
    }
}
