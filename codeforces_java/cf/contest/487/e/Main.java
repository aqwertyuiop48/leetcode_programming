import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new byte[raw.length / 2 + 8] instanceof byte[] tokFirst
            && new int[raw.length / 2 + 8] instanceof int[] tokVal
            && new int[] {-1} instanceof int[] tc
            && IntStream.range(0, raw.length).allMatch(i ->
                raw[i] <= ' '
                || ((i > 0 && raw[i - 1] > ' ') || ((++tc[0]) >= 0 && (tokFirst[tc[0]] = raw[i]) > 0))
                    && (raw[i] < '0' || raw[i] > '9' || (tokVal[tc[0]] = tokVal[tc[0]] * 10 + raw[i] - '0') >= 0))
            && Integer.valueOf(tokVal[0]) instanceof Integer n
            && Integer.valueOf(tokVal[1]) instanceof Integer m
            && Integer.valueOf(tokVal[2]) instanceof Integer q
            && IntStream.range(0, n).map(i -> tokVal[3 + i]).toArray() instanceof int[] w
            && Integer.valueOf(3 + n) instanceof Integer eb
            && new int[n + 1] instanceof int[] start
            && IntStream.range(0, 2 * m).allMatch(i -> ++start[tokVal[eb + i]] > 0)
            && IntStream.range(0, n).allMatch(i -> (start[i + 1] += start[i]) >= 0)
            && Arrays.copyOf(start, n) instanceof int[] fp
            && new int[2 * m] instanceof int[] adj
            && IntStream.range(0, m).allMatch(i ->
                (adj[fp[tokVal[eb + 2 * i] - 1]++] = tokVal[eb + 2 * i + 1] - 1) >= 0
                && (adj[fp[tokVal[eb + 2 * i + 1] - 1]++] = tokVal[eb + 2 * i] - 1) >= 0)
            && new int[n] instanceof int[] dfn
            && new int[n] instanceof int[] low
            && new int[n] instanceof int[] dfsPar
            && Arrays.copyOf(start, n) instanceof int[] ptr
            && new int[n] instanceof int[] stk
            && new int[n] instanceof int[] vs
            && new int[2 * n] instanceof int[] par
            && new int[2 * n] instanceof int[] ord
            && new int[] {0, 1, 1, 0, 0, 0, 0, 0} instanceof int[] ts
            && (dfn[0] = 1) == 1 && (low[0] = 1) == 1 && (par[0] = -1) < 0
            && IntStream.range(0, Integer.MAX_VALUE).takeWhile(x -> ts[0] >= 0).allMatch(x ->
                ts[5] == 1
                    ? Integer.valueOf(vs[--ts[1]]) instanceof Integer y
                        && (par[y] = ts[7]) >= 0 && (ord[ts[3]++] = y) >= 0
                        && (y != ts[6] || ((ord[ts[3]++] = ts[7]) >= 0 && (ts[5] = 0) == 0))
                    : Integer.valueOf(stk[ts[0]]) instanceof Integer u
                        && (ptr[u] < start[u + 1]
                            ? Integer.valueOf(adj[ptr[u]++]) instanceof Integer v
                                && (dfn[v] == 0
                                    ? (dfsPar[v] = u) >= 0 && (dfn[v] = ++ts[2]) > 0 && (low[v] = dfn[v]) > 0
                                        && (stk[++ts[0]] = v) >= 0 && (vs[ts[1]++] = v) >= 0
                                    : v == dfsPar[u] || (low[u] = Math.min(low[u], dfn[v])) > 0)
                            : (--ts[0] < 0
                                ? (ord[ts[3]++] = u) >= 0
                                : Integer.valueOf(stk[ts[0]]) instanceof Integer p
                                    && (low[p] = Math.min(low[p], low[u])) > 0
                                    && (low[u] < dfn[p]
                                        || ((ts[7] = n + ts[4]++) >= 0 && (par[ts[7]] = p) >= 0 && (ts[6] = u) >= 0 && (ts[5] = 1) > 0)))))
            && Integer.valueOf(n + ts[4]) instanceof Integer T
            && Integer.valueOf(ts[4]) instanceof Integer sqn
            && new int[T] instanceof int[] sz
            && new int[T] instanceof int[] heavy
            && new int[T] instanceof int[] hsz
            && new int[T] instanceof int[] head
            && new int[T] instanceof int[] depth
            && new int[T] instanceof int[] cl
            && new int[T] instanceof int[] pos
            && IntStream.range(0, T).allMatch(i -> (sz[i] = 1) > 0)
            && IntStream.range(0, T - 1).allMatch(i ->
                Integer.valueOf(ord[i]) instanceof Integer x
                && Integer.valueOf(par[x]) instanceof Integer p
                && (sz[p] += sz[x]) > 0
                && (sz[x] <= hsz[p] || ((hsz[p] = sz[x]) > 0 && (heavy[p] = x) >= 0)))
            && IntStream.range(0, T).allMatch(j ->
                Integer.valueOf(ord[T - 1 - j]) instanceof Integer x
                && (head[x] = x == 0 ? 0 : heavy[par[x]] == x ? head[par[x]] : x) >= 0
                && (depth[x] = x == 0 ? 0 : depth[par[x]] + 1) >= 0
                && ++cl[head[x]] > 0)
            && new int[1] instanceof int[] nb
            && IntStream.range(0, T).allMatch(j ->
                Integer.valueOf(ord[T - 1 - j]) instanceof Integer x
                && (head[x] == x
                    ? (pos[x] = nb[0]) >= 0 && (nb[0] += cl[x]) > 0
                    : (pos[x] = pos[par[x]] + 1) > 0))
            && Integer.valueOf(n - 1) instanceof Integer kc
            && new int[sqn + 1] instanceof int[] cs
            && IntStream.range(1, n).allMatch(x -> ++cs[par[x] - n + 1] > 0)
            && IntStream.range(0, sqn).allMatch(s -> (cs[s + 1] += cs[s]) >= 0)
            && Arrays.copyOf(cs, sqn + 1) instanceof int[] cf
            && new int[n] instanceof int[] chPos
            && IntStream.range(1, n).allMatch(x -> (chPos[x] = cf[par[x] - n]++) >= 0)
            && new int[2 * T + 2 * kc] instanceof int[] tr
            && IntStream.range(1, n).allMatch(x -> (tr[2 * T + kc + chPos[x]] = w[x]) >= 0)
            && IntStream.rangeClosed(1, kc - 1).allMatch(j ->
                (tr[2 * T + kc - j] = Math.min(tr[2 * T + 2 * (kc - j)], tr[2 * T + 2 * (kc - j) + 1])) >= 0)
            && IntStream.range(0, T).allMatch(x -> (tr[T + pos[x]] = x < n ? w[x] : Integer.MAX_VALUE) >= 0)
            && IntStream.range(1, n).allMatch(x -> (tr[T + pos[par[x]]] = Math.min(tr[T + pos[par[x]]], w[x])) >= 0)
            && IntStream.rangeClosed(1, T - 1).allMatch(j ->
                (tr[T - j] = Math.min(tr[2 * (T - j)], tr[2 * (T - j) + 1])) >= 0)
            && new int[12] instanceof int[] S
            && Integer.valueOf(eb + 2 * m) instanceof Integer eb2
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, Integer.MAX_VALUE).takeWhile(x -> S[1] != 99).allMatch(x ->
                S[1] == 3
                    ? (S[5] < S[6]
                        ? ((S[5] & 1) == 0 || ((S[4] = Math.min(S[4], tr[S[9] + S[5]])) >= 0 && ++S[5] > 0))
                            && ((S[6] & 1) == 0 || (--S[6] >= 0 && (S[4] = Math.min(S[4], tr[S[9] + S[6]])) >= 0))
                            && (S[5] >>= 1) >= 0 && (S[6] >>= 1) >= 0
                        : (S[1] = S[7]) >= 0)
                    : S[1] == 7
                    ? (S[8] >= 1
                        ? (tr[S[9] + S[8]] = Math.min(tr[S[9] + 2 * S[8]], tr[S[9] + 2 * S[8] + 1])) >= 0 && (S[8] >>= 1) >= 0
                        : (S[1] = S[11]) >= 0)
                    : S[1] == 2
                    ? (head[S[2]] != head[S[3]]
                        ? (depth[head[S[2]]] >= depth[head[S[3]]]
                            ? (S[5] = T + pos[head[S[2]]]) > 0 && (S[6] = T + pos[S[2]] + 1) > 0 && (S[2] = par[head[S[2]]]) >= 0
                                && (S[9] = 0) == 0 && (S[7] = 2) > 0 && (S[1] = 3) > 0
                            : (S[5] = T + pos[head[S[3]]]) > 0 && (S[6] = T + pos[S[3]] + 1) > 0 && (S[3] = par[head[S[3]]]) >= 0
                                && (S[9] = 0) == 0 && (S[7] = 2) > 0 && (S[1] = 3) > 0)
                        : (S[5] = T + Math.min(pos[S[2]], pos[S[3]])) > 0 && (S[6] = T + Math.max(pos[S[2]], pos[S[3]]) + 1) > 0
                            && (S[2] = pos[S[2]] < pos[S[3]] ? S[2] : S[3]) >= 0 && (S[9] = 0) == 0 && (S[7] = 4) > 0 && (S[1] = 3) > 0)
                    : S[1] == 0
                    ? (S[0] >= q
                        ? (S[1] = 99) > 0
                        : Integer.valueOf(eb2 + 3 * S[0]) instanceof Integer p
                            && Integer.valueOf(tokVal[p + 1] - 1) instanceof Integer a
                            && (tokFirst[p] == 'A'
                                ? (S[2] = a) >= 0 && (S[3] = tokVal[p + 2] - 1) >= 0 && (S[4] = Integer.MAX_VALUE) > 0 && (S[1] = 2) > 0 && ++S[0] > 0
                                : (w[a] = tokVal[p + 2]) >= 0 && (tr[T + pos[a]] = tokVal[p + 2]) >= 0 && (S[2] = a) >= 0
                                    && (S[8] = (T + pos[a]) >> 1) >= 0 && (S[9] = 0) == 0 && (S[11] = a == 0 ? 0 : 12) >= 0
                                    && (a == 0 || (tr[2 * T + kc + chPos[a]] = tokVal[p + 2]) >= 0)
                                    && (S[1] = 7) > 0 && ++S[0] > 0))
                    : S[1] == 4
                    ? (S[4] = S[2] >= n ? Math.min(S[4], w[par[S[2]]]) : S[4]) >= 0 && sb.append(S[4]).append('\n') != null && (S[1] = 0) == 0
                    : S[1] == 12
                    ? (S[8] = (kc + chPos[S[2]]) >> 1) >= 0 && (S[9] = 2 * T) > 0 && (S[11] = 13) > 0 && (S[1] = 7) > 0
                    : S[1] == 13
                    ? Integer.valueOf(par[S[2]] - n) instanceof Integer s
                        && (S[5] = kc + cs[s]) > 0 && (S[6] = kc + cs[s + 1]) > 0 && (S[4] = Integer.MAX_VALUE) > 0
                        && (S[9] = 2 * T) > 0 && (S[7] = 14) > 0 && (S[1] = 3) > 0
                    : Integer.valueOf(par[S[2]]) instanceof Integer sq
                        && (tr[T + pos[sq]] = S[4]) >= 0 && (S[8] = (T + pos[sq]) >> 1) >= 0 && (S[9] = 0) == 0
                        && (S[11] = 0) == 0 && (S[1] = 7) > 0)
            ? sb.toString()
            : "");
    }
}
