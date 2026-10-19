import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt()}).toList() instanceof List<int[]> pts
            && Integer.valueOf(2 * n + 1) instanceof Integer T && Integer.valueOf(2 * (2 * n + n * n)) instanceof Integer cap
            && new int[cap] instanceof int[] to && new int[cap] instanceof int[] rc && new double[cap] instanceof double[] cost && new int[]{0} instanceof int[] ec
            && IntStream.rangeClosed(0, T).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && ((Predicate<double[]>) a -> adj.get((int) a[0]).add(ec[0]) && (to[ec[0]] = (int) a[1]) >= 0 && (rc[ec[0]] = (int) a[2]) >= 0 && (cost[ec[0]] = a[3]) == a[3] && ++ec[0] > 0
                && adj.get((int) a[1]).add(ec[0]) && (to[ec[0]] = (int) a[0]) >= 0 && (rc[ec[0]] = 0) == 0 && (cost[ec[0]] = -a[3]) == -a[3] && ++ec[0] > 0) instanceof Predicate<double[]> add
            && IntStream.rangeClosed(1, n).allMatch(i -> add.test(new double[]{0, i, 2, 0}) && add.test(new double[]{n + i, T, 1, 0}))
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).filter(j -> pts.get(i)[1] > pts.get(j)[1])
                .allMatch(j -> add.test(new double[]{i + 1, n + j + 1, 1, Math.hypot(pts.get(i)[0] - pts.get(j)[0], pts.get(i)[1] - pts.get(j)[1])})))
            && new double[T + 1] instanceof double[] dist && new int[T + 1] instanceof int[] pe && new boolean[T + 1] instanceof boolean[] inq && new double[]{0} instanceof double[] tot && new int[]{0} instanceof int[] fl
            && (IntStream.iterate(0, x -> x + 1).allMatch(x -> IntStream.rangeClosed(0, T).allMatch(i -> (dist[i] = 1e18) > 0 && !(inq[i] = false)) && (dist[0] = 0) == 0 && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(u -> !(inq[u] = false) && adj.get(u).stream().allMatch(e -> rc[e] <= 0 || dist[u] + cost[e] >= dist[to[e]] - 1e-9
                    || (dist[to[e]] = dist[u] + cost[e]) > -1e17 && (pe[to[e]] = e) >= 0 && (inq[to[e]] || (inq[to[e]] = true) && dq.add(to[e]) || true)))
                && (dist[T] >= 1e17 ? false : IntStream.iterate(T, v -> v != 0, v -> to[pe[v] ^ 1]).allMatch(v -> --rc[pe[v]] >= 0 && ++rc[pe[v] ^ 1] > 0)
                    && (tot[0] += dist[T]) > -1e17 && ++fl[0] > 0)) || true)
            ? fl[0] == n - 1 ? String.format("%.9f", tot[0]) : "-1" : "");
    }
}
