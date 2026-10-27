import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] ed && new int[2 * m] instanceof int[] nxt && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] head
            && IntStream.range(0, 2 * m).allMatch(j -> (nxt[j] = head[ed[j]]) >= -1 && (head[ed[j]] = j) >= 0) && head.clone() instanceof int[] cur
            && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] low && new int[n + 1] instanceof int[] par && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] pe
            && new int[n + 1] instanceof int[] lev && new int[n + 1] instanceof int[] ord && new int[n + 1] instanceof int[] stk && new int[]{1} instanceof int[] timer && new int[]{1} instanceof int[] sp && new boolean[m + 1] instanceof boolean[] bridge
            && (tin[1] = low[1] = 1) == 1 && (ord[0] = 1) == 1 && (stk[0] = 1) == 1
            && IntStream.range(0, 2 * m + n + 1).allMatch(z -> sp[0] == 0 || ((Integer) stk[sp[0] - 1] instanceof Integer v
                && (cur[v] >= 0
                    ? (Integer) cur[v] instanceof Integer e && (cur[v] = nxt[e]) >= -1 && (Integer) ed[e ^ 1] instanceof Integer w
                        && (e >> 1 == pe[v] || (tin[w] != 0 ? (low[v] = Math.min(low[v], tin[w])) > 0
                            : (par[w] = v) > 0 && (pe[w] = e >> 1) >= 0 && (lev[w] = lev[v] + 1) > 0 && (tin[w] = low[w] = ++timer[0]) > 0 && (ord[timer[0] - 1] = w) > 0 && (stk[sp[0]++] = w) > 0))
                    : --sp[0] >= 0 && (sp[0] == 0 || ((low[stk[sp[0] - 1]] = Math.min(low[stk[sp[0] - 1]], low[v])) > 0 && (low[v] <= tin[stk[sp[0] - 1]] || (bridge[pe[v]] = true)))))))
            && new int[n + 1] instanceof int[] dep && IntStream.range(1, n).allMatch(i -> (Integer) ord[i] instanceof Integer x && (dep[x] = dep[par[x]] + (bridge[pe[x]] ? 1 : 0)) >= 0)
            && IntStream.range(0, 17).mapToObj(j -> j == 0 ? IntStream.range(0, n).mapToLong(i -> (long) lev[ord[i]] << 17 | ord[i]).toArray() : new long[Math.max(0, n - (1 << j) + 1)]).toArray(long[][]::new) instanceof long[][] S
            && IntStream.range(1, 17).allMatch(j -> IntStream.range(0, S[j].length).allMatch(i -> (S[j][i] = Math.min(S[j - 1][i], S[j - 1][i + (1 << (j - 1))])) >= 0))
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            ? IntStream.range(0, k).mapToObj(q -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer u && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer v
                && (Integer) (Math.min(tin[u], tin[v])) instanceof Integer l && (Integer) (Math.max(tin[u], tin[v]) - 1) instanceof Integer r && (Integer) (31 - Integer.numberOfLeadingZeros(Math.max(1, r - l + 1))) instanceof Integer j
                ? String.valueOf(u.equals(v) ? 0 : dep[u] + dep[v] - 2 * dep[par[(int) (Math.min(S[j][l], S[j][r - (1 << j) + 1]) & 131071)]]) : "").collect(Collectors.joining("\n"))
            : "");
    }
}



