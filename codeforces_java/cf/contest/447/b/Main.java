import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it
            && it.next() instanceof String s && Long.valueOf(it.next()) instanceof Long k
            && LongStream.generate(() -> Long.parseLong(it.next())).limit(26).toArray() instanceof long[] w
            ? IntStream.range(0, s.length()).mapToLong(i -> (i + 1L) * w[s.charAt(i) - 'a']).sum()
                + Arrays.stream(w).max().getAsLong() * (k * s.length() + k * (k + 1) / 2) : "");
    }
}
