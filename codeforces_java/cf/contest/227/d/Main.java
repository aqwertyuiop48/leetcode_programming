import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next()).boxed().sorted(Comparator.reverseOrder()).mapToLong(Integer::longValue).toArray() instanceof long[] a
            && new long[n + 1] instanceof long[] pre && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + a[i]) >= 0)
            && new HashMap<Integer, Long>() instanceof HashMap<Integer, Long> memo
            && Integer.valueOf(it.next()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(it.next()) instanceof Integer k
                ? String.valueOf(memo.computeIfAbsent(k, kk -> new long[]{1, k, 0, 1} instanceof long[] st
                    && IntStream.iterate(0, x -> st[0] < n, x -> x + 1).allMatch(x -> (st[2] += (pre[(int) Math.min(n, st[0] + st[1])] - pre[(int) st[0]]) * st[3]) >= 0 && (st[0] += st[1]) > 0 && (st[1] *= k) > 0 && ++st[3] > 0)
                    ? Long.valueOf(st[2]) : Long.valueOf(0))) : "").collect(Collectors.joining(" ")) : "");
    }
}

