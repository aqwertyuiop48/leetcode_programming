import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m
            && new int[n + 2] instanceof int[] sx
            && IntStream.range(0, 2 * m).filter(i -> ++sx[tok[2 + i] + 1] > 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(v -> (sx[v] += sx[v - 1]) >= 0).count() >= 0
            && Arrays.copyOf(sx, n + 2) instanceof int[] pos && new int[2 * m] instanceof int[] adjTo && new int[2 * m] instanceof int[] adjE
            && IntStream.rangeClosed(1, m).filter(e -> (adjTo[pos[tok[2 * e]]] = tok[2 * e + 1]) > 0 & (adjE[pos[tok[2 * e]]++] = e) > 0
                & (adjTo[pos[tok[2 * e + 1]]] = tok[2 * e]) > 0 & (adjE[pos[tok[2 * e + 1]]++] = e) > 0).count() >= 0
            && Arrays.copyOf(sx, n + 2) instanceof int[] it && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] low && new int[n + 1] instanceof int[] tout
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] pe && new int[n + 2] instanceof int[] ord && new int[m + 1] instanceof int[] tail
            && new int[n + 1] instanceof int[] stack && new int[]{1, 1} instanceof int[] sp
            && (stack[0] = 1) == 1 && (tin[1] = low[1] = 1) == 1 && (ord[1] = 1) == 1
            && (IntStream.range(0, 2 * m + n + 5).allMatch(step -> sp[0] > 0 && Integer.valueOf(stack[sp[0] - 1]) instanceof Integer v
                && (it[v] < sx[v + 1]
                    ? (Integer.valueOf(it[v]++) instanceof Integer k && adjE[k] != pe[v]
                        ? Integer.valueOf(adjTo[k]) instanceof Integer w && (tin[w] == 0
                            ? (par[w] = v) > 0 & (pe[w] = adjE[k]) > 0 & (stack[sp[0]++] = w) > 0 & (ord[tin[w] = low[w] = ++sp[1]] = w) > 0
                            : (low[v] = Math.min(low[v], tin[w])) > 0 & (tin[w] > tin[v] || (tail[adjE[k]] = v) > 0))
                        : true)
                    : (tout[v] = sp[1]) > 0 & --sp[0] >= 0 & (sp[0] == 0 || (low[stack[sp[0] - 1]] = Math.min(low[stack[sp[0] - 1]], low[v])) > 0))) || true)
            && new int[n + 1] instanceof int[] comp && new int[n + 1] instanceof int[] sz && new int[]{0} instanceof int[] nc
            && IntStream.rangeClosed(1, n).filter(t -> Integer.valueOf(ord[t]) instanceof Integer v
                && (comp[v] = (v == 1 || low[v] > tin[par[v]]) ? ++nc[0] : comp[par[v]]) > 0 & ++sz[comp[v]] > 0).count() >= 0
            && Integer.valueOf(IntStream.rangeClosed(1, n).reduce((a, b) -> sz[comp[a]] >= sz[comp[b]] ? a : b).getAsInt()) instanceof Integer R
            && IntStream.rangeClosed(2, n).filter(c -> Integer.valueOf(par[c]) instanceof Integer p
                && (tail[pe[c]] = low[c] > tin[p] && !(tin[c] <= tin[R] && tin[R] <= tout[c]) ? c : p) > 0).count() >= 0
            ? sz[comp[R]] + "\n" + IntStream.rangeClosed(1, m).mapToObj(e -> tail[e] + " " + (tok[2 * e] ^ tok[2 * e + 1] ^ tail[e])).collect(Collectors.joining("\n")) : "");
    }
}
