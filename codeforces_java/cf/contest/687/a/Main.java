import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m
            && new int[n + 2] instanceof int[] off && new int[n + 2] instanceof int[] pos && new int[2 * m + 1] instanceof int[] adj
            && new int[n + 2] instanceof int[] col && new int[n + 2] instanceof int[] q && new int[1] instanceof int[] tl && new int[1] instanceof int[] hd
            && IntStream.range(0, m).filter(i -> off[v[2 + 2 * i] + 1]++ + off[v[3 + 2 * i] + 1]++ < 0).count() == 0
            && IntStream.rangeClosed(1, n + 1).filter(i -> (off[i] += off[i - 1]) < 0 || (pos[i - 1] = off[i - 1]) < 0).count() == 0
            && IntStream.range(0, m).filter(i -> (adj[pos[v[2 + 2 * i]]++] = v[3 + 2 * i]) + (adj[pos[v[3 + 2 * i]]++] = v[2 + 2 * i]) < 0).count() == 0
            && IntStream.range(0, n + 2).filter(i -> (col[i] = -1) > 0).count() == 0
            && IntStream.rangeClosed(1, n).filter(s -> col[s] < 0 && off[s + 1] > off[s])
                .filter(s -> (q[tl[0]] = s) + 0 * (col[s] = 0) + 0 * (tl[0]++) + (int) (0L * (IntStream.iterate(hd[0], h -> h < tl[0], h -> h + 1)
                    .filter(h -> IntStream.range(off[q[h]], off[q[h] + 1]).filter(e -> col[adj[e]] < 0)
                        .filter(e -> (q[tl[0]++] = adj[e] + 0 * (col[adj[e]] = 1 - col[q[h]])) < 0).count() < 0).count() + (hd[0] = tl[0]))) < 0).count() == 0
            && IntStream.range(0, m).allMatch(i -> col[v[2 + 2 * i]] != col[v[3 + 2 * i]])
            ? IntStream.range(0, 2).mapToObj(c -> IntStream.rangeClosed(1, n).filter(x -> col[x] == c).boxed().collect(Collectors.toList()))
                .map(l -> l.size() + "\n" + l.stream().map(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "-1");
    }
}
