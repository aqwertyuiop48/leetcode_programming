import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> i < k && a[i] < 0 ? -a[i] : a[i]).toArray() instanceof int[] b
            && Integer.valueOf(k - (int) IntStream.range(0, n).filter(i -> i < k && a[i] < 0).count()) instanceof Integer rem
            ? Arrays.stream(b).sum() - rem % 2 * 2 * Arrays.stream(b).min().getAsInt() : "");
    }
}
