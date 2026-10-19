import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a && new int[n] instanceof int[] nd && new int[n] instanceof int[] ni
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (nd[i] = i + 1 < n && a[i] <= a[i + 1] ? nd[i + 1] : i) >= 0 && (ni[i] = i + 1 < n && a[i] >= a[i + 1] ? ni[i + 1] : i) >= 0)
            ? IntStream.range(0, m).mapToObj(q -> Integer.valueOf(it.nextInt() - 1) instanceof Integer l && Integer.valueOf(it.nextInt() - 1) instanceof Integer r && ni[nd[l]] >= r ? "Yes" : "No").collect(Collectors.joining("\n")) : "");
    }
}
