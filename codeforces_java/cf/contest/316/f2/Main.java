
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] == 10).findFirst().orElse(raw.length)) instanceof Integer nl
            && new StringTokenizer(new String(raw, 0, nl)) instanceof StringTokenizer hd
            && Integer.valueOf(hd.nextToken()) instanceof Integer h && Integer.valueOf(hd.nextToken()) instanceof Integer w
            && Integer.valueOf((w + 63) / 64 + 2) instanceof Integer S && Integer.valueOf((h + 6) * S) instanceof Integer NW
            && new long[NW] instanceof long[] g && new int[2] instanceof int[] pos
            && IntStream.range(nl, raw.length).allMatch(i -> raw[i] < 48 || raw[i] > 49 || pos[1] >= h
                || ((raw[i] == 48 || (g[(pos[1] + 3) * S + 1 + (pos[0] >> 6)] |= 1L << pos[0]) != 0) && (++pos[0] < w || ((pos[0] = 0) == 0 && ++pos[1] > 0))))
            && new long[S] instanceof long[] ins
            && IntStream.range(0, S).allMatch(j -> ((ins[j] = Math.min(64 + w, 64 * j + 64) > Math.max(64, 64 * j)
                ? (Math.min(64 + w, 64 * j + 64) - Math.max(64, 64 * j) == 64 ? -1L : ((1L << (Math.min(64 + w, 64 * j + 64) - Math.max(64, 64 * j))) - 1) << (Math.max(64, 64 * j) - 64 * j)) : 0L) | 1L) != 0)
            && new long[NW] instanceof long[] bz && new long[NW] instanceof long[] az && new long[NW] instanceof long[] er && new long[NW] instanceof long[] dh
            && new long[NW] instanceof long[] op && new long[NW] instanceof long[] d1 && new long[NW] instanceof long[] dd && new long[NW] instanceof long[] rr
            && IntStream.range(3 * S, (h + 3) * S).allMatch(k -> ((bz[k] = ins[k % S] & ~g[k]) | 1L) != 0)
            && IntStream.range(3 * S, (h + 3) * S).allMatch(k -> ((az[k] = bz[k] | bz[k] << 1 | bz[k - 1] >>> 63 | bz[k] << 2 | bz[k - 1] >>> 62 | bz[k] >>> 1 | bz[k + 1] << 63 | bz[k] >>> 2 | bz[k + 1] << 62) | 1L) != 0)
            && IntStream.range(3 * S, (h + 3) * S).allMatch(k -> ((er[k] = g[k] & ~(az[k - 2 * S] | az[k - S] | az[k] | az[k + S] | az[k + 2 * S])) | 1L) != 0)
            && IntStream.range(3 * S, (h + 3) * S).allMatch(k -> ((dh[k] = er[k] | er[k] << 1 | er[k - 1] >>> 63 | er[k] << 2 | er[k - 1] >>> 62 | er[k] >>> 1 | er[k + 1] << 63 | er[k] >>> 2 | er[k + 1] << 62) | 1L) != 0)
            && IntStream.range(3 * S, (h + 3) * S).allMatch(k -> ((op[k] = g[k] & (dh[k - 2 * S] | dh[k - S] | dh[k] | dh[k + S] | dh[k + 2 * S])) | 1L) != 0)
            && IntStream.range(3 * S, (h + 3) * S).allMatch(k -> ((d1[k] = op[k] | op[k] << 1 | op[k - 1] >>> 63 | op[k] >>> 1 | op[k + 1] << 63) | 1L) != 0)
            && IntStream.range(3 * S, (h + 3) * S).allMatch(k -> ((dd[k] = d1[k - S] | d1[k] | d1[k + S]) | 1L) != 0)
            && IntStream.range(3 * S, (h + 3) * S).allMatch(k -> ((rr[k] = g[k] & ~dd[k]) | 1L) != 0)
            && ((BiFunction<long[], Boolean, int[]>) (mask, eight) -> new int[NW * 64] instanceof int[] lab && new int[NW * 64] instanceof int[] q && new int[2] instanceof int[] c
                && ((IntPredicate) j -> (mask[j >> 6] >>> j & 1L) != 0 && lab[j] == 0 && (lab[j] = c[0]) > 0 && (q[c[1]++] = j) >= 0) instanceof IntPredicate vis
                && IntStream.range(0, NW).allMatch(k -> mask[k] == 0 || IntStream.range(0, 64).allMatch(b -> (mask[k] >>> b & 1L) == 0 || lab[k * 64 + b] != 0
                    || ++c[0] > 0 && (lab[k * 64 + b] = c[0]) > 0 && (q[0] = k * 64 + b) >= 0 && (c[1] = 1) > 0
                    && IntStream.iterate(0, t -> t < c[1], t -> t + 1).allMatch(t -> (vis.test(q[t] - 1) | vis.test(q[t] + 1) | vis.test(q[t] - S * 64) | vis.test(q[t] + S * 64)
                        | (eight && (vis.test(q[t] - S * 64 - 1) | vis.test(q[t] - S * 64 + 1) | vis.test(q[t] + S * 64 - 1) | vis.test(q[t] + S * 64 + 1)))) || true)))
                ? lab : new int[0]) instanceof BiFunction<long[], Boolean, int[]> label
            && label.apply(op, true) instanceof int[] lo && label.apply(rr, true) instanceof int[] lr
            && Integer.valueOf(Arrays.stream(lo).max().getAsInt()) instanceof Integer cnt && Integer.valueOf(Arrays.stream(lr).max().getAsInt()) instanceof Integer rc
            && new int[rc + 1] instanceof int[] sz && new int[rc + 1] instanceof int[] sun && new int[cnt + 1] instanceof int[] rays
            && IntStream.range(0, NW).allMatch(k -> rr[k] == 0 || IntStream.range(0, 64).allMatch(b -> (rr[k] >>> b & 1L) == 0 || ++sz[lr[k * 64 + b]] > 0 && (sun[lr[k * 64 + b]] != 0
                || (sun[lr[k * 64 + b]] = IntStream.rangeClosed(-3, 3).flatMap(dy -> IntStream.rangeClosed(-3, 3).map(dx -> lo[k * 64 + b + dy * S * 64 + dx])).max().getAsInt()) >= 0)))
            && IntStream.rangeClosed(1, rc).allMatch(k -> sz[k] < 6 || sun[k] == 0 || ++rays[sun[k]] > 0)
            ? cnt + "\n" + Arrays.stream(rays, 1, cnt + 1).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}



