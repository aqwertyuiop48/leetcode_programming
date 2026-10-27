import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(m ->
            System.out.println(
                new int[n + 1] instanceof int[] head
                && IntStream.range(0, n + 1).allMatch(i -> (head[i] = -1) < 0)
                && new int[2 * m] instanceof int[] to
                && new int[2 * m] instanceof int[] nxt
                && IntStream.range(0, m).allMatch(e -> new int[]{s.nextInt(), s.nextInt()} instanceof int[] p
                    && (to[2 * e] = p[1]) > 0 && (nxt[2 * e] = head[p[0]]) >= -1 && (head[p[0]] = 2 * e) >= 0
                    && (to[2 * e + 1] = p[0]) > 0 && (nxt[2 * e + 1] = head[p[1]]) >= -1 && (head[p[1]] = 2 * e + 1) >= 0)
                && new int[n + 1] instanceof int[] tin
                && new int[n + 1] instanceof int[] low
                && new int[n + 1] instanceof int[] pe
                && head.clone() instanceof int[] it
                && new int[n + 1] instanceof int[] stk
                && new boolean[m] instanceof boolean[] br
                && new int[1] instanceof int[] t
                && new int[1] instanceof int[] sp
                && ((IntPredicate) v -> it[v] < 0
                    ? (--sp[0] < 0 || ((low[stk[sp[0]]] = Math.min(low[stk[sp[0]]], low[v])) >= 0 && (low[v] > tin[stk[sp[0]]] ? (br[pe[v] >> 1] = true) : true)))
                    : ((IntPredicate) e -> (it[v] = nxt[e]) >= -1
                        && (e == (pe[v] ^ 1)
                            || (tin[to[e]] != 0
                                ? (low[v] = Math.min(low[v], tin[to[e]])) >= 0
                                : (tin[to[e]] = low[to[e]] = ++t[0]) > 0 && (pe[to[e]] = e) >= 0 && (stk[++sp[0]] = to[e]) > 0))).test(it[v])) instanceof IntPredicate S
                && IntStream.rangeClosed(1, n).filter(r -> tin[r] == 0).allMatch(r -> (tin[r] = low[r] = ++t[0]) > 0 && (pe[r] = -1) < 0 && (stk[0] = r) > 0 && (sp[0] = 0) == 0
                    && IntStream.generate(() -> 0).anyMatch(z -> sp[0] < 0 || (S.test(stk[sp[0]]) && false)))
                && new int[n + 1] instanceof int[] par
                && IntStream.range(0, n + 1).allMatch(i -> (par[i] = i) >= 0)
                && ((IntUnaryOperator) x -> par[IntStream.iterate(x, y -> par[y] != y, y -> par[y] = par[par[y]]).reduce(x, (a, b) -> b)]) instanceof IntUnaryOperator F
                && IntStream.range(0, m).filter(e -> !br[e]).allMatch(e -> (par[F.applyAsInt(to[2 * e])] = F.applyAsInt(to[2 * e + 1])) >= 0)
                && new int[n + 1] instanceof int[] deg
                && IntStream.range(0, m).filter(e -> br[e]).allMatch(e -> ++deg[F.applyAsInt(to[2 * e])] > 0 && ++deg[F.applyAsInt(to[2 * e + 1])] > 0)
                && new int[2][n + 1] instanceof int[][] vis
                && new int[n + 1] instanceof int[] dist
                && new int[n + 1] instanceof int[] q
                && new int[2] instanceof int[] qp
                && new int[1] instanceof int[] md
                && new int[2] instanceof int[] bst
                && ((IntPredicate) s0 -> (qp[0] = 0) == 0 && (qp[1] = 1) == 1 && (q[0] = s0) >= 0 && (vis[md[0]][s0] = 1) > 0 && (dist[s0] = 0) == 0 && (bst[0] = 0) == 0 && (bst[1] = s0) >= 0
                    && IntStream.generate(() -> 0).anyMatch(z -> qp[0] >= qp[1] || (((IntPredicate) v -> Stream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> vis[md[0]][to[e]] != 0
                        || ((vis[md[0]][to[e]] = 1) > 0 && (dist[to[e]] = dist[v] + (br[e >> 1] ? 1 : 0)) >= 0 && (q[qp[1]++] = to[e]) > 0
                            && (dist[to[e]] > bst[0] ? (bst[0] = dist[to[e]]) >= 0 && (bst[1] = to[e]) >= 0 : true)))).test(q[qp[0]++]) && false))) instanceof IntPredicate P
                && IntStream.rangeClosed(1, n).filter(v -> vis[0][v] == 0).mapToLong(v ->
                    (md[0] = 0) == 0 && P.test(v) && (md[0] = 1) == 1 && P.test(bst[1])
                    ? (bst[0] == 0 ? 1L : bst[0] - 1L) : 0L).toArray() instanceof long[] r
                ? n - (IntStream.rangeClosed(1, n).filter(i -> F.applyAsInt(i) == i && deg[i] == 1).count() + LongStream.of(r).sum() - (r.length - 1))
                : -1L))));
    }
}





