import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[m] instanceof int[] ea && new int[m] instanceof int[] eb && new long[m] instanceof long[] ew && new int[2 * m] instanceof int[] nxt && new int[n + 1] instanceof int[] head && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (ea[i] = Integer.parseInt(tk.nextToken())) > 0 && (eb[i] = Integer.parseInt(tk.nextToken())) > 0 && (ew[i] = Long.parseLong(tk.nextToken())) > 0
                && (nxt[2 * i] = head[ea[i]]) >= -1 && (head[ea[i]] = 2 * i) >= 0 && (nxt[2 * i + 1] = head[eb[i]]) >= -1 && (head[eb[i]] = 2 * i + 1) >= 0)
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer src
            && new long[n + 1] instanceof long[] dist && IntStream.rangeClosed(0, n).allMatch(i -> (dist[i] = Long.MAX_VALUE) > 0) && (dist[src] = 0) == 0
            && new PriorityQueue<long[]>(Comparator.comparingLong(x -> x[0])) instanceof PriorityQueue<long[]> pq && pq.add(new long[]{0, src})
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).allMatch(top -> top[0] != dist[(int) top[1]] || IntStream.iterate(head[(int) top[1]], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                (Integer) (e >> 1) instanceof Integer id && (Integer) ((e & 1) == 0 ? eb[id] : ea[id]) instanceof Integer v
                && (top[0] + ew[id] >= dist[v] || (dist[v] = top[0] + ew[id]) >= 0 && pq.add(new long[]{dist[v], v}))))
            && new long[n + 1] instanceof long[] bw && new int[n + 1] instanceof int[] bi && IntStream.rangeClosed(0, n).allMatch(i -> (bw[i] = Long.MAX_VALUE) > 0)
            && IntStream.range(0, m).allMatch(i -> (dist[ea[i]] + ew[i] != dist[eb[i]] || ew[i] >= bw[eb[i]] || (bw[eb[i]] = ew[i]) > 0 && (bi[eb[i]] = i + 1) > 0)
                && (dist[eb[i]] + ew[i] != dist[ea[i]] || ew[i] >= bw[ea[i]] || (bw[ea[i]] = ew[i]) > 0 && (bi[ea[i]] = i + 1) > 0))
            ? IntStream.rangeClosed(1, n).filter(v -> v != src).mapToLong(v -> bw[v]).sum() + "\n" + IntStream.rangeClosed(1, n).filter(v -> v != src).mapToObj(v -> String.valueOf(bi[v])).collect(Collectors.joining(" ")) : "");
    }
}
