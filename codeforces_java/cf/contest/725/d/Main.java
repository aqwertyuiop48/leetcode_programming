import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && Integer.valueOf((int) a[0]) instanceof Integer n
            && IntStream.range(1, n).boxed().sorted((x, y) -> Long.compare(a[2 * y + 1], a[2 * x + 1])).mapToInt(Integer::intValue).toArray() instanceof int[] ord
            && new long[]{a[1]} instanceof long[] cur && new int[]{0, n} instanceof int[] ps && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq
            && (IntStream.generate(() -> 0).allMatch(z ->
                (IntStream.range(ps[0], n - 1).takeWhile(q -> a[2 * ord[q] + 1] > cur[0]).filter(q -> pq.add(a[2 * ord[q] + 2] - a[2 * ord[q] + 1] + 1) && ++ps[0] > 0).count() >= 0)
                && (ps[1] = Math.min(ps[1], pq.size() + 1)) > 0
                && pq.peek() != null && pq.peek() <= cur[0] && (cur[0] -= pq.poll()) > Long.MIN_VALUE) || true)
            ? String.valueOf(ps[1]) : "");
    }
}
