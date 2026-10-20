import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n && Long.valueOf(it.next()) instanceof Long l && Long.valueOf(it.next()) instanceof Long t
            && LongStream.generate(it::next).limit(n).toArray() instanceof long[] a
            && Long.valueOf(2 * t / l) instanceof Long q && Long.valueOf(2 * t % l) instanceof Long r
            && ((LongToIntFunction) v -> Integer.valueOf(Arrays.binarySearch(a, v)) instanceof Integer b ? (b >= 0 ? b : -b - 1) : 0) instanceof LongToIntFunction lb
            ? String.format(Locale.US, "%.10f", ((double) n * (n - 1) / 2 * 2 * q + IntStream.range(0, n).mapToLong(j -> j - lb.applyAsInt(a[j] - r)).sum() + IntStream.range(0, n).mapToLong(j -> lb.applyAsInt(a[j] - (l - r) + 1)).sum()) / 4) : "");
    }
}
