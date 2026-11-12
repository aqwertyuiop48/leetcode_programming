
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Long) Long.parseLong(tk.nextToken()) instanceof Long w
            && IntStream.range(0, n).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}).sorted(Comparator.comparingInt(x -> x[1])).toArray(int[][]::new) instanceof int[][] us
            && Arrays.stream(us).mapToInt(x -> x[0]).distinct().sorted().toArray() instanceof int[] av && (Integer) av.length instanceof Integer K && (Integer) 192 instanceof Integer B && (Integer) ((K + B - 1) / B) instanceof Integer nb
            && Arrays.stream(av).asLongStream().toArray() instanceof long[] X && Arrays.stream(us).mapToInt(x -> Arrays.binarySearch(av, x[0])).toArray() instanceof int[] rk && (Integer) us[n - 1][1] instanceof Integer maxb
            && new int[maxb + 3] instanceof int[] cb && IntStream.range(0, n).map(i -> ++cb[us[i][1] + 1]).sum() >= 0 && IntStream.range(1, maxb + 3).map(c -> cb[c] += cb[c - 1]).sum() >= 0
            && new long[K] instanceof long[] Y && new long[nb * B] instanceof long[] hx && new long[nb * B] instanceof long[] hy && new int[nb] instanceof int[] hs && new int[nb] instanceof int[] hp && new int[nb] instanceof int[] ins
            && new long[1] instanceof long[] run && new long[1] instanceof long[] bv && new long[1] instanceof long[] ba && new long[1] instanceof long[] tmp && new long[4 * nb] instanceof long[] rc
            && ((IntPredicate) q -> (rc[4 * q] = hx[q * B + hp[q]]) >= 0 && (rc[4 * q + 1] = hy[q * B + hp[q]]) >= 0 && (rc[4 * q + 2] = hp[q] + 1 < hs[q] ? hx[q * B + hp[q] + 1] : 0) >= 0 && (rc[4 * q + 3] = hp[q] + 1 < hs[q] ? hy[q * B + hp[q] + 1] : -4000000000000000000L) > Long.MIN_VALUE) instanceof IntPredicate sync
            && ((IntBinaryOperator) (q, j) -> (hs[q] >= 2 && (Y[j] - hy[q * B + hs[q] - 2]) * (hx[q * B + hs[q] - 1] - hx[q * B + hs[q] - 2]) > (hy[q * B + hs[q] - 1] - hy[q * B + hs[q] - 2]) * (X[j] - hx[q * B + hs[q] - 2]) && --hs[q] >= 0) ? 1 : 0) instanceof IntBinaryOperator pop
            && ((IntBinaryOperator) (q, r) -> ((hs[q] = 0) == 0 && (hp[q] = 0) == 0 && IntStream.range(q * B, Math.min(K, (q + 1) * B)).map(j -> ((j <= r ? (Y[j] += X[j]) : 0) >= 0
                && ((pop.applyAsInt(q, j) > 0 && pop.applyAsInt(q, j) > 0 && pop.applyAsInt(q, j) > 0 && IntStream.range(0, B).anyMatch(t -> pop.applyAsInt(q, j) <= 0)) || true)
                && (hx[q * B + hs[q]] = X[j]) >= 0 && (hy[q * B + hs[q]] = Y[j]) >= 0 && ++hs[q] > 0) ? 0 : 0).sum() == 0 && sync.test(q)) ? 0 : -1) instanceof IntBinaryOperator bld
            && ((IntPredicate) q -> rc[4 * q + 3] + run[0] * rc[4 * q + 2] > rc[4 * q + 1] + run[0] * rc[4 * q] && ++hp[q] > 0 && sync.test(q)) instanceof IntPredicate adv
            && IntStream.range(0, nb).map(q -> bld.applyAsInt(q, -1)).sum() == 0
            ? IntStream.rangeClosed(0, maxb + 1).mapToObj(c -> (c == 0 || cb[c] == cb[c - 1] || (IntStream.range(cb[c - 1], cb[c]).map(i -> (++ins[rk[i] / B] > 0 && bld.applyAsInt(rk[i] / B, rk[i]) >= 0) ? 0 : 0).sum() == 0
                    && (bv[0] = 0) == 0 && (ba[0] = 0) == 0 && (run[0] = 0) == 0
                    && IntStream.range(0, nb).map(i -> nb - 1 - i).map(q -> (((adv.test(q) && adv.test(q) && IntStream.range(0, B).anyMatch(t -> !adv.test(q))) || true)
                        && (tmp[0] = rc[4 * q + 1] + run[0] * rc[4 * q]) >= 0 && (tmp[0] < bv[0] || ((bv[0] = tmp[0]) >= 0 && (ba[0] = rc[4 * q]) >= 0)) && (run[0] += ins[q]) >= 0) ? 0 : 0).sum() == 0))
                ? ((long) c * w * (n - cb[c]) + bv[0]) + " " + (bv[0] > 0 ? ba[0] : 0) : "").collect(Collectors.joining("\n")) : "");
    }
}



