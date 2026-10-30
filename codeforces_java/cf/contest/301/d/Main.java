import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && new int[n + 2] instanceof int[] pos && IntStream.rangeClosed(1, n).filter(i -> (pos[v[1 + i]] = i) > 0).count() >= 0
            && Integer.valueOf((int) Math.sqrt(n)) instanceof Integer T
            && ((Function<IntBinaryOperator, Boolean>) f -> IntStream.rangeClosed(1, T).filter(t -> IntStream.rangeClosed(1, n / t).filter(x -> f.applyAsInt(pos[x], pos[t * x]) >= 0).count() >= 0).count() >= 0
                && IntStream.rangeClosed(1, n / (T + 1)).filter(x -> IntStream.rangeClosed(T + 1, n / x).filter(t -> f.applyAsInt(pos[x], pos[t * x]) >= 0).count() >= 0).count() >= 0) instanceof Function<IntBinaryOperator, Boolean> gen
            && new int[n + 3] instanceof int[] sh && gen.apply((a, b) -> ++sh[Math.max(a, b) + 1])
            && IntStream.rangeClosed(1, n + 1).filter(i -> (sh[i] += sh[i - 1]) >= 0).count() >= 0
            && new int[sh[n + 1]] instanceof int[] lo && sh.clone() instanceof int[] fill
            && gen.apply((a, b) -> (lo[fill[Math.max(a, b)]++] = Math.min(a, b)) >= 0 ? 1 : 0)
            && new int[n + 3] instanceof int[] qh
            && IntStream.range(0, m).filter(q -> ++qh[v[n + 3 + 2 * q] + 1] > 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(i -> (qh[i] += qh[i - 1]) >= 0).count() >= 0
            && new int[m] instanceof int[] qo && qh.clone() instanceof int[] qf
            && IntStream.range(0, m).filter(q -> (qo[qf[v[n + 3 + 2 * q]]++] = q) >= 0).count() >= 0
            && new int[n + 2] instanceof int[] c1 && new int[(n >> 6) + 2] instanceof int[] c2 && new int[(n >> 12) + 2] instanceof int[] c3
            && new int[m] instanceof int[] ans
            && IntStream.rangeClosed(1, n).filter(r -> IntStream.range(sh[r], sh[r + 1]).filter(i -> ++c1[lo[i]] > 0 && ++c2[lo[i] >> 6] > 0 && ++c3[lo[i] >> 12] > 0).count() >= 0
                && IntStream.range(qh[r], qh[r + 1]).filter(k -> Integer.valueOf(qo[k]) instanceof Integer q && Integer.valueOf(v[n + 2 + 2 * q]) instanceof Integer l
                    && (ans[q] = sh[r + 1] - Arrays.stream(c3, 0, l >> 12).sum() - Arrays.stream(c2, (l >> 12) << 6, l >> 6).sum() - Arrays.stream(c1, (l >> 6) << 6, l).sum()) >= 0).count() >= 0).count() >= 0
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
