import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && IntStream.range(0, m).map(i -> it.nextInt()).sorted().toArray() instanceof int[] d
            ? Arrays.stream(d).anyMatch(x -> x == 1 || x == n) || IntStream.range(0, m - 2).anyMatch(i -> d[i + 2] - d[i] == 2) ? "NO" : "YES" : "");
    }
}
