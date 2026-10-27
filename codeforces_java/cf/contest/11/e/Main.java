import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().getBytes() instanceof byte[] raw
            && new byte[2 * raw.length + 4] instanceof byte[] t
            && new int[]{1} instanceof int[] len
            && IntStream.range(0, raw.length).allMatch(i ->
                (raw[i] == 'X' || i == 0 || raw[i] != raw[i - 1] || ++len[0] > 0)
                && (t[len[0]++] = (byte) (raw[i] == 'L' ? 1 : raw[i] == 'R' ? 2 : 0)) >= 0)
            && (Long) IntStream.range(1, len[0]).filter(i -> t[i] != 0).count() instanceof Long steps
            && (t[1] == t[len[0] - 1] && t[1] != 0 ? new int[][]{{0, 1}, {1, 0}} : new int[][]{{0, 0}}) instanceof int[][] variants
            && ((ToLongFunction<int[]>) vp ->
                Stream.iterate(new long[]{IntStream.range(0, len[0] - 1 + vp[0] + vp[1]).map(i -> (((i >= vp[0] ? t[i - vp[0] + 1] : 0) & 1) == 1 && (i & 1) == 0 ? 1 : 0) + (((i >= vp[0] ? t[i - vp[0] + 1] : 0) >> 1) == 1 && (i & 1) == 1 ? 1 : 0)).sum(), len[0] - 1 + vp[0] + vp[1] + ((len[0] - 1 + vp[0] + vp[1]) & 1), 0}, st -> st[2] == 0, st ->
                    new long[]{0, -4000000000000000000L, 0, 0, 0, 0, 0, 0} instanceof long[] f
                    && IntStream.range(0, len[0] - 1 + vp[0] + vp[1]).allMatch(i ->
                        (f[((i + 1) & 1) << 2 | 1] = (f[(i & 1) << 2 | 1] - st[0] > f[(i & 1) << 2] ? f[(i & 1) << 2 | 1] - st[0] : f[(i & 1) << 2])
                            + ((i >= vp[0] ? t[i - vp[0] + 1] : 0) & 1) * st[1] - st[0]) == f[((i + 1) & 1) << 2 | 1]
                        && (f[((i + 1) & 1) << 2 | 3] = (f[(i & 1) << 2 | 1] - st[0] > f[(i & 1) << 2] ? f[(i & 1) << 2 | 3] + 1 : f[(i & 1) << 2 | 2])
                            + (((i >= vp[0] ? t[i - vp[0] + 1] : 0) & 1) << 22) + 1) > 0
                        && (f[((i + 1) & 1) << 2] = (f[(i & 1) << 2] - st[0] > f[(i & 1) << 2 | 1] ? f[(i & 1) << 2] - st[0] : f[(i & 1) << 2 | 1])
                            + ((i >= vp[0] ? t[i - vp[0] + 1] : 0) >> 1) * st[1] - st[0]) == f[((i + 1) & 1) << 2]
                        && (f[((i + 1) & 1) << 2 | 2] = (f[(i & 1) << 2] - st[0] > f[(i & 1) << 2 | 1] ? f[(i & 1) << 2 | 2] + 1 : f[(i & 1) << 2 | 3])
                            + (((i >= vp[0] ? t[i - vp[0] + 1] : 0) >> 1) << 22) + 1) > 0)
                    && (Integer) (((len[0] - 1 + vp[0] + vp[1]) & 1) << 2) instanceof Integer b0
                    && (Long) (f[b0] >= f[b0 | 1] - st[0] ? f[b0 | 2] : f[b0 | 3] + 1) instanceof Long best
                    ? (best >> 22) * st[1] > st[0] * (best & 4194303L)
                        ? new long[]{best >> 22, best & 4194303L, 0}
                        : new long[]{st[0], st[1], 1}
                    : new long[]{st[0], st[1], 1})
                    .reduce((a, b) -> b).map(r -> r[0] << 32 | r[1]).get()) instanceof ToLongFunction<int[]> solve
            && Arrays.stream(variants).mapToLong(solve).toArray() instanceof long[] evens
            && (Long) Arrays.stream(evens).reduce((a, b) -> (a >> 32) * (b & 4294967295L) >= (b >> 32) * (a & 4294967295L) ? a : b).getAsLong() instanceof Long ev
            && new long[]{ev >> 32, ev & 4294967295L} instanceof long[] e
            && new long[]{steps, 2L * Arrays.stream(variants).mapToLong(vp -> (len[0] - 1 + vp[0] + vp[1]) % 2 == 1 ? len[0] - 1 + vp[0] + vp[1] : len[0] + vp[0] + vp[1]).min().getAsLong()} instanceof long[] od
            && new long[]{e[0] * od[1] >= od[0] * e[1] ? e[0] : od[0], e[0] * od[1] >= od[0] * e[1] ? e[1] : od[1]} instanceof long[] r
            && (Long) (r[0] * 100_000_000L / r[1]) instanceof Long v
            ? (v / 1000000) + "." + String.format("%06d", v % 1000000)
            : "");
    }
}


