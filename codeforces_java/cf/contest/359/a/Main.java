import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && Integer.valueOf(IntStream.range(0, n * m).map(i -> it.nextInt() == 1 && (i / m == 0 || i / m == n - 1 || i % m == 0 || i % m == m - 1) ? 1 : 0).sum()) instanceof Integer border
            ? border > 0 ? 2 : 4 : 0);
    }
}
