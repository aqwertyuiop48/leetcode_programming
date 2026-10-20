import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new HashSet<Integer>() instanceof HashSet<Integer> seen && new int[n + 1] instanceof int[] suf
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (suf[i] = suf[i + 1] + (seen.add(a[i]) ? 1 : 0)) >= 0)
            ? IntStream.range(0, m).mapToObj(q -> String.valueOf(suf[it.next() - 1])).collect(Collectors.joining("\n")) : "");
    }
}
