import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer z
            && new HashMap<List<Integer>, Integer>() instanceof HashMap<List<Integer>, Integer> ids
            && ((LongUnaryOperator) k -> (((((k ^ (k >>> 32)) * 0x9E3779B97F4A7C15L) ^ (((k ^ (k >>> 32)) * 0x9E3779B97F4A7C15L) >>> 29)) * 0xBF58476D1CE4E5B9L) ^ (((((k ^ (k >>> 32)) * 0x9E3779B97F4A7C15L) ^ (((k ^ (k >>> 32)) * 0x9E3779B97F4A7C15L) >>> 29)) * 0xBF58476D1CE4E5B9L) >>> 32))) instanceof LongUnaryOperator mix
            ? IntStream.range(0, z).mapToObj(tc -> Integer.valueOf(st.nextToken()) instanceof Integer n
                && Integer.valueOf(st.nextToken()) instanceof Integer kk
                && IntStream.range(0, kk).mapToObj(i -> Integer.valueOf(st.nextToken()) instanceof Integer m
                    ? (IntStream.range(0, 2 * m).map(q -> Integer.parseInt(st.nextToken()) - 1).toArray() instanceof int[] raw && IntStream.range(0, n).map(q -> -1).toArray() instanceof int[] mp && new int[1] instanceof int[] cq ? Arrays.stream(raw).map(x -> mp[x] >= 0 ? mp[x] : (mp[x] = cq[0]++)).toArray() : new int[0]) : new int[0]).toArray(int[][]::new) instanceof int[][] eds
                && Arrays.stream(eds).map(ed -> new int[n] instanceof int[] dg && IntStream.range(0, ed.length / 2).allMatch(i -> Math.max(++dg[ed[2 * i]], ++dg[ed[2 * i + 1]]) > 0)
                    && IntStream.range(0, n).mapToObj(v -> new int[dg[v]]).toArray(int[][]::new) instanceof int[][] aj && new int[n] instanceof int[] ps
                    && IntStream.range(0, ed.length / 2).allMatch(i -> Math.max(aj[ed[2 * i]][ps[ed[2 * i]]++] = ed[2 * i + 1], aj[ed[2 * i + 1]][ps[ed[2 * i + 1]]++] = ed[2 * i]) >= 0) ? aj : null).toArray(int[][][]::new) instanceof int[][][] pics
                && new int[1][][] instanceof int[][][] gh
                && new int[1] instanceof int[] xh
                && ((Function<Integer, int[][]>) s -> new int[n] instanceof int[] ord
                    && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] par
                    && new int[]{1} instanceof int[] c
                    && (ord[0] = s) >= 0 && (par[s] = s) >= 0
                    && IntStream.range(0, n).allMatch(h -> h >= c[0] || IntStream.of(gh[0][ord[h]]).filter(w -> w != xh[0] && par[w] < 0)
                        .peek(w -> ord[c[0]++] = w + 0 * (par[w] = ord[h])).count() >= 0)
                    ? new int[][]{Arrays.copyOf(ord, c[0]), par} : null) instanceof Function<Integer, int[][]> bfs
                && ((Supplier<Long>) () -> new boolean[n] instanceof boolean[] seen && new long[n] instanceof long[] cm1 && new long[n] instanceof long[] dn && new long[n] instanceof long[] up && new long[1] instanceof long[] tot
                    && IntStream.range(0, n).filter(v -> v != xh[0] && !seen[v]).allMatch(v -> bfs.apply(v) instanceof int[][] b0
                        && Arrays.stream(b0[0]).allMatch(u -> (seen[u] = true))
                        && new long[1] instanceof long[] cs
                        && IntStream.range(0, b0[0].length).map(t -> b0[0].length - 1 - t).allMatch(t -> Integer.valueOf(b0[0][t]) instanceof Integer u
                            && (dn[u] = mix.applyAsLong(cm1[u] + 0x7654321L)) == dn[u]
                            && (b0[1][u] == u || (cm1[b0[1][u]] += mix.applyAsLong(dn[u] ^ 0x1234567L)) == cm1[b0[1][u]]))
                        && Arrays.stream(b0[0]).allMatch(u -> (b0[1][u] == u || (up[u] = mix.applyAsLong(cm1[b0[1][u]] + (b0[1][b0[1][u]] == b0[1][u] ? 0L : mix.applyAsLong(up[b0[1][u]] ^ 0x1234567L)) - mix.applyAsLong(dn[u] ^ 0x1234567L) + 0x7654321L)) == up[u])
                            && (cs[0] += mix.applyAsLong(mix.applyAsLong(cm1[u] + (b0[1][u] == u ? 0L : mix.applyAsLong(up[u] ^ 0x1234567L)) + 0x7654321L) ^ 0x2468ACEL)) == cs[0])
                        && (tot[0] += mix.applyAsLong(cs[0] ^ 0x13579BDL)) == tot[0]) ? tot[0] : 0L) instanceof Supplier<Long> fk
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
                && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> cnt
                && IntStream.range(0, kk).allMatch(i -> (gh[0] = pics[i]) != null && (xh[0] = n - 1) >= 0 && cnt.merge(fk.get(), 1, Integer::sum) > 0)
                && IntStream.range(0, kk).filter(i -> eds[i].length == 2 * (n - 2)).findFirst() instanceof OptionalInt bo
                && bo.isPresent()
                && Integer.valueOf(bo.getAsInt()) instanceof Integer bi
                && IntStream.range(0, n - 1).filter(u -> IntStream.range(0, n).mapToObj(v -> v == n - 1 ? new int[]{u}
                        : v == u ? IntStream.concat(Arrays.stream(pics[bi][v]), IntStream.of(n - 1)).toArray() : pics[bi][v]).toArray(int[][]::new) instanceof int[][] g
                    && (gh[0] = g) != null
                    && Arrays.equals(Arrays.stream(hs.apply(g)).sorted().toArray(), ph)
                    && new HashMap<>(cnt) instanceof HashMap<Long, Integer> cm
                    && IntStream.range(0, n).allMatch(del -> (xh[0] = del) >= 0 && cm.merge(fk.get(), -1, Integer::sum) >= 0)).findFirst() instanceof OptionalInt uo
                && uo.isPresent()
                ? "YES\n" + IntStream.range(0, n - 2).mapToObj(e -> (eds[bi][2 * e] + 1) + " " + (eds[bi][2 * e + 1] + 1)).collect(Collectors.joining("\n"))
                    + (n > 2 ? "\n" : "") + (uo.getAsInt() + 1) + " " + n : "NO").collect(Collectors.joining("\n")) : "");
    }
}
