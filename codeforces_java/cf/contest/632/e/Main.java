import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).filter(q -> raw[q] > 47 && raw[q] < 58 ? (st[0] = st[0] * 10 + raw[q] - 48) < 0
                : q > 0 && raw[q - 1] > 47 && raw[q - 1] < 58 && (v[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n && Integer.valueOf((int) v[1]) instanceof Integer k
            && Integer.valueOf((int) IntStream.rangeClosed(1, n).mapToLong(i -> v[1 + i]).min().getAsLong()) instanceof Integer mn
            && Integer.valueOf((int) IntStream.rangeClosed(1, n).mapToLong(i -> v[1 + i]).max().getAsLong() - mn) instanceof Integer M
            && Integer.valueOf(k * M) instanceof Integer D && Integer.valueOf(Math.max(8, Integer.highestOneBit(D) * 2)) instanceof Integer NR
            && new double[NR / 2] instanceof double[] cs && new double[NR / 2] instanceof double[] sn
            && IntStream.range(0, NR / 4).filter(j -> (cs[j] = Math.cos(2 * Math.PI * j / NR)) + (sn[j] = Math.sin(2 * Math.PI * j / NR)) > 9).count() >= 0
            && IntStream.range(NR / 4, NR / 2).filter(j -> (cs[j] = -sn[j - NR / 4]) + (sn[j] = cs[j - NR / 4]) > 9).count() >= 0
            && new double[NR + 64] instanceof double[] R && new double[NR / 2] instanceof double[] re && new double[NR / 2] instanceof double[] im
            && new double[NR / 2] instanceof double[] re2 && new double[NR / 2] instanceof double[] im2 && new int[NR / 2] instanceof int[] REV
            && new long[NR / 64 + 20] instanceof long[] BR && new long[NR / 64 + 20] instanceof long[] OUT
            && IntStream.rangeClosed(1, n).filter(i -> (R[(int) v[1 + i] - mn] = 1) > 9).count() >= 0
            && IntStream.rangeClosed(1, n).map(i -> (int) v[1 + i] - mn).filter(x -> x > 0).distinct().toArray() instanceof int[] bl
            && new double[12] instanceof double[] T && new int[3] instanceof int[] I && new int[]{M} instanceof int[] dg
            && IntStream.iterate(31 - Integer.numberOfLeadingZeros(k) - 1, t -> t >= 0, t -> t - 1).flatMap(t -> ((k >> t) & 1) == 1 ? IntStream.of(0, 1) : IntStream.of(0)).toArray() instanceof int[] ops
            && Arrays.stream(ops).allMatch(op -> op == 0
                ? Integer.valueOf(Math.max(2, Integer.highestOneBit(dg[0]) * 2)) instanceof Integer H && Integer.valueOf(31 - Integer.numberOfLeadingZeros(H)) instanceof Integer lh
                    && IntStream.range(0, H).filter(i -> (REV[i] = (REV[i >> 1] >> 1) | ((i & 1) << (lh - 1))) < 0).count() >= 0
                    && IntStream.range(0, H).filter(j -> (re[REV[j]] = R[2 * j]) + (im[REV[j]] = R[2 * j + 1]) > 9).count() >= 0
                    && IntStream.rangeClosed(1, lh).allMatch(s -> IntStream.range(0, H / 2).filter(idx ->
                        (I[0] = idx & ((1 << (s - 1)) - 1)) >= 0 && (I[1] = ((idx >> (s - 1)) << s) + I[0]) >= 0 && (I[2] = I[1] + (1 << (s - 1))) >= 0
                        && (T[10] = cs[I[0] * (NR >> s)]) + (T[11] = -sn[I[0] * (NR >> s)]) > -9
                        && (T[0] = re[I[2]] * T[10] - im[I[2]] * T[11]) + (T[1] = re[I[2]] * T[11] + im[I[2]] * T[10])
                            + (re[I[2]] = re[I[1]] - T[0]) + (im[I[2]] = im[I[1]] - T[1]) + (re[I[1]] += T[0]) + (im[I[1]] += T[1]) > 1e300).count() >= 0)
                    && IntStream.range(0, H).filter(kk -> (I[0] = (H - kk) & (H - 1)) >= 0
                        && (T[0] = (re[kk] + re[I[0]]) / 2) + (T[1] = (im[kk] - im[I[0]]) / 2) + (T[2] = (im[kk] + im[I[0]]) / 2) + (T[3] = (re[I[0]] - re[kk]) / 2) > 1e300
                        || (I[1] = (kk < (H >> 1) ? kk : kk - (H >> 1)) * (NR / H)) >= 0
                        && (T[4] = (kk < (H >> 1) ? cs[I[1]] : -cs[I[1]])) + (T[5] = (kk < (H >> 1) ? -sn[I[1]] : sn[I[1]])) > 1e300
                        || (T[6] = T[0] * T[0] - T[1] * T[1]) + (T[7] = 2 * T[0] * T[1]) + (T[8] = T[2] * T[2] - T[3] * T[3]) + (T[9] = 2 * T[2] * T[3]) > 1e300
                        || (re2[kk] = (T[6] + T[4] * T[8] - T[5] * T[9]) - 2 * (T[0] * T[3] + T[1] * T[2])) + (im2[kk] = -((T[7] + T[4] * T[9] + T[5] * T[8]) + 2 * (T[0] * T[2] - T[1] * T[3]))) > 1e300).count() >= 0
                    && IntStream.range(0, H).filter(kk -> (re[REV[kk]] = re2[kk]) + (im[REV[kk]] = im2[kk]) > 9).count() >= 0
                    && IntStream.rangeClosed(1, lh).allMatch(s -> IntStream.range(0, H / 2).filter(idx ->
                        (I[0] = idx & ((1 << (s - 1)) - 1)) >= 0 && (I[1] = ((idx >> (s - 1)) << s) + I[0]) >= 0 && (I[2] = I[1] + (1 << (s - 1))) >= 0
                        && (T[10] = cs[I[0] * (NR >> s)]) + (T[11] = -sn[I[0] * (NR >> s)]) > -9
                        && (T[0] = re[I[2]] * T[10] - im[I[2]] * T[11]) + (T[1] = re[I[2]] * T[11] + im[I[2]] * T[10])
                            + (re[I[2]] = re[I[1]] - T[0]) + (im[I[2]] = im[I[1]] - T[1]) + (re[I[1]] += T[0]) + (im[I[1]] += T[1]) > 1e300).count() >= 0)
                    && IntStream.range(0, H).filter(j -> (R[2 * j] = re[j] > H / 2.0 ? 1 : 0) + (R[2 * j + 1] = -im[j] > H / 2.0 ? 1 : 0) > 9).count() >= 0
                    && (dg[0] = 2 * dg[0]) >= 0
                : Integer.valueOf(dg[0] + M) instanceof Integer nd2 && Integer.valueOf((dg[0] >> 6) + 1) instanceof Integer W1 && Integer.valueOf((nd2 >> 6) + 2) instanceof Integer W2
                    && IntStream.range(0, W2 + 1).filter(w -> (BR[w] = 0L) + (OUT[w] = 0L) == 7).count() >= 0
                    && IntStream.range(0, W1).filter(w -> (BR[w] = IntStream.range(0, 64).filter(i -> R[w * 64 + i] > 0.5).mapToLong(i -> 1L << i).reduce(0L, (x, y) -> x | y)) == 7).count() >= 0
                    && IntStream.range(0, W1).filter(w -> (OUT[w] |= BR[w]) == 7).count() >= 0
                    && Arrays.stream(bl).allMatch(bb -> IntStream.range(0, W1).filter(w -> (OUT[w + (bb >> 6)] |= BR[w] << (bb & 63)) + ((bb & 63) == 0 ? 0L : (OUT[w + (bb >> 6) + 1] |= BR[w] >>> (64 - (bb & 63)))) == 7).count() >= 0)
                    && IntStream.range(0, nd2 + 1).filter(i -> (R[i] = (OUT[i >> 6] >>> (i & 63)) & 1L) == 7).count() >= 0
                    && (dg[0] = nd2) >= 0)
            ? IntStream.rangeClosed(0, D).filter(s -> R[s] > 0.5).mapToObj(s -> String.valueOf((long) s + (long) k * mn)).collect(Collectors.joining(" ")) : "");
    }
}
