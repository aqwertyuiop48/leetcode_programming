import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && new long[n + 1] instanceof long[] p1 && new long[n + 1] instanceof long[] p2
            && IntStream.range(0, n).allMatch(i -> (p1[i + 1] = p1[i] + a[i]) > 0)
            && Arrays.stream(a).sorted().toArray() instanceof int[] b
            && IntStream.range(0, n).allMatch(i -> (p2[i + 1] = p2[i] + b[i]) > 0)
            && Integer.valueOf(it.nextInt()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> it.nextInt() == 1 ? Integer.valueOf(it.nextInt()) instanceof Integer l && Integer.valueOf(it.nextInt()) instanceof Integer r ? p1[r] - p1[l - 1] : 0
                : Integer.valueOf(it.nextInt()) instanceof Integer l && Integer.valueOf(it.nextInt()) instanceof Integer r ? p2[r] - p2[l - 1] : 0).map(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
