import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a
            && Integer.valueOf((int) it.nextLong()) instanceof Integer m && new long[]{0} instanceof long[] cur
            ? IntStream.range(0, m).mapToObj(i -> Long.valueOf(Math.max(cur[0], a[(int) it.nextLong() - 1])) instanceof Long b && (cur[0] = b + it.nextLong()) >= 0 ? String.valueOf(b) : "").collect(Collectors.joining("\n")) : "");
    }
}
