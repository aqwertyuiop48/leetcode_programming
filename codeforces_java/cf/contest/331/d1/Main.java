import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(java.util.regex.Pattern.compile("\\s+") instanceof java.util.regex.Pattern pt && new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> pt.splitAsStream(l.trim())).filter(w -> !w.isEmpty()).toArray(String[]::new) instanceof String[] w
            && Integer.valueOf(w[0]) instanceof Integer n && Long.valueOf(w[1]) instanceof Long b
            && Long.valueOf(1L << 31) instanceof Long M && Long.valueOf(2000000000000000000L) instanceof Long INF
            && new long[]{1, -1, 0, 0} instanceof long[] DX && new long[]{0, 0, 1, -1} instanceof long[] DY
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(w[2 + 4 * i]), Long.parseLong(w[3 + 4 * i]), Long.parseLong(w[4 + 4 * i]), Long.parseLong(w[5 + 4 * i])}).toArray(long[][]::new) instanceof long[][] sg
            && Arrays.stream(sg).map(s -> new long[]{s[1], s[0], s[3], s[2]}).toArray(long[][]::new) instanceof long[][] sgT
            && Arrays.stream(sg).mapToInt(s -> s[2] > s[0] ? 0 : s[2] < s[0] ? 1 : s[3] > s[1] ? 2 : 3).toArray() instanceof int[] dr
            && Integer.valueOf(Integer.parseInt(w[2 + 4 * n])) instanceof Integer q && Integer.valueOf(3 + 4 * n) instanceof Integer qb
            && ((BiFunction<long[][], long[][], long[][]>) (sgm, rys) -> new TreeMap<Long, Integer>() instanceof TreeMap<Long, Integer> H && new TreeMap<Long, Integer>() instanceof TreeMap<Long, Integer> act
                && new long[rys.length][] instanceof long[][] out
                && IntStream.range(0, sgm.length).filter(i -> sgm[i][1] == sgm[i][3]).allMatch(i -> H.put(sgm[i][1] * M + Math.min(sgm[i][0], sgm[i][2]), i) == null)
                && LongStream.concat(LongStream.concat(
                        IntStream.range(0, sgm.length).filter(i -> sgm[i][0] == sgm[i][2]).mapToLong(i -> ((Math.min(sgm[i][1], sgm[i][3]) * 4) << 20) | i),
                        IntStream.range(0, sgm.length).filter(i -> sgm[i][0] == sgm[i][2]).mapToLong(i -> ((Math.max(sgm[i][1], sgm[i][3]) * 4 + 2) << 20) | i)),
                        IntStream.range(0, rys.length).mapToLong(r -> ((rys[r][1] * 4 + 1) << 20) | r)).sorted().toArray() instanceof long[] ev
                && Arrays.stream(ev).allMatch(e -> Integer.valueOf((int) (e >> 20 & 3)) instanceof Integer typ && Integer.valueOf((int) (e & 1048575)) instanceof Integer id
                    && (typ == 0 ? act.put(sgm[id][0], id) == null || true
                        : typ == 2 ? act.remove(sgm[id][0]) != null || true
                        : Long.valueOf(rys[id][0]) instanceof Long px && Long.valueOf(rys[id][1]) instanceof Long py && Long.valueOf(rys[id][2]) instanceof Long s
                            && Optional.ofNullable(s > 0 ? act.higherEntry(px) : act.lowerEntry(px)) instanceof Optional<Map.Entry<Long, Integer>> ov
                            && Optional.ofNullable(s > 0 ? H.higherEntry(py * M + px) : H.lowerEntry(py * M + px)).filter(en -> (en.getKey() >> 31) == py) instanceof Optional<Map.Entry<Long, Integer>> oh
                            && Long.valueOf(ov.map(en -> Math.abs(en.getKey() - px)).orElse(INF)) instanceof Long vd
                            && Long.valueOf(oh.map(en -> s > 0 ? (en.getKey() & (M - 1)) - px : px - Math.max(sgm[en.getValue()][0], sgm[en.getValue()][2])).orElse(INF)) instanceof Long hd
                            && (out[id] = new long[]{vd < hd ? ov.get().getValue() : hd < INF ? oh.get().getValue() : -1, Math.min(vd, hd)}) != null))
                ? out : null) instanceof BiFunction<long[][], long[][], long[][]> shoot
            && new long[n + q] instanceof long[] rx && new long[n + q] instanceof long[] ry && new int[n + q] instanceof int[] rd && new long[q] instanceof long[] qt
            && IntStream.range(0, n).allMatch(i -> (rx[i] = sg[i][2]) >= 0 && (ry[i] = sg[i][3]) >= 0 && (rd[i] = dr[i]) >= 0)
            && IntStream.range(0, q).allMatch(i -> (rx[n + i] = Long.parseLong(w[qb + 4 * i])) >= 0 && (ry[n + i] = Long.parseLong(w[qb + 4 * i + 1])) >= 0
                && (rd[n + i] = "RLUD".indexOf(w[qb + 4 * i + 2].charAt(0))) >= 0 && (qt[i] = Long.parseLong(w[qb + 4 * i + 3])) >= 0)
            && IntStream.range(0, n + q).filter(i -> rd[i] < 2).toArray() instanceof int[] ih
            && IntStream.range(0, n + q).filter(i -> rd[i] >= 2).toArray() instanceof int[] iv
            && shoot.apply(sg, Arrays.stream(ih).mapToObj(i -> new long[]{rx[i], ry[i], rd[i] == 0 ? 1 : -1}).toArray(long[][]::new)) instanceof long[][] rh
            && shoot.apply(sgT, Arrays.stream(iv).mapToObj(i -> new long[]{ry[i], rx[i], rd[i] == 2 ? 1 : -1}).toArray(long[][]::new)) instanceof long[][] rv
            && new long[n + q][] instanceof long[][] res
            && IntStream.range(0, ih.length).allMatch(k -> (res[ih[k]] = rh[k]) != null)
            && IntStream.range(0, iv.length).allMatch(k -> (res[iv[k]] = rv[k]) != null)
            && ((IntToLongFunction) i -> res[i][0] >= 0 ? res[i][1] : (rd[i] == 0 ? b - rx[i] : rd[i] == 1 ? rx[i] : rd[i] == 2 ? b - ry[i] : ry[i])) instanceof IntToLongFunction fl
            && ((IntToLongFunction) j -> res[j][0] >= 0 ? fl.applyAsLong(j) + Math.abs(sg[(int) res[j][0]][2] - (rx[j] + DX[rd[j]] * fl.applyAsLong(j))) + Math.abs(sg[(int) res[j][0]][3] - (ry[j] + DY[rd[j]] * fl.applyAsLong(j))) : INF) instanceof IntToLongFunction cost
            && Integer.valueOf(51) instanceof Integer K
            && new int[K][] instanceof int[][] up && new long[K][] instanceof long[][] ds
            && (up[0] = IntStream.range(0, n).map(j -> res[j][0] >= 0 ? (int) res[j][0] : j).toArray()) != null
            && (ds[0] = IntStream.range(0, n).mapToLong(cost).toArray()) != null
            && IntStream.range(1, K).allMatch(k -> (up[k] = IntStream.range(0, n).map(j -> up[k - 1][up[k - 1][j]]).toArray()) != null
                && (ds[k] = IntStream.range(0, n).mapToLong(j -> Math.min(INF, ds[k - 1][j] + ds[k - 1][up[k - 1][j]])).toArray()) != null)
            && new java.util.TreeMap<Long, Integer>() instanceof TreeMap<Long, Integer> Hm && new TreeMap<Long, Integer>() instanceof TreeMap<Long, Integer> Vm
            && IntStream.range(0, n).allMatch(i -> sg[i][1] == sg[i][3] ? Hm.put(sg[i][1] * M + Math.min(sg[i][0], sg[i][2]), i) == null : Vm.put(sg[i][0] * M + Math.min(sg[i][1], sg[i][3]), i) == null)
            && ((IntToLongFunction) i -> Optional.ofNullable(Hm.floorEntry(ry[i] * M + rx[i])).filter(en -> (en.getKey() >> 31) == ry[i] && rx[i] <= Math.max(sg[en.getValue()][0], sg[en.getValue()][2])).map(en -> (long) en.getValue())
                .or(() -> Optional.ofNullable(Vm.floorEntry(rx[i] * M + ry[i])).filter(en -> (en.getKey() >> 31) == rx[i] && ry[i] <= Math.max(sg[en.getValue()][1], sg[en.getValue()][3])).map(en -> (long) en.getValue())).orElse(-1L)) instanceof IntToLongFunction onArrow
            && ((Function<long[], String>) a -> (a[0] + DX[(int) a[2]] * a[3]) + " " + (a[1] + DY[(int) a[2]] * a[3])) instanceof Function<long[], String> at
            && ((BiFunction<Integer, long[], String>) (ri, st) -> Long.valueOf(onArrow.applyAsLong(ri)) instanceof Long oa
                ? (oa >= 0
                    ? (Long.valueOf(Math.abs(sg[oa.intValue()][2] - rx[ri]) + Math.abs(sg[oa.intValue()][3] - ry[ri])) instanceof Long rem
                        && (st[0] <= rem ? true : (st[0] -= rem) >= 0 && (st[1] = oa) >= 0 && false) ? at.apply(new long[]{rx[ri], ry[ri], dr[oa.intValue()], st[0]}) : "")
                    : (Long.valueOf(fl.applyAsLong(ri)) instanceof Long d
                        ? (st[0] <= d || res[ri][0] < 0 ? at.apply(new long[]{rx[ri], ry[ri], rd[ri], Math.min(st[0], d)})
                            : (st[0] -= d) >= 0 && Long.valueOf(rx[ri] + DX[rd[ri]] * d) instanceof Long cx && Long.valueOf(ry[ri] + DY[rd[ri]] * d) instanceof Long cy
                              && Integer.valueOf((int) res[ri][0]) instanceof Integer hid && Long.valueOf(Math.abs(sg[hid][2] - cx) + Math.abs(sg[hid][3] - cy)) instanceof Long rem2
                              && (st[0] <= rem2 ? true : (st[0] -= rem2) >= 0 && (st[1] = hid) >= 0 && false) ? at.apply(new long[]{cx, cy, dr[hid], st[0]}) : "")
                        : ""))
                : "") instanceof BiFunction<Integer, long[], String> stage1
            && ((Function<long[], String>) st -> IntStream.iterate(K - 1, k -> k >= 0, k -> k - 1).allMatch(k -> ds[k][(int) st[1]] > st[0] || ((st[0] -= ds[k][(int) st[1]]) >= 0 && (st[1] = up[k][(int) st[1]]) >= 0))
                && Integer.valueOf((int) st[1]) instanceof Integer cur && Long.valueOf(fl.applyAsLong(cur)) instanceof Long d2
                ? (st[0] <= d2 || res[cur][0] < 0 ? at.apply(new long[]{sg[cur][2], sg[cur][3], dr[cur], Math.min(st[0], d2)})
                    : Long.valueOf(sg[cur][2] + DX[dr[cur]] * d2) instanceof Long cx && Long.valueOf(sg[cur][3] + DY[dr[cur]] * d2) instanceof Long cy
                        ? at.apply(new long[]{cx, cy, dr[(int) res[cur][0]], st[0] - d2}) : "") : "") instanceof Function<long[], String> stage2
            ? IntStream.range(0, q).parallel().mapToObj(qi -> new long[]{qt[qi], 0} instanceof long[] st && stage1.apply(n + qi, st) instanceof String early ? (early.isEmpty() ? stage2.apply(st) : early) : "").collect(Collectors.joining("\n")) : "");
    }
}
