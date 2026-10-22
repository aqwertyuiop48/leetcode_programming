import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && new int[n + 2] instanceof int[] p && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = it.next()) >= 0)
            && new int[n + 3] instanceof int[] sm && IntStream.iterate(n, i -> i >= 1, i -> i - 1).allMatch(i -> (sm[i] = Math.max(sm[i + 1], p[i])) >= 0)
            && Integer.valueOf(n + 2) instanceof Integer W && new int[W * W] instanceof int[] dist && new int[W * W] instanceof int[] q
            && new int[]{1} instanceof int[] tail && (q[0] = 1 * W + 2) > 0 && (dist[q[0]] = 1) == 1
            && IntStream.iterate(0, i -> i < tail[0], i -> i + 1).allMatch(i -> Integer.valueOf(q[i]) instanceof Integer s && Integer.valueOf(s / W) instanceof Integer a && Integer.valueOf(s % W) instanceof Integer b
                && (b > n || dist[s] > k
                    || IntStream.of((sm[b] > 0 && p[a] > 0) ? Math.min(b + 1, n + 1) * W + Math.min(b + 2, n + 1) : -1,
                                    (sm[b] > 0 && p[a] < 100) ? b * W + b + 1 : -1,
                                    (sm[b] < 100 && p[a] > 0) ? a * W + b + 1 : -1)
                        .filter(t -> t >= 0 && dist[t] == 0).allMatch(t -> (dist[t] = dist[s] + 1) > 0 && (q[tail[0]++] = t) > 0)))
            ? tail[0] : "");
    }
}
