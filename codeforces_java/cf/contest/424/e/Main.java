
import java.util.*;
import java.util.concurrent.*;
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
            && (Integer) cs.length instanceof Integer nt
            && IntStream.range(0, nt).mapToObj(t -> IntStream.range(1, 4).mapToObj(col -> IntStream.range(0, 3).map(p -> (cs[t] >> (4 - 2 * p) & 3) != col || (cs[t] & ~(3 << (4 - 2 * p))) == 0
                    || ((cs[t] & ~(3 << (4 - 2 * p))) >> 2 & 3) == 0 && (((cs[t] & ~(3 << (4 - 2 * p))) >> 4 & 3) != 0 ? 1 : 0) + (((cs[t] & ~(3 << (4 - 2 * p))) & 3) != 0 ? 1 : 0) == 1 ? -3
                    : live.test(canon.applyAsInt(cs[t] & ~(3 << (4 - 2 * p)))) ? typeOf[canon.applyAsInt(cs[t] & ~(3 << (4 - 2 * p)))] : -2).toArray()).toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] rm
            && IntStream.range(0, nt).mapToObj(t -> IntStream.range(0, 3).mapToObj(c3 -> IntStream.range(0, 3).filter(p -> rm[t][c3][p] != -3 && IntStream.range(0, p).noneMatch(q -> rm[t][c3][q] == rm[t][c3][p])).toArray()).toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] vp
            && IntStream.range(0, 64).map(tp -> (tp >> 4 & 3) != 0 && (tp >> 2 & 3) != 0 && (tp & 3) != 0 ? 1 : 0).toArray() instanceof int[] full
            && IntStream.range(0, 64).map(tp -> full[tp] == 1 && tp == canon.applyAsInt(tp) ? typeOf[tp] : -1).toArray() instanceof int[] topType
            && IntStream.range(0, 64).mapToObj(tp -> IntStream.range(1, 4).mapToObj(col -> IntStream.range(0, 3).filter(q -> full[tp] == 1 || (tp >> (4 - 2 * q) & 3) == 0)
                    .map(q -> canon.applyAsInt(full[tp] == 1 ? col << (4 - 2 * q) : tp | (col << (4 - 2 * q)))).distinct().toArray()).toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] tnext
            && IntStream.range(0, nt * 3).map(z -> vp[z / 3][z % 3].length).toArray() instanceof int[] nR
            && IntStream.range(0, 192).map(z -> tnext[z / 3][z % 3].length).toArray() instanceof int[] nN
            && IntStream.range(0, nt * 9).mapToLong(z -> z % 3 < vp[z / 9][z / 3 % 3].length ? fa.applyAsLong(rm[z / 9][z / 3 % 3][vp[z / 9][z / 3 % 3][z % 3]]) - fa.applyAsLong(z / 9) : 0L).toArray() instanceof long[] dA
            && IntStream.range(0, nt * 9).mapToLong(z -> z % 3 < vp[z / 9][z / 3 % 3].length ? fb.applyAsLong(rm[z / 9][z / 3 % 3][vp[z / 9][z / 3 % 3][z % 3]]) - fb.applyAsLong(z / 9) : 0L).toArray() instanceof long[] dB
            && IntStream.range(0, 576).mapToLong(z -> z % 3 < tnext[z / 9][z / 3 % 3].length ? fa.applyAsLong(topType[z / 9]) : 0L).toArray() instanceof long[] tA
            && IntStream.range(0, 576).mapToLong(z -> z % 3 < tnext[z / 9][z / 3 % 3].length ? fb.applyAsLong(topType[z / 9]) + ((long) (tnext[z / 9][z / 3 % 3][z % 3] - z / 9) << 56) : 0L).toArray() instanceof long[] tB
            && IntStream.range(0, nt * 64).mapToObj(id -> IntStream.range(0, 27).filter(code -> code / 3 % 3 < nR[id / 64 * 3 + code / 9] && code % 3 < nN[id % 64 * 3 + code / 9]).toArray()).toArray(int[][]::new) instanceof int[][] codes
            && IntStream.range(0, nt * 64).map(id -> codes[id].length).toArray() instanceof int[] cmbN
            && IntStream.range(0, nt * 64 * 27).map(z -> z % 27 < codes[z / 27].length ? codes[z / 27][z % 27] / 9 : 0).toArray() instanceof int[] cmbC
            && IntStream.range(0, nt * 64 * 27).mapToLong(z -> z % 27 < codes[z / 27].length
                ? dA[(z / 27 / 64 * 3 + codes[z / 27][z % 27] / 9) * 3 + codes[z / 27][z % 27] / 3 % 3] + tA[(z / 27 % 64 * 3 + codes[z / 27][z % 27] / 9) * 3 + codes[z / 27][z % 27] % 3] : 0L).toArray() instanceof long[] cmbA
            && IntStream.range(0, nt * 64 * 27).mapToLong(z -> z % 27 < codes[z / 27].length
                ? dB[(z / 27 / 64 * 3 + codes[z / 27][z % 27] / 9) * 3 + codes[z / 27][z % 27] / 3 % 3] + tB[(z / 27 % 64 * 3 + codes[z / 27][z % 27] / 9) * 3 + codes[z / 27][z % 27] % 3] : 0L).toArray() instanceof long[] cmbB
            && (Integer) (1 << 22) instanceof Integer CAP && new long[3 * CAP] instanceof long[] tab
            && new long[4096] instanceof long[] FA && new long[4096] instanceof long[] FB && new int[4096] instanceof int[] FS && new double[12288] instanceof double[] FV
            && ((LongUnaryOperator) x -> ((x ^ (x >>> 29)) * 0xBF58476D1CE4E5B9L) ^ (((x ^ (x >>> 29)) * 0xBF58476D1CE4E5B9L) >>> 32)) instanceof LongUnaryOperator mix
            && ((LongUnaryOperator) x -> (x | x >>> 1 | x >>> 2 | x >>> 3) & 0x1111111111111111L) instanceof LongUnaryOperator nz
            && new IntBinaryOperator[3] instanceof IntBinaryOperator[] g && new IntToDoubleFunction[1] instanceof IntToDoubleFunction[] e
            && (g[0] = (d, s) -> tab[3 * s + 1] == 0 || tab[3 * s] == FA[d] && tab[3 * s + 1] == FB[d] ? s : g[0].applyAsInt(d, (s + 1) & (CAP - 1))) != null
            && (g[1] = (d, m) -> m == 0 ? 0 : g[2].applyAsInt(d, Integer.numberOfTrailingZeros(m) << 5) + g[1].applyAsInt(d, m & (m - 1))) != null
            && (g[2] = (d, x) -> (Integer) ((x >> 5) * 64 + (int) (FB[d] >>> 56)) instanceof Integer id && (x & 31) < cmbN[id]
                ? (Integer) (id * 27 + (x & 31)) instanceof Integer q && (Integer) (3 * d + cmbC[q]) instanceof Integer vi
                    && (FA[d + 1] = FA[d] + cmbA[q]) == FA[d + 1] && (FB[d + 1] = FB[d] + cmbB[q]) == FB[d + 1]
                    && (FV[vi] = Math.min(FV[vi], e[0].applyAsDouble(d + 1))) == FV[vi] ? g[2].applyAsInt(d, x + 1) : 0
                : 0) != null
            && (e[0] = d -> (FS[d] = g[0].applyAsInt(d, (int) (mix.applyAsLong(FA[d] * 0x9E3779B97F4A7C15L + FB[d] * 0xC2B2AE3D27D4EB4FL) & (CAP - 1)))) >= 0 && tab[3 * FS[d] + 1] != 0
                ? Double.longBitsToDouble(tab[3 * FS[d] + 2])
                : (FV[3 * d] = 1e18) > 0 && (FV[3 * d + 1] = 1e18) > 0 && (FV[3 * d + 2] = 1e18) > 0
                    && g[1].applyAsInt(d, (int) (Long.compress(nz.applyAsLong(FA[d]), 0x1111111111111111L) | Long.compress(nz.applyAsLong(FB[d] & 0xFFFFFFFFFFFFFFL), 0x1111111111111111L) << 16)) >= 0
                    && (Double) (1.0 / 6 + (FV[3 * d] > 1e17 ? 1.0 / 6 : 0) + (FV[3 * d + 1] > 1e17 ? 2.0 / 6 : 0) + (FV[3 * d + 2] > 1e17 ? 2.0 / 6 : 0)) instanceof Double f0
                    && (Double) ((FV[3 * d] > 1e17 ? 0 : FV[3 * d] / 6) + (FV[3 * d + 1] > 1e17 ? 0 : FV[3 * d + 1] / 3) + (FV[3 * d + 2] > 1e17 ? 0 : FV[3 * d + 2] / 3)) instanceof Double f1
                    && (Double) (f0 < 0.999999 ? (1 + f1) / (1 - f0) : 0.0) instanceof Double r
                    && (FS[d] = g[0].applyAsInt(d, FS[d])) >= 0 && (tab[3 * FS[d]] = FA[d]) == FA[d] && (tab[3 * FS[d] + 1] = FB[d]) == FB[d] && (tab[3 * FS[d] + 2] = Double.doubleToRawLongBits(r)) == tab[3 * FS[d] + 2] ? r : 0.0) != null
            && (FA[0] = IntStream.range(0, n - 1).mapToLong(i -> fa.applyAsLong(typeOf[canon.applyAsInt(rows[i])])).sum()) == FA[0]
            && (FB[0] = IntStream.range(0, n - 1).mapToLong(i -> fb.applyAsLong(typeOf[canon.applyAsInt(rows[i])])).sum() | ((long) canon.applyAsInt(rows[n - 1]) << 56)) == FB[0]
            ? String.format("%.12f", CompletableFuture.supplyAsync(() -> e[0].applyAsDouble(0), r -> new Thread(null, r, "t", 1L << 29).start()).join()) : "");
    }
}



