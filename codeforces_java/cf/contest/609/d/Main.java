import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{-1, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> Integer.valueOf(i < raw.length ? raw[i] : 32) instanceof Integer ch
                && (ch >= 48 ? (st[0] = Math.max(st[0], 0) * 10 + ch - 48) >= 0 : st[0] < 0 || ((v[st[1]++] = st[0]) >= 0 && (st[0] = -1) < 0))).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && Integer.valueOf(v[2]) instanceof Integer k && Integer.valueOf(v[3]) instanceof Integer s
            && new int[m + 1] instanceof int[] pa && new int[m + 1] instanceof int[] pb
            && IntStream.rangeClosed(1, m).filter(d -> (pa[d] = d == 1 || v[3 + d] < v[3 + pa[d - 1]] ? d : pa[d - 1]) >= 0
                && (pb[d] = d == 1 || v[3 + m + d] < v[3 + m + pb[d - 1]] ? d : pb[d - 1]) >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(g -> v[2 + 2 * m + 2 * g] == 1).mapToLong(g -> ((long) v[3 + 2 * m + 2 * g] << 18) | g).sorted().mapToInt(x -> (int) (x & 262143)).toArray() instanceof int[] D1
            && IntStream.rangeClosed(1, n).filter(g -> v[2 + 2 * m + 2 * g] == 2).mapToLong(g -> ((long) v[3 + 2 * m + 2 * g] << 18) | g).sorted().mapToInt(x -> (int) (x & 262143)).toArray() instanceof int[] D2
            && ((IntFunction<int[]>) d -> Long.valueOf(v[3 + pa[d]]) instanceof Long A && Long.valueOf(v[3 + m + pb[d]]) instanceof Long B && new int[]{0, 0} instanceof int[] ij
                ? IntStream.range(0, k).map(q -> ij[0] < D1.length && (ij[1] >= D2.length || (long) v[3 + 2 * m + 2 * D1[ij[0]]] * A <= (long) v[3 + 2 * m + 2 * D2[ij[1]]] * B) ? D1[ij[0]++] : D2[ij[1]++]).toArray() : null) instanceof IntFunction<int[]> pk
            && ((IntPredicate) d -> IntStream.of(pk.apply(d)).mapToLong(g -> (long) v[3 + 2 * m + 2 * g] * (v[2 + 2 * m + 2 * g] == 1 ? v[3 + pa[d]] : v[3 + m + pb[d]])).sum() <= s) instanceof IntPredicate feas
            && new int[]{1, m + 1} instanceof int[] lh
            && IntStream.range(0, 19).filter(it -> lh[0] < lh[1] && Integer.valueOf((lh[0] + lh[1]) / 2) instanceof Integer mid && (feas.test(mid) ? (lh[1] = mid) > 0 : (lh[0] = mid + 1) > 0)).count() >= 0
            ? (lh[0] > m ? "-1" : lh[0] + "\n" + IntStream.of(pk.apply(lh[0])).mapToObj(g -> g + " " + (v[2 + 2 * m + 2 * g] == 1 ? pa[lh[0]] : pb[lh[0]])).collect(Collectors.joining("\n"))) : "");
    }
}
