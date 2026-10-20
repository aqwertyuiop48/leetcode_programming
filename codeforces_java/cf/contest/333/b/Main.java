import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new boolean[n + 1] instanceof boolean[] r && new boolean[n + 1] instanceof boolean[] c
            && IntStream.range(0, m).allMatch(i -> (r[t[2 + 2 * i]] = true) && (c[t[3 + 2 * i]] = true))
            ? IntStream.rangeClosed(2, n - 1).map(i -> (r[i] ? 0 : 1) + (c[i] ? 0 : 1) - (n % 2 == 1 && i == n / 2 + 1 && !r[i] && !c[i] ? 1 : 0)).sum() : "");
    }
}
