import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[1]) instanceof Integer m
            && Integer.valueOf(n + 1) instanceof Integer N1 && Integer.valueOf(2 * n) instanceof Integer Lmax
            && Integer.valueOf(a.length) instanceof Integer T0
            && new int[m] instanceof int[] eu && new int[m] instanceof int[] ev && new int[m] instanceof int[] vo && new int[m] instanceof int[] vl
            && new int[]{2} instanceof int[] p
            && IntStream.range(0, m).filter(i -> (eu[i] = a[p[0]]) < 0 || (ev[i] = a[p[0] + 1]) < 0 || (vl[i] = a[p[0] + 2]) < 0 || (vo[i] = p[0] + 3) < 0 || (p[0] += 3 + vl[i]) < 0).count() == 0
            && Arrays.copyOf(a, 2 * T0) instanceof int[] V
            && IntStream.range(0, m).filter(e -> IntStream.range(0, vl[e]).filter(j -> (V[T0 + vo[e] + j] = a[vo[e] + vl[e] - 1 - j]) < 0).count() > 0).count() == 0
            && new int[N1 * N1] instanceof int[] T
            && IntStream.range(0, m).filter(e -> T[eu[e] * N1 + ev[e]] == 0 && (T[eu[e] * N1 + ev[e]] = e + 1) < 0).count() == 0
            && new int[Lmax + 6] instanceof int[] PB && new int[Lmax + 6] instanceof int[] PE
            && Integer.valueOf(3 * m + p[0] + 5) instanceof Integer SM
            && new int[SM] instanceof int[] sa && new int[SM] instanceof int[] sb && new int[SM] instanceof int[] sl && new int[]{0} instanceof int[] c
            && Integer.valueOf((Lmax + 1) * N1) instanceof Integer W
            && ((Predicate<int[]>) q -> (sa[c[0]] = (q[0] == 1 || q[0] == 2 ? 0 : W) + q[1]) >= 0
                && (sb[c[0]] = (q[0] == 1 || q[0] == 4 ? 0 : W) + q[2]) >= 0 && (sl[c[0]] = q[3]) > 0 && ++c[0] > 0) instanceof Predicate<int[]> add
            && ((ToLongFunction<int[]>) r -> r[3] - r[2] > r[4] || r[4] < 0 ? -1L
                : new int[]{0, 1, r[3] - r[2], 0, r[1], 0, 0} instanceof int[] s && (PB[0] = r[2]) >= 0 && (PE[0] = r[3]) >= 0
                && IntStream.range(0, r[4] + 1).filter(i -> s[2] == 0 || !((s[5] = V[PB[s[0]]]) >= 1 && s[5] <= n
                    && (s[6] = T[r[0] == 0 ? s[4] * N1 + s[5] : s[5] * N1 + s[4]]) > 0
                    && s[2] - 1 + vl[s[6] - 1] <= r[4] - s[3] - 1
                    && (++PB[s[0]] == PE[s[0]] ? ++s[0] >= 0 : true)
                    && (vl[s[6] - 1] == 0 || (PB[s[1]] = vo[s[6] - 1] + (r[0] == 0 ? 0 : T0)) >= 0 && (PE[s[1]] = PB[s[1]] + vl[s[6] - 1]) >= 0 && ++s[1] > 0)
                    && (s[2] += vl[s[6] - 1] - 1) >= 0 && (s[4] = s[5]) > 0 && ++s[3] > 0)).findFirst() instanceof OptionalInt o
                && s[2] == 0 ? ((long) s[3] << 20 | s[4]) : -1L) instanceof ToLongFunction<int[]> ch
            && IntStream.range(0, m).filter(e -> vl[e] == 0 && add.test(new int[]{2, eu[e], ev[e], 1})).count() >= 0
            && IntStream.range(0, m).filter(e -> vl[e] > 0 && V[vo[e]] == ev[e]
                && Long.valueOf(ch.applyAsLong(new int[]{0, ev[e], vo[e] + 1, vo[e] + vl[e], Lmax - 1})) instanceof Long rs && rs >= 0
                && add.test(new int[]{1, eu[e], (int) (rs & 1048575), 1 + (int) (rs >> 20)})).count() >= 0
            && IntStream.range(0, m).filter(e -> vl[e] > 0 && V[vo[e] + vl[e] - 1] == eu[e]
                && Long.valueOf(ch.applyAsLong(new int[]{1, eu[e], T0 + vo[e] + 1, T0 + vo[e] + vl[e], Lmax - 1})) instanceof Long rs && rs >= 0
                && add.test(new int[]{3, (int) (rs & 1048575), ev[e], 1 + (int) (rs >> 20)})).count() >= 0
            && IntStream.range(0, m).filter(e -> IntStream.range(0, Math.max(0, vl[e] - 1)).filter(q -> V[vo[e] + q] == eu[e] && V[vo[e] + q + 1] == ev[e]
                && Long.valueOf(ch.applyAsLong(new int[]{1, eu[e], T0 + vo[e] + vl[e] - q, T0 + vo[e] + vl[e], Lmax - 1})) instanceof Long rb && rb >= 0
                && Long.valueOf(ch.applyAsLong(new int[]{0, ev[e], vo[e] + q + 2, vo[e] + vl[e], Lmax - 1 - (int) (rb >> 20)})) instanceof Long rf && rf >= 0
                && add.test(new int[]{4, (int) (rb & 1048575), (int) (rf & 1048575), 1 + (int) (rb >> 20) + (int) (rf >> 20)})).count() < 0).count() == 0
            && new int[2 * W] instanceof int[] D
            && IntStream.rangeClosed(1, n).filter(v -> (D[W + v] = 1) < 0).count() == 0
            && IntStream.rangeClosed(0, Lmax).filter(L -> IntStream.range(0, c[0]).filter(s -> sl[s] + L <= Lmax && D[sa[s] + L * N1] != 0
                && (D[sb[s] + (L + sl[s]) * N1] = (D[sb[s] + (L + sl[s]) * N1] + D[sa[s] + L * N1]) % 1000000007) < 0).count() > 0).count() == 0
            ? IntStream.rangeClosed(1, Lmax).mapToObj(L -> "" + IntStream.rangeClosed(1, n).mapToLong(v -> D[L * N1 + v]).sum() % 1000000007L).collect(Collectors.joining("\n")) : "");
    }
}
