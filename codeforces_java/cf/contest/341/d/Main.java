import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw && new long[b0.length / 2 + 2] instanceof long[] nums && new long[1] instanceof long[] cur && new int[3] instanceof int[] f
            && IntStream.range(0, raw.length).mapToLong(i -> raw[i] >= 48 ? (cur[0] = cur[0] * 10 + raw[i] - 48) * 0 + (f[1] = 1) * 0L : raw[i] == 45 ? (f[0] = 1) * 0L : f[1] == 1 ? (nums[f[2]++] = f[0] == 1 ? -cur[0] : cur[0]) * 0 + (cur[0] = 0) * 0 + (f[0] = 0) * 0 + (f[1] = 0) * 0 : 0L).sum() == 0
            && new int[] {0} instanceof int[] pos && new int[5] instanceof int[] w && IntStream.range(0, 11 * 128).map(i -> i % 128 / Math.max(1, i / 128)).toArray() instanceof int[] dv && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer n && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer m
            && Integer.valueOf(n + 2) instanceof Integer W && new long[4 * W * W] instanceof long[] T
            && new int[(n + 2) * 12] instanceof int[] cd && new int[n + 2] instanceof int[] cdn && new int[(n + 2) * 12] instanceof int[] cu && new int[n + 2] instanceof int[] cun
            && IntStream.rangeClosed(1, n + 1).allMatch(x -> IntStream.iterate(x, y -> y > 0, y -> y - (y & -y)).toArray() instanceof int[] ch && (cdn[x] = ch.length) > 0 && IntStream.range(0, ch.length).allMatch(k -> (cd[x * 12 + k] = ch[k]) > 0)
                && IntStream.iterate(x, y -> y <= n, y -> y + (y & -y)).toArray() instanceof int[] ch2 && (cun[x] = ch2.length) >= 0 && IntStream.range(0, ch2.length).allMatch(k -> (cu[x * 12 + k] = ch2[k]) > 0)))
            System.out.print(IntStream.range(0, m).mapToObj(q -> Integer.valueOf((int) nums[pos[0]++]) instanceof Integer t && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer x0 && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer y0 && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer x1 && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer y1
                && Long.valueOf(t == 1 ? 0L : nums[pos[0]++]) instanceof Long v
                && (t == 1 ? cd : cu) instanceof int[] tab && (t == 1 ? cdn : cun) instanceof int[] cn
                && (t == 1 ? new int[] {x1, x0 - 1, x1, x0 - 1} : new int[] {x0, x0, x1 + 1, x1 + 1}) instanceof int[] cx
                && (t == 1 ? new int[] {y1, y1, y0 - 1, y0 - 1} : new int[] {y0, y1 + 1, y0, y1 + 1}) instanceof int[] cy
                && new int[] {0, cn[cx[0]] * cn[cy[0]], 0, 0, 0} instanceof int[] cb
                && (cb[2] = cb[1] + cn[cx[1]] * cn[cy[1]]) >= 0 && (cb[3] = cb[2] + cn[cx[2]] * cn[cy[2]]) >= 0 && (cb[4] = cb[3] + cn[cx[3]] * cn[cy[3]]) >= 0
                && Long.valueOf(IntStream.range(0, cb[4]).mapToLong(r -> (w[0] = r < cb[1] ? 0 : r < cb[2] ? 1 : r < cb[3] ? 2 : 3) + (w[1] = r - cb[w[0]]) + (w[2] = cn[cy[w[0]]]) + (w[3] = dv[w[2] * 128 + w[1]]) >= 0
                    && (w[4] = (((tab[cx[w[0]] * 12 + w[3]] * W + tab[cy[w[0]] * 12 + w[1] - w[3] * w[2]]) << 2) | ((cx[w[0]] & 1) << 1) | (cy[w[0]] & 1))) >= 0
                    ? (t == 1 ? T[w[4]] : (T[w[4]] ^= v) * 0L) : 0L).reduce(0L, (p, q2) -> p ^ q2)) instanceof Long res
                ? (t == 1 ? String.valueOf(res) : "") : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")));
    }
}
