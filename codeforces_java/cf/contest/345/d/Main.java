import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).mapToObj(i -> it.next()).toArray(String[]::new) instanceof String[] g && new boolean[n] instanceof boolean[] reach && new int[n] instanceof int[] q && new int[]{1} instanceof int[] qt
            && (reach[0] = true) && IntStream.iterate(0, i -> i < qt[0], i -> i + 1).allMatch(i -> IntStream.range(0, n - 1).filter(j -> !reach[j] && g[q[i]].charAt(j) == '1').allMatch(j -> (reach[j] = true) && (q[qt[0]++] = j) >= 0))
            ? IntStream.range(0, n - 1).filter(j -> reach[j] && g[n - 1].charAt(j) == '1').count() : "");
    }
}
