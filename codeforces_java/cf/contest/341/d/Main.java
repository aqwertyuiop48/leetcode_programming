import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw && new long[b0.length / 2 + 2] instanceof long[] nums && new long[1] instanceof long[] cur && new int[2] instanceof int[] f
            && IntStream.range(0, raw.length).mapToLong(i -> raw[i] >= 48 ? (cur[0] = cur[0] * 10 + raw[i] - 48) * 0 + (f[1] = 1) * 0L : f[1] == 1 ? (nums[f[0]++] = cur[0]) * 0 + (cur[0] = 0) * 0 + (f[1] = 0) * 0 : 0L).sum() == 0
            && new int[] {0} instanceof int[] pos && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer n && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer m
            && Integer.valueOf(n + 1) instanceof Integer W && new long[4 * W * W] instanceof long[] T
            && new int[W * 12] instanceof int[] dn && new int[W] instanceof int[] dnn && new int[W * 12] instanceof int[] up && new int[W] instanceof int[] upn
            && IntStream.range(0, W).allMatch(x -> IntStream.iterate(x, y -> y >= 0, y -> (y & (y + 1)) - 1).toArray() instanceof int[] ch && (dnn[x] = ch.length) > 0 && IntStream.range(0, ch.length).allMatch(k -> (dn[x * 12 + k] = ch[k]) >= 0)
                && IntStream.iterate(x, y -> y <= n, y -> y | (y + 1)).toArray() instanceof int[] ch2 && (upn[x] = ch2.length) > 0 && IntStream.range(0, ch2.length).allMatch(k -> (up[x * 12 + k] = ch2[k]) >= 0)))
            System.out.println(IntStream.range(0, m).mapToObj(q -> Integer.valueOf((int) nums[pos[0]++]) instanceof Integer t && Integer.valueOf((int) nums[pos[0]++] - 1) instanceof Integer x1 && Integer.valueOf((int) nums[pos[0]++] - 1) instanceof Integer y1 && Integer.valueOf((int) nums[pos[0]++] - 1) instanceof Integer x2 && Integer.valueOf((int) nums[pos[0]++] - 1) instanceof Integer y2
                && Long.valueOf(t == 1 ? 0L : nums[pos[0]++]) instanceof Long v
                && (t == 1 ? dn : up) instanceof int[] tab && (t == 1 ? dnn : upn) instanceof int[] cn
                && (t == 1 ? new int[] {(((x2 & 1) << 1) + (y2 & 1)), (((x1 - 1) & 1) << 1) + (y2 & 1), ((x2 & 1) << 1) + ((y1 - 1) & 1), (((x1 - 1) & 1) << 1) + ((y1 - 1) & 1)}
                    : new int[] {((x1 & 1) << 1) + (y1 & 1), (((x2 + 1) & 1) << 1) + (y1 & 1), ((x1 & 1) << 1) + ((y2 + 1) & 1), (((x2 + 1) & 1) << 1) + ((y2 + 1) & 1)}) instanceof int[] cc
                && (t == 1 ? new int[] {x2 + 1, x1, x2 + 1, x1} : new int[] {x1, x2 + 1, x1, x2 + 1}) instanceof int[] cx
                && (t == 1 ? new int[] {y2 + 1, y2 + 1, y1, y1} : new int[] {y1, y1, y2 + 1, y2 + 1}) instanceof int[] cy
                && (t == 1 ? new boolean[] {true, x1 > 0, y1 > 0, x1 > 0 && y1 > 0} : new boolean[] {true, x2 < n - 1, y2 < n - 1, x2 < n - 1 && y2 < n - 1}) instanceof boolean[] en
                && Long.valueOf(IntStream.range(0, 4).filter(c -> en[c]).mapToLong(c -> IntStream.range(0, cn[cx[c]] * cn[cy[c]]).mapToLong(r -> Integer.valueOf(cc[c] * W * W + tab[cx[c] * 12 + r / cn[cy[c]]] * W + tab[cy[c] * 12 + r % cn[cy[c]]]) instanceof Integer ix
                    ? (t == 1 ? T[ix] : (T[ix] ^= v) * 0L) : 0L).reduce(0L, (p, q2) -> p ^ q2)).reduce(0L, (p, q2) -> p ^ q2)) instanceof Long res
                ? (t == 1 ? String.valueOf(res) : "") : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")));
    }
}
