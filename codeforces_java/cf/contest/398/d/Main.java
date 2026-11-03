import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw0 && Arrays.copyOf(raw0, raw0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] t && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).allMatch(i -> (raw[i] >= 48 && raw[i] <= 57 ? (st[1] = st[1] * 10 + raw[i] - 48) + (st[2] = 1) : raw[i] > 57 ? -(t[st[0]++] = -raw[i]) : st[2] == 1 ? (t[st[0]++] = st[1]) + (st[1] = st[2] = 0) : 0) >= 0)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer q && Integer.valueOf(t[3]) instanceof Integer o
            && new int[n + 1] instanceof int[] on && IntStream.range(0, o).allMatch(i -> (on[t[4 + i]] = 1) > 0)
            && Integer.valueOf(4 + o + 2 * m) instanceof Integer qp
            && new int[q] instanceof int[] qt && new int[q] instanceof int[] qa && new int[q] instanceof int[] qb && new int[1] instanceof int[] pt && (pt[0] = qp) > 0
            && IntStream.range(0, q).allMatch(j -> (qt[j] = -t[pt[0]]) > 0 && (qa[j] = t[pt[0] + 1]) >= 0 && (qb[j] = qt[j] == 65 || qt[j] == 68 ? t[pt[0] + 2] : 0) >= 0 && (pt[0] += qt[j] == 65 || qt[j] == 68 ? 3 : 2) > 0)
            && ((LongBinaryOperator) (a, b) -> Math.min(a, b) << 16 | Math.max(a, b)) instanceof LongBinaryOperator kf
            && LongStream.concat(IntStream.range(0, m).mapToLong(i -> kf.applyAsLong(t[4 + o + 2 * i], t[5 + o + 2 * i])), IntStream.range(0, q).filter(j -> qt[j] == 65).mapToLong(j -> kf.applyAsLong(qa[j], qb[j]))).sorted().distinct().toArray() instanceof long[] ks
            && Integer.valueOf(ks.length) instanceof Integer E
            && IntStream.range(0, E).map(e -> (int) (ks[e] >> 16)).toArray() instanceof int[] eu && IntStream.range(0, E).map(e -> (int) (ks[e] & 65535)).toArray() instanceof int[] ev
            && IntStream.range(0, m).map(i -> Arrays.binarySearch(ks, kf.applyAsLong(t[4 + o + 2 * i], t[5 + o + 2 * i]))).toArray() instanceof int[] ie
            && IntStream.range(0, q).map(j -> qt[j] == 65 || qt[j] == 68 ? Arrays.binarySearch(ks, kf.applyAsLong(qa[j], qb[j])) : 0).toArray() instanceof int[] qe
            && new int[n + 2] instanceof int[] ad && IntStream.range(0, E).allMatch(e -> ++ad[eu[e] + 1] > 0 && ++ad[ev[e] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (ad[v] += ad[v - 1]) >= 0)
            && Arrays.copyOf(ad, n + 2) instanceof int[] fp && new int[2 * E] instanceof int[] adjE && new int[2 * E] instanceof int[] adjO
            && IntStream.range(0, E).allMatch(e -> (adjE[fp[eu[e]]] = e) >= 0 && (adjO[fp[eu[e]]++] = ev[e]) > 0 && (adjE[fp[ev[e]]] = e) >= 0 && (adjO[fp[ev[e]]++] = eu[e]) > 0)
            && new boolean[n + 2] instanceof boolean[] hv && IntStream.rangeClosed(1, n).allMatch(v -> (hv[v] = ad[v + 1] - ad[v] > 600) || true)
            && new int[n + 2] instanceof int[] hs && IntStream.range(0, E).allMatch(e -> (!hv[ev[e]] || ++hs[eu[e] + 1] > 0) && (!hv[eu[e]] || ++hs[ev[e] + 1] > 0))
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (hs[v] += hs[v - 1]) >= 0)
            && Arrays.copyOf(hs, n + 2) instanceof int[] hp && new int[2 * E] instanceof int[] hE && new int[2 * E] instanceof int[] hO
            && IntStream.range(0, E).allMatch(e -> (!hv[ev[e]] || (hE[hp[eu[e]]] = e) >= 0 && (hO[hp[eu[e]]++] = ev[e]) > 0) && (!hv[eu[e]] || (hE[hp[ev[e]]] = e) >= 0 && (hO[hp[ev[e]]++] = eu[e]) > 0))
            && new int[E] instanceof int[] act && new int[n + 1] instanceof int[] cnt
            && ((IntPredicate) e -> act[e] == 1 || (act[e] = 1) == 1 && (cnt[ev[e]] += on[eu[e]]) > Integer.MIN_VALUE && (cnt[eu[e]] += on[ev[e]]) > Integer.MIN_VALUE) instanceof IntPredicate addE
            && ((IntPredicate) e -> act[e] == 0 || (act[e] = 0) == 0 && (cnt[ev[e]] -= on[eu[e]]) > Integer.MIN_VALUE && (cnt[eu[e]] -= on[ev[e]]) > Integer.MIN_VALUE) instanceof IntPredicate delE
            && IntStream.range(0, m).allMatch(i -> addE.test(ie[i]))
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).allMatch(j -> Integer.valueOf(qa[j]) instanceof Integer u
                && (qt[j] == 65 ? addE.test(qe[j])
                    : qt[j] == 68 ? delE.test(qe[j])
                    : qt[j] == 79 ? on[u] == 1 || (on[u] = 1) == 1 && IntStream.range(hs[u], hs[u + 1]).allMatch(k -> (cnt[hO[k]] += act[hE[k]]) > Integer.MIN_VALUE)
                    : qt[j] == 70 ? on[u] == 0 || (on[u] = 0) == 0 && IntStream.range(hs[u], hs[u + 1]).allMatch(k -> (cnt[hO[k]] -= act[hE[k]]) > Integer.MIN_VALUE)
                    : sb.append(hv[u] ? cnt[u] : IntStream.range(ad[u], ad[u + 1]).map(k -> act[adjE[k]] * on[adjO[k]]).sum()).append('\n') != null))
            ? sb.toString().trim() : "");
    }
}
