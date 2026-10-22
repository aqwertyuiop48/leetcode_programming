import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] p && new long[n + 1] instanceof long[] pre
            && IntStream.rangeClosed(1, n).allMatch(i -> (pre[i] = Math.floorMod(2 * pre[i - 1] + 2 - pre[p[i - 1] - 1], 1000000007L)) >= 0)
            ? pre[n] : "");
    }
}
