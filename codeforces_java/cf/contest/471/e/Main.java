import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : i < raw.length && raw[i] == 45 ? (st[3] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[3] > 0 ? -st[1] : st[1]) != Integer.MIN_VALUE && (st[1] = st[2] = st[3] = 0) == 0) || true)
                && (Integer) v[0] instanceof Integer n
                && IntStream.range(0, n).filter(i -> v[2 + 4 * i] == v[4 + 4 * i]).map(i -> v[2 + 4 * i]).sorted().toArray() instanceof int[] ysa
                && IntStream.range(0, ysa.length).filter(i -> i == 0 || ysa[i] != ysa[i - 1]).map(i -> ysa[i]).toArray() instanceof int[] ys
                && (Integer) ys.length instanceof Integer m
                && IntStream.range(0, 2 * n).filter(j -> (j & 1) == 0 || v[2 + 4 * (j >> 1)] == v[4 + 4 * (j >> 1)]).mapToLong(j -> (((j & 1) == 0 ? v[1 + 4 * (j >> 1)] : v[3 + 4 * (j >> 1)]) + 1000000000L) << 20 | (long) ((j & 1) == 1 ? 2 : v[2 + 4 * (j >> 1)] == v[4 + 4 * (j >> 1)] ? 0 : 1) << 18 | (j >> 1)).sorted().toArray() instanceof long[] ev
                && new int[n] instanceof int[] p && new int[n] instanceof int[] sz && new int[n] instanceof int[] cnt && new int[m + 1] instanceof int[] idAt && new int[4100] instanceof int[] wb && new int[1] instanceof int[] res
                && new long[2][(m >> 6) + 4] instanceof long[][] l0 && new long[2][(m >> 12) + 4] instanceof long[][] l1 && new long[2] instanceof long[] l2
                && IntStream.range(0, n).allMatch(i -> (p[i] = i) >= 0 && (sz[i] = 1) > 0)
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
                && fr.getAndSet(x -> p[x] == x ? x : (p[x] = fr.get().applyAsInt(p[x]))) == null
                && Optional.<IntBinaryOperator>of((a, b) -> (Integer) fr.get().applyAsInt(a) instanceof Integer ra && (Integer) fr.get().applyAsInt(b) instanceof Integer rb && !ra.equals(rb) && (sz[ra] < sz[rb] ? (p[ra] = rb) >= 0 && (sz[rb] += sz[ra]) > 0 : (p[rb] = ra) >= 0 && (sz[ra] += sz[rb]) > 0) ? 1 : 0).get() instanceof IntBinaryOperator un
                && Optional.<IntBinaryOperator>of((s, x) -> (l0[s][x >> 6] |= 1L << x) != 0 && (l1[s][x >> 12] |= 1L << (x >> 6)) != 0 && (l2[s] |= 1L << (x >> 12)) != 0 ? 1 : 0).get() instanceof IntBinaryOperator add
                && Optional.<IntBinaryOperator>of((s, x) -> (l0[s][x >> 6] &= ~(1L << x)) != 0 || (l1[s][x >> 12] &= ~(1L << (x >> 6))) != 0 || (l2[s] &= ~(1L << (x >> 12))) != 0 || true ? 1 : 0).get() instanceof IntBinaryOperator del
                && Optional.<IntBinaryOperator>of((s, x) -> ((Long) (l0[s][x >> 6] & -1L << x) instanceof Long w0 && w0 != 0 && (res[0] = (x >> 6 << 6) + Long.numberOfTrailingZeros(w0)) >= 0
                        || (Integer) ((x >> 6) + 1) instanceof Integer y1 && (Long) (l1[s][y1 >> 6] & -1L << y1) instanceof Long w1 && w1 != 0 && (Integer) ((y1 >> 6 << 6) + Long.numberOfTrailingZeros(w1)) instanceof Integer j1 && (res[0] = (j1 << 6) + Long.numberOfTrailingZeros(l0[s][j1])) >= 0
                        || (Integer) (((x >> 6) + 1 >> 6) + 1) instanceof Integer z2 && (Long) (l2[s] & (z2 < 64 ? -1L << z2 : 0L)) instanceof Long w2 && w2 != 0 && (Integer) Long.numberOfTrailingZeros(w2) instanceof Integer k2 && (Integer) ((k2 << 6) + Long.numberOfTrailingZeros(l1[s][k2])) instanceof Integer j2 && (res[0] = (j2 << 6) + Long.numberOfTrailingZeros(l0[s][j2])) >= 0) ? res[0] : -1).get() instanceof IntBinaryOperator nx
                && Optional.<IntBinaryOperator>of((s, x) -> x >= 0 && ((Long) (l0[s][x >> 6] & -1L >>> ~x) instanceof Long w0 && w0 != 0 && (res[0] = (x >> 6 << 6) + 63 - Long.numberOfLeadingZeros(w0)) >= 0
                        || (Integer) ((x >> 6) - 1) instanceof Integer y1 && y1 >= 0 && (Long) (l1[s][y1 >> 6] & -1L >>> ~y1) instanceof Long w1 && w1 != 0 && (Integer) ((y1 >> 6 << 6) + 63 - Long.numberOfLeadingZeros(w1)) instanceof Integer j1 && (res[0] = (j1 << 6) + 63 - Long.numberOfLeadingZeros(l0[s][j1])) >= 0
                        || (Integer) (((x >> 6) - 1 >> 6) - 1) instanceof Integer z2 && z2 >= 0 && (Long) (l2[s] & -1L >>> ~z2) instanceof Long w2 && w2 != 0 && (Integer) (63 - Long.numberOfLeadingZeros(w2)) instanceof Integer k2 && (Integer) ((k2 << 6) + 63 - Long.numberOfLeadingZeros(l1[s][k2])) instanceof Integer j2 && (res[0] = (j2 << 6) + 63 - Long.numberOfLeadingZeros(l0[s][j2])) >= 0) ? res[0] : -1).get() instanceof IntBinaryOperator pv
                && Optional.<IntBinaryOperator>of((x, d) -> (Integer) ((x >> 6) + 1) instanceof Integer b1 && (wb[Math.min(b1, 4097)] += d) >= 0
                        && (Integer) (b1 + (b1 & -b1)) instanceof Integer b2 && (wb[Math.min(b2, 4097)] += d) >= 0
                        && (Integer) (b2 + (b2 & -b2)) instanceof Integer b3 && (wb[Math.min(b3, 4097)] += d) >= 0
                        && (Integer) (b3 + (b3 & -b3)) instanceof Integer b4 && (wb[Math.min(b4, 4097)] += d) >= 0
                        && (Integer) (b4 + (b4 & -b4)) instanceof Integer b5 && (wb[Math.min(b5, 4097)] += d) >= 0
                        && (Integer) (b5 + (b5 & -b5)) instanceof Integer b6 && (wb[Math.min(b6, 4097)] += d) >= 0
                        && (Integer) (b6 + (b6 & -b6)) instanceof Integer b7 && (wb[Math.min(b7, 4097)] += d) >= 0
                        && (Integer) (b7 + (b7 & -b7)) instanceof Integer b8 && (wb[Math.min(b8, 4097)] += d) >= 0
                        && (Integer) (b8 + (b8 & -b8)) instanceof Integer b9 && (wb[Math.min(b9, 4097)] += d) >= 0
                        && (Integer) (b9 + (b9 & -b9)) instanceof Integer b10 && (wb[Math.min(b10, 4097)] += d) >= 0
                        && (Integer) (b10 + (b10 & -b10)) instanceof Integer b11 && (wb[Math.min(b11, 4097)] += d) >= 0
                        && (Integer) (b11 + (b11 & -b11)) instanceof Integer b12 && (wb[Math.min(b12, 4097)] += d) >= 0
                        && (Integer) (b12 + (b12 & -b12)) instanceof Integer b13 && (wb[Math.min(b13, 4097)] += d) >= 0 ? 1 : 0).get() instanceof IntBinaryOperator wupd
                && Optional.<IntUnaryOperator>of(x -> x < 0 ? 0 : (Integer) (x >> 6) instanceof Integer a1 && (Integer) (a1 & a1 - 1) instanceof Integer a2 && (Integer) (a2 & a2 - 1) instanceof Integer a3 && (Integer) (a3 & a3 - 1) instanceof Integer a4 && (Integer) (a4 & a4 - 1) instanceof Integer a5 && (Integer) (a5 & a5 - 1) instanceof Integer a6 && (Integer) (a6 & a6 - 1) instanceof Integer a7 && (Integer) (a7 & a7 - 1) instanceof Integer a8 && (Integer) (a8 & a8 - 1) instanceof Integer a9 && (Integer) (a9 & a9 - 1) instanceof Integer a10 && (Integer) (a10 & a10 - 1) instanceof Integer a11 ? wb[a1] + wb[a2] + wb[a3] + wb[a4] + wb[a5] + wb[a6] + wb[a7] + wb[a8] + wb[a9] + wb[a10] + wb[a11] + Long.bitCount(l0[0][x >> 6] & -1L >>> ~x) : 0).get() instanceof IntUnaryOperator wq
                && Optional.<IntPredicate>of(i -> (Integer) Arrays.binarySearch(ys, v[2 + 4 * i]) instanceof Integer r && (Integer) pv.applyAsInt(0, r - 1) instanceof Integer a && add.applyAsInt(0, r) > 0 && (idAt[r] = i) >= 0 && wupd.applyAsInt(r, 1) > 0 && add.applyAsInt(1, r) > 0 && (a < 0 || add.applyAsInt(1, a) > 0)).get() instanceof IntPredicate ins
                && Optional.<IntPredicate>of(i -> (Integer) Arrays.binarySearch(ys, v[2 + 4 * i]) instanceof Integer q1 && (Integer) (q1 >= 0 ? q1 : -q1 - 1) instanceof Integer lo && (Integer) Arrays.binarySearch(ys, v[4 + 4 * i]) instanceof Integer q2 && (Integer) (q2 >= 0 ? q2 : -q2 - 2) instanceof Integer hi && lo <= hi && (cnt[i] = wq.applyAsInt(hi) - wq.applyAsInt(lo - 1)) >= 0 && (Integer) nx.applyAsInt(0, lo) instanceof Integer f && f >= 0 && f <= hi && un.applyAsInt(i, idAt[f]) >= 0
                        && IntStream.generate(() -> 0).anyMatch(z -> !((Integer) nx.applyAsInt(1, f) instanceof Integer u && u >= 0 && (Integer) nx.applyAsInt(0, u + 1) instanceof Integer w && w >= 0 && w <= hi && un.applyAsInt(idAt[u], idAt[w]) >= 0 && del.applyAsInt(1, u) >= 0))).get() instanceof IntPredicate vert
                && Optional.<IntPredicate>of(i -> (Integer) Arrays.binarySearch(ys, v[2 + 4 * i]) instanceof Integer r && (Integer) pv.applyAsInt(0, r - 1) instanceof Integer a && (Integer) nx.applyAsInt(0, r + 1) instanceof Integer b && del.applyAsInt(0, r) >= 0 && wupd.applyAsInt(r, -1) > 0 && (a < 0 || b < 0 || (l0[1][r >> 6] >> r & 1L) == 0 || add.applyAsInt(1, a) > 0) && del.applyAsInt(1, r) >= 0).get() instanceof IntPredicate rm
                && LongStream.of(ev).allMatch(k -> (Integer) (int) (k & 262143) instanceof Integer i && (Integer) (int) (k >> 18 & 3) instanceof Integer t && ((t == 0 ? ins.test(i) : t == 1 ? vert.test(i) : rm.test(i)) || true))
                && new long[n] instanceof long[] tot
                && IntStream.range(0, n).allMatch(i -> (Integer) fr.get().applyAsInt(i) instanceof Integer r && (tot[r] += Math.abs(v[3 + 4 * i] - (long) v[1 + 4 * i]) + Math.abs(v[4 + 4 * i] - (long) v[2 + 4 * i]) + 1 - cnt[i]) > Long.MIN_VALUE)
                && (Long) (LongStream.of(tot).max().getAsLong() - 1) instanceof Long ans ? ans : "");
    }
}
