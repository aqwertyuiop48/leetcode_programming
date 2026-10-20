import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((LongSupplier) () -> Long.parseLong(st.nextToken())) instanceof LongSupplier rd
            && Integer.valueOf((int) rd.getAsLong()) instanceof Integer n && Long.valueOf(rd.getAsLong()) instanceof Long b
            && LongStream.generate(rd).limit(4L * n).toArray() instanceof long[] ar
            && IntStream.range(0, n).mapToLong(i -> ar[4 * i]).toArray() instanceof long[] ax1
            && IntStream.range(0, n).mapToLong(i -> ar[4 * i + 1]).toArray() instanceof long[] ay1
            && IntStream.range(0, n).mapToLong(i -> ar[4 * i + 2]).toArray() instanceof long[] ax2
            && IntStream.range(0, n).mapToLong(i -> ar[4 * i + 3]).toArray() instanceof long[] ay2
            && Integer.valueOf((int) rd.getAsLong()) instanceof Integer q && Integer.valueOf(n + q) instanceof Integer K
            && new long[K] instanceof long[] rx && new long[K] instanceof long[] ry && new long[K] instanceof long[] rdx && new long[K] instanceof long[] rdy && new long[q] instanceof long[] qt
            && IntStream.range(0, n).filter(i -> (rx[i] = ax2[i]) < 0 || (ry[i] = ay2[i]) < 0 || (rdx[i] = Long.signum(ax2[i] - ax1[i])) < -1 || (rdy[i] = Long.signum(ay2[i] - ay1[i])) < -1).count() == 0
            && IntStream.range(0, q).filter(i -> (rx[n + i] = rd.getAsLong()) < 0 || (ry[n + i] = rd.getAsLong()) < 0
                || st.nextToken() instanceof String ds && ((rdx[n + i] = ds.equals("R") ? 1 : ds.equals("L") ? -1 : 0) < -1 || (rdy[n + i] = ds.equals("U") ? 1 : ds.equals("D") ? -1 : 0) < -1)
                || (qt[i] = rd.getAsLong()) < 0).count() == 0
            && new int[K] instanceof int[] hitA && new int[K] instanceof int[] onA && new long[K] instanceof long[] hitX && new long[K] instanceof long[] hitY && new long[K] instanceof long[] hitD
            && IntStream.range(0, K).filter(i -> (hitA[i] = -1) + (onA[i] = -1) > 0).count() == 0
            && IntStream.of(0, 1).filter(f -> ((IntPredicate) i -> f == 0 ? ay1[i] == ay2[i] : ax1[i] == ax2[i]) instanceof IntPredicate isSeg
                && ((IntToLongFunction) i -> f == 0 ? ay1[i] : ax1[i]) instanceof IntToLongFunction key
                && ((IntToLongFunction) i -> f == 0 ? Math.min(ax1[i], ax2[i]) : Math.min(ay1[i], ay2[i])) instanceof IntToLongFunction lo
                && ((IntToLongFunction) i -> f == 0 ? Math.max(ax1[i], ax2[i]) : Math.max(ay1[i], ay2[i])) instanceof IntToLongFunction hi
                && new TreeMap<Long, Integer>() instanceof TreeMap<Long, Integer> act
                && LongStream.concat(IntStream.range(0, n).filter(isSeg).boxed().flatMapToLong(i -> LongStream.of(((lo.applyAsLong(i) << 2 | 1) << 20) | i, (((hi.applyAsLong(i) + 1) << 2) << 20) | i)),
                    IntStream.range(0, K).filter(k -> k >= n || (f == 0 ? rdy[k] : rdx[k]) != 0).mapToLong(k -> (((f == 0 ? rx[k] : ry[k]) << 2 | 2) << 20) | k)).sorted().toArray() instanceof long[] ev
                && LongStream.of(ev).filter(e -> Integer.valueOf((int) (e & 1048575)) instanceof Integer id && Integer.valueOf((int) (e >> 20 & 3)) instanceof Integer ty
                    && (ty == 0 ? act.remove(key.applyAsLong(id), id) || true
                        : ty == 1 ? act.put(key.applyAsLong(id), id) != null || true
                        : Long.valueOf(f == 0 ? ry[id] : rx[id]) instanceof Long qk && Long.valueOf(f == 0 ? rdy[id] : rdx[id]) instanceof Long dr
                        && (id < n || act.get(qk) == null || (onA[id] = act.get(qk)) >= -1)
                        && (dr == 0 || (dr > 0 ? act.higherEntry(qk) : act.lowerEntry(qk)) instanceof Map.Entry<Long, Integer> en
                            && (hitA[id] = en.getValue()) >= 0 && (hitX[id] = f == 0 ? rx[id] : en.getKey()) >= -1 && (hitY[id] = f == 0 ? en.getKey() : ry[id]) >= -1
                            && (hitD[id] = Math.abs(en.getKey() - qk)) >= 0 || true))).count() >= 0
                && true).count() >= 0
            && IntStream.of(0, 1, 2, 3).mapToObj(c -> IntStream.range(0, n).filter(i -> c < 2 ? ax1[i] == ax2[i] : ay1[i] == ay2[i]).boxed()
                .sorted(Comparator.comparingLong(i -> ((c < 2 ? ax1[i] : ay1[i]) << 31) | (c % 2 == 0 ? (c < 2 ? Math.min(ay1[i], ay2[i]) : Math.min(ax1[i], ax2[i])) : (c < 2 ? Math.max(ay1[i], ay2[i]) : Math.max(ax1[i], ax2[i])))))
                .toList()).toList() instanceof List<List<Integer>> cl
            && IntStream.range(0, 4).mapToObj(c -> cl.get(c).stream().mapToLong(i -> ((c < 2 ? ax1[i] : ay1[i]) << 31) | (c % 2 == 0 ? (c < 2 ? Math.min(ay1[i], ay2[i]) : Math.min(ax1[i], ax2[i])) : (c < 2 ? Math.max(ay1[i], ay2[i]) : Math.max(ax1[i], ax2[i])))).toArray()).toList() instanceof List<long[]> ck
            && IntStream.range(0, K).filter(k -> Boolean.valueOf(rdy[k] != 0) instanceof Boolean vert && Long.valueOf(vert ? rx[k] : ry[k]) instanceof Long line && Long.valueOf(vert ? ry[k] : rx[k]) instanceof Long pos
                && Long.valueOf(vert ? rdy[k] : rdx[k]) instanceof Long dr && Integer.valueOf((vert ? 0 : 2) + (dr > 0 ? 0 : 1)) instanceof Integer c
                && Long.valueOf(line << 31 | pos) instanceof Long kq && Integer.valueOf(Arrays.binarySearch(ck.get(c), kq)) instanceof Integer bs
                && Integer.valueOf(dr > 0 ? (bs >= 0 ? bs + 1 : -bs - 1) : (bs >= 0 ? bs : -bs - 1) - 1) instanceof Integer ix
                && (ix >= 0 && ix < ck.get(c).length && (ck.get(c)[ix] >> 31) == line
                    && Long.valueOf(ck.get(c)[ix] & 2147483647L) instanceof Long along
                    && (hitA[k] < 0 || Math.abs(along - pos) < hitD[k])
                    && (hitA[k] = cl.get(c).get(ix)) >= 0 && (hitD[k] = Math.abs(along - pos)) >= 0 && (hitX[k] = vert ? line : along) >= -1 && (hitY[k] = vert ? along : line) >= -1 || true)
                && (hitA[k] >= 0 || (hitD[k] = vert ? (dr > 0 ? b - ry[k] : ry[k]) : (dr > 0 ? b - rx[k] : rx[k])) >= 0 || true)).count() >= 0
            && Long.valueOf(4000000000000000000L) instanceof Long INF && new int[51][n] instanceof int[][] up && new long[51][n] instanceof long[][] ws
            && IntStream.range(0, n).filter(i -> (up[0][i] = hitA[i] >= 0 ? hitA[i] : i) < 0
                || (ws[0][i] = hitA[i] >= 0 ? hitD[i] + Math.abs(hitX[i] - ax2[hitA[i]]) + Math.abs(hitY[i] - ay2[hitA[i]]) : INF) < 0).count() == 0
            && IntStream.range(1, 51).filter(l -> IntStream.range(0, n).filter(i -> (up[l][i] = up[l - 1][up[l - 1][i]]) < 0
                || (ws[l][i] = Math.min(INF, ws[l - 1][i] + ws[l - 1][up[l - 1][i]])) < 0).count() > 0).count() == 0
            && ((Function<long[], String>) s -> IntStream.iterate(50, l -> l >= 0, l -> l - 1).boxed().reduce(new long[]{s[0], s[1]},
                    (a, l) -> ws[l][(int) a[0]] <= a[1] ? new long[]{up[l][(int) a[0]], a[1] - ws[l][(int) a[0]]} : a, (a, c) -> a) instanceof long[] r
                && Integer.valueOf((int) r[0]) instanceof Integer cur
                ? hitA[cur] < 0 ? (ax2[cur] + rdx[cur] * Math.min(r[1], hitD[cur])) + " " + (ay2[cur] + rdy[cur] * Math.min(r[1], hitD[cur]))
                : r[1] <= hitD[cur] ? (ax2[cur] + rdx[cur] * r[1]) + " " + (ay2[cur] + rdy[cur] * r[1])
                : (hitX[cur] + rdx[hitA[cur]] * (r[1] - hitD[cur])) + " " + (hitY[cur] + rdy[hitA[cur]] * (r[1] - hitD[cur])) : "") instanceof Function<long[], String> walk
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(n + i) instanceof Integer k && Long.valueOf(qt[i]) instanceof Long t
                ? onA[k] >= 0 ? Long.valueOf(Math.abs(rx[k] - ax2[onA[k]]) + Math.abs(ry[k] - ay2[onA[k]])) instanceof Long d0
                    ? t <= d0 ? (rx[k] + rdx[onA[k]] * t) + " " + (ry[k] + rdy[onA[k]] * t) : walk.apply(new long[]{onA[k], t - d0}) : ""
                : hitA[k] < 0 ? (rx[k] + rdx[k] * Math.min(t, hitD[k])) + " " + (ry[k] + rdy[k] * Math.min(t, hitD[k]))
                : t <= hitD[k] ? (rx[k] + rdx[k] * t) + " " + (ry[k] + rdy[k] * t)
                : Long.valueOf(t - hitD[k]) instanceof Long rem && Long.valueOf(Math.abs(hitX[k] - ax2[hitA[k]]) + Math.abs(hitY[k] - ay2[hitA[k]])) instanceof Long d1
                    ? rem <= d1 ? (hitX[k] + rdx[hitA[k]] * rem) + " " + (hitY[k] + rdy[hitA[k]] * rem) : walk.apply(new long[]{hitA[k], rem - d1}) : "" : "").collect(Collectors.joining("\n")) : "");
    }
}
