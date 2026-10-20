import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).sorted().toArray() instanceof int[] a
            && new long[n + 1] instanceof long[] pre && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + a[i]) >= 0)
            ? String.valueOf(IntStream.iterate(1, s -> s <= n, s -> s * 4).mapToLong(s -> pre[n] - pre[n - s]).sum()) : "");
    }
}
