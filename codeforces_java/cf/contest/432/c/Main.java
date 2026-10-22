import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n
            && new int[n + 2] instanceof int[] pos && new int[n + 2] instanceof int[] a && new boolean[n + 3] instanceof boolean[] comp && new int[n + 3] instanceof int[] bp
            && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = it.nextInt()) > 0 && (pos[a[i]] = i) > 0)
            && IntStream.rangeClosed(2, n + 1).allMatch(p -> (comp[p] || IntStream.iterate(2 * p, q -> q <= n + 1, q -> q + p).allMatch(q -> (comp[q] = true))) && (bp[p] = comp[p] ? bp[p - 1] : p) > 0)
            && new ArrayList<String>() instanceof ArrayList<String> out
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.iterate(pos[i], c -> c > i, c -> c - bp[c - i + 1] + 1).allMatch(c -> Integer.valueOf(c - bp[c - i + 1] + 1) instanceof Integer j
                && Integer.valueOf(a[j]) instanceof Integer v && (a[c] = v) > 0 && (pos[v] = c) > 0 && (a[j] = i) > 0 && (pos[i] = j) > 0 && out.add(j + " " + c)))
            ? out.size() + (out.isEmpty() ? "" : "\n") + String.join("\n", out) : "");
    }
}
