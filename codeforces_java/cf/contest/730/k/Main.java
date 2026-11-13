import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] sq
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (sq[1] = sq[1] * 10 + raw[i] - 48) >= 0 & (sq[2] = 1) > 0 : sq[2] == 0 || (tok[sq[0]++] = sq[1]) >= 0 & (sq[1] = 0) == 0 & (sq[2] = 0) == 0).count() >= 0
            && new int[]{1} instanceof int[] pc && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, tok[0]).allMatch(tt -> Integer.valueOf(tok[pc[0]]) instanceof Integer n && Integer.valueOf(tok[pc[0] + 1]) instanceof Integer m
                && Integer.valueOf(tok[pc[0] + 2]) instanceof Integer s && Integer.valueOf(tok[pc[0] + 3]) instanceof Integer t
                && Integer.valueOf(pc[0] + 4) instanceof Integer eb && (pc[0] += 4 + 2 * m) > 0
                && new int[n + 2] instanceof int[] sx
                && IntStream.range(0, 2 * m).filter(i -> ++sx[tok[eb + i] + 1] > 0).count() >= 0
                && IntStream.rangeClosed(1, n + 1).filter(v -> (sx[v] += sx[v - 1]) >= 0).count() >= 0
                && Arrays.copyOf(sx, n + 2) instanceof int[] pos && new int[2 * m] instanceof int[] adj
                && IntStream.range(0, m).filter(e -> (adj[pos[tok[eb + 2 * e]]++] = tok[eb + 2 * e + 1]) > 0 & (adj[pos[tok[eb + 2 * e + 1]]++] = tok[eb + 2 * e]) > 0).count() >= 0
                && Arrays.copyOf(sx, n + 2) instanceof int[] it && new int[n + 2] instanceof int[] pre && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] low
                && new int[n + 3] instanceof int[] ord && new int[n + 2] instanceof int[] stk && new int[]{2, 2} instanceof int[] sp
                && (stk[0] = s) > 0 && (stk[1] = t) > 0 && (pre[s] = 1) == 1 && (ord[1] = s) > 0 && (low[s] = s) > 0 && (pre[t] = 2) == 2 && (ord[2] = t) > 0 && (par[t] = s) > 0 && (low[t] = t) > 0
                && (IntStream.range(0, 2 * m + n + 5).allMatch(step -> sp[0] > 0 && Integer.valueOf(stk[sp[0] - 1]) instanceof Integer v
                    && (it[v] < sx[v + 1]
                        ? Integer.valueOf(adj[it[v]++]) instanceof Integer w
                            && (pre[w] == 0
                                ? (par[w] = v) > 0 & (ord[pre[w] = ++sp[1]] = w) > 0 & (low[w] = w) > 0 & (stk[sp[0]++] = w) > 0
                                : w.intValue() != par[v] && pre[w] < pre[low[v]] ? (low[v] = w) > 0 : true)
                        : --sp[0] >= 0 & (v.intValue() == s || (pre[low[v]] < pre[low[par[v]]] ? (low[par[v]] = low[v]) > 0 : true)))) || true)
                && new int[n + 2] instanceof int[] sg && new int[n + 2] instanceof int[] nx && new int[n + 2] instanceof int[] pv
                && (nx[0] = s) > 0 && (pv[s] = 0) == 0 && (nx[s] = t) > 0 && (pv[t] = s) > 0 && (nx[t] = n + 1) > 0 && (pv[n + 1] = t) > 0 && (sg[s] = -1) < 0
                && IntStream.rangeClosed(3, Math.min(n, sp[1])).filter(k -> Integer.valueOf(ord[k]) instanceof Integer v && Integer.valueOf(par[v]) instanceof Integer p
                    && (sg[low[v]] == -1
                        ? (nx[pv[p]] = v) > 0 & (pv[v] = pv[p]) >= 0 & (nx[v] = p) > 0 & (pv[p] = v) > 0 & (sg[p] = 1) > 0
                        : (pv[nx[p]] = v) > 0 & (nx[v] = nx[p]) > 0 & (pv[v] = p) > 0 & (nx[p] = v) > 0 & (sg[p] = -1) < 0)).count() >= 0
                && new int[n + 2] instanceof int[] num && new int[]{0} instanceof int[] cn
                && IntStream.iterate(nx[0], v -> v != n + 1, v -> nx[v]).filter(v -> (num[v] = ++cn[0]) > 0).count() >= 0
                && new int[n + 2] instanceof int[] hin && new int[n + 2] instanceof int[] hout
                && IntStream.range(0, m).filter(e -> Integer.valueOf(tok[eb + 2 * e]) instanceof Integer x && Integer.valueOf(tok[eb + 2 * e + 1]) instanceof Integer y
                    && (num[x] < num[y] ? (hout[x] = 1) + (hin[y] = 1) > 0 : (hout[y] = 1) + (hin[x] = 1) > 0)).count() >= 0
                && cn[0] == n && sp[1] == n && num[s] == 1 && num[t] == n && IntStream.rangeClosed(1, n).allMatch(v -> (v == s || hin[v] == 1) && (v == t || hout[v] == 1))
                ? sb.append("Yes\n").append(IntStream.range(0, m).mapToObj(e -> num[tok[eb + 2 * e]] < num[tok[eb + 2 * e + 1]] ? tok[eb + 2 * e] + " " + tok[eb + 2 * e + 1] : tok[eb + 2 * e + 1] + " " + tok[eb + 2 * e]).collect(Collectors.joining("\n"))).append('\n') != null
                : sb.append("No\n") != null)
            ? sb.toString() : "");
    }
}
