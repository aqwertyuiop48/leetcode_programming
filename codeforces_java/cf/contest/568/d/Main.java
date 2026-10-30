import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] == 45 ? (st[3] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[3] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[2] = 0) + (st[3] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && (Integer) nums[1] instanceof Integer kk
            && IntStream.range(0, n).mapToLong(i -> nums[2 + 3 * i]).toArray() instanceof long[] A
            && IntStream.range(0, n).mapToLong(i -> nums[3 + 3 * i]).toArray() instanceof long[] B
            && IntStream.range(0, n).mapToLong(i -> nums[4 + 3 * i]).toArray() instanceof long[] C
            && List.of(new int[]{0, 0}) instanceof List<int[]> NO
            && new Random() instanceof Random rnd
            && new Object[1] instanceof Object[] holder
            && ((Function<int[], long[]>) ab -> new long[]{B[ab[0]] * C[ab[1]] - B[ab[1]] * C[ab[0]], C[ab[0]] * A[ab[1]] - C[ab[1]] * A[ab[0]], A[ab[0]] * B[ab[1]] - A[ab[1]] * B[ab[0]]}) instanceof Function<int[], long[]> pt
            && (holder[0] = (BiFunction<int[], Integer, List<int[]>>) (idx, k) ->
                idx.length <= k ? Arrays.stream(idx).mapToObj(q -> new int[]{q + 1, -1}).collect(Collectors.toList())
                : k == 0 ? NO
                : idx.length > k * k
                    ? IntStream.range(0, 300).mapToObj(tr -> (Integer) rnd.nextInt(idx.length) instanceof Integer x
                        && (Integer) rnd.nextInt(idx.length) instanceof Integer y
                        && x.intValue() != y.intValue()
                        && pt.apply(new int[]{idx[x], idx[y]}) instanceof long[] p
                        && p[2] != 0
                        && Arrays.stream(idx).filter(q -> A[q] * p[0] + B[q] * p[1] + C[q] * p[2] == 0).count() > k
                        ? ((BiFunction<int[], Integer, List<int[]>>) holder[0]).apply(Arrays.stream(idx).filter(q -> A[q] * p[0] + B[q] * p[1] + C[q] * p[2] != 0).toArray(), k - 1) instanceof List<int[]> sub
                            ? (sub == NO ? NO : Stream.concat(sub.stream(), Stream.of(new int[]{idx[x] + 1, idx[y] + 1})).collect(Collectors.toList()))
                            : NO
                        : null).filter(Objects::nonNull).findFirst().orElse(NO)
                    : IntStream.range(0, idx.length).mapToObj(j -> j == 0
                        ? ((BiFunction<int[], Integer, List<int[]>>) holder[0]).apply(Arrays.copyOfRange(idx, 1, idx.length), k - 1) instanceof List<int[]> sub0
                            ? (sub0 == NO ? NO : Stream.concat(sub0.stream(), Stream.of(new int[]{idx[0] + 1, -1})).collect(Collectors.toList()))
                            : NO
                        : pt.apply(new int[]{idx[0], idx[j]}) instanceof long[] p
                            && p[2] != 0
                            && ((BiFunction<int[], Integer, List<int[]>>) holder[0]).apply(Arrays.stream(idx).filter(q -> A[q] * p[0] + B[q] * p[1] + C[q] * p[2] != 0).toArray(), k - 1) instanceof List<int[]> sub1
                            && sub1 != NO
                            ? Stream.concat(sub1.stream(), Stream.of(new int[]{idx[0] + 1, idx[j] + 1})).collect(Collectors.toList())
                            : NO).filter(r -> r != NO).findFirst().orElse(NO)) != null
            && ((BiFunction<int[], Integer, List<int[]>>) holder[0]).apply(IntStream.range(0, n).toArray(), kk) instanceof List<int[]> res
            ? (res == NO ? "NO" : "YES\n" + res.size() + "\n" + res.stream().map(a -> a[0] + " " + a[1]).collect(Collectors.joining("\n")))
            : "");
    }
}
