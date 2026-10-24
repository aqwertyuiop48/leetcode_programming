import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> Integer.parseInt(tk.nextToken()) - 1).toArray() instanceof int[] ed
            && new int[2 * m] instanceof int[] nxt && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] head && new int[n] instanceof int[] deg
            && IntStream.range(0, 2 * m).allMatch(j -> (nxt[j] = head[ed[j]]) >= -1 && (head[ed[j]] = j) >= 0 && ++deg[ed[j]] > 0)
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] color && new int[n] instanceof int[] q && new int[2] instanceof int[] qp
            && IntStream.range(0, n).allMatch(r -> color[r] >= 0 || ((color[r] = 0) == 0 && (q[qp[1]++] = r) >= 0
                && IntStream.range(0, n).takeWhile(z -> qp[0] < qp[1]).allMatch(z -> (Integer) q[qp[0]++] instanceof Integer u
                    && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> color[ed[e ^ 1]] < 0).allMatch(e -> (color[ed[e ^ 1]] = 1 - color[u]) >= 0 && (q[qp[1]++] = ed[e ^ 1]) >= 0))))
            && (Integer) (int) IntStream.of(color).filter(c -> c == 0).count() instanceof Integer cz
            && (cz % 3 != 2 || IntStream.range(0, n).allMatch(i -> (color[i] = 1 - color[i]) >= 0))
            && (Integer) (int) IntStream.of(color).filter(c -> c == 0).count() instanceof Integer c0 && (Integer) (n - c0) instanceof Integer c1
            && new int[n] instanceof int[] res && new int[n] instanceof int[] mk && new int[]{1, 3} instanceof int[] st
            && ((IntBinaryOperator) (i, want) -> (color[i] = 2) == 2 && (res[i] = st[0]) > 0 && IntStream.iterate(head[i], e -> e >= 0, e -> nxt[e]).allMatch(e -> (mk[ed[e ^ 1]] = i + 1) > 0)
                && IntStream.range(0, n).filter(j -> color[j] == want && mk[j] != i + 1).limit(2).allMatch(j -> (color[j] = 2) == 2 && (res[j] = st[0]) > 0) && ++st[0] > 0 ? 1 : 0) instanceof IntBinaryOperator grp
            && (cz % 3 == 0 || (IntStream.range(0, n).filter(i -> color[i] == 0 && deg[i] <= c1 - 2).findFirst() instanceof OptionalInt f0 && f0.isPresent()
                ? grp.applyAsInt(f0.getAsInt(), 1) == 1
                : IntStream.range(0, n).filter(i -> color[i] == 1 && deg[i] <= c0 - 2).limit(2).toArray() instanceof int[] cd && cd.length == 2 && grp.applyAsInt(cd[0], 0) == 1 && grp.applyAsInt(cd[1], 0) == 1))
            && IntStream.concat(IntStream.range(0, n).filter(i -> color[i] == 0), IntStream.range(0, n).filter(i -> color[i] == 1)).allMatch(i -> (res[i] = st[0]) > 0 && (--st[1] != 0 || (++st[0] > 0 && (st[1] = 3) > 0)))
            ? "YES\n" + IntStream.of(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "NO");
    }
}
