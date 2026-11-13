import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[n + 1]) instanceof Integer q && Integer.valueOf(300) instanceof Integer B
            && new int[n] instanceof int[] a && IntStream.range(0, n).filter(i -> (a[i] = tok[1 + i]) > 0).count() >= 0
            && new int[n + 2] instanceof int[] tot && IntStream.range(0, n).filter(i -> ++tot[a[i]] > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> tot[v] > B).toArray() instanceof int[] hv
            && Integer.valueOf(Math.max(1, (int) (n / Math.sqrt(q)))) instanceof Integer bs
            && IntStream.range(0, q).mapToLong(i -> ((long) (tok[n + 2 + 2 * i] - 1) / bs << 40) | ((long) (((tok[n + 2 + 2 * i] - 1) / bs & 1) == 0 ? tok[n + 3 + 2 * i] - 1 : 200000 - (tok[n + 3 + 2 * i] - 1)) << 20) | i).toArray() instanceof long[] keys
            && IntStream.of(0).peek(z -> Arrays.sort(keys)).sum() == 0
            && new int[n + 2] instanceof int[] cnt && new int[n + B + 3] instanceof int[] cc && new int[]{0, 0, -1} instanceof int[] mo
            && new IntPredicate[2] instanceof IntPredicate[] mv
            && (mv[0] = i -> Integer.valueOf(a[i]) instanceof Integer v && --cc[cnt[v]] != 99999999 && ++cc[++cnt[v]] != 99999999 && (cnt[v] != 1 || ++mo[0] > 0)) != null
            && (mv[1] = i -> Integer.valueOf(a[i]) instanceof Integer v && --cc[cnt[v]] != 99999999 && ++cc[--cnt[v]] != 99999999 && (cnt[v] != 0 || --mo[0] >= 0)) != null
            && new int[B + 2] instanceof int[] T && new int[hv.length + 1] instanceof int[] H && new int[n + B + 16] instanceof int[] Mv && new int[n + B + 16] instanceof int[] Mc
            && new int[6] instanceof int[] S && new long[1] instanceof long[] AN && new IntBinaryOperator[1] instanceof IntBinaryOperator[] push && new IntSupplier[1] instanceof IntSupplier[] take
            && (push[0] = (s, c) -> s <= B ? (T[s] += c) : S[3] > S[2] && Mv[S[3] - 1] == s ? (Mc[S[3] - 1] += c) : (Mv[S[3]] = s) + (Mc[S[3]++] = c)) != null
            && (take[0] = () -> Integer.valueOf(S[4] > S[5] ? H[S[5]] : Integer.MAX_VALUE) instanceof Integer hh && Integer.valueOf(S[3] > S[2] ? Mv[S[2]] : Integer.MAX_VALUE) instanceof Integer mm
                ? (hh <= mm ? H[S[5]++] : Mc[S[2]]-- == 1 ? Mv[S[2]++] : Mv[S[2]]) : 0) != null
            && new long[q] instanceof long[] res
            ? (IntStream.range(0, q).filter(qi -> Integer.valueOf((int) (keys[qi] & 1048575)) instanceof Integer id
                && IntStream.range(0, Math.max(0, mo[1] - tok[n + 2 + 2 * id] + 1)).filter(z -> mv[0].test(--mo[1])).count() >= 0
                && IntStream.range(0, Math.max(0, tok[n + 3 + 2 * id] - 1 - mo[2])).filter(z -> mv[0].test(++mo[2])).count() >= 0
                && IntStream.range(0, Math.max(0, tok[n + 2 + 2 * id] - 1 - mo[1])).filter(z -> mv[1].test(mo[1]++)).count() >= 0
                && IntStream.range(0, Math.max(0, mo[2] - tok[n + 3 + 2 * id] + 1)).filter(z -> mv[1].test(mo[2]--)).count() >= 0
                && (S[0] = mo[0]) >= 0 && (S[1] = 0) == 0 && (S[2] = 0) == 0 && (S[3] = 0) == 0 && (S[4] = 0) == 0 && (S[5] = 0) == 0 && (AN[0] = 0) == 0
                && IntStream.rangeClosed(1, B).filter(f -> (T[f] = cc[f]) >= 0).count() >= 0
                && IntStream.range(0, hv.length).filter(j -> cnt[hv[j]] > B && (H[S[4]++] = cnt[hv[j]]) > 0).count() >= 0
                && IntStream.of(0).peek(z -> Arrays.sort(H, 0, S[4])).sum() == 0
                && IntStream.rangeClosed(1, B).filter(f -> T[f] == 0 || Integer.valueOf(S[1] > 0 ? 1 : 0) instanceof Integer u && (AN[0] += u * (S[1] + f)) >= 0 && (u == 0 || push[0].applyAsInt(S[1] + f, 1) >= 0)
                    && (S[0] -= u) >= 0 && Integer.valueOf(T[f] - u) instanceof Integer c && (AN[0] += 2L * f * (c / 2)) >= 0 && (S[0] -= c / 2) >= 0 && (c / 2 == 0 || push[0].applyAsInt(2 * f, c / 2) >= 0) && (S[1] = c % 2 == 1 ? f : 0) >= 0).count() >= 0
                && (IntStream.range(0, 2 * n + 10).allMatch(z -> S[0] > 1 && (S[1] > 0
                    ? Integer.valueOf(S[1]) instanceof Integer p && (S[1] = 0) == 0 && Integer.valueOf(take[0].getAsInt()) instanceof Integer b && (AN[0] += p + b) > 0 && (S[0] -= 1) >= 0 && push[0].applyAsInt(p + b, 1) >= 0
                    : Integer.valueOf(S[4] > S[5] ? H[S[5]] : Integer.MAX_VALUE) instanceof Integer hh && Integer.valueOf(S[3] > S[2] ? Mv[S[2]] : Integer.MAX_VALUE) instanceof Integer mm
                        && (hh <= mm || Mc[S[2]] < 2
                            ? Integer.valueOf(take[0].getAsInt()) instanceof Integer x && Integer.valueOf(take[0].getAsInt()) instanceof Integer y && (AN[0] += x + y) > 0 && (S[0] -= 1) >= 0 && push[0].applyAsInt(x + y, 1) >= 0
                            : Integer.valueOf(Mc[S[2]] / 2) instanceof Integer m && (AN[0] += 2L * mm * m) > 0 && (S[0] -= m) >= 0 && (Mc[S[2]] -= 2 * m) >= 0 && (Mc[S[2]] > 0 || ++S[2] > 0) && push[0].applyAsInt(2 * mm, m) >= 0))) || true)
                && (res[id] = AN[0]) >= 0).count() >= 0 ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "") : "");
    }
}
