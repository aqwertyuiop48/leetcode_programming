import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer k && Long.valueOf(t[2]) instanceof Long x
            && new PriorityQueue<long[]>((p, q) -> Long.compare(p[0], q[0])) instanceof PriorityQueue<long[]> pq
            && new int[]{(int) IntStream.range(0, n).filter(i -> t[3 + i] < 0).count()} instanceof int[] neg
            && IntStream.range(0, n).allMatch(i -> pq.add(new long[]{Math.abs(t[3 + i]), i}))
            && IntStream.range(0, k).allMatch(s -> pq.poll() instanceof long[] e && Integer.valueOf((int) e[1]) instanceof Integer i
                && Long.valueOf(t[3 + i]) instanceof Long v
                && Long.valueOf(((neg[0] % 2 == 0) == (v >= 0)) ? v - x : v + x) instanceof Long nv
                && (neg[0] += (nv < 0 ? 1 : 0) - (v < 0 ? 1 : 0)) >= 0
                && (t[3 + i] = nv) == nv.longValue()
                && pq.add(new long[]{Math.abs(nv), i}))
            ? IntStream.range(0, n).mapToObj(i -> "" + t[3 + i]).collect(Collectors.joining(" ")) : "");
    }
}
