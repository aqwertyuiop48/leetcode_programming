import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] b
            && Long.valueOf(it.nextLong()) instanceof Long m
            && new HashMap<Long, int[]>() instanceof HashMap<Long, int[]> cnt
            && IntStream.range(0, n).allMatch(i -> cnt.computeIfAbsent(a[i], k -> new int[2])[0]++ >= 0 && cnt.computeIfAbsent(b[i], k -> new int[2])[0]++ >= 0 && (a[i] != b[i] || cnt.get(a[i])[1]++ >= 0))
            ? cnt.values().stream().mapToLong(e -> new long[]{e[1]} instanceof long[] d
                ? LongStream.rangeClosed(2, e[0]).reduce(1, (acc, i) -> i % 2 == 0 && d[0] > 0 && d[0]-- > 0 ? acc * (i / 2) % m : acc * i % m) : 0)
                .reduce(1 % m, (x, y) -> x * y % m) : "");
    }
}
