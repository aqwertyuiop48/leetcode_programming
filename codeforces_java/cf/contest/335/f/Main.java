import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Arrays.stream(t, 1, n + 1).boxed().collect(Collectors.groupingBy(x -> x, () -> new TreeMap<Long, Long>(Comparator.reverseOrder()), Collectors.counting())) instanceof TreeMap<Long, Long> g
            && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq && new long[]{0} instanceof long[] cnt
            && g.entrySet().stream().allMatch(e -> Long.valueOf(e.getKey()) instanceof Long v && Integer.valueOf(e.getValue().intValue()) instanceof Integer c
                && Integer.valueOf((int) Math.min(c, cnt[0] - 2L * pq.size())) instanceof Integer k && Integer.valueOf((int) Math.min(cnt[0], c) - k) instanceof Integer rest
                && new ArrayList<Long>() instanceof ArrayList<Long> tmp
                && IntStream.range(0, k).allMatch(i -> tmp.add(v))
                && IntStream.iterate(0, j -> j < rest, j -> j + 2).allMatch(j -> pq.poll() instanceof Long x
                    && (x < v ? tmp.add(v) && (j + 1 >= rest || tmp.add(v)) : tmp.add(x) && (j + 1 >= rest || 2 * v - x <= 0 || tmp.add(2 * v - x))))
                && (tmp.isEmpty() || pq.addAll(tmp)) && (cnt[0] += c) > 0)
            ? Arrays.stream(t, 1, n + 1).sum() - pq.stream().mapToLong(x -> x).sum() : "");
    }
}
