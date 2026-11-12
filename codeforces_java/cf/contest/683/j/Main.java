import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && ((Integer) Integer.parseInt(t[0])) instanceof Integer n
            && ((Integer) Integer.parseInt(t[1])) instanceof Integer m
            && ((Integer) (n * m)) instanceof Integer nm
            && ((IntUnaryOperator) i -> t[2 + i / m].charAt(i % m)) instanceof IntUnaryOperator ch
            && IntStream.range(0, nm).map(i -> ch.applyAsInt(i) == 'X' ? 1 : 0).toArray() instanceof int[] g
            && ((Integer) IntStream.range(0, nm).filter(i -> ch.applyAsInt(i) == 'E').findFirst().getAsInt()) instanceof Integer he
            && ((Integer) IntStream.range(0, nm).filter(i -> ch.applyAsInt(i) == 'T').findFirst().getAsInt()) instanceof Integer tx
            && new int[] {he} instanceof int[] hp
            && new int[] {m, -m, 1, -1} instanceof int[] dl
            && new int[] {1, -1, 0, 0} instanceof int[] dr
            && new int[] {0, 0, 1, -1} instanceof int[] dc
            && new StringBuilder() instanceof StringBuilder sb
            && new int[nm] instanceof int[] dist
            && new int[nm] instanceof int[] pd
            && new int[nm] instanceof int[] q
            && new int[2] instanceof int[] qp
            && new int[nm] instanceof int[] d2
            && new int[nm] instanceof int[] key
            && new int[1] instanceof int[] cur
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> dq
            && ((IntBinaryOperator) (u, d) -> u / m + dr[d] >= 0 && u / m + dr[d] < n && u % m + dc[d] >= 0 && u % m + dc[d] < m ? u + dl[d] : -1) instanceof IntBinaryOperator nb
            && ((IntBinaryOperator) (u, d) -> ((Integer) nb.applyAsInt(u, d)) instanceof Integer v
                && v >= 0 && g[v] == 0 && dist[v] < 0 && (dist[v] = dist[u] + 1) > 0 && (pd[v] = d) >= 0 && (q[qp[1]++] = v) >= 0 ? 1 : 0) instanceof IntBinaryOperator visit
            && ((IntUnaryOperator) z -> IntStream.range(0, nm).filter(i -> (dist[i] = -1) > 0).count() == 0
                && (dist[hp[0]] = 0) == 0 && (q[0] = hp[0]) >= 0 && (qp[0] = 0) == 0 && (qp[1] = 1) == 1
                && IntStream.range(0, nm).allMatch(k -> qp[0] < qp[1] && ((Integer) q[qp[0]++]) instanceof Integer u
                    && (u.intValue() == tx.intValue() || visit.applyAsInt(u, 0) + visit.applyAsInt(u, 1) + visit.applyAsInt(u, 2) + visit.applyAsInt(u, 3) >= 0))
                || true ? 1 : 0) instanceof IntUnaryOperator bfs
            && ((IntUnaryOperator) z -> IntStream.range(0, nm).filter(i -> (d2[i] = 536870912) < 0).count() == 0
                && (d2[tx] = 0) == 0 && dq.offerFirst(tx)
                && IntStream.range(0, 8 * nm + 8).allMatch(k -> dq.pollFirst() instanceof Integer u
                    && IntStream.range(0, 4).filter(e -> ((Integer) nb.applyAsInt(u, e)) instanceof Integer v
                        && v >= 0 && d2[u] + g[v] < d2[v] && (d2[v] = d2[u] + g[v]) >= 0 && (g[v] == 0 ? dq.offerFirst(v) : dq.offerLast(v))).count() >= 0)
                || true ? 1 : 0) instanceof IntUnaryOperator cost
            && ((IntBinaryOperator) (s, w) -> s < 0 ? -1 : w == 4 ? s
                : (((Integer) nb.applyAsInt(s, w)) instanceof Integer v && v >= 0 && g[v] == 0 && v.intValue() != tx.intValue() ? v : -1)) instanceof IntBinaryOperator mv
            && ((IntUnaryOperator) p -> IntStream.range(0, 125).filter(c -> ((Integer) mv.applyAsInt(mv.applyAsInt(mv.applyAsInt(p, c % 5), c / 5 % 5), c / 25)) instanceof Integer f
                && f >= 0 && (Math.abs(f / m - p / m) >= 2 || Math.abs(f % m - p % m) >= 2)).findFirst().orElse(-1)) instanceof IntUnaryOperator esc
            && ((IntBinaryOperator) (r, c) -> r >= 0 && r < n && c >= 0 && c < m && g[r * m + c] == 1 ? d2[r * m + c] : 536870912) instanceof IntBinaryOperator kv
            && ((IntBinaryOperator) (r, c) -> Math.min(
                Math.min(Math.min(kv.applyAsInt(r - 1, c - 1), kv.applyAsInt(r - 1, c)), Math.min(kv.applyAsInt(r - 1, c + 1), kv.applyAsInt(r, c - 1))),
                Math.min(Math.min(kv.applyAsInt(r, c), kv.applyAsInt(r, c + 1)), Math.min(Math.min(kv.applyAsInt(r + 1, c - 1), kv.applyAsInt(r + 1, c)), kv.applyAsInt(r + 1, c + 1))))) instanceof IntBinaryOperator kf
            && ((IntUnaryOperator) z -> IntStream.range(0, nm).parallel().filter(p -> (key[p] = dist[p] < 0 || Math.max(Math.abs(p / m - tx / m), Math.abs(p % m - tx % m)) < 2 ? 536870912
                : kf.applyAsInt(p / m, p % m) >= 536870912 ? 536870912 : kf.applyAsInt(p / m, p % m) * 20000 + dist[p]) < 0).count() == 0 ? 1 : 0) instanceof IntUnaryOperator keys
            && ((IntUnaryOperator) z -> (IntStream.range(0, nm + 1).allMatch(k -> (cur[0] = IntStream.range(0, nm).parallel().reduce((a, b) -> key[b] < key[a] ? b : a).getAsInt()) >= 0
                && key[cur[0]] < 536870912 && esc.applyAsInt(cur[0]) < 0 && (key[cur[0]] = 536870912) > 0) || true) && key[cur[0]] < 536870912 ? cur[0] : -1) instanceof IntUnaryOperator sel
            && ((IntUnaryOperator) p -> (int) IntStream.range(0, 9).filter(j -> p / m + j / 3 - 1 >= 0 && p / m + j / 3 - 1 < n && p % m + j % 3 - 1 >= 0 && p % m + j % 3 - 1 < m
                && (g[(p / m + j / 3 - 1) * m + p % m + j % 3 - 1] = 0) > 0).count()) instanceof IntUnaryOperator clr
            && ((IntUnaryOperator) tg -> new StringBuilder() instanceof StringBuilder seg
                && IntStream.iterate(tg, c -> c != hp[0], c -> c - dl[pd[c]]).filter(c -> seg.append("SNEW".charAt(pd[c])) == null).count() == 0
                && sb.append(seg.reverse()).length() >= 0 ? 1 : 0) instanceof IntUnaryOperator emit
            && ((IntPredicate) k -> bfs.applyAsInt(0) >= 0
                && (dist[tx] >= 0 ? emit.applyAsInt(tx) < 0
                    : (keys.applyAsInt(0) >= 0 && ((Integer) sel.applyAsInt(0)) instanceof Integer p
                        && (p < 0 ? sb.append("No solution").length() < 0
                            : (emit.applyAsInt(p) >= 0 && sb.append('M').length() > 0 && ((Integer) esc.applyAsInt(p)) instanceof Integer ec
                                && sb.append("SNEWT".charAt(ec % 5)).append("SNEWT".charAt(ec / 5 % 5)).append("SNEWT".charAt(ec / 25)).length() > 0
                                && (hp[0] = mv.applyAsInt(mv.applyAsInt(mv.applyAsInt(p, ec % 5), ec / 5 % 5), ec / 25)) >= 0 && clr.applyAsInt(p) >= 0))))) instanceof IntPredicate step
            && cost.applyAsInt(0) >= 0 && (IntStream.range(0, nm + 5).allMatch(step) || true)
            ? sb.toString() : "");
    }
}
