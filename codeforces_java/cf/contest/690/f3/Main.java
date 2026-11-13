import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer zz
            && new HashMap<List<Integer>, Integer>() instanceof HashMap<List<Integer>, Integer> ids
            && ((LongUnaryOperator) k -> k * 0x9E3779B97F4A7C15L + 0x632BE59BD9B4E019L).andThen(q -> (q ^ (q >>> 30)) * 0xBF58476D1CE4E5B9L)
                .andThen(q -> (q ^ (q >>> 27)) * 0x94D049BB133111EBL).andThen(q -> q ^ (q >>> 31)) instanceof LongUnaryOperator mix
            ? IntStream.range(0, zz).mapToObj(tc -> Integer.valueOf(st.nextToken()) instanceof Integer n
                && Integer.valueOf(st.nextToken()) instanceof Integer kk
                && Integer.valueOf(st.nextToken()) instanceof Integer m1
                && IntStream.range(0, 2 * m1).map(q -> Integer.parseInt(st.nextToken()) - 1).toArray() instanceof int[] ed1
                && Integer.valueOf(st.nextToken()) instanceof Integer m2
                && IntStream.range(0, 2 * m2).map(q -> Integer.parseInt(st.nextToken()) - 1).toArray() instanceof int[] ed2
                && Integer.valueOf(n - 1) instanceof Integer vv
                ? (vv == 0 ? "YES"
                : ((Function<int[], int[][]>) ed -> new int[vv] instanceof int[] dg
                    && IntStream.range(0, ed.length / 2).allMatch(i -> Math.max(++dg[ed[2 * i]], ++dg[ed[2 * i + 1]]) > 0)
                    && IntStream.range(0, vv).mapToObj(v -> new int[dg[v]]).toArray(int[][]::new) instanceof int[][] aj
                    && new int[vv] instanceof int[] ps
                    && IntStream.range(0, ed.length / 2).allMatch(i -> Math.max(aj[ed[2 * i]][ps[ed[2 * i]]++] = ed[2 * i + 1], aj[ed[2 * i + 1]][ps[ed[2 * i + 1]]++] = ed[2 * i]) >= 0)
                    ? aj : null) instanceof Function<int[], int[][]> mk
                && new int[][][]{mk.apply(ed1), mk.apply(ed2)} instanceof int[][][] ad
                && new int[1][][] instanceof int[][][] ah
                && new int[1] instanceof int[] xh
                && new int[vv] instanceof int[] stamp
                && new int[1] instanceof int[] ctr
                && new int[vv] instanceof int[] qa
                && new int[vv] instanceof int[] pp
                && ((Function<Integer, int[]>) s -> (++ctr[0]) > 0 && (stamp[s] = ctr[0]) > 0 && (qa[0] = s) >= 0 && (pp[s] = s) >= 0
                    && new int[]{1} instanceof int[] cn
                    && (IntStream.range(0, vv).allMatch(h -> h < cn[0] && IntStream.of(ah[0][qa[h]]).filter(w -> w != xh[0] && stamp[w] != ctr[0])
                        .peek(w -> qa[cn[0]++] = w + 0 * ((stamp[w] = ctr[0]) + (pp[w] = qa[h]))).count() >= 0) || true)
                    ? Arrays.copyOf(qa, cn[0]) : null) instanceof Function<Integer, int[]> bfs
                && new int[1][] instanceof int[][] parh
                && new int[1][] instanceof int[][] idh
                && ((Function<Integer, Integer>) r -> bfs.apply(r) instanceof int[] ord
                    && Arrays.stream(ord).allMatch(u -> (parh[0][u] = pp[u]) >= 0)
                    && IntStream.range(0, ord.length).map(t -> ord.length - 1 - t).allMatch(t -> Integer.valueOf(ord[t]) instanceof Integer v
                        && (idh[0][v] = ids.computeIfAbsent(Arrays.stream(ah[0][v]).filter(w -> w != xh[0] && parh[0][w] == v && w != v).map(w -> idh[0][w]).sorted().boxed().collect(Collectors.toList()), q -> ids.size())) >= 0)
                    ? idh[0][r] : -1) instanceof Function<Integer, Integer> rp
                && ((BiFunction<Integer, Integer, Object[]>) (gi, x) -> (ah[0] = ad[gi]) != null && (xh[0] = x) >= 0
                    && IntStream.range(0, vv).map(i -> -1).toArray() instanceof int[] cof
                    && new int[vv] instanceof int[] par && new int[vv] instanceof int[] idv
                    && new int[vv] instanceof int[] roots && new int[vv] instanceof int[] cls
                    && (parh[0] = par) != null && (idh[0] = idv) != null
                    && new int[1] instanceof int[] cc
                    && IntStream.range(0, vv).filter(v -> v != x && cof[v] < 0).allMatch(v -> bfs.apply(v) instanceof int[] o0
                        && Arrays.stream(o0).allMatch(u -> (cof[u] = cc[0]) >= 0)
                        && Integer.valueOf(o0[o0.length - 1]) instanceof Integer a
                        && bfs.apply(a) instanceof int[] o1
                        && Integer.valueOf(o1[o1.length - 1]) instanceof Integer b
                        && Integer.valueOf((int) IntStream.iterate(b, u -> u != a, u -> pp[u]).count()) instanceof Integer len
                        && Integer.valueOf(IntStream.iterate(b, u -> pp[u]).skip(len / 2).findFirst().getAsInt()) instanceof Integer c1
                        && Integer.valueOf(len % 2 == 1 ? IntStream.iterate(b, u -> pp[u]).skip(len / 2 + 1).findFirst().getAsInt() : c1) instanceof Integer c2
                        && Integer.valueOf(rp.apply(c1)) instanceof Integer i1
                        && Integer.valueOf(len % 2 == 1 ? rp.apply(c2) : i1) instanceof Integer i2
                        && (len % 2 == 1 && i1 < i2 ? rp.apply(c1) : 0) >= 0
                        && (roots[cc[0]] = len % 2 == 1 && i1 < i2 ? c1 : c2) >= 0
                        && (cls[cc[0]] = Math.min(i1, i2)) >= 0
                        && ++cc[0] > 0)
                    ? new Object[]{cof, roots, cls, par, idv, cc[0]} : null) instanceof BiFunction<Integer, Integer, Object[]> comp
                && ((Function<int[][], int[]>) g1 -> new boolean[vv] instanceof boolean[] sn && new int[vv] instanceof int[] od && new int[vv] instanceof int[] pr3
                    && new int[vv] instanceof int[] dn && new int[vv] instanceof int[] up && new int[vv] instanceof int[] rr && new int[1] instanceof int[] cn2
                    && IntStream.range(0, vv).filter(v -> !sn[v]).allMatch(v -> (sn[v] = true) && (od[0] = v) >= 0 && (pr3[v] = v) >= 0 && (cn2[0] = 1) > 0
                        && (IntStream.range(0, vv).allMatch(h -> h < cn2[0] && IntStream.of(g1[od[h]]).filter(w -> !sn[w])
                            .peek(w -> od[cn2[0]++] = w + (pr3[w] = od[h]) * 0 + ((sn[w] = true) ? 0 : 1)).count() >= 0) || true)
                        && IntStream.range(0, cn2[0]).map(t -> cn2[0] - 1 - t).allMatch(t -> Integer.valueOf(od[t]) instanceof Integer u
                            && (dn[u] = ids.computeIfAbsent(Arrays.stream(g1[u]).filter(w -> pr3[w] == u && w != u).map(w -> dn[w]).sorted().boxed().collect(Collectors.toList()), q -> ids.size())) >= 0)
                        && IntStream.range(0, cn2[0]).allMatch(t -> Integer.valueOf(od[t]) instanceof Integer u
                            && Arrays.stream(g1[u]).filter(w -> pr3[w] == u && w != u).toArray() instanceof int[] ch
                            && (rr[u] = ids.computeIfAbsent(Stream.concat(Arrays.stream(ch).mapToObj(w -> dn[w]), u == v ? Stream.<Integer>empty() : Stream.of(up[u])).sorted().collect(Collectors.toList()), q -> ids.size())) >= 0
                            && Arrays.stream(ch).allMatch(c -> (up[c] = ids.computeIfAbsent(Stream.concat(Arrays.stream(ch).filter(s -> s != c).mapToObj(s -> dn[s]),
                                u == v ? Stream.<Integer>empty() : Stream.of(up[u])).sorted().collect(Collectors.toList()), q -> ids.size())) >= 0)))
                    ? rr : null) instanceof Function<int[][], int[]> orb
                && orb.apply(ad[0]) instanceof int[] o1
                && orb.apply(ad[1]) instanceof int[] o2
                && new HashSet<Integer>() instanceof HashSet<Integer> seen1
                && new HashSet<Integer>() instanceof HashSet<Integer> seen2
                && ((Function<Integer, long[]>) gi -> (ah[0] = ad[gi]) != null && (xh[0] = -1) < 0
                    && new int[vv] instanceof int[] cs && new int[vv] instanceof int[] sz && new int[vv] instanceof int[] bp
                    && new long[1] instanceof long[] tot
                    && IntStream.range(0, vv).filter(v -> cs[v] == 0).allMatch(v -> bfs.apply(v) instanceof int[] o
                        && Arrays.stream(o).allMatch(u -> (bp[u] = pp[u]) >= 0 && (sz[u] = 1) > 0 && (cs[u] = o.length) > 0)
                        && IntStream.range(0, o.length).map(t -> o.length - 1 - t).allMatch(t -> o[t] == v || (sz[bp[o[t]]] += sz[o[t]]) > 0)
                        && (tot[0] += mix.applyAsLong(o.length)) == tot[0])
                    && Long.valueOf(Arrays.stream(ah[0]).mapToLong(nb -> mix.applyAsLong(nb.length + 1000003L)).sum()) instanceof Long dsum
                    ? IntStream.range(0, vv).mapToLong(x -> (tot[0] - mix.applyAsLong(cs[x])
                        + Arrays.stream(ah[0][x]).filter(w -> bp[w] == x && w != x).mapToLong(w -> mix.applyAsLong(sz[w])).sum()
                        + (cs[x] - sz[x] > 0 ? mix.applyAsLong(cs[x] - sz[x]) : 0)) * 1000003L
                        + dsum - mix.applyAsLong(ah[0][x].length + 1000003L)
                        - Arrays.stream(ah[0][x]).mapToLong(w -> mix.applyAsLong(ah[0][w].length + 1000003L)).sum()
                        + Arrays.stream(ah[0][x]).mapToLong(w -> mix.applyAsLong(ah[0][w].length - 1 + 1000003L)).sum()).toArray() : null) instanceof Function<Integer, long[]> hs
                && hs.apply(0) instanceof long[] h1
                && hs.apply(1) instanceof long[] h2
                && IntStream.range(0, vv).boxed().filter(y -> (ad[1][y].length == vv - m1 || ad[1][y].length == vv - m1 - 1) && seen2.add(o2[y])).collect(Collectors.groupingBy(y -> h2[y])) instanceof Map<Long, List<Integer>> byh
                && new HashMap<Integer, Object[]>() instanceof HashMap<Integer, Object[]> cache1
                && new HashMap<Integer, Object[]>() instanceof HashMap<Integer, Object[]> cache2
                && ((BiFunction<Integer, Integer, String>) (x, y) -> cache1.computeIfAbsent(x, q -> comp.apply(0, x)) instanceof Object[] d1
                    && cache2.computeIfAbsent(y, q -> comp.apply(1, y)) instanceof Object[] d2
                    && d1[0] instanceof int[] cof1 && d1[2] instanceof int[] cls1 && d1[3] instanceof int[] par1 && d1[4] instanceof int[] idv1 && d1[1] instanceof int[] roots1
                    && d2[0] instanceof int[] cof2 && d2[2] instanceof int[] cls2 && d2[3] instanceof int[] par2 && d2[4] instanceof int[] idv2 && d2[1] instanceof int[] roots2
                    && Integer.valueOf((Integer) d1[5]) instanceof Integer cn1
                    && cn1 == ((Integer) d2[5]).intValue()
                    && Arrays.equals(Arrays.stream(cls1, 0, cn1).sorted().toArray(), Arrays.stream(cls2, 0, cn1).sorted().toArray())
                    && new boolean[cn1] instanceof boolean[] af
                    && new boolean[cn1] instanceof boolean[] bf
                    && Arrays.stream(ad[0][x]).allMatch(w -> af[cof1[w]] = true)
                    && Arrays.stream(ad[1][y]).allMatch(w -> bf[cof2[w]] = true)
                    && Integer.valueOf(ad[0][x].length + ad[1][y].length - cn1) instanceof Integer dlt
                    && (dlt == 0 || dlt == 1)
                    && Arrays.stream(cls1, 0, cn1).distinct().toArray() instanceof int[] dcl
                    && IntStream.range(0, dcl.length).map(j -> Math.max(0, (int) IntStream.range(0, cn1).filter(i -> cls1[i] == dcl[j] && af[i]).count()
                        + (int) IntStream.range(0, cn1).filter(i -> cls2[i] == dcl[j] && bf[i]).count()
                        - (int) IntStream.range(0, cn1).filter(i -> cls1[i] == dcl[j]).count())).toArray() instanceof int[] lo
                    && IntStream.range(0, dcl.length).map(j -> Math.min((int) IntStream.range(0, cn1).filter(i -> cls1[i] == dcl[j] && af[i]).count(),
                        (int) IntStream.range(0, cn1).filter(i -> cls2[i] == dcl[j] && bf[i]).count())).toArray() instanceof int[] hi
                    && Integer.valueOf(1 - (dlt == 1 ? 0 : 1)) instanceof Integer target
                    && Arrays.stream(lo).sum() <= target && target <= Arrays.stream(hi).sum()
                    && IntStream.range(0, dcl.length).map(j -> lo[j] + (target - Arrays.stream(lo).sum() == 1
                        && IntStream.range(0, j).noneMatch(j2 -> hi[j2] > lo[j2]) && hi[j] > lo[j] ? 1 : 0)).toArray() instanceof int[] sk
                    && new int[cn1] instanceof int[] partner
                    && IntStream.range(0, dcl.length).allMatch(j -> new int[][]{
                            IntStream.range(0, cn1).filter(i -> cls1[i] == dcl[j] && af[i]).toArray(),
                            IntStream.range(0, cn1).filter(i -> cls1[i] == dcl[j] && !af[i]).toArray(),
                            IntStream.range(0, cn1).filter(i -> cls2[i] == dcl[j] && bf[i]).toArray(),
                            IntStream.range(0, cn1).filter(i -> cls2[i] == dcl[j] && !bf[i]).toArray()} instanceof int[][] g4
                        && IntStream.concat(Arrays.stream(g4[0]), Arrays.stream(g4[1])).toArray() instanceof int[] cp
                        && IntStream.concat(IntStream.concat(Arrays.stream(g4[2], 0, sk[j]), Arrays.stream(g4[3], 0, g4[0].length - sk[j])),
                            IntStream.concat(Arrays.stream(g4[2], sk[j], g4[2].length), Arrays.stream(g4[3], g4[0].length - sk[j], g4[3].length))).toArray() instanceof int[] dp
                        && IntStream.range(0, cp.length).allMatch(i -> (partner[dp[i]] = cp[i]) >= 0))
                    && new int[vv] instanceof int[] m21
                    && new int[vv] instanceof int[] q1
                    && new int[vv] instanceof int[] q2
                    && IntStream.range(0, cn1).filter(d -> bf[d]).allMatch(d -> Integer.valueOf(roots1[partner[d]]) instanceof Integer r1
                        && Integer.valueOf(roots2[d]) instanceof Integer r2
                        && (q1[0] = r1) >= 0 && (q2[0] = r2) >= 0 && (m21[r2] = r1) >= 0
                        && new int[]{1} instanceof int[] tl
                        && (IntStream.range(0, vv).allMatch(h -> h < tl[0]
                            && Arrays.stream(ad[0][q1[h]]).filter(w -> w != x && par1[w] == q1[h] && w != q1[h]).boxed().sorted(Comparator.comparingInt(w -> idv1[w])).mapToInt(Integer::intValue).toArray() instanceof int[] k1
                            && Arrays.stream(ad[1][q2[h]]).filter(w -> w != y && par2[w] == q2[h] && w != q2[h]).boxed().sorted(Comparator.comparingInt(w -> idv2[w])).mapToInt(Integer::intValue).toArray() instanceof int[] k2
                            && IntStream.range(0, k1.length).allMatch(i -> (q1[tl[0]] = k1[i]) >= 0 && (q2[tl[0]] = k2[i]) >= 0 && (m21[k2[i]] = k1[i]) >= 0 && ++tl[0] > 0)) || true))
                    ? "YES\n" + Stream.of(
                        IntStream.range(0, m1).mapToObj(i -> (ed1[2 * i] + 1) + " " + (ed1[2 * i + 1] + 1)),
                        Arrays.stream(ad[1][y]).mapToObj(w -> n + " " + (m21[w] + 1)),
                        dlt == 0 ? Stream.of(n + " " + (x + 1)) : Stream.<String>empty()).flatMap(Function.identity()).collect(Collectors.joining("\n")) : null) instanceof BiFunction<Integer, Integer, String> att
                ? IntStream.range(0, vv).boxed().filter(x -> (ad[0][x].length == vv - m2 || ad[0][x].length == vv - m2 - 1) && seen1.add(o1[x])).flatMap(x -> byh.getOrDefault(h1[x], List.of()).stream().map(y -> att.apply(x, y)))
                    .filter(Objects::nonNull).findFirst().orElse("NO") : "") : "").collect(Collectors.joining("\n")) : "");
    }
}
