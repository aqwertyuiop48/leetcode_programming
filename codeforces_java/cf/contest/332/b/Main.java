import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer k
            && new long[n + 1] instanceof long[] p
            && IntStream.range(0, n).allMatch(i -> (p[i + 1] = p[i] + t[2 + i]) >= 0 | true)
            && IntStream.rangeClosed(0, n - k).mapToLong(i -> p[i + k] - p[i]).toArray() instanceof long[] s
            && new int[s.length] instanceof int[] pm
            && IntStream.range(1, s.length).allMatch(i -> (pm[i] = s[i] > s[pm[i - 1]] ? i : pm[i - 1]) >= 0)
            && IntStream.rangeClosed(k, n - k).boxed().max(Comparator.comparingLong((Integer b) -> s[pm[b - k]] + s[b]).thenComparing(Comparator.comparingInt((Integer b) -> b).reversed())) instanceof Optional<Integer> ob
            ? (pm[ob.get() - k] + 1) + " " + (ob.get() + 1) : "");
    }
}
