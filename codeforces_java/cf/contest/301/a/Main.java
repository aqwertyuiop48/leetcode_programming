import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && LongStream.generate(it::next).limit(2 * n - 1).toArray() instanceof long[] a
            && Long.valueOf(Arrays.stream(a).map(Math::abs).sum()) instanceof Long s
            && Long.valueOf(Arrays.stream(a).map(Math::abs).min().getAsLong()) instanceof Long m
            ? s - (n % 2 == 0 && Arrays.stream(a).filter(x -> x < 0).count() % 2 == 1 ? 2 * m : 0) : "");
    }
}
