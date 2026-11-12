import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{-1, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> (i < raw.length ? raw[i] : 32) >= 48 ? (st[0] = Math.max(st[0], 0) * 10 + raw[i] - 48) >= 0 : st[0] < 0 || ((v[st[1]++] = st[0]) >= 0 && (st[0] = -1) < 0)).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer m && Integer.valueOf(v[1]) instanceof Integer n && Integer.valueOf(v[2]) instanceof Integer k && Integer.valueOf(v[3]) instanceof Integer s
            && new int[m + 1] instanceof int[] pa && new int[m + 1] instanceof int[] pb
            && IntStream.rangeClosed(1, m).filter(d -> (pa[d] = d == 1 || v[3 + d] < v[3 + pa[d - 1]] ? d : pa[d - 1]) >= 0
                && (pb[d] = d == 1 || v[3 + m + d] < v[3 + m + pb[d - 1]] ? d : pb[d - 1]) >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).mapToLong(g -> ((long) v[3 + 2 * m + 2 * g] << 18) | g).toArray() instanceof long[] K
            && Stream.of(0).peek(z -> Arrays.sort(K)).findFirst().isPresent()
            && Arrays.stream(K).mapToInt(x -> (int) (x & 262143)).filter(g -> v[2 + 2 * m + 2 * g] == 1).toArray() instanceof int[] D1
            && Arrays.stream(K).mapToInt(x -> (int) (x & 262143)).filter(g -> v[2 + 2 * m + 2 * g] == 2).toArray() instanceof int[] D2
            && ((IntFunction<int[]>) d -> Long.valueOf(v[3 + pa[d]]) instanceof Long A && Long.valueOf(v[3 + m + pb[d]]) instanceof Long B && new int[]{0, 0} instanceof int[] ij
                ? IntStream.range(0, k).map(q -> ij[0] < D1.length && (ij[1] >= D2.length || (long) v[3 + 2 * m + 2 * D1[ij[0]]] * A <= (long) v[3 + 2 * m + 2 * D2[ij[1]]] * B) ? D1[ij[0]++] : D2[ij[1]++]).toArray() : null) instanceof IntFunction<int[]> pk
            && IntStream.range(0, D1.length).mapToLong(i -> v[3 + 2 * m + 2 * D1[i]]).toArray() instanceof long[] c1
            && IntStream.range(0, D2.length).mapToLong(i -> v[3 + 2 * m + 2 * D2[i]]).toArray() instanceof long[] c2
            && new long[2] instanceof long[] ac && new long[D1.length + 1] instanceof long[] P1 && new long[D2.length + 1] instanceof long[] P2
            && Stream.of(0).peek(z -> Arrays.setAll(P1, i -> i == 0 ? 0 : (ac[0] += c1[i - 1]))).peek(z -> Arrays.setAll(P2, i -> i == 0 ? 0 : (ac[1] += c2[i - 1]))).findFirst().isPresent()
            && ((IntPredicate) d -> Long.valueOf(v[3 + pa[d]]) instanceof Long A && Long.valueOf(v[3 + m + pb[d]]) instanceof Long B
                && new int[]{Math.max(0, k - D2.length), Math.min(k, D1.length)} instanceof int[] r
                && IntStream.range(0, 19).filter(it -> r[0] < r[1] && Integer.valueOf((r[0] + r[1]) / 2) instanceof Integer mi && (A * c1[mi] >= B * c2[k - mi - 1] ? (r[1] = mi) >= 0 : (r[0] = mi + 1) >= 0)).count() >= 0
                && A * P1[r[0]] + B * P2[k - r[0]] <= s) instanceof IntPredicate feas
            && new int[]{1, m + 1} instanceof int[] lh
            && IntStream.range(0, 19).filter(it -> lh[0] < lh[1] && Integer.valueOf((lh[0] + lh[1]) / 2) instanceof Integer mid && (feas.test(mid) ? (lh[1] = mid) > 0 : (lh[0] = mid + 1) > 0)).count() >= 0
            ? (lh[0] > m ? "-1" : lh[0] + "\n" + IntStream.of(pk.apply(lh[0])).mapToObj(g -> g + " " + (v[2 + 2 * m + 2 * g] == 1 ? pa[lh[0]] : pb[lh[0]])).collect(Collectors.joining("\n"))) : "");
    }
}
