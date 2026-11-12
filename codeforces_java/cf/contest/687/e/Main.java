import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m
            && new int[n + 2] instanceof int[] off && new int[n + 2] instanceof int[] pos && new int[n + 2] instanceof int[] roff && new int[n + 2] instanceof int[] rpos
            && new int[m + 1] instanceof int[] adj && new int[m + 1] instanceof int[] radj
            && new boolean[n] instanceof boolean[] seen && new int[n] instanceof int[] cur && new int[n + 1] instanceof int[] stk && new int[n] instanceof int[] ord && new int[n] instanceof int[] comp
            && new int[n + 1] instanceof int[] q && new int[n] instanceof int[] mark && new int[n] instanceof int[] dist && new boolean[n + 1] instanceof boolean[] sink
            && new int[n + 1] instanceof int[] csz && new AtomicIntegerArray(n + 1) instanceof AtomicIntegerArray best && new boolean[n] instanceof boolean[] rem
            && new int[2] instanceof int[] cs && new int[1] instanceof int[] tl && new int[1] instanceof int[] sp && new int[1] instanceof int[] oc && new int[1] instanceof int[] cc
            && IntStream.range(0, m).filter(i -> off[v[2 + 2 * i]]++ + roff[v[3 + 2 * i]]++ < 0).count() == 0
            && IntStream.rangeClosed(1, n).filter(i -> (off[i] += off[i - 1]) + (roff[i] += roff[i - 1]) + (pos[i - 1] = off[i - 1]) + (rpos[i - 1] = roff[i - 1]) < 0).count() == 0
            && IntStream.range(0, m).filter(i -> (adj[pos[v[2 + 2 * i] - 1]++] = v[3 + 2 * i] - 1) + (radj[rpos[v[3 + 2 * i] - 1]++] = v[2 + 2 * i] - 1) < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (cur[i] = off[i]) + (comp[i] = -1) * 0 + ((sink[i] = true) ? 0 : 0) < 0).count() == 0
            && IntStream.range(0, n).filter(r -> !seen[r]).filter(r -> (stk[0] = r) + (sp[0] = 1) + ((seen[r] = true) ? 0 : 0)
                + (int) IntStream.iterate(0, i -> sp[0] > 0, i -> i + 1).filter(i -> (Integer) stk[sp[0] - 1] instanceof Integer x
                    && (cur[x] < off[x + 1] ? (seen[adj[cur[x]]] ? cur[x]++ : ((seen[adj[cur[x]]] = true) ? 0 : 0) + (stk[sp[0]++] = adj[cur[x]++])) : (ord[oc[0]++] = stk[--sp[0]])) < 0).count() < 0).count() == 0
            && IntStream.range(0, n).map(i -> ord[n - 1 - i]).filter(r -> comp[r] < 0).filter(r -> (comp[r] = cc[0]) + (q[0] = r) + (tl[0] = 1) + (cs[0] = 0) + (cs[1] = roff[r])
                + (int) IntStream.iterate(0, i -> cs[0] < tl[0], i -> i + 1).filter(i -> (cs[1] < roff[q[cs[0]] + 1]
                    ? (comp[radj[cs[1]]] >= 0 ? cs[1]++ : (comp[radj[cs[1]]] = cc[0]) * 0 + (q[tl[0]++] = radj[cs[1]]) * 0 + cs[1]++)
                    : (cs[1] = ++cs[0] < tl[0] ? roff[q[cs[0]]] : 0)) < 0).count() + (cc[0]++) < 0).count() == 0
            && IntStream.range(0, m).filter(i -> comp[v[2 + 2 * i] - 1] != comp[v[3 + 2 * i] - 1]).filter(i -> (sink[comp[v[2 + 2 * i] - 1]] = false)).count() == 0
            && IntStream.range(0, n).filter(u -> csz[comp[u]]++ < 0).count() == 0
            && IntStream.range(0, n).filter(c -> best.getAndSet(c, csz[c]) < 0).count() == 0
            && IntStream.range(0, 8).parallel().filter(ch -> new int[n + 1] instanceof int[] lq && new int[n] instanceof int[] lm && new int[n] instanceof int[] ld && new int[2] instanceof int[] lc && new int[1] instanceof int[] lt
                && IntStream.range(0, n).filter(s -> s % 8 == ch && sink[comp[s]] && csz[comp[s]] > 1 && off[s + 1] - off[s] > 1)
                    .filter(s -> (lq[0] = s) + (lc[0] = 0) + (lc[1] = off[s]) + (lt[0] = 1) + (ld[s] = 0) + (lm[s] = s + 1)
                        + (int) IntStream.iterate(0, i -> lc[0] < lt[0] && ld[lq[lc[0]]] + 1 < best.get(comp[s]), i -> i + 1).filter(i -> (lc[1] < off[lq[lc[0]] + 1]
                            ? (adj[lc[1]] == s ? best.accumulateAndGet(comp[s], ld[lq[lc[0]]] + 1, Math::min) * 0 + lc[1]++
                                : rem[adj[lc[1]]] || lm[adj[lc[1]]] == s + 1 ? lc[1]++
                                : (lm[adj[lc[1]]] = s + 1) * 0 + (ld[adj[lc[1]]] = ld[lq[lc[0]]] + 1) * 0 + (lq[lt[0]++] = adj[lc[1]]) * 0 + lc[1]++)
                            : (lc[1] = ++lc[0] < lt[0] ? off[lq[lc[0]]] : 0)) < 0).count() + ((rem[s] = true) ? 0 : 0) < 0).count() == 0).count() > 0
            ? IntStream.range(0, n).filter(c -> csz[c] > 1 && sink[c]).asLongStream().map(c -> 998L * best.get((int) c) + 1).sum() + n : "");
    }
}
