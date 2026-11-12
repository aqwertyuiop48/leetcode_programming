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
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(n + 5) instanceof Integer INF
            && Integer.valueOf(Arrays.stream(a, 1, n + 1).max().getAsInt()) instanceof Integer maxV
            && new int[maxV + 2] instanceof int[] min1 && new int[maxV + 2] instanceof int[] min2 && new int[maxV + 2] instanceof int[] max1 && new int[maxV + 2] instanceof int[] max2
            && IntStream.rangeClosed(1, n).filter(i -> Integer.valueOf(a[i]) instanceof Integer v
                && (min1[v] == 0 ? (min1[v] = i) : min2[v] == 0 ? (min2[v] = i) : 0) >= 0 && (max2[v] = max1[v]) >= 0 && (max1[v] = i) > 0).count() >= 0
            && new int[4] instanceof int[] t && new long[]{(long) n * (n + 1) / 2} instanceof long[] S && new long[]{0, 0} instanceof long[] ans
            && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> map
            && IntStream.rangeClosed(1, n).filter(i -> map.put(i, i) == null).count() >= 0 && map.put(n + 1, n + 2) == null
            && ((IntUnaryOperator) c -> c <= 0 ? 0 : c < t[0] ? (t[1] = t[0]) + (t[0] = c) : c < t[1] ? (t[1] = c) : 0) instanceof IntUnaryOperator mnU
            && ((IntUnaryOperator) c -> c <= 0 ? 0 : c > t[2] ? (t[3] = t[2]) + (t[2] = c) : c > t[3] ? (t[3] = c) : 0) instanceof IntUnaryOperator mxU
            && ((IntBinaryOperator) (a0, v) -> map.floorEntry(a0).getValue() < v
                && (map.floorKey(a0) == a0 || map.put(a0, map.floorEntry(a0).getValue()) == null || true)
                && IntStream.iterate(a0, c -> map.get(c) < v, c -> map.higherKey(c)).filter(c -> (S[0] += (long) (v - map.get(c)) * (map.higherKey(c) - c)) > Long.MIN_VALUE && map.remove(c) != null || true).count() >= 0
                && map.put(a0, v) == null || true ? 0 : 0) instanceof IntBinaryOperator cm
            && IntStream.range(0, maxV).map(i -> maxV - i).filter(g -> (t[0] = INF) + (t[1] = INF) + (t[2] = 0) + (t[3] = 0) >= 0
                && IntStream.iterate(g, m -> m <= maxV, m -> m + g).filter(m -> mnU.applyAsInt(min1[m]) + mnU.applyAsInt(min2[m]) + mxU.applyAsInt(max1[m]) + mxU.applyAsInt(max2[m]) >= 0).count() >= 0
                && (ans[1] = S[0]) >= 0
                && (t[1] >= INF || (t[1] + 1 <= n ? cm.applyAsInt(t[1] + 1, n + 1) : 0) + cm.applyAsInt(t[0] + 1, t[2]) + cm.applyAsInt(1, t[3]) >= 0)
                && (ans[0] += (long) g * (S[0] - ans[1])) >= 0).count() >= 0
            ? ans[0] : "");
    }
}
