import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && Long.valueOf(tk.nextToken()) instanceof Long b && Long.valueOf(tk.nextToken()) instanceof Long c
            && Long.valueOf(Math.min(b, 5 * c)) instanceof Long bb
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken()) + 1000000000L).sorted().toArray() instanceof long[] us
            ? IntStream.range(0, 5).mapToLong(r -> new PriorityQueue<Long>(Collections.reverseOrder()) instanceof PriorityQueue<Long> pq && new long[]{0} instanceof long[] sum
                ? IntStream.range(0, n).mapToLong(i -> Long.valueOf(us[i] + (r - us[i] % 5 + 5) % 5) instanceof Long a2
                    && Long.valueOf((a2 - r) / 5) instanceof Long q2 && Long.valueOf((a2 - us[i]) * c - q2 * bb) instanceof Long key
                    && pq.add(key) && (sum[0] += key) != Long.MIN_VALUE && (pq.size() <= k || (sum[0] -= pq.poll()) != Long.MIN_VALUE)
                    ? (pq.size() == k ? sum[0] + k * q2 * bb : Long.MAX_VALUE) : 0L).min().getAsLong()
                : 0L).min().getAsLong()
            : "");
    }
}
