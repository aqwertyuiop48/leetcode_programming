import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(t ->
            System.out.println(
                Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer n
                && new int[n + 1] instanceof int[] fr
                && new int[n + 1] instanceof int[] sx
                && IntStream.rangeClosed(1, n).allMatch(i -> (fr[i] = Integer.parseInt(t.nextToken())) > 0 && (sx[i] = Integer.parseInt(t.nextToken())) > 0)
                && new int[n + 1] instanceof int[] deg
                && IntStream.rangeClosed(1, n).allMatch(i -> ++deg[fr[i]] > 0)
                && ((ToLongFunction<Integer>) v -> (1L << 20) + (sx[v] != sx[fr[v]] ? 1 : 0)) instanceof ToLongFunction<Integer> W
                && new long[n + 1] instanceof long[] sumF
                && new long[n + 1] instanceof long[] gain
                && new long[n + 1] instanceof long[] F
                && new long[n + 1] instanceof long[] G
                && new int[n + 1] instanceof int[] ch
                && new boolean[n + 1] instanceof boolean[] vis
                && new boolean[n + 1] instanceof boolean[] used
                && new ArrayList<int[]>() instanceof ArrayList<int[]> pairs
                && IntStream.rangeClosed(1, n).filter(v -> deg[v] == 0).boxed().collect(Collectors.toCollection(ArrayDeque::new)) instanceof ArrayDeque<Integer> q
                && Stream.generate(q::poll).takeWhile(Objects::nonNull).filter(v -> (--deg[fr[v]] == 0 && q.add(fr[v])) || true).toList() instanceof List<Integer> order
                && order.stream().allMatch(v -> (G[v] = sumF[v]) >= 0 && (F[v] = G[v] + gain[v]) >= 0 && (sumF[fr[v]] += F[v]) >= 0
                    && (G[v] + W.applyAsLong(v) - F[v] <= gain[fr[v]] || (gain[fr[v]] = G[v] + W.applyAsLong(v) - F[v]) > 0 && (ch[fr[v]] = v) > 0))
                && IntStream.rangeClosed(1, n).filter(v -> deg[v] > 0).boxed().toList() instanceof List<Integer> cyc
                && cyc.stream().allMatch(v -> (G[v] = sumF[v]) >= 0 && (F[v] = G[v] + gain[v]) >= 0)
                && cyc.stream().filter(v -> !vis[v]).allMatch(v ->
                    Stream.iterate(new int[]{v, 0}, x -> x[1] == 0 || x[0] != v, x -> new int[]{fr[x[0]], 1}).map(x -> x[0]).toList() instanceof List<Integer> c
                    && c.stream().allMatch(x -> vis[x] = true)
                    && Integer.valueOf(c.size()) instanceof Integer L
                    && IntStream.range(0, L).mapToLong(i -> G[c.get(i)] + G[c.get((i + 1) % L)] + W.applyAsLong(c.get(i)) - F[c.get(i)] - F[c.get((i + 1) % L)]).toArray() instanceof long[] d
                    && new long[L + 2] instanceof long[] dpA
                    && new long[L + 2] instanceof long[] dpB
                    && IntStream.rangeClosed(0, L - 2).allMatch(i -> (dpA[i + 2] = Math.max(dpA[i + 1], d[i] + dpA[i])) > -1)
                    && IntStream.rangeClosed(1, L - 3).allMatch(i -> (dpB[i + 2] = Math.max(dpB[i + 1], d[i] + dpB[i])) > -1)
                    && Boolean.valueOf(d[L - 1] + dpB[L - 1] > dpA[L]) instanceof Boolean useB
                    && (useB
                        ? IntStream.concat(IntStream.of(L - 1), IntStream.iterate(L - 3, i -> i >= 1, i -> dpB[i + 2] == dpB[i + 1] ? i - 1 : i - 2).filter(i -> dpB[i + 2] != dpB[i + 1]))
                        : IntStream.iterate(L - 2, i -> i >= 0, i -> dpA[i + 2] == dpA[i + 1] ? i - 1 : i - 2).filter(i -> dpA[i + 2] != dpA[i + 1])).toArray() instanceof int[] es
                    && IntStream.of(es).allMatch(e -> pairs.add(new int[]{c.get(e), c.get((e + 1) % L)}) && (used[c.get(e)] = true) && (used[c.get((e + 1) % L)] = true)))
                && Stream.concat(cyc.stream(), IntStream.range(0, order.size()).map(i -> order.get(order.size() - 1 - i)).boxed())
                    .filter(v -> !used[v] && ch[v] != 0 && (used[ch[v]] = true) && pairs.add(new int[]{v, ch[v]})).toList() instanceof List<Integer> done
                ? pairs.size() + " " + pairs.stream().filter(p -> sx[p[0]] != sx[p[1]]).count() + "\n"
                    + pairs.stream().map(p -> p[0] + " " + p[1]).collect(Collectors.joining("\n"))
                : ""));
    }
}





