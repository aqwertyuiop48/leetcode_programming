import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer k && Long.valueOf(it.next()) instanceof Long p
            && new long[n] instanceof long[] rs && new long[m] instanceof long[] cs
            && IntStream.range(0, n * m).allMatch(x -> Integer.valueOf(it.next()) instanceof Integer v && (rs[x / m] += v) >= 0 && (cs[x % m] += v) >= 0)
            && (BiFunction<long[], Long, long[]>) ((s, d) -> new PriorityQueue<Long>(Comparator.reverseOrder()) instanceof PriorityQueue<Long> q && Arrays.stream(s).allMatch(q::add)
                && new long[k + 1] instanceof long[] r && IntStream.rangeClosed(1, k).allMatch(i -> q.poll() instanceof Long v && (r[i] = r[i - 1] + v) > Long.MIN_VALUE && q.add(v - d)) ? r : null) instanceof BiFunction<long[], Long, long[]> f
            && f.apply(rs, p * m) instanceof long[] R && f.apply(cs, p * n) instanceof long[] C
            ? IntStream.rangeClosed(0, k).mapToLong(i -> R[i] + C[k - i] - (long) i * (k - i) * p).max().getAsLong() : "");
    }
}
