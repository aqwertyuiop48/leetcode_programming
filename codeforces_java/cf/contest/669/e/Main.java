import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[]{0, 0, 0, 0, 0} instanceof int[] ps
            && Stream.of(0).peek(z -> IntStream.rangeClosed(0, raw.length).forEach(i -> ps[4] = i < raw.length && raw[i] >= 48 ? (ps[3] = 1) + (ps[0] = ps[0] * 10 + raw[i] - 48)
                : i < raw.length && raw[i] == 45 ? (ps[2] = 1)
                : ps[3] == 1 ? (a[ps[1]++] = ps[2] == 1 ? -ps[0] : ps[0]) + (ps[0] = ps[2] = ps[3] = 0) : 0)).findFirst().isPresent()
            && Integer.valueOf(a[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> ((long) a[3 + 3 * i] << 30) | a[2 + 3 * i]).toArray() instanceof long[] key
            && Arrays.stream(key).sorted().toArray() instanceof long[] sorted
            && IntStream.range(0, n).map(i -> Arrays.binarySearch(sorted, key[i])).toArray() instanceof int[] pos
            && new int[n] instanceof int[] gs && new int[n + 2] instanceof int[] bit && new int[n] instanceof int[] res
            && IntStream.range(0, n).filter(p -> (gs[p] = p > 0 && sorted[p] >> 30 == sorted[p - 1] >> 30 ? gs[p - 1] : p) >= 0).count() >= 0
            && ((IntUnaryOperator) j -> IntStream.iterate(j + 1, k -> k > 0, k -> k - (k & -k)).map(k -> bit[k]).sum()) instanceof IntUnaryOperator pref
            && IntStream.range(0, n).filter(i -> a[1 + 3 * i] == 3
                ? (res[i] = pref.applyAsInt(pos[i]) - pref.applyAsInt(gs[pos[i]] - 1)) >= 0
                : Integer.valueOf(a[1 + 3 * i] == 1 ? 1 : -1) instanceof Integer d && IntStream.iterate(pos[i] + 1, k -> k <= n, k -> k + (k & -k)).filter(k -> (bit[k] += d) != 0 || true).count() >= 0).count() >= 0
            ? IntStream.range(0, n).filter(i -> a[1 + 3 * i] == 3).mapToObj(i -> String.valueOf(res[i])).collect(Collectors.joining("\n")) : "");
    }
}
