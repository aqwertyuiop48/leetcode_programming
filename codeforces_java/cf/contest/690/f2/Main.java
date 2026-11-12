import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer z
            && new HashMap<List<Integer>, Integer>() instanceof HashMap<List<Integer>, Integer> ids
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
                && new HashMap<String, Integer>() instanceof HashMap<String, Integer> cnt
                && IntStream.range(0, kk).allMatch(i -> (gh[0] = pics[i]) != null && (xh[0] = n - 1) >= 0 && cnt.merge(fk.get(), 1, Integer::sum) > 0)
                && IntStream.range(0, kk).filter(i -> eds[i].length == 2 * (n - 2)).findFirst() instanceof OptionalInt bo
                && bo.isPresent()
                && Integer.valueOf(bo.getAsInt()) instanceof Integer bi
                && IntStream.range(0, n - 1).filter(u -> IntStream.range(0, n).mapToObj(v -> v == n - 1 ? new int[]{u}
                        : v == u ? IntStream.concat(Arrays.stream(pics[bi][v]), IntStream.of(n - 1)).toArray() : pics[bi][v]).toArray(int[][]::new) instanceof int[][] g
                    && (gh[0] = g) != null
                    && new HashMap<>(cnt) instanceof HashMap<String, Integer> cm
                    && IntStream.range(0, n).allMatch(del -> (xh[0] = del) >= 0 && cm.merge(fk.get(), -1, Integer::sum) >= 0)).findFirst() instanceof OptionalInt uo
                && uo.isPresent()
                ? "YES\n" + IntStream.range(0, n - 2).mapToObj(e -> (eds[bi][2 * e] + 1) + " " + (eds[bi][2 * e + 1] + 1)).collect(Collectors.joining("\n"))
                    + (n > 2 ? "\n" : "") + (uo.getAsInt() + 1) + " " + n : "NO").collect(Collectors.joining("\n")) : "");
    }
}
