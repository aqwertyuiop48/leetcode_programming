import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer p
            && Integer.valueOf(g[2 + 3 * n]) instanceof Integer q
            && IntStream.range(0, n).mapToLong(i -> ((long) g[4 + 3 * i] << 13) | i).sorted().toArray() instanceof long[] keys
            && (IntUnaryOperator) (x -> Arrays.binarySearch(keys, (long) x << 13) >= 0 ? Arrays.binarySearch(keys, (long) x << 13) : -(Arrays.binarySearch(keys, (long) x << 13) + 1)) instanceof IntUnaryOperator lb
            && Integer.valueOf(IntStream.range(0, q).map(j -> g[4 + 3 * n + 2 * j]).max().getAsInt()) instanceof Integer B
            && IntStream.range(0, q).mapToLong(j -> ((long) (g[3 + 3 * n + 2 * j] / p) << 20) | j).sorted().toArray() instanceof long[] qk
            && new int[q] instanceof int[] ans
            && IntStream.iterate(0, s -> s < q, s -> -(Arrays.binarySearch(qk, (((qk[s] >> 20) + 1) << 20) - 1) + 1)).allMatch(s ->
                Integer.valueOf((int) (qk[s] >> 20)) instanceof Integer k
                && Integer.valueOf(lb.applyAsInt(k * p)) instanceof Integer mid
                && Integer.valueOf(mid - lb.applyAsInt(k * p - p + 1)) instanceof Integer jm
                && Integer.valueOf(lb.applyAsInt(k * p + p) - mid) instanceof Integer km
                && new int[jm + 1][] instanceof int[][] L
                && new int[km + 1][] instanceof int[][] R
                && (L[0] = new int[B + 1]) != null
                && (R[0] = new int[B + 1]) != null
                && IntStream.rangeClosed(1, jm).allMatch(j ->
                    Integer.valueOf((int) (keys[mid - j] & 8191)) instanceof Integer it
                    && (L[j] = new int[B + 1]) != null
                    && L[j - 1] instanceof int[] pv
                    && new int[]{g[2 + 3 * it], g[3 + 3 * it]} instanceof int[] ch
                    && IntStream.of(0).peek(z -> Arrays.setAll(L[j], x -> Math.max(pv[x], x >= ch[0] ? pv[x - ch[0]] + ch[1] : 0))).findFirst().isPresent())
                && IntStream.rangeClosed(1, km).allMatch(j ->
                    Integer.valueOf((int) (keys[mid + j - 1] & 8191)) instanceof Integer it
                    && (R[j] = new int[B + 1]) != null
                    && R[j - 1] instanceof int[] pv
                    && new int[]{g[2 + 3 * it], g[3 + 3 * it]} instanceof int[] ch
                    && IntStream.of(0).peek(z -> Arrays.setAll(R[j], x -> Math.max(pv[x], x >= ch[0] ? pv[x - ch[0]] + ch[1] : 0))).findFirst().isPresent())
                && IntStream.range(s, q).takeWhile(e -> (qk[e] >> 20) == k).allMatch(e ->
                    Integer.valueOf((int) (qk[e] & 0xFFFFF)) instanceof Integer j
                    && Integer.valueOf(g[3 + 3 * n + 2 * j]) instanceof Integer a
                    && Integer.valueOf(g[4 + 3 * n + 2 * j]) instanceof Integer b
                    && L[mid - lb.applyAsInt(a - p + 1)] instanceof int[] lr
                    && R[lb.applyAsInt(a + 1) - mid] instanceof int[] rr
                    && new int[b + 1] instanceof int[] tmp
                    && IntStream.of(0).peek(z -> Arrays.setAll(tmp, x -> lr[x] + rr[tmp.length - 1 - x])).findFirst().isPresent()
                    && (ans[j] = Arrays.stream(tmp).max().getAsInt()) >= 0))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}
