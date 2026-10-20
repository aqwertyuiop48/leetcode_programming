import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Arrays.stream(t).skip(1).boxed().collect(Collectors.groupingBy(x -> x, () -> new TreeMap<Long, Long>(Comparator.reverseOrder()), Collectors.counting())) instanceof TreeMap<Long, Long> grp
            && new PriorityQueue<Long>() instanceof PriorityQueue<Long> q && new long[1] instanceof long[] cnt
            && grp.entrySet().stream().allMatch(e -> Long.valueOf(e.getKey()) instanceof Long v && Long.valueOf(e.getValue()) instanceof Long c
                && Long.valueOf(Math.min(c, cnt[0] - 2L * q.size())) instanceof Long can && Long.valueOf(Math.min(cnt[0], c) - can) instanceof Long rest
                && new ArrayList<Long>(Collections.nCopies(can.intValue(), v)) instanceof ArrayList<Long> tmp
                && LongStream.iterate(0, i -> i < rest, i -> i + 2).allMatch(i -> q.poll() instanceof Long x
                    && (x < v ? tmp.add(v) && (i + 1 >= rest || tmp.add(v)) : tmp.add(x) && (i + 1 >= rest || 2 * v - x <= 0 || tmp.add(2 * v - x))))
                && (q.addAll(tmp) || true) && (cnt[0] += c) > 0)
            ? Arrays.stream(t).skip(1).sum() - q.stream().mapToLong(x -> x).sum() : "");
    }
}
