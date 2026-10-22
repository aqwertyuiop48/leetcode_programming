import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && LongStream.range(0, n).map(i -> (it.next() + 100000000L << 20) | i).sorted().toArray() instanceof long[] key
            && Integer.valueOf(it.next().intValue()) instanceof Integer k
            && Arrays.stream(key).map(z -> (z >> 20) - 100000000L).toArray() instanceof long[] xs
            && new long[n + 1] instanceof long[] p1 && new long[n + 1] instanceof long[] p2
            && IntStream.range(0, n).allMatch(j -> (p1[j + 1] = p1[j] + xs[j]) != Long.MIN_VALUE && (p2[j + 1] = p2[j] + j * xs[j]) != Long.MIN_VALUE)
            && IntStream.rangeClosed(0, n - k).boxed().min(Comparator.comparingLong(i -> 2 * (p2[i + k] - p2[i]) - (2L * i + k - 1) * (p1[i + k] - p1[i]))).get() instanceof Integer best
            ? IntStream.range(best, best + k).mapToObj(j -> String.valueOf((key[j] & 1048575) + 1)).collect(Collectors.joining(" ")) : "");
    }
}
