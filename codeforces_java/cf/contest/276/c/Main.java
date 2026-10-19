import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer q
            && IntStream.range(0, n).map(i -> it.nextInt()).sorted().toArray() instanceof int[] a && new int[n + 2] instanceof int[] d
            && IntStream.range(0, q).allMatch(i -> d[it.nextInt() - 1]++ != Integer.MIN_VALUE && d[it.nextInt()]-- != Integer.MIN_VALUE)
            && new int[]{0} instanceof int[] run
            && IntStream.range(0, n).map(i -> run[0] += d[i]).sorted().toArray() instanceof int[] c
            ? IntStream.range(0, n).mapToLong(i -> (long) a[i] * c[i]).sum() : "");
    }
}
