import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, 3 * (n - 1)).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] e3
            && IntStream.range(0, 2 * (n - 1)).map(j -> e3[3 * (j / 2) + (j & 1)]).toArray() instanceof int[] ed && new int[2 * n] instanceof int[] nxt && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] head
            && IntStream.range(0, 2 * (n - 1)).allMatch(j -> (nxt[j] = head[ed[j]]) >= -1 && (head[ed[j]] = j) >= 0) && head.clone() instanceof int[] cur
            && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] lev && new int[n + 1] instanceof int[] ord && new int[n + 1] instanceof int[] stk && new long[n + 1] instanceof long[] dist
            && new int[]{1} instanceof int[] timer && new int[]{1} instanceof int[] sp && (tin[1] = 1) == 1 && (ord[0] = 1) == 1 && (stk[0] = 1) == 1
            && IntStream.range(0, 3 * n + 1).allMatch(z -> sp[0] == 0 || ((Integer) stk[sp[0] - 1] instanceof Integer v
                && (cur[v] >= 0
                    ? (Integer) cur[v] instanceof Integer j && (cur[v] = nxt[j]) >= -1 && (Integer) ed[j ^ 1] instanceof Integer w
                        && (w == par[v] || ((par[w] = v) > 0 && (lev[w] = lev[v] + 1) > 0 && (dist[w] = dist[v] + e3[3 * (j / 2) + 2]) > 0 && (tin[w] = ++timer[0]) > 0 && (ord[timer[0] - 1] = w) > 0 && (stk[sp[0]++] = w) > 0))
                    : --sp[0] >= 0)))
            && IntStream.range(0, 17).mapToObj(j -> j == 0 ? IntStream.range(0, n).mapToLong(i -> (long) lev[ord[i]] << 17 | ord[i]).toArray() : new long[Math.max(0, n - (1 << j) + 1)]).toArray(long[][]::new) instanceof long[][] S
            && IntStream.range(1, 17).allMatch(j -> IntStream.range(0, S[j].length).allMatch(i -> (S[j][i] = Math.min(S[j - 1][i], S[j - 1][i + (1 << (j - 1))])) >= 0))
            && ((IntBinaryOperator) (a, b) -> Math.min(tin[a], tin[b])) instanceof IntBinaryOperator lo && ((IntBinaryOperator) (a, b) -> Math.max(tin[a], tin[b]) - 1) instanceof IntBinaryOperator hi
            && ((LongBinaryOperator) (a, b) -> a == b ? 0L : dist[(int) a] + dist[(int) b] - 2 * dist[par[(int) (Math.min(S[31 - Integer.numberOfLeadingZeros(hi.applyAsInt((int) a, (int) b) - lo.applyAsInt((int) a, (int) b) + 1)][lo.applyAsInt((int) a, (int) b)],
                S[31 - Integer.numberOfLeadingZeros(hi.applyAsInt((int) a, (int) b) - lo.applyAsInt((int) a, (int) b) + 1)][hi.applyAsInt((int) a, (int) b) - (1 << (31 - Integer.numberOfLeadingZeros(hi.applyAsInt((int) a, (int) b) - lo.applyAsInt((int) a, (int) b) + 1))) + 1]) & 131071)]]) instanceof LongBinaryOperator d
            && new int[n + 1] instanceof int[] byTin && IntStream.rangeClosed(1, n).allMatch(v -> (byTin[tin[v]] = v) > 0)
            && new TreeSet<Integer>() instanceof TreeSet<Integer> set && new long[]{0} instanceof long[] sum && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(qi -> tk.nextToken() instanceof String op
                    ? op.equals("?") ? String.valueOf(sum[0] / 2)
                    : (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x
                        && (op.equals("+") || set.remove(tin[x]))
                        && (Integer) (set.isEmpty() ? 0 : byTin[set.lower(tin[x]) != null ? set.lower(tin[x]) : set.last()]) instanceof Integer pv
                        && (Integer) (set.isEmpty() ? 0 : byTin[set.higher(tin[x]) != null ? set.higher(tin[x]) : set.first()]) instanceof Integer nx
                        && (set.isEmpty() || (sum[0] += (op.equals("+") ? 1 : -1) * (d.applyAsLong(pv, x) + d.applyAsLong(x, nx) - d.applyAsLong(pv, nx))) != Long.MIN_VALUE)
                        && (op.equals("-") || set.add(tin[x])) ? "" : ""
                    : "").filter(z -> !z.isEmpty()).collect(Collectors.joining("\n"))
            : "");
    }
}



