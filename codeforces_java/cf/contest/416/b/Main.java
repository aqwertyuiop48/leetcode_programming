import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && new long[m] instanceof long[] f
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(IntStream.range(0, m).mapToLong(j -> f[j] = Math.max(f[j], j == 0 ? 0 : f[j - 1]) + it.nextInt()).max().getAsLong())).collect(Collectors.joining(" ")) : "");
    }
}
