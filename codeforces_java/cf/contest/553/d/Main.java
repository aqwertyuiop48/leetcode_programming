import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n && (Integer) (int) tk[1] instanceof Integer m && (Integer) (int) tk[2] instanceof Integer k && (Integer) (n - k) instanceof Integer nn
            && new boolean[n + 1] instanceof boolean[] fort && IntStream.range(0, k).allMatch(i -> (fort[(int) tk[3 + i]] = true))
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).collect(Collectors.toList()) instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, m).mapToLong(e -> adj.get((int) tk[3 + k + 2 * e]).add((int) tk[4 + k + 2 * e]) & adj.get((int) tk[4 + k + 2 * e]).add((int) tk[3 + k + 2 * e]) ? 1 : 0).sum() >= 0
            && new long[n + 1] instanceof long[] cnt && new boolean[n + 1] instanceof boolean[] removed && new int[nn] instanceof int[] order && new long[]{-1, 1, 0} instanceof long[] bs
            && new PriorityQueue<long[]>((x, y) -> Long.compare(x[0] * y[1], y[0] * x[1])) instanceof PriorityQueue<long[]> pq
            && IntStream.rangeClosed(1, n).filter(v -> !fort[v]).allMatch(v -> (cnt[v] = adj.get(v).stream().filter(u -> !fort[u]).count()) >= 0 && pq.add(new long[]{cnt[v], adj.get(v).size(), v}))
            && IntStream.range(0, nn).allMatch(i -> Stream.generate(pq::poll).filter(e -> !removed[(int) e[2]] && cnt[(int) e[2]] == e[0]).findFirst().get() instanceof long[] e2 && (Integer) (int) e2[2] instanceof Integer v
                && (e2[0] * bs[1] > bs[0] * e2[1] ? (bs[0] = e2[0]) + (bs[1] = e2[1]) + (bs[2] = i) >= 0 : true)
                && (removed[v] = true) && (order[i] = v) >= 0
                && adj.get(v).stream().filter(u -> !fort[u] && !removed[u]).peek(u -> pq.add(new long[]{--cnt[u], adj.get(u).size(), u})).count() >= 0)
            ? (nn - bs[2]) + "\n" + Arrays.stream(order, (int) bs[2], nn).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
