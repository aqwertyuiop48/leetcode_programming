import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer z
            && new HashMap<List<Integer>, Integer>() instanceof HashMap<List<Integer>, Integer> ids
            && ((LongUnaryOperator) k -> k * 0x9E3779B97F4A7C15L + 0x632BE59BD9B4E019L).andThen(q -> (q ^ (q >>> 30)) * 0xBF58476D1CE4E5B9L)
                .andThen(q -> (q ^ (q >>> 27)) * 0x94D049BB133111EBL).andThen(q -> q ^ (q >>> 31)) instanceof LongUnaryOperator mix
            ? IntStream.range(0, z).mapToObj(tc -> Integer.valueOf(st.nextToken()) instanceof Integer n
                && Integer.valueOf(st.nextToken()) instanceof Integer kk
                && IntStream.range(0, kk).mapToObj(i -> Integer.valueOf(st.nextToken()) instanceof Integer m
                    ? IntStream.range(0, 2 * m).map(q -> Integer.parseInt(st.nextToken()) - 1).toArray() : new int[0]).toArray(int[][]::new) instanceof int[][] eds
                && Arrays.stream(eds).map(ed -> IntStream.range(0, n).mapToObj(v -> IntStream.range(0, ed.length / 2)
                    .flatMap(e -> ed[2 * e] == v ? IntStream.of(ed[2 * e + 1]) : ed[2 * e + 1] == v ? IntStream.of(ed[2 * e]) : IntStream.empty()).toArray())
                    .toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] pics
                && new int[1][][] instanceof int[][][] gh
                && new int[1] instanceof int[] xh
                && ((Function<Integer, int[][]>) s -> new int[n] instanceof int[] ord
                    && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] par
                    && new int[]{1} instanceof int[] c
                    && (ord[0] = s) >= 0 && (par[s] = s) >= 0
                    && IntStream.range(0, n).allMatch(h -> h >= c[0] || IntStream.of(gh[0][ord[h]]).filter(w -> w != xh[0] && par[w] < 0)
                        .peek(w -> ord[c[0]++] = w + 0 * (par[w] = ord[h])).count() >= 0)
                    ? new int[][]{Arrays.copyOf(ord, c[0]), par} : null) instanceof Function<Integer, int[][]> bfs
                && ((Function<Integer, Integer>) r -> bfs.apply(r) instanceof int[][] bp
                    && new int[n] instanceof int[] idv
                    && IntStream.range(0, bp[0].length).map(t -> bp[0].length - 1 - t).allMatch(t -> Integer.valueOf(bp[0][t]) instanceof Integer v
                        && (idv[v] = ids.computeIfAbsent(Arrays.stream(gh[0][v]).filter(w -> w != xh[0] && bp[1][w] == v && w != v).map(w -> idv[w]).sorted().boxed().collect(Collectors.toList()), q -> ids.size())) >= 0)
                    ? idv[r] : -1) instanceof Function<Integer, Integer> rid
                && ((Supplier<String>) () -> new boolean[n] instanceof boolean[] seen
                    ? IntStream.range(0, n).filter(v -> v != xh[0] && !seen[v]).map(v -> bfs.apply(v) instanceof int[][] b0
                        && Arrays.stream(b0[0]).allMatch(u -> (seen[u] = true))
                        && Integer.valueOf(b0[0][b0[0].length - 1]) instanceof Integer a
                        && bfs.apply(a) instanceof int[][] b1
                        && Integer.valueOf(b1[0][b1[0].length - 1]) instanceof Integer b
                        && Integer.valueOf((int) IntStream.iterate(b, u -> u != a, u -> b1[1][u]).count()) instanceof Integer len
                        && Integer.valueOf(IntStream.iterate(b, u -> b1[1][u]).skip(len / 2).findFirst().getAsInt()) instanceof Integer c1
                        && Integer.valueOf(len % 2 == 1 ? IntStream.iterate(b, u -> b1[1][u]).skip(len / 2 + 1).findFirst().getAsInt() : c1) instanceof Integer c2
                        ? Math.min(rid.apply(c1), rid.apply(c2)) : -1).sorted().boxed().map(String::valueOf).collect(Collectors.joining(",")) : "") instanceof Supplier<String> fk
                && ((Function<int[][], long[]>) g0 -> new boolean[n] instanceof boolean[] sn && new int[n] instanceof int[] ord && new int[n] instanceof int[] pr
                    && new int[n] instanceof int[] sz && new int[n] instanceof int[] cs && new long[1] instanceof long[] tot && new int[1] instanceof int[] cnt0
                    && IntStream.range(0, n).filter(v -> !sn[v]).allMatch(v -> (sn[v] = true) && (ord[0] = v) >= 0 && (pr[v] = v) >= 0 && (sz[v] = 1) > 0 && (cnt0[0] = 1) > 0
                        && (IntStream.range(0, n).allMatch(h -> h < cnt0[0] && IntStream.of(g0[ord[h]]).filter(w -> !sn[w])
                            .peek(w -> ord[cnt0[0]++] = w + (pr[w] = ord[h]) * 0 + (sz[w] = 1) * 0 + ((sn[w] = true) ? 0 : 1)).count() >= 0) || true)
                        && IntStream.range(0, cnt0[0]).map(t -> cnt0[0] - 1 - t).allMatch(t -> ord[t] == v || (sz[pr[ord[t]]] += sz[ord[t]]) > 0)
                        && IntStream.range(0, cnt0[0]).allMatch(t -> (cs[ord[t]] = cnt0[0]) > 0)
                        && (tot[0] += mix.applyAsLong(cnt0[0])) == tot[0])
                    && Long.valueOf(Arrays.stream(g0).mapToLong(nb -> mix.applyAsLong(nb.length + 1000003L)).sum()) instanceof Long dsum
                    ? IntStream.range(0, n).mapToLong(x -> (tot[0] - mix.applyAsLong(cs[x])
                        + Arrays.stream(g0[x]).filter(w -> pr[w] == x && w != x).mapToLong(w -> mix.applyAsLong(sz[w])).sum()
                        + (cs[x] - sz[x] > 0 ? mix.applyAsLong(cs[x] - sz[x]) : 0)) * 1000003L
                        + dsum - mix.applyAsLong(g0[x].length + 1000003L)
                        - Arrays.stream(g0[x]).mapToLong(w -> mix.applyAsLong(g0[w].length + 1000003L)).sum()
                        + Arrays.stream(g0[x]).mapToLong(w -> mix.applyAsLong(g0[w].length - 1 + 1000003L)).sum()).toArray() : null) instanceof Function<int[][], long[]> hs
                && Arrays.stream(pics).mapToLong(pg -> hs.apply(pg)[n - 1]).sorted().toArray() instanceof long[] ph
                && new HashMap<String, Integer>() instanceof HashMap<String, Integer> cnt
                && IntStream.range(0, kk).allMatch(i -> (gh[0] = pics[i]) != null && (xh[0] = n - 1) >= 0 && cnt.merge(fk.get(), 1, Integer::sum) > 0)
                && IntStream.range(0, kk).filter(i -> eds[i].length == 2 * (n - 2)).findFirst() instanceof OptionalInt bo
                && bo.isPresent()
                && Integer.valueOf(bo.getAsInt()) instanceof Integer bi
                && IntStream.range(0, n - 1).filter(u -> IntStream.range(0, n).mapToObj(v -> v == n - 1 ? new int[]{u}
                        : v == u ? IntStream.concat(Arrays.stream(pics[bi][v]), IntStream.of(n - 1)).toArray() : pics[bi][v]).toArray(int[][]::new) instanceof int[][] g
                    && (gh[0] = g) != null
                    && Arrays.equals(Arrays.stream(hs.apply(g)).sorted().toArray(), ph)
                    && new HashMap<>(cnt) instanceof HashMap<String, Integer> cm
                    && IntStream.range(0, n).allMatch(del -> (xh[0] = del) >= 0 && cm.merge(fk.get(), -1, Integer::sum) >= 0)).findFirst() instanceof OptionalInt uo
                && uo.isPresent()
                ? "YES\n" + IntStream.range(0, n - 2).mapToObj(e -> (eds[bi][2 * e] + 1) + " " + (eds[bi][2 * e + 1] + 1)).collect(Collectors.joining("\n"))
                    + (n > 2 ? "\n" : "") + (uo.getAsInt() + 1) + " " + n : "NO").collect(Collectors.joining("\n")) : "");
    }
}
