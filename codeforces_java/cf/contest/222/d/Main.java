import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer x
            && IntStream.range(0, n).map(i -> it.next()).sorted().toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> it.next()).sorted().toArray() instanceof int[] b
            && new int[1] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> cnt[0] >= n || a[i] + b[n - 1 - cnt[0]] < x || ++cnt[0] > 0 || true)
            ? "1 " + cnt[0] : "");
    }
}

