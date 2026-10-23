import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer m
            && new int[n + 1] instanceof int[] head
            && new int[2 * m + 2] instanceof int[] nx
            && new int[2 * m + 2] instanceof int[] to
            && new int[2 * m + 2] instanceof int[] wx
            && IntStream.range(0, m).allMatch(e ->
                (to[2 * e + 1] = g[3 + 3 * e]) > 0
                && (wx[2 * e + 1] = g[4 + 3 * e]) >= 0
                && (nx[2 * e + 1] = head[g[2 + 3 * e]]) >= 0
                && (head[g[2 + 3 * e]] = 2 * e + 1) > 0
                && (to[2 * e + 2] = g[2 + 3 * e]) > 0
                && (wx[2 * e + 2] = g[4 + 3 * e]) >= 0
                && (nx[2 * e + 2] = head[g[3 + 3 * e]]) >= 0
                && (head[g[3 + 3 * e]] = 2 * e + 2) > 0)
            && IntStream.range(0, 131072).mapToLong(i ->
                (Long) ((i + 1L) * 0x9E3779B97F4A7C15L) instanceof Long z0
                && (Long) ((z0 ^ (z0 >>> 30)) * 0xBF58476D1CE4E5B9L) instanceof Long z1
                && (Long) ((z1 ^ (z1 >>> 27)) * 0x94D049BB133111EBL) instanceof Long z2
                ? z2 ^ (z2 >>> 31) | 1L : 1L).toArray() instanceof long[] rnd
            && new long[131073] instanceof long[] pre
            && IntStream.range(0, 131072).allMatch(i -> (pre[i + 1] = pre[i] + rnd[i]) * 0 == 0)
            && new long[131072] instanceof long[] pw2
            && (pw2[0] = 1) == 1
            && IntStream.range(1, 131072).allMatch(i -> (pw2[i] = pw2[i - 1] * 2 % 1000000007L) > 0)
            && Integer.valueOf((2 * m + 4) * 37 + 64) instanceof Integer cap
            && new int[cap] instanceof int[] lc
            && new int[cap] instanceof int[] rc
            && new long[cap] instanceof long[] hs
            && new int[2] instanceof int[] cnt
            && new int[2] instanceof int[] xp
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> fr
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> ur
            && fr.compareAndSet(null, (node, code) ->
                (code >> 5) + (1 << 17 - (code & 31)) - 1 < xp[0]
                    || hs[node] == pre[(code >> 5) + (1 << 17 - (code & 31))] - pre[code >> 5]
                    ? -1
                    : (code & 31) == 17
                        ? code >> 5
                        : (Integer) fr.get().applyAsInt(lc[node], (code >> 5 << 5) | ((code & 31) + 1)) instanceof Integer res && res >= 0
                            ? res
                            : fr.get().applyAsInt(rc[node], ((code >> 5) + (1 << 16 - (code & 31)) << 5) | ((code & 31) + 1)))
            && ur.compareAndSet(null, (node, code) ->
                (code >> 5) + (1 << 17 - (code & 31)) - 1 < xp[0] || (code >> 5) > xp[1]
                    ? node
                    : (code >> 5) >= xp[0] && (code >> 5) + (1 << 17 - (code & 31)) - 1 <= xp[1] - 1
                        ? 0
                        : (code & 31) == 17
                            ? Integer.valueOf(++cnt[0]) instanceof Integer id && (hs[id] = rnd[code >> 5]) != 0 ? id : -1
                            : Integer.valueOf(++cnt[0]) instanceof Integer id
                                && (lc[id] = ur.get().applyAsInt(lc[node], (code >> 5 << 5) | ((code & 31) + 1))) >= 0
                                && (rc[id] = ur.get().applyAsInt(rc[node], ((code >> 5) + (1 << 16 - (code & 31)) << 5) | ((code & 31) + 1))) >= 0
                                && ((hs[id] = hs[lc[id]] + hs[rc[id]]) == 0 || true)
                                ? id : 0)
            && ((IntBinaryOperator) (root, x) ->
                (xp[0] = x) >= 0 && (xp[1] = fr.get().applyAsInt(root, 0)) >= 0 ? ur.get().applyAsInt(root, 0) : -1) instanceof IntBinaryOperator add
            && new int[2 * m + 4] instanceof int[] verRoot
            && new int[2 * m + 4] instanceof int[] verMsb
            && new int[2 * m + 4] instanceof int[] verV
            && new int[2 * m + 4] instanceof int[] verPrev
            && new long[2 * m + 4] instanceof long[] verMod
            && ((IntBinaryOperator) (a, b) ->
                verMsb[a] != verMsb[b]
                    ? verMsb[a] < verMsb[b] ? -1 : 1
                    : verRoot[a] == verRoot[b]
                        ? 0
                        : (Long) LongStream.range(0, 17).reduce((long) verRoot[a] << 32 | verRoot[b], (s, l) ->
                            hs[(int) (s >>> 32)] == hs[(int) s]
                                ? s
                                : hs[rc[(int) (s >>> 32)]] != hs[rc[(int) s]]
                                    ? (long) rc[(int) (s >>> 32)] << 32 | rc[(int) s]
                                    : (long) lc[(int) (s >>> 32)] << 32 | lc[(int) s]) instanceof Long fin
                            ? hs[(int) (fin >>> 32)] == hs[(int) (long) fin] ? 0 : hs[(int) (fin >>> 32)] != 0 ? 1 : -1
                            : 0) instanceof IntBinaryOperator cmpVer
            && new PriorityQueue<Integer>((a, b) -> cmpVer.applyAsInt(a, b)) instanceof PriorityQueue<Integer> pq
            && new int[n + 1] instanceof int[] cur
            && new boolean[n + 1] instanceof boolean[] done
            && new int[] {1} instanceof int[] vc
            && (verMsb[1] = -1) == -1
            && (verV[1] = g[2 + 3 * m]) > 0
            && (cur[g[2 + 3 * m]] = 1) == 1
            && pq.add(1)
            && IntStream.generate(() -> 0).takeWhile(z -> !pq.isEmpty() && !done[g[3 + 3 * m]]).allMatch(z ->
                (Integer) pq.poll() instanceof Integer k
                && (Integer) verV[k] instanceof Integer u
                && (done[u] || cur[u] != k
                    || ((done[u] = true)
                        && IntStream.iterate(head[u], e -> e != 0, e -> nx[e]).allMatch(e ->
                            done[to[e]]
                            || ((Integer) add.applyAsInt(verRoot[k], wx[e]) instanceof Integer nr
                                && (verRoot[vc[0] + 1] = nr) >= 0
                                && (verMsb[vc[0] + 1] = Math.max(verMsb[k], xp[1])) >= -1
                                && (verV[vc[0] + 1] = to[e]) > 0
                                && (verPrev[vc[0] + 1] = k) > 0
                                && (verMod[vc[0] + 1] = (verMod[k] + pw2[wx[e]]) % 1000000007L) >= 0
                                && (cur[to[e]] != 0 && cmpVer.applyAsInt(vc[0] + 1, cur[to[e]]) >= 0
                                    || ((cur[to[e]] = ++vc[0]) > 0 && pq.add(vc[0]))))))))
            ? cur[g[3 + 3 * m]] == 0
                ? "-1"
                : verMod[cur[g[3 + 3 * m]]] + "\n"
                    + IntStream.iterate(cur[g[3 + 3 * m]], k -> k != 0, k -> verPrev[k]).map(k -> verV[k]).boxed().collect(Collectors.toList()).reversed().size() + "\n"
                    + IntStream.iterate(cur[g[3 + 3 * m]], k -> k != 0, k -> verPrev[k]).map(k -> verV[k]).boxed().collect(Collectors.toList()).reversed()
                        .stream().map(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}
