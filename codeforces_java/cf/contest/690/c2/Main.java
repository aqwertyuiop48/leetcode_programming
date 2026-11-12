import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> Integer.parseInt(st.nextToken()) - 1).toArray() instanceof int[] ed
            && IntStream.range(0, m).map(i -> ed[2 * i]).toArray() instanceof int[] eu
            && IntStream.range(0, m).map(i -> ed[2 * i + 1]).toArray() instanceof int[] ev
            && new int[n + 1] instanceof int[] start
            && new int[2 * m] instanceof int[] adj
            && IntStream.range(0, m).allMatch(i -> Math.max(++start[eu[i] + 1], ++start[ev[i] + 1]) > 0)
            && IntStream.range(0, n).allMatch(i -> (start[i + 1] += start[i]) >= 0)
            && start.clone() instanceof int[] fp
            && IntStream.range(0, m).allMatch(i -> Math.max(adj[fp[eu[i]]++] = ev[i], adj[fp[ev[i]]++] = eu[i]) >= 0)
            && ((LongUnaryOperator) src -> IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] d
                && new int[n] instanceof int[] q
                && new int[]{1} instanceof int[] t
                && (d[(int) src] = 0) == 0
                && (q[0] = (int) src) >= 0
                && IntStream.range(0, n).allMatch(h -> IntStream.range(start[q[h]], start[q[h] + 1]).map(e -> adj[e]).filter(v -> d[v] < 0)
                    .peek(v -> q[t[0]++] = v + 0 * (d[v] = d[q[h]] + 1)).count() >= 0)
                ? ((long) d[q[n - 1]] << 20) | q[n - 1] : -1) instanceof LongUnaryOperator bfs
            ? (bfs.applyAsLong(bfs.applyAsLong(0) & 1048575) >> 20) : "");
    }
}
