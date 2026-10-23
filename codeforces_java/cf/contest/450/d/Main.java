import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[2 * m + 2 * k] instanceof int[] nxt && new int[2 * m + 2 * k] instanceof int[] to && new long[2 * m + 2 * k] instanceof long[] w
            && new int[]{0} instanceof int[] ec
            && ((java.util.function.Predicate<long[]>) e -> (to[ec[0]] = (int) e[1]) > 0 && (w[ec[0]] = e[2]) > 0 && (nxt[ec[0]] = head[(int) e[0]]) >= -1 && (head[(int) e[0]] = ec[0]++) >= 0) instanceof java.util.function.Predicate<long[]> add
            && new long[m][] instanceof long[][] rd
            && IntStream.range(0, m).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b && (Long) Long.parseLong(tk.nextToken()) instanceof Long c
                && (rd[i] = new long[]{a, b, c}) != null && add.test(new long[]{a, b, c}) && add.test(new long[]{b, a, c}))
            && IntStream.range(0, k).mapToObj(i -> new long[]{Integer.parseInt(tk.nextToken()), Long.parseLong(tk.nextToken())}).toArray(long[][]::new) instanceof long[][] tr
            && Arrays.stream(tr).allMatch(t -> add.test(new long[]{1, t[0], t[1]}) && add.test(new long[]{t[0], 1, t[1]}))
            && new long[n + 1] instanceof long[] dist && IntStream.rangeClosed(1, n).allMatch(i -> (dist[i] = Long.MAX_VALUE) > 0) && (dist[1] = 0) == 0
            && new PriorityQueue<long[]>(Comparator.comparingLong(x -> x[0])) instanceof PriorityQueue<long[]> pq && pq.add(new long[]{0, 1})
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).allMatch(cur -> cur[0] > dist[(int) cur[1]] || IntStream.iterate(head[(int) cur[1]], e -> e >= 0, e -> nxt[e]).allMatch(e -> cur[0] + w[e] >= dist[to[e]] || ((dist[to[e]] = cur[0] + w[e]) >= 0 && pq.add(new long[]{dist[to[e]], to[e]}))))
            && new boolean[n + 1] instanceof boolean[] flag
            && Arrays.stream(rd).allMatch(r -> (dist[(int) r[0]] + r[2] != dist[(int) r[1]] || (flag[(int) r[1]] = true)) && (dist[(int) r[1]] + r[2] != dist[(int) r[0]] || (flag[(int) r[0]] = true)))
            ? "" + Arrays.stream(tr).filter(t -> t[1] > dist[(int) t[0]] || t[1] == dist[(int) t[0]] && (flag[(int) t[0]] || !(flag[(int) t[0]] = true))).count() : "");
    }
}
