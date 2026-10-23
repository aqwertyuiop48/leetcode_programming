import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> sc.next().chars().map(ch -> ch == 'R' ? 1 : ch == 'G' ? 2 : 3).reduce(0, (x, y) -> x * 4 + y)).toArray(Integer[]::new) instanceof Integer[] rows
            && ((IntUnaryOperator) cd -> Math.min(cd, ((cd & 3) << 4) | (cd & 12) | (cd >> 4 & 3))) instanceof IntUnaryOperator canon
            && ((IntPredicate) cd -> (cd >> 4 & 3) != 0 && (cd >> 2 & 3) != 0 && (cd & 3) != 0 || ((cd >> 2 & 3) != 0 && ((cd >> 4 & 3) != 0 ? 1 : 0) + ((cd & 3) != 0 ? 1 : 0) == 1)) instanceof IntPredicate live
            && IntStream.range(1, 64).filter(cd -> canon.applyAsInt(cd) == cd && live.test(cd)).toArray() instanceof int[] cs
            && IntStream.range(0, 64).map(cd -> cd == 0 ? -1 : Math.max(-1, Arrays.binarySearch(cs, canon.applyAsInt(cd)))).toArray() instanceof int[] typeOf
            && ((IntToLongFunction) f -> f < 0 ? 0L : f < 16 ? 1L << (4 * f) : 0L) instanceof IntToLongFunction fa
            && ((IntToLongFunction) f -> f >= 16 ? 1L << (4 * (f - 16)) : 0L) instanceof IntToLongFunction fb
            && IntStream.range(0, cs.length).mapToObj(t -> IntStream.range(1, 4).mapToObj(col -> IntStream.range(0, 3).map(p -> (cs[t] >> (4 - 2 * p) & 3) != col || (cs[t] & ~(3 << (4 - 2 * p))) == 0
                    || ((cs[t] & ~(3 << (4 - 2 * p))) >> 2 & 3) == 0 && (((cs[t] & ~(3 << (4 - 2 * p))) >> 4 & 3) != 0 ? 1 : 0) + (((cs[t] & ~(3 << (4 - 2 * p))) & 3) != 0 ? 1 : 0) == 1 ? -3
                    : live.test(canon.applyAsInt(cs[t] & ~(3 << (4 - 2 * p)))) ? typeOf[canon.applyAsInt(cs[t] & ~(3 << (4 - 2 * p)))] : -2).toArray()).toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] rm
            && IntStream.range(0, cs.length).mapToObj(t -> IntStream.range(0, 3).mapToObj(c3 -> IntStream.range(0, 3).filter(p -> rm[t][c3][p] != -3 && IntStream.range(0, p).noneMatch(q -> rm[t][c3][q] == rm[t][c3][p])).toArray()).toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] vp
            && IntStream.range(0, cs.length).mapToObj(t -> IntStream.range(0, 3).mapToObj(c3 -> IntStream.range(0, 3).map(p -> rm[t][c3][p] != -3 && IntStream.range(0, p).noneMatch(q -> rm[t][c3][q] == rm[t][c3][p]) ? 1 : 0).toArray()).toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] ok
            && IntStream.range(0, 64).map(tp -> (tp >> 4 & 3) != 0 && (tp >> 2 & 3) != 0 && (tp & 3) != 0 ? 1 : 0).toArray() instanceof int[] full
            && IntStream.range(0, 64).map(tp -> full[tp] == 1 && tp == canon.applyAsInt(tp) ? typeOf[tp] : -1).toArray() instanceof int[] topType
            && IntStream.range(0, 64).mapToObj(tp -> IntStream.range(1, 4).mapToObj(col -> IntStream.range(0, 3).filter(q -> full[tp] == 1 || (tp >> (4 - 2 * q) & 3) == 0)
                    .map(q -> canon.applyAsInt(full[tp] == 1 ? col << (4 - 2 * q) : tp | (col << (4 - 2 * q)))).distinct().toArray()).toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] tnext
            && IntStream.range(0, cs.length).mapToObj(t -> IntStream.range(0, 3).mapToObj(c3 -> IntStream.range(0, 3).mapToLong(p -> rm[t][c3][p] == -3 ? 0L : fa.applyAsLong(rm[t][c3][p]) - fa.applyAsLong(t)).toArray()).toArray(long[][]::new)).toArray(long[][][]::new) instanceof long[][][] mvA
            && IntStream.range(0, cs.length).mapToObj(t -> IntStream.range(0, 3).mapToObj(c3 -> IntStream.range(0, 3).mapToLong(p -> rm[t][c3][p] == -3 ? 0L : fb.applyAsLong(rm[t][c3][p]) - fb.applyAsLong(t)).toArray()).toArray(long[][]::new)).toArray(long[][][]::new) instanceof long[][][] mvB
            && IntStream.range(0, 64).mapToObj(tp -> IntStream.range(0, 3).mapToObj(c3 -> IntStream.of(tnext[tp][c3]).mapToLong(nt -> fa.applyAsLong(topType[tp])).toArray()).toArray(long[][]::new)).toArray(long[][][]::new) instanceof long[][][] tA
            && IntStream.range(0, 64).mapToObj(tp -> IntStream.range(0, 3).mapToObj(c3 -> IntStream.of(tnext[tp][c3]).mapToLong(nt -> fb.applyAsLong(topType[tp]) + ((long) (nt - tp) << 56)).toArray()).toArray(long[][]::new)).toArray(long[][][]::new) instanceof long[][][] tB
            && (Integer) (1 << 22) instanceof Integer CAP && new long[CAP] instanceof long[] kk && new double[CAP] instanceof double[] val && new Object[1] instanceof Object[] ref
            && ((LongBinaryOperator) (a, b) -> ((((a * 0x9E3779B97F4A7C15L) ^ ((a * 0x9E3779B97F4A7C15L) >>> 32)) + b * 0xC2B2AE3D27D4EB4FL) ^ ((((a * 0x9E3779B97F4A7C15L) ^ ((a * 0x9E3779B97F4A7C15L) >>> 32)) + b * 0xC2B2AE3D27D4EB4FL) >>> 29)) * 0xBF58476D1CE4E5B9L) instanceof LongBinaryOperator hraw
            && ((LongBinaryOperator) (a, b) -> (hraw.applyAsLong(a, b) ^ (hraw.applyAsLong(a, b) >>> 29)) | 1L) instanceof LongBinaryOperator hf
            && ((LongToIntFunction) fp -> kk[(int) ((fp >>> 20) & (CAP - 1))] == fp || kk[(int) ((fp >>> 20) & (CAP - 1))] == 0 ? (int) ((fp >>> 20) & (CAP - 1))
                : (IntStream.iterate((int) ((fp >>> 20) & (CAP - 1)), i -> kk[i] != 0 && kk[i] != fp, i -> (i + 1) & (CAP - 1)).reduce((x, y) -> y).getAsInt() + 1) & (CAP - 1)) instanceof LongToIntFunction probe
            && (ref[0] = (ToDoubleFunction<long[]>) st -> (st[2] = hf.applyAsLong(st[0], st[1])) == st[2] && (st[3] = probe.applyAsInt(st[2])) == st[3] && kk[(int) st[3]] == st[2] ? val[(int) st[3]]
                : new long[2] instanceof long[] m
                    && (m[0] = st[1] >>> 56 & 63) == m[0] && new double[]{1e18, 1e18, 1e18} instanceof double[] b3 && new long[4] instanceof long[] sc2
                    && ((IntToDoubleFunction) k -> (sc2[0] = st[0] + mvA[k / 27][k / 9 % 3][k / 3 % 3] + tA[(int) m[0]][k / 9 % 3][k % 3]) == sc2[0] && (sc2[1] = st[1] + mvB[k / 27][k / 9 % 3][k / 3 % 3] + tB[(int) m[0]][k / 9 % 3][k % 3]) == sc2[1]
                            ? ((ToDoubleFunction<long[]>) ref[0]).applyAsDouble(sc2) : 1e18) instanceof IntToDoubleFunction ev
                    && new IntPredicate[1] instanceof IntPredicate[] loop
                    && (loop[0] = q -> q == 81 || (((int) ((q % 27 < 16 ? st[0] : st[1]) >>> (4 * (q % 27 & 15))) & 15) == 0
                        || (Integer) (vp[q % 27][q / 27].length) instanceof Integer n1 && (Integer) (tnext[(int) m[0]][q / 27].length) instanceof Integer n2 && (Integer) ((q % 27 * 3 + q / 27) * 9) instanceof Integer bs
                        && (b3[q / 27] = Math.min(b3[q / 27], Math.min(Math.min(Math.min(
                            n1 > 0 && n2 > 0 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][0] + 0) : 1e18, n1 > 0 && n2 > 1 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][0] + 1) : 1e18),
                            Math.min(n1 > 0 && n2 > 2 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][0] + 2) : 1e18, n1 > 1 && n2 > 0 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][1] + 0) : 1e18)),
                            Math.min(Math.min(n1 > 1 && n2 > 1 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][1] + 1) : 1e18, n1 > 1 && n2 > 2 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][1] + 2) : 1e18),
                            Math.min(n1 > 2 && n2 > 0 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][2] + 0) : 1e18, Math.min(n1 > 2 && n2 > 1 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][2] + 1) : 1e18, n1 > 2 && n2 > 2 ? ev.applyAsDouble(bs + 3 * vp[q % 27][q / 27][2] + 2) : 1e18)))))) <= 1e18)
                        && loop[0].test(q + 1)) != null && loop[0].test(0)
                    && new double[]{1.0 / 6 + (b3[0] > 1e17 ? 1.0 / 6 : 0) + (b3[1] > 1e17 ? 2.0 / 6 : 0) + (b3[2] > 1e17 ? 2.0 / 6 : 0), (b3[0] > 1e17 ? 0 : b3[0] / 6) + (b3[1] > 1e17 ? 0 : b3[1] / 3) + (b3[2] > 1e17 ? 0 : b3[2] / 3)} instanceof double[] fr
                    && (fr[1] = fr[0] < 0.999999 ? (1 + fr[1]) / (1 - fr[0]) : 0.0) == fr[1]
                    && (kk[probe.applyAsInt(st[2])] = st[2]) != 0 && (val[probe.applyAsInt(st[2])] = fr[1]) == fr[1] ? fr[1] : 0.0) != null
            ? String.format("%.12f", ((ToDoubleFunction<long[]>) ref[0]).applyAsDouble(LongStream.of(
                IntStream.range(0, n - 1).mapToLong(i -> fa.applyAsLong(typeOf[canon.applyAsInt(rows[i])])).sum(),
                IntStream.range(0, n - 1).mapToLong(i -> fb.applyAsLong(typeOf[canon.applyAsInt(rows[i])])).sum() | ((long) canon.applyAsInt(rows[n - 1]) << 56), 0, 0).toArray())) : "");
    }
}
