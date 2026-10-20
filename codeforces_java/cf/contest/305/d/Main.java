import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long MOD
            && IntStream.range(0, m).mapToObj(i -> new int[] {it.next(), it.next()}).toList() instanceof List<int[]> es
            && new long[n + 2] instanceof long[] pw && (pw[0] = 1) > 0 && IntStream.range(1, n + 2).allMatch(i -> (pw[i] = pw[i - 1] * 2 % MOD) > 0)
            && es.stream().allMatch(e -> e[1] - e[0] == 1 || e[1] - e[0] == k + 1)
            && es.stream().filter(e -> e[1] - e[0] == k + 1).map(e -> e[0]).distinct().sorted().mapToInt(x -> x).toArray() instanceof int[] f
            && Integer.valueOf(n - k - 1) instanceof Integer N
            ? N <= 0 ? 1 : f.length == 0
                ? (1 + IntStream.rangeClosed(1, N).mapToLong(s -> pw[Math.min(N, s + k) - s]).sum()) % MOD
                : f[f.length - 1] - f[0] > k ? 0
                : IntStream.rangeClosed(Math.max(1, f[f.length - 1] - k), f[0]).mapToLong(s -> pw[Math.min(N, s + k) - s - f.length + (s == f[0] ? 1 : 0)]).sum() % MOD
            : 0);
    }
}
