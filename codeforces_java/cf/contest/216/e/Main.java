import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Long.valueOf(it.next() - 1) instanceof Long m && Long.valueOf(it.next()) instanceof Long k && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && LongStream.range(0, n).map(i -> it.next()).toArray() instanceof long[] d
            && new long[]{0} instanceof long[] run
            && Long.valueOf(Arrays.stream(d).map(x -> x == 0 ? ++run[0] : (run[0] = 0)).sum()) instanceof Long zeroSegs
            && new HashMap<Long, Long>(Map.of(0L, 1L)) instanceof HashMap<Long, Long> cnt
            && new long[]{0} instanceof long[] pre
            ? k == 0 ? zeroSegs
                : Arrays.stream(d).map(x -> Long.valueOf(pre[0] = (pre[0] + x) % m) instanceof Long p && Long.valueOf(cnt.getOrDefault(((p - k % m) % m + m) % m, 0L)) instanceof Long c && cnt.merge(p, 1L, Long::sum) > 0 ? c : 0).sum() - (k.equals(m) ? zeroSegs : 0)
            : "");
    }
}
