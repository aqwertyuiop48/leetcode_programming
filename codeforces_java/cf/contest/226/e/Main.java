import java.util.Objects;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) g0[0] instanceof Integer n
            && (Integer) g0[n + 1] instanceof Integer m
            && new int[n + 2] instanceof int[] par
            && IntStream.rangeClosed(1, n).allMatch(v -> (par[v] = g0[v]) >= 0)
            && (Integer) IntStream.rangeClosed(1, n).filter(v -> par[v] == 0).findFirst().getAsInt() instanceof Integer root
            && new int[n + 3] instanceof int[] cc
            && IntStream.rangeClosed(1, n).allMatch(v -> par[v] == 0 || ++cc[par[v]] > 0)
            && new int[n + 3] instanceof int[] cs0
            && IntStream.rangeClosed(1, n).allMatch(v -> (cs0[v + 1] = cs0[v] + cc[v]) >= 0)
            && new int[n + 3] instanceof int[] fp
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (fp[v] = cs0[v]) >= 0)
            && new int[n + 1] instanceof int[] child
            && IntStream.rangeClosed(1, n).allMatch(v -> par[v] == 0 || (child[fp[par[v]]++] = v) > 0)
            && new int[n + 1] instanceof int[] ord
            && new int[n + 2] instanceof int[] depth
            && new int[]{0} instanceof int[] tail
            && (ord[0] = root) > 0
            && IntStream.range(0, n).allMatch(i -> IntStream.range(cs0[ord[i]], cs0[ord[i] + 1]).allMatch(j -> (ord[++tail[0]] = child[j]) > 0 && (depth[child[j]] = depth[ord[i]] + 1) > 0))
            && new int[n + 2] instanceof int[] sz
            && IntStream.rangeClosed(1, n).allMatch(v -> (sz[v] = 1) > 0)
            && IntStream.range(1, n).map(i -> n - i).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && new int[n + 2] instanceof int[] heavy
            && IntStream.range(1, n).allMatch(i -> sz[ord[i]] > sz[heavy[par[ord[i]]]] ? (heavy[par[ord[i]]] = ord[i]) > 0 : true)
            && new int[n + 2] instanceof int[] top
            && (top[root] = root) > 0
            && IntStream.range(1, n).allMatch(i -> (top[ord[i]] = heavy[par[ord[i]]] == ord[i] ? top[par[ord[i]]] : ord[i]) > 0)
            && new int[n + 2] instanceof int[] cl
            && IntStream.rangeClosed(1, n).allMatch(v -> ++cl[top[v]] > 0)
            && new int[n + 2] instanceof int[] off
            && new int[]{0} instanceof int[] run
            && IntStream.range(0, n).allMatch(i -> top[ord[i]] != ord[i] || ((off[ord[i]] = run[0]) >= 0 && (run[0] += cl[ord[i]]) > 0))
            && new int[n + 2] instanceof int[] pos
            && new int[n + 2] instanceof int[] inv
            && IntStream.rangeClosed(1, n).allMatch(v -> (pos[v] = off[top[v]] + depth[v] - depth[top[v]]) >= 0 && (inv[pos[v]] = v) > 0)
            && new int[m + 2] instanceof int[] eo
            && (eo[1] = n + 2) > 0
            && IntStream.rangeClosed(1, m).allMatch(t -> (eo[t + 1] = eo[t] + (g0[eo[t]] == 1 ? 2 : 5)) > 0)
            && (Integer) (m * 17 + 40) instanceof Integer cap
            && new int[cap * 4] instanceof int[] nd
            && new int[]{0} instanceof int[] cn
            && new int[4] instanceof int[] is
            && new int[4] instanceof int[] pd
            && new int[4] instanceof int[] cs
            && new int[2] instanceof int[] xs
            && new int[2] instanceof int[] qv
            && new int[2] instanceof int[] rm
            && new int[80] instanceof int[] PL
            && new int[80] instanceof int[] PC
            && new int[m + 1] instanceof int[] ver
            && ((IntBinaryOperator) (pr, p) -> (Integer) (++cn[0]) instanceof Integer rt
                && (nd[rt * 4] = nd[pr * 4]) >= 0 && (nd[rt * 4 + 1] = nd[pr * 4 + 1]) >= 0 && (nd[rt * 4 + 2] = nd[pr * 4 + 2]) >= 0
                && (is[0] = rt) > 0 && (is[1] = pr) >= 0
                && IntStream.range(0, 17).filter(j -> !(
                    ((p >> 16 - j & 1) == 1 || ++nd[is[0] * 4 + 2] > 0)
                        && (j == 16 || ((is[2] = nd[is[1] * 4 + (p >> 16 - j & 1)]) >= 0 && (is[3] = ++cn[0]) > 0
                            && (nd[is[3] * 4] = nd[is[2] * 4]) >= 0 && (nd[is[3] * 4 + 1] = nd[is[2] * 4 + 1]) >= 0 && (nd[is[3] * 4 + 2] = nd[is[2] * 4 + 2]) >= 0
                            && (nd[is[0] * 4 + (p >> 16 - j & 1)] = is[3]) > 0 && (is[0] = is[3]) > 0 && (is[1] = is[2]) >= 0)))).count() == 0
                ? rt : 0) instanceof IntBinaryOperator ins
            && ((IntUnaryOperator) p -> (pd[0] = qv[0]) >= 0 && (pd[1] = qv[1]) >= 0 && (pd[2] = 0) == 0
                && IntStream.range(0, 17).filter(j -> !((p >> 16 - j & 1) == 1
                    ? (pd[2] += nd[pd[0] * 4 + 2] - nd[pd[1] * 4 + 2]) > Integer.MIN_VALUE && (pd[0] = nd[pd[0] * 4 + 1]) >= 0 && (pd[1] = nd[pd[1] * 4 + 1]) >= 0
                    : (pd[0] = nd[pd[0] * 4]) >= 0 && (pd[1] = nd[pd[1] * 4]) >= 0)).count() == 0
                ? p - pd[2] : 0) instanceof IntUnaryOperator pg
            && ((IntUnaryOperator) j0 -> (pd[0] = qv[0]) >= 0 && (pd[1] = qv[1]) >= 0 && (pd[2] = 0) == 0 && (pd[3] = j0) > 0
                && IntStream.range(0, 17).filter(j -> !(
                    (1 << 16 - j) - (nd[pd[0] * 4 + 2] - nd[pd[1] * 4 + 2]) >= pd[3]
                        ? (pd[0] = nd[pd[0] * 4]) >= 0 && (pd[1] = nd[pd[1] * 4]) >= 0
                        : (pd[3] -= (1 << 16 - j) - (nd[pd[0] * 4 + 2] - nd[pd[1] * 4 + 2])) > -5 && (pd[2] += 1 << 16 - j) > 0 && (pd[0] = nd[pd[0] * 4 + 1]) >= 0 && (pd[1] = nd[pd[1] * 4 + 1]) >= 0)).count() == 0
                ? pd[2] : -1) instanceof IntUnaryOperator kth
            && ((IntBinaryOperator) (u, dmin) -> (cs[0] = u) > 0 && (cs[1] = 0) == 0
                && IntStream.generate(() ->
                    (Integer) (pos[top[cs[0]]] + Math.max(0, dmin + 1 - depth[top[cs[0]]])) instanceof Integer lp
                        && lp <= pos[cs[0]]
                        && (Integer) pg.applyAsInt(lp) instanceof Integer gl
                        && (PL[cs[2] + cs[1]] = gl) >= 0
                        && (PC[cs[2] + cs[1]] = pg.applyAsInt(pos[cs[0]] + 1) - gl) >= 0
                        && ++cs[1] > 0
                        && depth[top[cs[0]]] > dmin + 1
                        && (cs[0] = par[top[cs[0]]]) > 0 ? 1 : 0).takeWhile(z -> z > 0).count() >= 0
                ? cs[1] : 0) instanceof IntBinaryOperator climb
            && ((IntBinaryOperator) (base, np) ->
                (Integer) IntStream.range(0, np).filter(i -> rm[0] <= PC[base + i] || (rm[0] -= PC[base + i]) < 0).findFirst().getAsInt() instanceof Integer fi
                    ? inv[kth.applyAsInt(PL[base + fi] + PC[base + fi] - rm[0] + 1)] : 0) instanceof IntBinaryOperator pick
            ? IntStream.rangeClosed(1, m).mapToObj(t ->
                (Integer) g0[eo[t]] instanceof Integer type
                    ? type == 1
                        ? (ver[t] = ins.applyAsInt(ver[t - 1], pos[g0[eo[t] + 1]])) >= 0 ? (String) null : (String) null
                        : (Integer) g0[eo[t] + 1] instanceof Integer a
                            && (Integer) g0[eo[t] + 2] instanceof Integer b
                            && (Integer) g0[eo[t] + 3] instanceof Integer k
                            && (Integer) g0[eo[t] + 4] instanceof Integer y
                            && (ver[t] = ver[t - 1]) >= 0 && (qv[0] = ver[t]) >= 0 && (qv[1] = ver[y]) >= 0
                            && (xs[0] = a) > 0 && (xs[1] = b) > 0
                            && IntStream.generate(() -> top[xs[0]] != top[xs[1]]
                                ? (depth[top[xs[0]]] >= depth[top[xs[1]]] ? (xs[0] = par[top[xs[0]]]) : (xs[1] = par[top[xs[1]]])) * 0 + 1 : 0).takeWhile(z -> z > 0).count() >= 0
                            && (Integer) (depth[xs[0]] <= depth[xs[1]] ? xs[0] : xs[1]) instanceof Integer L
                            && (cs[2] = 0) == 0
                            && (Integer) climb.applyAsInt(a, depth[L] - 1) instanceof Integer na
                            && (Integer) (pg.applyAsInt(pos[a] + 1) - pg.applyAsInt(pos[a])) instanceof Integer ga
                            && (Integer) IntStream.range(0, na).map(i -> PC[i]).sum() instanceof Integer ca
                            && (Integer) (k + ga) instanceof Integer kp
                            && (rm[0] = kp) > 0
                            && (Integer) (kp <= ca ? pick.applyAsInt(0, na)
                                : (cs[2] = 40) == 40 && (Integer) climb.applyAsInt(b, depth[L]) instanceof Integer nb
                                    && (Integer) IntStream.range(0, nb).map(i -> PC[40 + i]).sum() instanceof Integer cb
                                    && kp - ca <= cb && (rm[0] = cb - (kp - ca) + 1) > 0 ? pick.applyAsInt(40, nb) : -1) instanceof Integer res
                            ? String.valueOf(res.equals(b) ? -1 : res) : (String) null
                    : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) + "\n"
            : "");
    }
}

