import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> Long.valueOf(it.nextLong()) instanceof Long x && Long.valueOf(it.nextLong()) instanceof Long y ? new long[]{x + y, x - y} : null)
                .sorted(Comparator.comparingLong(p -> p[0])).toArray(long[][]::new) instanceof long[][] sp
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long INF
            && new long[n + 1] instanceof long[] pmin && new long[n + 1] instanceof long[] pmax && new long[n + 1] instanceof long[] smin && new long[n + 1] instanceof long[] smax
            && (pmin[0] = INF) > 0 && (pmax[0] = -INF) < 0 && (smin[n] = INF) > 0 && (smax[n] = -INF) < 0
            && IntStream.range(0, n).allMatch(i -> (pmin[i + 1] = Math.min(pmin[i], sp[i][1])) > Long.MIN_VALUE && (pmax[i + 1] = Math.max(pmax[i], sp[i][1])) > Long.MIN_VALUE
                && (smin[n - 1 - i] = Math.min(smin[n - i], sp[n - 1 - i][1])) > Long.MIN_VALUE && (smax[n - 1 - i] = Math.max(smax[n - i], sp[n - 1 - i][1])) > Long.MIN_VALUE)
            && ((LongPredicate) d -> new int[]{0} instanceof int[] j && IntStream.range(0, n).anyMatch(i -> IntStream.generate(() -> 0).anyMatch(z -> j[0] + 1 >= n || sp[j[0] + 1][0] - sp[i][0] > d || (j[0] += 1) < 0) | true
                && (Math.max(pmax[i], smax[j[0] + 1]) < Math.min(pmin[i], smin[j[0] + 1]) || Math.max(pmax[i], smax[j[0] + 1]) - Math.min(pmin[i], smin[j[0] + 1]) <= d))) instanceof LongPredicate ok
            && new long[]{0, 4000000000L} instanceof long[] bs
            && IntStream.range(0, 34).allMatch(z -> ok.test((bs[0] + bs[1]) / 2) ? (bs[1] = (bs[0] + bs[1]) / 2) >= 0 : (bs[0] = (bs[0] + bs[1]) / 2 + 1) >= 0)
            ? String.format(Locale.US, "%.15f", bs[0] / 2.0) : "");
    }
}
