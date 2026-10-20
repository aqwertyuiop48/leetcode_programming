import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] h && new long[n + 1] instanceof long[] pre
            && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + h[i]) >= 0)
            ? IntStream.rangeClosed(0, n - k).boxed().min(Comparator.comparingLong(i -> pre[i + k] - pre[i])).get() + 1 : "");
    }
}
