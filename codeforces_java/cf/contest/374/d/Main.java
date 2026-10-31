import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] vals && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length + 1).map(k -> k < raw.length && raw[k] >= 48 ? (ps[0] = ps[0] * 10 + raw[k] - 48) * 0 + (ps[1] = 1) * 0
                : k < raw.length && raw[k] == 45 ? (ps[2] = 1) * 0
                : ps[1] == 1 ? (vals[ps[3]++] = ps[2] == 1 ? -ps[0] : ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) + (ps[2] = 0) : 0).sum() == 0
            && Integer.valueOf(vals[0]) instanceof Integer n && Integer.valueOf(vals[1]) instanceof Integer m
            && Arrays.copyOfRange(vals, 2, 2 + m) instanceof int[] a
            && new int[2097152] instanceof int[] tree && new int[n + 1] instanceof int[] val && new int[]{0, 0} instanceof int[] st
            && ((LongUnaryOperator) s -> tree[2 * (int) (s >>> 32)] < (int) s
                ? (((long) (2 * (int) (s >>> 32) + 1) << 32) | ((int) s - tree[2 * (int) (s >>> 32)])) + 0 * --tree[2 * (int) (s >>> 32) + 1]
                : (((long) (2 * (int) (s >>> 32)) << 32) | (int) s) + 0 * --tree[2 * (int) (s >>> 32)]) instanceof LongUnaryOperator step
            && IntStream.range(0, n).map(i -> vals[2 + m + i] == -1
                ? (Integer.valueOf(Arrays.binarySearch(a, st[0])) instanceof Integer ix && Integer.valueOf(ix >= 0 ? ix + 1 : -ix - 1) instanceof Integer kk
                    && IntStream.range(0, kk).map(j -> Integer.valueOf((int) (step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(step.applyAsLong(((1L << 32) | (a[j] - j)))))))))))))))))))))) >>> 32) - 1048576) instanceof Integer pos && (val[pos] = 2) > 0 ? 0 : 0).sum() >= 0
                    && (st[0] -= kk) >= 0 ? 0 : 0)
                : (++tree[(1048576 + st[1]) >> 0] + ++tree[(1048576 + st[1]) >> 1] + ++tree[(1048576 + st[1]) >> 2] + ++tree[(1048576 + st[1]) >> 3] + ++tree[(1048576 + st[1]) >> 4] + ++tree[(1048576 + st[1]) >> 5] + ++tree[(1048576 + st[1]) >> 6] + ++tree[(1048576 + st[1]) >> 7] + ++tree[(1048576 + st[1]) >> 8] + ++tree[(1048576 + st[1]) >> 9] + ++tree[(1048576 + st[1]) >> 10] + ++tree[(1048576 + st[1]) >> 11] + ++tree[(1048576 + st[1]) >> 12] + ++tree[(1048576 + st[1]) >> 13] + ++tree[(1048576 + st[1]) >> 14] + ++tree[(1048576 + st[1]) >> 15] + ++tree[(1048576 + st[1]) >> 16] + ++tree[(1048576 + st[1]) >> 17] + ++tree[(1048576 + st[1]) >> 18] + ++tree[(1048576 + st[1]) >> 19] + ++tree[(1048576 + st[1]) >> 20] > 0
                    && (val[st[1]] = vals[2 + m + i]) >= 0 && ++st[1] > 0 && ++st[0] > 0 ? 0 : 0)).sum() == 0
            && IntStream.range(0, st[1]).filter(p -> val[p] != 2).map(p -> 48 + val[p]).toArray() instanceof int[] out
            ? out.length == 0 ? "Poor stack!" : new String(out, 0, out.length) : "");
    }
}
