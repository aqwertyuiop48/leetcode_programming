import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && Integer.valueOf((int) a[0]) instanceof Integer n && Integer.valueOf((int) a[1]) instanceof Integer m
            && Long.valueOf(a[2]) instanceof Long L && Integer.valueOf((int) a[3]) instanceof Integer s && Integer.valueOf((int) a[4]) instanceof Integer t
            && IntStream.range(0, m).map(i -> (int) a[5 + 3 * i]).toArray() instanceof int[] eu
            && IntStream.range(0, m).map(i -> (int) a[6 + 3 * i]).toArray() instanceof int[] ev
            && IntStream.range(0, m).mapToLong(i -> a[7 + 3 * i]).toArray() instanceof long[] w
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] head
            && new int[2 * m] instanceof int[] nxt && new int[2 * m] instanceof int[] to
            && IntStream.range(0, m).allMatch(i -> (to[2 * i] = ev[i]) >= 0 && (nxt[2 * i] = head[eu[i]]) > -5 && (head[eu[i]] = 2 * i) >= 0
                && (to[2 * i + 1] = eu[i]) >= 0 && (nxt[2 * i + 1] = head[ev[i]]) > -5 && (head[ev[i]] = 2 * i + 1) >= 0)
            && new int[m] instanceof int[] zi
            && IntStream.range(1, m).allMatch(i -> (zi[i] = zi[i - 1] + (w[i - 1] == 0 ? 1 : 0)) >= 0)
            && Integer.valueOf(m == 0 ? 0 : zi[m - 1] + (w[m - 1] == 0 ? 1 : 0)) instanceof Integer Z
            && IntStream.range(0, m).filter(i -> w[i] == 0).toArray() instanceof int[] zpos
            && ((Function<Integer, long[]>) k -> IntStream.range(0, m).mapToLong(i -> w[i] > 0 ? w[i] : zi[i] < k ? 1L : 2000000000L).toArray()) instanceof Function<Integer, long[]> mk
            && ((ToLongFunction<long[]>) W -> LongStream.generate(() -> 1L << 60).limit(n).toArray() instanceof long[] d
                && new PriorityQueue<long[]>((x, y) -> Long.compare(x[0], y[0])) instanceof PriorityQueue<long[]> pq
                && (d[s] = 0) == 0 && pq.add(new long[]{0, s})
                && Stream.iterate(pq.poll(), x -> x != null, x -> pq.poll()).filter(x -> x[0] == d[(int) x[1]])
                    .allMatch(x -> IntStream.iterate(head[(int) x[1]], e -> e >= 0, e -> nxt[e]).filter(e -> x[0] + W[e >> 1] < d[to[e]])
                        .allMatch(e -> pq.add(new long[]{d[to[e]] = x[0] + W[e >> 1], to[e]})))
                ? d[t] : 0L) instanceof ToLongFunction<long[]> dj
            && ((Function<long[], String>) W -> "YES\n" + IntStream.range(0, m).mapToObj(i -> eu[i] + " " + ev[i] + " " + W[i]).collect(Collectors.joining("\n"))) instanceof Function<long[], String> fmt
            && Long.valueOf(dj.applyAsLong(mk.apply(0))) instanceof Long f0
            && new int[]{1, Z} instanceof int[] b
            ? (f0 - L < 0 ? "NO" : f0 - L == 0 ? fmt.apply(mk.apply(0))
                : Z == 0 || dj.applyAsLong(mk.apply(Z)) > L ? "NO"
                : (IntStream.range(0, 20).allMatch(z -> b[0] >= b[1] || (dj.applyAsLong(mk.apply((b[0] + b[1]) / 2)) <= L ? (b[1] = (b[0] + b[1]) / 2) >= 0 : (b[0] = (b[0] + b[1]) / 2 + 1) >= 0))
                    && mk.apply(b[0]) instanceof long[] W2
                    && Long.valueOf(dj.applyAsLong(W2)) instanceof Long fk
                    && (W2[zpos[b[0] - 1]] = L - fk + 1) > 0
                    ? fmt.apply(W2) : "NO"))
            : "NO");
    }
}
