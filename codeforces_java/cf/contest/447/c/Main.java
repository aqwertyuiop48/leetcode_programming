import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new int[n] instanceof int[] L && new int[n] instanceof int[] R
            && IntStream.range(0, n).allMatch(i -> (L[i] = i > 0 && a[i] > a[i - 1] ? L[i - 1] + 1 : 1) > 0)
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (R[i] = i < n - 1 && a[i] < a[i + 1] ? R[i + 1] + 1 : 1) > 0)
            ? IntStream.range(0, n).map(i -> Math.max(Math.max(i > 0 ? L[i - 1] + 1 : 1, i < n - 1 ? R[i + 1] + 1 : 1),
                i > 0 && i < n - 1 && a[i + 1] - a[i - 1] >= 2 ? L[i - 1] + R[i + 1] + 1 : 1)).max().getAsInt() : "");
    }
}
