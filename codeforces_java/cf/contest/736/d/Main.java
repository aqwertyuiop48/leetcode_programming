import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).allMatch(k -> 0 * (raw[k] > 47 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[2] = 1) : st[2] == 1 ? (v[(int) st[3]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n && Integer.valueOf((int) v[1]) instanceof Integer m
            && Integer.valueOf((n + 63) / 64) instanceof Integer W
            && new long[n * 64] instanceof long[] F
            && new int[m] instanceof int[] ea && new int[m] instanceof int[] eb
            && IntStream.range(0, m).allMatch(k -> (ea[k] = (int) v[2 + 2 * k] - 1) >= 0 && (eb[k] = (int) v[3 + 2 * k] - 1) >= 0 && ((F[ea[k] * 64 + (eb[k] >> 6)] |= 1L << (eb[k] & 63)) | 1) != 0)
            && IntStream.range(0, n).allMatch(i -> ((F[i * 64 + W + (i >> 6)] |= 1L << (i & 63)) | 1) != 0)
            && new int[n] instanceof int[] pc && new int[]{0} instanceof int[] rk
            && new long[64] instanceof long[] tmp && new long[n] instanceof long[] cb
            && IntStream.range(0, n).allMatch(c -> IntStream.range(rk[0], n).filter(q -> (F[q * 64 + (c >> 6)] >>> (c & 63) & 1) == 1).findFirst() instanceof OptionalInt pv
                && (pv.isEmpty() || Stream.of(0).peek(z -> System.arraycopy(F, pv.getAsInt() * 64, tmp, 0, 64)).findFirst().isPresent()
                    && Stream.of(0).peek(z -> System.arraycopy(F, rk[0] * 64, F, pv.getAsInt() * 64, 64)).findFirst().isPresent()
                    && Stream.of(0).peek(z -> System.arraycopy(tmp, 0, F, rk[0] * 64, 64)).findFirst().isPresent()
                    && Stream.of(0).peek(z -> Arrays.setAll(cb, q -> q == rk[0] ? 0L : (F[q * 64 + (c >> 6)] >>> (c & 63)) & 1L)).findFirst().isPresent()
                    && Stream.of(0).peek(z -> Arrays.setAll(F, e -> cb[e >> 6] == 0L ? F[e] : F[e] ^ F[rk[0] * 64 + (e & 63)])).findFirst().isPresent()
                    && (pc[rk[0]] = c) >= 0 && (rk[0]++) >= 0))
            && new int[]{rk[0] == n ? 0 : rk[0] == n - 1 ? 1 : 2} instanceof int[] md
            && IntStream.range(0, n).filter(c -> IntStream.range(0, rk[0]).noneMatch(k -> pc[k] == c)).findFirst() instanceof OptionalInt fo
            && new int[]{fo.orElse(0)} instanceof int[] fa
            && new int[n] instanceof int[] xv && new int[n] instanceof int[] yv
            && (xv[fa[0]] = 1) == 1
            && IntStream.range(0, rk[0]).allMatch(k -> (xv[pc[k]] = (int) (F[k * 64 + (fa[0] >> 6)] >>> (fa[0] & 63) & 1)) >= 0)
            && IntStream.range(0, n).allMatch(i -> (yv[i] = (int) (F[(n - 1) * 64 + W + (i >> 6)] >>> (i & 63) & 1)) >= 0)
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, m).allMatch(k -> sb.append(md[0] == 0 ? ((F[eb[k] * 64 + W + (ea[k] >> 6)] >>> (ea[k] & 63) & 1) == 0 ? "YES" : "NO") : md[0] == 1 ? (xv[eb[k]] == 1 && yv[ea[k]] == 1 ? "YES" : "NO") : "NO").append('\n').length() > 0)
            ? sb.toString().trim() : "");
    }
}
