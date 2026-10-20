import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[1 + 3 * i])).toArray() instanceof int[] l
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[2 + 3 * i])).toArray() instanceof int[] v
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[3 + 3 * i])).toArray() instanceof int[] r
            && Integer.valueOf(1 << 18) instanceof Integer N && new int[2 * N] instanceof int[] tr && new int[N] instanceof int[] dd
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> l[i])).mapToInt(i -> i).toArray() instanceof int[] byL
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> v[i])).mapToInt(i -> i).toArray() instanceof int[] byV
            && ((java.util.function.IntBinaryOperator) (p, x) -> (tr[p] += x) + (p < N ? (dd[p] += x) : 0)) instanceof java.util.function.IntBinaryOperator ap
            && ((java.util.function.IntUnaryOperator) p0 -> IntStream.iterate(p0 >> 1, q -> q >= 1, q -> q >> 1).map(q -> tr[q] = Math.max(tr[2 * q], tr[2 * q + 1]) + dd[q]).sum()) instanceof java.util.function.IntUnaryOperator build
            && ((java.util.function.ToIntFunction<int[]>) a -> new int[]{a[0] + N, a[1] + N} instanceof int[] lr
                && IntStream.iterate(0, k -> lr[0] < lr[1], k -> k + 1).map(k -> ((lr[0] & 1) == 1 ? ap.applyAsInt(lr[0]++, a[2]) : 0) + ((lr[1] & 1) == 1 ? ap.applyAsInt(--lr[1], a[2]) : 0) + (lr[0] >>= 1) + (lr[1] >>= 1)).count() >= 0
                && build.applyAsInt(a[0] + N) + build.applyAsInt(a[1] + N - 1) >= 0 ? 1 : 0) instanceof java.util.function.ToIntFunction<int[]> ra
            && new int[]{0, 0} instanceof int[] ptr && new int[]{0, 0, 0} instanceof int[] best
            && IntStream.rangeClosed(1, 200000).allMatch(L -> (ptr[1] += IntStream.iterate(ptr[1], p -> p < n && v[byV[p]] < L, p -> p + 1).map(p -> ra.applyAsInt(new int[]{v[byV[p]], r[byV[p]] + 1, -1}) >= 0 ? 1 : 1).sum()) >= 0
                && (ptr[0] += IntStream.iterate(ptr[0], p -> p < n && l[byL[p]] <= L, p -> p + 1).map(p -> ra.applyAsInt(new int[]{v[byL[p]], r[byL[p]] + 1, 1}) >= 0 ? 1 : 1).sum()) >= 0
                && (tr[1] <= best[0] || ((best[0] = tr[1]) > 0 & (best[1] = L) > 0 & (best[2] = IntStream.range(0, 18).reduce(1, (p, k) -> 2 * p + (tr[2 * p + 1] > tr[2 * p] ? 1 : 0)) - N) >= 0)))
            ? best[0] + "\n" + IntStream.range(0, n).filter(i -> l[i] <= best[1] && best[1] <= v[i] && v[i] <= best[2] && best[2] <= r[i]).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
