import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().filter(s -> !s.trim().isEmpty()).collect(Collectors.toList()) instanceof List<String> L
            && Arrays.stream(L.get(0).trim().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] nt
            && Integer.valueOf(nt[0]) instanceof Integer n
            && Integer.valueOf(nt[1]) instanceof Integer t
            && Integer.valueOf(n * n) instanceof Integer cn
            && Integer.valueOf(cn * (t + 1)) instanceof Integer N0
            && Integer.valueOf(N0 + cn) instanceof Integer S
            && Integer.valueOf(S + 1) instanceof Integer T
            && Integer.valueOf(T + 1) instanceof Integer N
            && new int[cn] instanceof int[] lab
            && new int[cn] instanceof int[] sc
            && new int[cn] instanceof int[] cc
            && new int[]{-1, 1, 0, 0} instanceof int[] DR
            && new int[]{0, 0, -1, 1} instanceof int[] DC
            && IntStream.range(0, cn).allMatch(c -> (lab[c] = Character.isDigit(L.get(1 + c / n).charAt(c % n)) ? 1 : 0) >= 0
                && (sc[c] = lab[c] == 1 ? L.get(1 + c / n).charAt(c % n) - '0' : 0) >= 0
                && (cc[c] = lab[c] == 1 ? L.get(1 + n + c / n).charAt(c % n) - '0' : 0) >= 0)
            && Integer.valueOf(IntStream.range(0, cn).filter(c -> L.get(1 + c / n).charAt(c % n) == 'Z').findFirst().getAsInt()) instanceof Integer z
            && ((IntFunction<IntStream>) c -> IntStream.range(0, 4).map(d -> c / n + DR[d] >= 0 && c / n + DR[d] < n && c % n + DC[d] >= 0 && c % n + DC[d] < n
                && lab[(c / n + DR[d]) * n + c % n + DC[d]] == 1 ? (c / n + DR[d]) * n + c % n + DC[d] : -1).filter(x -> x >= 0)) instanceof IntFunction<IntStream> nb
            && new int[cn] instanceof int[] dist
            && IntStream.range(0, cn).allMatch(c -> (dist[c] = 1000000) > 0)
            && (dist[z] = 0) == 0
            && new int[cn] instanceof int[] q2
            && new int[]{1} instanceof int[] qe
            && (q2[0] = z) >= 0
            && IntStream.iterate(0, i -> i < qe[0], i -> i + 1).allMatch(i -> nb.apply(q2[i]).filter(x -> dist[x] == 1000000).allMatch(x -> (dist[x] = dist[q2[i]] + 1) > 0 && (q2[qe[0]++] = x) >= 0))
            && new int[N] instanceof int[] hd
            && new int[16 * N] instanceof int[] nx
            && new int[16 * N] instanceof int[] to
            && new int[16 * N] instanceof int[] cp
            && new int[]{0} instanceof int[] ec
            && IntStream.range(0, N).allMatch(i -> (hd[i] = -1) < 0)
            && ((LongPredicate) x -> (to[ec[0]] = (int) (x >> 20 & 0xFFFFF)) >= 0 && (cp[ec[0]] = (int) (x & 0xFFFFF)) >= 0
                && (nx[ec[0]] = hd[(int) (x >> 40)]) >= -1 && (hd[(int) (x >> 40)] = ec[0]++) >= 0
                && (to[ec[0]] = (int) (x >> 40)) >= 0 && (cp[ec[0]] = 0) == 0
                && (nx[ec[0]] = hd[(int) (x >> 20 & 0xFFFFF)]) >= -1 && (hd[(int) (x >> 20 & 0xFFFFF)] = ec[0]++) >= 0) instanceof LongPredicate add
            && IntStream.range(0, cn).allMatch(c -> lab[c] == 0 || add.test(((long) (N0 + c) << 40) | ((long) T << 20) | cc[c])
                && IntStream.rangeClosed(0, t).filter(tt -> tt <= dist[c]).allMatch(tt ->
                    (tt != 0 || add.test(((long) S << 40) | ((long) (c * (t + 1)) << 20) | sc[c]))
                    && add.test(((long) (c * (t + 1) + tt) << 40) | ((long) (N0 + c) << 20) | 100000)
                    && (tt == t || tt >= dist[c] || IntStream.concat(IntStream.of(c), nb.apply(c)).filter(x -> tt + 1 <= dist[x])
                        .allMatch(x -> add.test(((long) (c * (t + 1) + tt) << 40) | ((long) (x * (t + 1) + tt + 1) << 20) | 100000)))))
            && new int[N] instanceof int[] lv
            && new int[N] instanceof int[] q
            && new int[N] instanceof int[] it
            && new int[]{0} instanceof int[] qt
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] dfs
            && (dfs[0] = (u, f) -> u == T ? f : new int[1] instanceof int[] r
                && IntStream.iterate(it[u], e -> e >= 0, e -> nx[e]).anyMatch(e -> cp[e] > 0 && lv[to[e]] == lv[u] + 1 && (it[u] = e) >= 0
                    && (r[0] = dfs[0].applyAsInt(to[e], Math.min(f, cp[e]))) > 0 && (cp[e] -= r[0]) >= 0 && (cp[e ^ 1] += r[0]) > 0) ? r[0] : 0) != null
            && Integer.valueOf(IntStream.generate(() -> IntStream.range(0, N).allMatch(i -> (lv[i] = -1) < 0) && (lv[S] = 0) == 0 && (q[0] = S) >= 0 && (qt[0] = 1) > 0
                && IntStream.iterate(0, i -> i < qt[0], i -> i + 1).allMatch(i -> IntStream.iterate(hd[q[i]], e -> e >= 0, e -> nx[e]).filter(e -> cp[e] > 0 && lv[to[e]] < 0)
                    .allMatch(e -> (lv[to[e]] = lv[q[i]] + 1) > 0 && (q[qt[0]++] = to[e]) >= 0))
                && lv[T] >= 0 && IntStream.range(0, N).allMatch(i -> (it[i] = hd[i]) >= -1)
                ? IntStream.generate(() -> dfs[0].applyAsInt(S, 1000000000)).takeWhile(x -> x > 0).sum() : -1).takeWhile(x -> x >= 0).sum()) instanceof Integer flow
            ? flow : "");
    }
}





