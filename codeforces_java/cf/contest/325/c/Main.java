import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (ps[0] = ps[0] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (ps[3] = 1) > 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((v[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) != Integer.MIN_VALUE && (ps[0] = 0) == 0 && (ps[2] = 0) == 0 && (ps[3] = 0) == 0))
            && Integer.valueOf(v[0]) instanceof Integer m && Integer.valueOf(v[1]) instanceof Integer n && Long.valueOf(314000000L) instanceof Long CAP
            && new int[m] instanceof int[] own && new int[m] instanceof int[] len && new int[m] instanceof int[] bs && new int[m] instanceof int[] d && new int[m + 1] instanceof int[] ms && new int[]{2} instanceof int[] ptr
            && IntStream.range(0, m).allMatch(i -> (own[i] = v[ptr[0]] - 1) >= -1 && (len[i] = v[ptr[0] + 1]) >= 0 && (bs[i] = ptr[0] + 2) > 0 && (ptr[0] += 2 + len[i]) > 0
                && (d[i] = (int) IntStream.range(bs[i], bs[i] + len[i]).filter(t -> v[t] == -1).count()) >= 0 && (ms[i + 1] = ms[i] + len[i] - d[i]) >= 0)
            && new int[ms[m] + 1] instanceof int[] mon
            && IntStream.range(0, m).allMatch(i -> IntStream.range(bs[i], bs[i] + len[i]).filter(t -> v[t] != -1).map(t -> (mon[ms[i] + (int) IntStream.range(bs[i], t).filter(u -> v[u] != -1).count()] = v[t] - 1)).sum() >= 0)
            && new int[n + 2] instanceof int[] ocS && new int[n + 2] instanceof int[] rbS
            && IntStream.range(0, ms[m]).allMatch(t -> ++ocS[mon[t] + 1] > 0) && IntStream.range(0, m).allMatch(i -> ++rbS[own[i] + 1] > 0)
            && IntStream.range(0, n).allMatch(i -> (ocS[i + 1] += ocS[i]) >= 0 & (rbS[i + 1] += rbS[i]) >= 0)
            && ocS.clone() instanceof int[] ocP && rbS.clone() instanceof int[] rbP && new int[ms[m] + 1] instanceof int[] oc && new int[m + 1] instanceof int[] rb
            && IntStream.range(0, m).allMatch(i -> (rb[rbP[own[i]]++] = i) >= 0 && IntStream.range(ms[i], ms[i + 1]).map(t -> oc[ocP[mon[t]]++] = i).sum() >= 0)
            && new int[m] instanceof int[] rem && new long[m] instanceof long[] val && new long[n] instanceof long[] mn && new boolean[n] instanceof boolean[] fin
            && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq
            && IntStream.range(0, m).allMatch(i -> (rem[i] = ms[i + 1] - ms[i]) >= 0 && (val[i] = d[i]) >= 0 && (rem[i] != 0 || pq.add((long) d[i] << 17 | own[i])))
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(e -> Integer.valueOf((int) (e & 131071)) instanceof Integer w && !fin[w] && (fin[w] = true) && (mn[w] = Math.min(CAP, e >> 17)) >= 0
                && IntStream.range(ocS[w], ocS[w + 1]).filter(t -> (val[oc[t]] = Math.min(CAP, val[oc[t]] + mn[w])) >= 0 && --rem[oc[t]] == 0 && !fin[own[oc[t]]] && pq.add(val[oc[t]] << 17 | own[oc[t]])).count() >= 0).count() >= 0
            && new int[n] instanceof int[] state && new int[n] instanceof int[] rp && new int[n] instanceof int[] cp && new int[n] instanceof int[] infI && new int[n + 1] instanceof int[] stk
            && new long[n] instanceof long[] sm && new long[n] instanceof long[] bst && new long[n] instanceof long[] mx && new int[]{0, 0} instanceof int[] sp
            && IntStream.generate(() -> 0).anyMatch(z -> sp[0] == 0
                ? sp[1] >= n || (fin[sp[1]] && state[sp[1]] == 0 ? (state[sp[1]] = 1) * 0 + (rp[sp[1]] = rbS[sp[1]]) * 0 + (cp[sp[1]] = -1) * 0 + (stk[sp[0]++] = sp[1]) * 0 + sp[1]++ * 0 > 0 : sp[1]++ < 0)
                : Integer.valueOf(stk[sp[0] - 1]) instanceof Integer u
                    ? rp[u] >= rbS[u + 1]
                        ? (state[u] = 2) * 0 + (mx[u] = Math.min(CAP, bst[u])) * 0 + (sp[0]--) * 0 > 0
                        : rem[rb[rp[u]]] != 0 ? (rp[u]++) * 0 > 0
                        : cp[u] < 0 ? (cp[u] = ms[rb[rp[u]]]) * 0 + (sm[u] = d[rb[rp[u]]]) * 0 > 0
                        : cp[u] >= ms[rb[rp[u]] + 1] ? (bst[u] = Math.max(bst[u], Math.min(CAP, sm[u]))) * 0 + (rp[u]++) * 0 + (cp[u] = -1) * 0 > 0
                        : state[mon[cp[u]]] == 0 ? (state[mon[cp[u]]] = 1) * 0 + (rp[mon[cp[u]]] = rbS[mon[cp[u]]]) * 0 + (cp[mon[cp[u]]] = -1) * 0 + (stk[sp[0]++] = mon[cp[u]]) * 0 > 0
                        : state[mon[cp[u]]] == 1 ? (infI[u] = 1) * 0 + (cp[u]++) * 0 > 0
                        : (infI[u] |= infI[mon[cp[u]]]) * 0 + (sm[u] = Math.min(CAP, sm[u] + mx[mon[cp[u]]])) * 0 + (cp[u]++) * 0 > 0
                    : true)
            ? IntStream.range(0, n).mapToObj(w -> fin[w] ? mn[w] + " " + (infI[w] == 1 ? -2 : mx[w]) : "-1 -1").collect(Collectors.joining("\n")) : "");
    }
}
