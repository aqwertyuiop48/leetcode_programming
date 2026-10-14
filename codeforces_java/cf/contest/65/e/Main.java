import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
            && (Integer) nm[0] instanceof Integer N
            && (Integer) nm[1] instanceof Integer M
            && IntStream.generate(s::nextInt).limit(2L * M).map(x -> x - 1).toArray() instanceof int[] E
            && new int[N] instanceof int[] deg
            && IntStream.range(0, N).map(i -> -1).toArray() instanceof int[] head
            && new int[2 * M] instanceof int[] nxt
            && IntStream.range(0, M).allMatch(i ->
                (deg[E[2 * i]]++ >= 0) & (deg[E[2 * i + 1]]++ >= 0)
                & (nxt[2 * i] = head[E[2 * i]]) >= -1 & (head[E[2 * i]] = 2 * i) >= 0
                & (nxt[2 * i + 1] = head[E[2 * i + 1]]) >= -1 & (head[E[2 * i + 1]] = 2 * i + 1) >= 0)
            && IntStream.range(0, N).toArray() instanceof int[] par
            && IntStream.range(0, N).map(i -> 1).toArray() instanceof int[] sz
            && ((IntUnaryOperator) x -> IntStream.iterate(x, v -> par[v]).filter(v -> par[v] == v).findFirst().getAsInt()) instanceof IntUnaryOperator find
            && new int[]{-1} instanceof int[] cyc
            && IntStream.range(0, M).allMatch(i ->
                new int[]{find.applyAsInt(E[2 * i]), find.applyAsInt(E[2 * i + 1])} instanceof int[] r
                && (r[0] == r[1]
                    ? cyc[0] >= 0 || (cyc[0] = i) >= 0
                    : (par[sz[r[0]] < sz[r[1]] ? r[0] : r[1]] = sz[r[0]] < sz[r[1]] ? r[1] : r[0]) >= 0
                      & (sz[sz[r[0]] < sz[r[1]] ? r[1] : r[0]] += sz[sz[r[0]] < sz[r[1]] ? r[0] : r[1]]) >= 0))
            && new int[N] instanceof int[] cntE
            && IntStream.range(0, M).allMatch(i -> cntE[find.applyAsInt(E[2 * i])]++ >= 0)
            && IntStream.range(0, N).filter(v -> par[v] == v).toArray() instanceof int[] roots
            && (Integer) (roots.length - 1) instanceof Integer K
            && ((Boolean) (N > 1 && deg[0] == 0)) instanceof Boolean Sp
            && (Integer) (Sp && cyc[0] < 0
                ? IntStream.range(0, N).filter(v -> deg[v] == 1 && cntE[find.applyAsInt(v)] >= 2).findFirst().orElse(-1)
                : -1) instanceof Integer Lf
            && (Integer) (!Sp ? -1 : cyc[0] >= 0 ? cyc[0] : Lf >= 0 ? head[Lf] >> 1 : -1) instanceof Integer E0
            && !(Sp ? E0 < 0 || M < K + (cyc[0] >= 0 ? 0 : 1) : M < K)
            && (Integer) (E0 < 0 ? 0 : cyc[0] >= 0 ? E[2 * E0] : E[2 * E0] == Lf ? E[2 * E0 + 1] : E[2 * E0]) instanceof Integer A
            && (Integer) find.applyAsInt(A) instanceof Integer Ex
            && IntStream.concat(
                IntStream.concat(
                    Arrays.stream(roots).filter(v -> v != Ex && cntE[v] > 0),
                    IntStream.range(1, N).filter(v -> deg[v] == 0)),
                Lf >= 0 ? IntStream.of(Lf) : IntStream.empty()).toArray() instanceof int[] P
            && new int[N + 2] instanceof int[] stk
            && new int[N + 2] instanceof int[] pes
            && new int[]{0, 0, 0, 0} instanceof int[] reg
            && new StringBuilder() instanceof StringBuilder out
            && new StringBuilder() instanceof StringBuilder cur
            && new boolean[N] instanceof boolean[] vis
            && new boolean[M] instanceof boolean[] done
            && new boolean[M] instanceof boolean[] moved
            && head.clone() instanceof int[] ptr
            && ((IntPredicate) x -> reg[2]++ >= 0 && cur.append(' ').append(x + 1) != null) instanceof IntPredicate aw
            && ((BiPredicate<Integer, Integer>) (y, e) ->
                (stk[reg[0]] = y) >= 0 & (pes[reg[0]++] = e) >= -1 & (vis[y] = true) & aw.test(y)) instanceof BiPredicate<Integer, Integer> push
            && ((BiPredicate<Integer, Integer>) (x, e) ->
                (Integer) P[reg[1]++] instanceof Integer y
                && (reg[3]++ >= 0)
                & out.append(reg[2]).append(cur).append('\n').append(e + 1).append(' ').append(x + 1).append(' ').append(y + 1).append('\n') != null
                & cur.delete(0, cur.length()) != null
                & (reg[2] = 0) == 0
                & (moved[e] = true)
                & push.test(y, e)) instanceof BiPredicate<Integer, Integer> attach
            && ((BooleanSupplier) () ->
                (Integer) stk[reg[0] - 1] instanceof Integer v
                && (ptr[v] >= 0
                    ? (Integer) ptr[v] instanceof Integer j
                      && (ptr[v] = nxt[j]) >= -1
                      && (done[j >> 1]
                          || (done[j >> 1] = true)
                             && (Integer) ((j & 1) == 0 ? E[2 * (j >> 1) + 1] : E[2 * (j >> 1)]) instanceof Integer w
                             && (vis[w] ? reg[1] >= P.length || attach.test(v, j >> 1) : push.test(w, j >> 1)))
                    : reg[0]-- > 1
                      && (Integer) stk[reg[0] - 1] instanceof Integer p
                      && (Integer) pes[reg[0]] instanceof Integer pe
                      && aw.test(p)
                      && (moved[pe] || reg[1] >= P.length || attach.test(p, pe)))) instanceof BooleanSupplier step
            && (Sp
                ? push.test(0, -1)
                  & (reg[3]++ >= 0)
                  & out.append(reg[2]).append(cur).append('\n').append(E0 + 1).append(' ').append(A + 1).append(" 1\n") != null
                  & cur.delete(0, cur.length()) != null
                  & (reg[2] = 0) == 0
                  & (moved[E0] = true)
                  & (done[E0] = true)
                  & push.test(A, E0)
                : push.test(0, -1))
            && IntStream.generate(() -> 0).filter(z -> !step.getAsBoolean()).findFirst().isPresent()
            ? "YES\n" + reg[3] + "\n" + out + reg[2] + cur
            : "NO");
    }
}
