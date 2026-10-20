import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer p && Integer.valueOf(t[2]) instanceof Integer k
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> t[4 + 2 * i]).thenComparing(Comparator.comparingInt((Integer i) -> t[3 + 2 * i]).reversed())).mapToInt(i -> i).toArray() instanceof int[] o
            && new long[n + 1] instanceof long[] pb
            && IntStream.range(0, n).allMatch(i -> (pb[i + 1] = pb[i] + t[4 + 2 * o[i]]) >= 0)
            && new PriorityQueue<Integer>() instanceof PriorityQueue<Integer> h && new long[]{0, -1, -1, -1} instanceof long[] st
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                (i < p - k || h.size() < k - 1 || ((Long.valueOf(t[3 + 2 * o[i]] + st[0]) instanceof Long A && Long.valueOf(pb[i] - pb[i - p + k]) instanceof Long B
                    && (A > st[1] || A.longValue() == st[1] && B > st[2]) && ((st[1] = A) > 0 | true) && ((st[2] = B) > 0 | true) && (st[3] = i) > 0) | true))
                && h.add(t[3 + 2 * o[i]]) && ((st[0] += t[3 + 2 * o[i]]) > 0 | true) && (h.size() <= k - 1 || (st[0] -= h.poll()) > 0 | true))
            ? Stream.concat(IntStream.range((int) st[3] - p + k, (int) st[3] + 1).boxed(), IntStream.range((int) st[3] + 1, n).boxed().sorted(Comparator.comparingInt((Integer i) -> t[3 + 2 * o[i]]).reversed()).limit(k - 1)).map(i -> String.valueOf(o[i] + 1)).collect(Collectors.joining(" ")) : "");
    }
}
