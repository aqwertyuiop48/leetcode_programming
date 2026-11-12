import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] <= 32).findFirst().getAsInt()) instanceof Integer n
            && Integer.valueOf(IntStream.range(n + 1, raw.length).filter(i -> raw[i] >= 48).reduce(0, (x, i) -> x * 10 + raw[i] - 48)) instanceof Integer k
            && new byte[n] instanceof byte[] rb && IntStream.range(0, n).filter(i -> (rb[i] = raw[n - 1 - i]) < 0).count() == 0
            && new String[1] instanceof String[] res
            && (k == 1
                ? IntStream.range(0, n).filter(i -> raw[i] != rb[i]).findFirst() instanceof OptionalInt df && (res[0] = df.isPresent() && raw[df.getAsInt()] > rb[df.getAsInt()] ? new String(rb, java.nio.charset.StandardCharsets.ISO_8859_1) : new String(raw, 0, n, java.nio.charset.StandardCharsets.ISO_8859_1)) != null
                : new int[]{0, 1, 0, 0} instanceof int[] ds && new int[n / 2 + 100] instanceof int[] bs && new int[n / 2 + 100] instanceof int[] bl && new int[n / 2 + 100] instanceof int[] bc
                    && (IntStream.range(0, 4 * n + 10).allMatch(t -> ds[0] >= n ? false
                        : ds[1] < n && rb[ds[2]] <= rb[ds[1]]
                            ? (ds[2] = rb[ds[2]] < rb[ds[1]] ? ds[0] : ds[2] + 1) >= 0 & ++ds[1] > 0
                            : (bs[ds[3]] = ds[0]) >= 0 & (bl[ds[3]] = ds[1] - ds[2]) > 0 & (bc[ds[3]] = (ds[2] - ds[0]) / (ds[1] - ds[2]) + 1) > 0
                                & (ds[0] += bc[ds[3]] * bl[ds[3]]) > 0 & (ds[1] = ds[0] + 1) > 0 & (ds[2] = ds[0]) >= 0 & ++ds[3] > 0) | true)
                    && new byte[n] instanceof byte[] ob && new int[]{ds[3], k, n, 0} instanceof int[] gs
                    && (IntStream.range(0, ds[3]).allMatch(t -> gs[0] > 0 && gs[1] >= 3 && Integer.valueOf(gs[0] - 1) instanceof Integer q
                        && Stream.of(0).peek(pk -> System.arraycopy(rb, bs[q], ob, gs[3], gs[2] - bs[q])).findFirst().isPresent()
                        && (gs[3] += gs[2] - bs[q]) > 0 && (gs[2] = bs[q]) >= 0 && ((bl[q] == 1 && q >= 1 && bl[q - 1] == 1) || --gs[1] >= 0) && --gs[0] >= 0) | true)
                    && (gs[0] == 0
                        || Integer.valueOf(gs[2]) instanceof Integer L && Integer.valueOf(gs[0]) instanceof Integer m && Integer.valueOf(gs[3]) instanceof Integer pos
                            && new int[]{0, 1, 0} instanceof int[] rs && ((IntUnaryOperator) x -> x >= L ? x - L : x) instanceof IntUnaryOperator ix
                            && (IntStream.range(0, 4 * L + 10).allMatch(t -> rs[0] < L && rs[1] < L && rs[2] < L
                                ? rb[ix.applyAsInt(rs[0] + rs[2])] == rb[ix.applyAsInt(rs[1] + rs[2])] ? ++rs[2] > 0
                                    : ((rb[ix.applyAsInt(rs[0] + rs[2])] > rb[ix.applyAsInt(rs[1] + rs[2])] ? (rs[0] += rs[2] + 1) > 0 : (rs[1] += rs[2] + 1) > 0) & (rs[0] == rs[1] ? ++rs[1] > 0 : true) & (rs[2] = 0) == 0)
                                : false) | true)
                            && new int[]{1} instanceof int[] cn && new int[64] instanceof int[] ci && (ci[0] = L - bs[m - 1]) > 0
                            && (IntStream.range(0, m - 1).allMatch(t -> Integer.valueOf(m - 2 - t) instanceof Integer jj && IntStream.range(0, L - bs[jj + 1]).allMatch(q -> rb[bs[jj] + q] == rb[bs[jj + 1] + q])
                                && cn[0] < 63 && (ci[cn[0]++] = L - bs[jj]) > 0) | true)
                            && Integer.valueOf(2 * L + 1) instanceof Integer NN && new byte[NN] instanceof byte[] comb && new int[NN] instanceof int[] z && new int[]{1, -1, 0, 0} instanceof int[] zs
                            && Stream.of(0).peek(pk -> System.arraycopy(rb, 0, comb, 0, L)).peek(pk -> System.arraycopy(raw, n - L, comb, L + 1, L)).findFirst().isPresent()
                            && (IntStream.range(0, 2 * NN + 10).allMatch(t -> zs[0] >= NN ? false
                                : (zs[1] >= 0 || (zs[1] = zs[0] < zs[3] ? Math.min(zs[3] - zs[0], z[zs[0] - zs[2]]) : 0) >= 0)
                                    && (zs[0] + zs[1] < NN && comb[zs[1]] == comb[zs[0] + zs[1]] ? ++zs[1] > 0
                                        : (z[zs[0]] = zs[1]) >= 0 & (zs[0] + zs[1] > zs[3] ? (zs[2] = zs[0]) >= 0 & (zs[3] = zs[0] + zs[1]) > 0 : true) & ++zs[0] > 0 & (zs[1] = -1) < 0)) | true)
                            && new int[]{1} instanceof int[] db
                            && IntStream.rangeClosed(2, L).filter(i -> Integer.valueOf(db[0]) instanceof Integer b && Integer.valueOf(i - b) instanceof Integer d
                                && (z[L + 1 + b] < d ? comb[L + 1 + b + z[L + 1 + b]] < rb[z[L + 1 + b]] : z[d] < L - i && rb[z[d]] < rb[d + z[d]]) && (db[0] = i) > 0).count() >= 0
                            && ((IntBinaryOperator) (code, p) -> (code & 3) == 0 ? rb[ix.applyAsInt((code >> 2) + p)]
                                : (code & 3) == 1 ? raw[n - L + p]
                                : (code & 3) == 2 ? (p < (code >> 2) ? rb[L - (code >> 2) + p] : raw[n - L + p])
                                : (p < (code >> 2) ? raw[n - L + p] : rb[p - (code >> 2)])) instanceof IntBinaryOperator chr
                            && new int[]{1} instanceof int[] best
                            && Integer.valueOf(Math.min(rs[0], rs[1])) instanceof Integer sh
                            && IntStream.concat(IntStream.of(sh * 4, db[0] * 4 + 3), IntStream.range(0, cn[0]).map(t -> ci[t] * 4 + 2)).filter(cd -> IntStream.range(0, L).filter(p -> chr.applyAsInt(best[0], p) != chr.applyAsInt(cd, p)).findFirst() instanceof OptionalInt df2
                                && df2.isPresent() && chr.applyAsInt(cd, df2.getAsInt()) < chr.applyAsInt(best[0], df2.getAsInt()) && (best[0] = cd) >= 0).count() >= 0
                            && IntStream.range(0, L).filter(p -> (ob[pos + p] = (byte) chr.applyAsInt(best[0], p)) < 0).count() == 0)
                    && (res[0] = new String(ob, java.nio.charset.StandardCharsets.ISO_8859_1)) != null)
            ? res[0] : "");
    }
}
