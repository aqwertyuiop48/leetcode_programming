import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer k
            && Long.valueOf(st.nextToken()) instanceof Long bb
            && Long.valueOf(st.nextToken()) instanceof Long c
            && Long.valueOf(Math.min(bb, 5 * c)) instanceof Long b
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(st.nextToken()) + 1000000000L).sorted().toArray() instanceof long[] t
            ? IntStream.range(0, 5).mapToLong(r -> new PriorityQueue<Long>(Comparator.reverseOrder()) instanceof PriorityQueue<Long> pq
                && new long[]{0, Long.MAX_VALUE} instanceof long[] st2
                && IntStream.range(0, n).allMatch(j -> Long.valueOf(Math.floorMod(r - t[j], 5)) instanceof Long d
                    && Long.valueOf(t[j] + d) instanceof Long tp
                    && Long.valueOf(d * c - (tp - r) / 5 * b) instanceof Long key
                    && pq.add(key)
                    && (st2[0] += key) != Long.MIN_VALUE
                    && (pq.size() <= k || (st2[0] -= pq.poll()) != Long.MIN_VALUE)
                    && (pq.size() < k || (st2[1] = Math.min(st2[1], st2[0] + k * ((tp - r) / 5) * b)) != Long.MIN_VALUE))
                ? st2[1] : Long.MAX_VALUE).min().getAsLong()
            : "");
    }
}
