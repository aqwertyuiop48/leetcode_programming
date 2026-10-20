import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new int[n + 1] instanceof int[] pos
            && IntStream.rangeClosed(1, n).allMatch(i -> (pos[it.next()] = i) > 0)
            && IntStream.range(0, 2 * m).map(i -> it.next()).toArray() instanceof int[] q
            && Long.valueOf((1L << 20) - 1) instanceof Long M
            && IntStream.rangeClosed(1, n).boxed().flatMapToLong(x -> IntStream.iterate(x, y -> y <= n, y -> y + x).mapToLong(y -> ((long) Math.max(pos[x], pos[y]) << 20) | Math.min(pos[x], pos[y]))).sorted().toArray() instanceof long[] P
            && IntStream.rangeClosed(0, n + 1).map(h -> ~Arrays.binarySearch(P, (long) h << 20)).toArray() instanceof int[] s
            && IntStream.range(0, m).mapToLong(i -> ((long) q[2 * i + 1] << 20) | i).sorted().toArray() instanceof long[] Q
            && IntStream.rangeClosed(0, n + 1).map(h -> ~Arrays.binarySearch(Q, ((long) h << 20) - 1)).toArray() instanceof int[] qs
            && new int[n + 2] instanceof int[] t
            && new int[m] instanceof int[] ans
            && IntStream.rangeClosed(1, n).allMatch(r ->
                IntStream.range(s[r], s[r + 1]).allMatch(i -> IntStream.iterate((int) (P[i] & M), x -> x <= n, x -> x + (x & -x)).allMatch(x -> ++t[x] > 0))
                && IntStream.range(qs[r], qs[r + 1]).allMatch(k -> Integer.valueOf((int) (Q[k] & M)) instanceof Integer id
                    && (ans[id] = s[r + 1] - IntStream.iterate(q[2 * id] - 1, x -> x > 0, x -> x - (x & -x)).map(x -> t[x]).sum()) >= 0))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
