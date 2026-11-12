
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
            && new boolean[n + 2] instanceof boolean[] hv && IntStream.rangeClosed(1, n).allMatch(v -> (hv[v] = ad[v + 1] > 450) || true)
            && new int[n + 2] instanceof int[] hc && IntStream.range(0, E).allMatch(e -> (!hv[ev[e]] || ++hc[eu[e]] > 0) && (!hv[eu[e]] || ++hc[ev[e]] > 0))
            && IntStream.range(0, n + 2).map(v -> (hc[v] + 7) / 8 * 8).toArray() instanceof int[] hz
            && new int[n + 3] instanceof int[] bs && IntStream.rangeClosed(1, n).allMatch(v -> (bs[v + 1] = bs[v] + hz[v] + (ad[v + 1] - hc[v] + 7) / 8 * 8) >= 0)
            && Arrays.copyOf(bs, n + 2) instanceof int[] ph && IntStream.range(0, n + 2).map(v -> bs[v] + hz[v]).toArray() instanceof int[] pl
            && new int[bs[n + 1]] instanceof int[] adjO && new int[bs[n + 1]] instanceof int[] ae && new int[E] instanceof int[] su && new int[E] instanceof int[] sv
            && IntStream.range(0, E).allMatch(e -> (su[e] = hv[ev[e]] ? ph[eu[e]]++ : pl[eu[e]]++) >= 0 && (adjO[su[e]] = ev[e]) > 0 && (sv[e] = hv[eu[e]] ? ph[ev[e]]++ : pl[ev[e]]++) >= 0 && (adjO[sv[e]] = eu[e]) > 0)
            && new int[n + 1] instanceof int[] cnt
            && ((IntPredicate) e -> ae[su[e]] == 1 || (ae[su[e]] = 1) == 1 && (ae[sv[e]] = 1) == 1 && (cnt[ev[e]] += on[eu[e]]) > Integer.MIN_VALUE && (cnt[eu[e]] += on[ev[e]]) > Integer.MIN_VALUE) instanceof IntPredicate addE
            && ((IntPredicate) e -> ae[su[e]] == 0 || (ae[su[e]] = 0) == 0 && (ae[sv[e]] = 0) == 0 && (cnt[ev[e]] -= on[eu[e]]) > Integer.MIN_VALUE && (cnt[eu[e]] -= on[ev[e]]) > Integer.MIN_VALUE) instanceof IntPredicate delE
            && IntStream.range(0, m).allMatch(i -> addE.test(ie[i]))
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).allMatch(j -> Integer.valueOf(qa[j]) instanceof Integer u
                && (qt[j] == 65 ? addE.test(qe[j])
                    : qt[j] == 68 ? delE.test(qe[j])
                    : qt[j] == 79 ? on[u] == 1 || (on[u] = 1) == 1 && IntStream.range(bs[u] >> 3, bs[u] + hz[u] >> 3).map(c -> (cnt[adjO[(c << 3) + 0]] += ae[(c << 3) + 0])+(cnt[adjO[(c << 3) + 1]] += ae[(c << 3) + 1])+(cnt[adjO[(c << 3) + 2]] += ae[(c << 3) + 2])+(cnt[adjO[(c << 3) + 3]] += ae[(c << 3) + 3])+(cnt[adjO[(c << 3) + 4]] += ae[(c << 3) + 4])+(cnt[adjO[(c << 3) + 5]] += ae[(c << 3) + 5])+(cnt[adjO[(c << 3) + 6]] += ae[(c << 3) + 6])+(cnt[adjO[(c << 3) + 7]] += ae[(c << 3) + 7])).sum() * 0 == 0
                    : qt[j] == 70 ? on[u] == 0 || (on[u] = 0) == 0 && IntStream.range(bs[u] >> 3, bs[u] + hz[u] >> 3).map(c -> (cnt[adjO[(c << 3) + 0]] -= ae[(c << 3) + 0])+(cnt[adjO[(c << 3) + 1]] -= ae[(c << 3) + 1])+(cnt[adjO[(c << 3) + 2]] -= ae[(c << 3) + 2])+(cnt[adjO[(c << 3) + 3]] -= ae[(c << 3) + 3])+(cnt[adjO[(c << 3) + 4]] -= ae[(c << 3) + 4])+(cnt[adjO[(c << 3) + 5]] -= ae[(c << 3) + 5])+(cnt[adjO[(c << 3) + 6]] -= ae[(c << 3) + 6])+(cnt[adjO[(c << 3) + 7]] -= ae[(c << 3) + 7])).sum() * 0 == 0
                    : sb.append(hv[u] ? cnt[u] : IntStream.range(bs[u] >> 3, bs[u + 1] >> 3).map(c -> ae[(c << 3) + 0] * on[adjO[(c << 3) + 0]]+ae[(c << 3) + 1] * on[adjO[(c << 3) + 1]]+ae[(c << 3) + 2] * on[adjO[(c << 3) + 2]]+ae[(c << 3) + 3] * on[adjO[(c << 3) + 3]]+ae[(c << 3) + 4] * on[adjO[(c << 3) + 4]]+ae[(c << 3) + 5] * on[adjO[(c << 3) + 5]]+ae[(c << 3) + 6] * on[adjO[(c << 3) + 6]]+ae[(c << 3) + 7] * on[adjO[(c << 3) + 7]]).sum()).append('\n') != null))
            ? sb.toString().trim() : "");
    }
}



