import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] v && new int[2] instanceof int[] ix && new long[1] instanceof long[] cu && new int[]{1} instanceof int[] sg
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + sg[0] * (raw[p] - 48) : 0 * (sg[0] = raw[p] == 45 ? -1 : 1)) == Long.MIN_VALUE).count() == 0
            && (Integer) (int) v[0] instanceof Integer n && (Long) v[1] instanceof Long k
            && IntStream.range(0, 2 * n).mapToLong(i -> i < n ? v[3 + 2 * i] - k + 1 : v[3 + 2 * (i - n)] + 1).sorted().distinct().toArray() instanceof long[] ys
            && IntStream.range(0, n).mapToObj(i -> Arrays.binarySearch(ys, v[3 + 2 * i] - k + 1)).mapToInt(x -> x).toArray() instanceof int[] lo
            && IntStream.range(0, n).mapToObj(i -> Arrays.binarySearch(ys, v[3 + 2 * i] + 1)).mapToInt(x -> x).toArray() instanceof int[] hi
            && new int[ys.length] instanceof int[] cnt && new long[ys.length] instanceof long[] since && new long[n + 2] instanceof long[] ans && IntStream.range(0, ys.length).mapToLong(j -> j + 1 < ys.length ? ys[j + 1] - ys[j] : 0).toArray() instanceof long[] len
            && IntStream.range(0, 2 * n).mapToLong(e -> ((e < n ? v[2 + 2 * e] - k + 1 : v[2 + 2 * (e - n)] + 1) + 1000000L << 18) | e).sorted().toArray() instanceof long[] keys
            && Arrays.stream(keys).filter(key -> (Long) ((key >> 18) - 1000000L) instanceof Long x && (Integer) (int) (key & 262143) instanceof Integer e
                && (Integer) (e >= n ? e - n : e) instanceof Integer p && (Integer) (e >= n ? -1 : 1) instanceof Integer d
                && Stream.of(0).peek(z -> IntStream.range(lo[p], hi[p]).forEach(j -> ans[cnt[j]] += len[j] * (x - since[j]) + 0 * (since[j] = x) + 0 * (cnt[j] += d))).findFirst().isPresent()).count() >= 0
            ? LongStream.rangeClosed(1, n).mapToObj(c -> String.valueOf(ans[(int) c])).collect(Collectors.joining(" ")) : "");
    }
}
