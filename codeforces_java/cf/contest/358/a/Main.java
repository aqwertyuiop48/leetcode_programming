import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] x
            && IntStream.range(0, n - 1).map(i -> Math.min(x[i], x[i + 1])).toArray() instanceof int[] l
            && IntStream.range(0, n - 1).map(i -> Math.max(x[i], x[i + 1])).toArray() instanceof int[] r
            && IntStream.range(0, n - 1).anyMatch(i -> IntStream.range(i + 1, n - 1).anyMatch(j -> l[i] < l[j] && l[j] < r[i] && r[i] < r[j] || l[j] < l[i] && l[i] < r[j] && r[j] < r[i]))
            ? "yes" : "no");
    }
}
