import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && new long[n] instanceof long[] t && new long[n] instanceof long[] s && new long[n] instanceof long[] p
            && IntStream.range(0, n).allMatch(i -> (t[i] = sc.nextLong()) >= 0 && (s[i] = sc.nextLong()) > 0 && (p[i] = sc.nextLong()) != 0)
            && Long.valueOf(sc.nextLong()) instanceof Long T
            && Integer.valueOf(IntStream.range(0, n).filter(i -> p[i] < 0).findFirst().getAsInt()) instanceof Integer u
            && IntStream.range(0, n).filter(i -> i != u).mapToLong(i -> p[i]).sorted().toArray() instanceof long[] qs
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> t[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && ((Function<Integer, long[]>) slot -> new long[n] instanceof long[] fin && new PriorityQueue<long[]>((x, y) -> Long.compare(y[0], x[0])) instanceof PriorityQueue<long[]> pq
                && new long[]{0, 0} instanceof long[] cp
                && IntStream.iterate(0, z -> cp[1] < n || !pq.isEmpty(), z -> z + 1).allMatch(z -> (pq.isEmpty() && t[ord[(int) cp[1]]] > cp[0] ? (cp[0] = t[ord[(int) cp[1]]]) : 0) >= 0
                    && IntStream.iterate(0, y -> cp[1] < n && t[ord[(int) cp[1]]] <= cp[0], y -> y + 1)
                        .allMatch(y -> Integer.valueOf(ord[(int) cp[1]]) instanceof Integer i
                            && pq.add(new long[]{i == u ? 2L * slot : 2L * Arrays.binarySearch(qs, p[i]) + 1, i, s[i]}) && ++cp[1] > 0)
                    && pq.peek() instanceof long[] top
                    && Long.valueOf(Math.min(top[2], cp[1] < n ? t[ord[(int) cp[1]]] - cp[0] : Long.MAX_VALUE)) instanceof Long run
                    && (cp[0] += run) >= 0 && (top[2] -= run) >= 0
                    && (top[2] > 0 || (fin[(int) top[1]] = cp[0]) >= 0 && pq.poll() != null))
                ? fin : null) instanceof Function<Integer, long[]> sim
            && new int[]{0, n - 1} instanceof int[] st
            && IntStream.iterate(0, z -> st[0] < st[1], z -> z + 1).allMatch(z -> Integer.valueOf((st[0] + st[1]) / 2) instanceof Integer mid
                && (sim.apply(mid)[u] <= T ? (st[1] = mid) >= 0 : (st[0] = mid + 1) >= 0))
            && Integer.valueOf(IntStream.range(st[0], n).filter(x -> (x == n - 1 || (x == 0 ? 1 : qs[x - 1] + 1) < qs[x]) && sim.apply(x)[u] == T).findFirst().orElse(st[0])) instanceof Integer sl
            ? (sl == 0 ? 1 : qs[sl - 1] + 1) + "\n" + Arrays.stream(sim.apply(sl)).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
