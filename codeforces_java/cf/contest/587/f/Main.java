import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] ts && new int[raw.length / 2 + 2] instanceof int[] tl && new int[]{0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] > 32 ? st[1] == 0 && (ts[st[0]] = i) >= 0 & (st[1] = 1) > 0 : st[1] == 1 && (tl[st[0]] = i - ts[st[0]]) >= 0 & ++st[0] > 0 & (st[1] = 0) == 0).count() >= 0
            && ((IntUnaryOperator) k -> IntStream.range(ts[k], ts[k] + tl[k]).reduce(0, (a, i) -> a * 10 + raw[i] - 48)) instanceof IntUnaryOperator num
            && Integer.valueOf(num.applyAsInt(0)) instanceof Integer n && Integer.valueOf(num.applyAsInt(1)) instanceof Integer q && Integer.valueOf(350) instanceof Integer B
            && Integer.valueOf(IntStream.range(0, n).map(i -> tl[2 + i]).sum()) instanceof Integer L
            && new int[(L + 2) * 26] instanceof int[] go && new int[raw.length] instanceof int[] pnAt && new int[]{0, 0} instanceof int[] cn
            && IntStream.range(0, n).filter(i -> (cn[1] = 0) == 0 & IntStream.range(ts[2 + i], ts[2 + i] + tl[2 + i]).filter(p -> Integer.valueOf(raw[p] - 97) instanceof Integer c
                && (pnAt[p] = (cn[1] = go[cn[1] * 26 + c] != 0 ? go[cn[1] * 26 + c] : (go[cn[1] * 26 + c] = ++cn[0]))) < 0).count() == 0).count() >= 0
            && Integer.valueOf(cn[0] + 1) instanceof Integer T
            && new int[T] instanceof int[] fail && new int[T] instanceof int[] qa && new int[]{1} instanceof int[] qt
            && IntStream.range(0, T).filter(i -> Integer.valueOf(qa[i]) instanceof Integer u
                && IntStream.range(0, 26).filter(c -> go[u * 26 + c] != 0
                    ? (fail[go[u * 26 + c]] = u == 0 ? 0 : go[fail[u] * 26 + c]) >= 0 & (qa[qt[0]++] = go[u * 26 + c]) > 0
                    : (go[u * 26 + c] = u == 0 ? 0 : go[fail[u] * 26 + c]) < 0).count() >= 0).count() >= 0
            && new int[T] instanceof int[] sz && new int[T] instanceof int[] tin && new int[T] instanceof int[] off
            && IntStream.range(0, T).filter(i -> (sz[i] = 1) < 0).count() == 0
            && IntStream.range(0, T - 1).filter(j -> (sz[fail[qa[T - 1 - j]]] += sz[qa[T - 1 - j]]) < 0).count() == 0
            && IntStream.range(1, T).filter(i -> Integer.valueOf(qa[i]) instanceof Integer v && (tin[v] = tin[fail[v]] + 1 + off[fail[v]]) < 0 | (off[fail[v]] += sz[v]) < 0).count() == 0
            && new int[n + 2] instanceof int[] endn && new int[raw.length] instanceof int[] tinAt
            && IntStream.rangeClosed(1, n).filter(i -> (endn[i] = pnAt[ts[1 + i] + tl[1 + i] - 1]) < 0).count() == 0
            && IntStream.range(0, raw.length).filter(p -> (tinAt[p] = tin[pnAt[p]]) < 0).count() == 0
            && new int[q] instanceof int[] qL && new int[q] instanceof int[] qR && new int[q] instanceof int[] qK && new int[q] instanceof int[] ans
            && new int[n + 2] instanceof int[] head && new int[2 * q] instanceof int[] nxt && new int[n + 2] instanceof int[] headK && new int[q] instanceof int[] nxtQ
            && IntStream.range(0, q).filter(j -> (qL[j] = num.applyAsInt(n + 2 + 3 * j)) < 0 | (qR[j] = num.applyAsInt(n + 3 + 3 * j)) < 0 | (qK[j] = num.applyAsInt(n + 4 + 3 * j)) < 0).count() == 0
            && IntStream.range(0, q).filter(j -> tl[1 + qK[j]] > B
                ? (nxtQ[j] = headK[qK[j]]) >= 0 & (headK[qK[j]] = j + 1) > 0
                : (nxt[2 * j] = head[qR[j]]) >= 0 & (head[qR[j]] = 2 * j + 1) > 0 & (qL[j] == 1 || (nxt[2 * j + 1] = head[qL[j] - 1]) >= 0 & (head[qL[j] - 1] = 2 * j + 2) > 0)).count() >= 0
            && new int[T] instanceof int[] c2 && new int[n + 2] instanceof int[] pref
            && IntStream.rangeClosed(1, n).filter(k -> tl[1 + k] > B && headK[k] != 0
                && Stream.of(0).peek(z -> Arrays.fill(c2, 0)).findFirst().isPresent()
                && IntStream.range(ts[1 + k], ts[1 + k] + tl[1 + k]).filter(p -> ++c2[pnAt[p]] < 0).count() == 0
                && IntStream.range(0, (T - 1) >> 3).filter(j -> (c2[fail[qa[T - 1 - 8 * j - 0]]] += c2[qa[T - 1 - 8 * j - 0]]) < 0 & (c2[fail[qa[T - 1 - 8 * j - 1]]] += c2[qa[T - 1 - 8 * j - 1]]) < 0 & (c2[fail[qa[T - 1 - 8 * j - 2]]] += c2[qa[T - 1 - 8 * j - 2]]) < 0 & (c2[fail[qa[T - 1 - 8 * j - 3]]] += c2[qa[T - 1 - 8 * j - 3]]) < 0 & (c2[fail[qa[T - 1 - 8 * j - 4]]] += c2[qa[T - 1 - 8 * j - 4]]) < 0 & (c2[fail[qa[T - 1 - 8 * j - 5]]] += c2[qa[T - 1 - 8 * j - 5]]) < 0 & (c2[fail[qa[T - 1 - 8 * j - 6]]] += c2[qa[T - 1 - 8 * j - 6]]) < 0 & (c2[fail[qa[T - 1 - 8 * j - 7]]] += c2[qa[T - 1 - 8 * j - 7]]) < 0).count() == 0
                && IntStream.range(8 * ((T - 1) >> 3), T - 1).filter(j -> (c2[fail[qa[T - 1 - j]]] += c2[qa[T - 1 - j]]) < 0).count() == 0
                && IntStream.range(0, n >> 3).filter(j -> (pref[8 * j + 1] = pref[8 * j + 0] + c2[endn[8 * j + 1]]) < 0 & (pref[8 * j + 2] = pref[8 * j + 1] + c2[endn[8 * j + 2]]) < 0 & (pref[8 * j + 3] = pref[8 * j + 2] + c2[endn[8 * j + 3]]) < 0 & (pref[8 * j + 4] = pref[8 * j + 3] + c2[endn[8 * j + 4]]) < 0 & (pref[8 * j + 5] = pref[8 * j + 4] + c2[endn[8 * j + 5]]) < 0 & (pref[8 * j + 6] = pref[8 * j + 5] + c2[endn[8 * j + 6]]) < 0 & (pref[8 * j + 7] = pref[8 * j + 6] + c2[endn[8 * j + 7]]) < 0 & (pref[8 * j + 8] = pref[8 * j + 7] + c2[endn[8 * j + 8]]) < 0).count() == 0
                && IntStream.rangeClosed(8 * (n >> 3) + 1, n).filter(i -> (pref[i] = pref[i - 1] + c2[endn[i]]) < 0).count() == 0
                && IntStream.iterate(headK[k], e -> e > 0, e -> nxtQ[e - 1]).filter(e -> (ans[e - 1] = pref[qR[e - 1]] - pref[qL[e - 1] - 1]) < 0).count() == 0).count() >= 0
            && new int[T + 512] instanceof int[] val && new int[(T >> 8) + 4] instanceof int[] badd
            && ((IntUnaryOperator) p -> val[tinAt[p]] + badd[tinAt[p] >> 8]) instanceof IntUnaryOperator pv
            && ((IntBinaryOperator) (a, b) -> a >> 8 == b >> 8 ? (IntStream.rangeClosed(a, b).filter(x -> ++val[x] < 0).count() > 0 ? 0 : 0)
                : (IntStream.rangeClosed(a, ((a >> 8) + 1 << 8) - 1).filter(x -> ++val[x] < 0).count() + IntStream.range((a >> 8) + 1, b >> 8).filter(x -> ++badd[x] < 0).count()
                    + IntStream.rangeClosed(b >> 8 << 8, b).filter(x -> ++val[x] < 0).count() > 0 ? 0 : 0)) instanceof IntBinaryOperator radd
            && IntStream.rangeClosed(1, n).filter(t -> radd.applyAsInt(tin[endn[t]], tin[endn[t]] + sz[endn[t]] - 1) >= 0
                && IntStream.iterate(head[t], e -> e > 0, e -> nxt[e - 1]).filter(e -> Integer.valueOf((e - 1) / 2) instanceof Integer j
                    && (ans[j] += (e % 2 == 1 ? 1 : -1) * (IntStream.range(0, tl[1 + qK[j]] >> 3).map(c -> pv.applyAsInt(ts[1 + qK[j]] + 8 * c + 0) + pv.applyAsInt(ts[1 + qK[j]] + 8 * c + 1) + pv.applyAsInt(ts[1 + qK[j]] + 8 * c + 2) + pv.applyAsInt(ts[1 + qK[j]] + 8 * c + 3) + pv.applyAsInt(ts[1 + qK[j]] + 8 * c + 4) + pv.applyAsInt(ts[1 + qK[j]] + 8 * c + 5) + pv.applyAsInt(ts[1 + qK[j]] + 8 * c + 6) + pv.applyAsInt(ts[1 + qK[j]] + 8 * c + 7)).sum() + IntStream.range(ts[1 + qK[j]] + (tl[1 + qK[j]] >> 3 << 3), ts[1 + qK[j]] + tl[1 + qK[j]]).map(pv).sum())) < 0).count() == 0).count() >= 0
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
