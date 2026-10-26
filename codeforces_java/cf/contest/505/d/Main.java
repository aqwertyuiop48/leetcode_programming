import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par && new int[n + 1] instanceof int[] indeg
            && new int[n + 1] instanceof int[] head && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && new int[m] instanceof int[] nxt && new int[m] instanceof int[] to
            && IntStream.range(0, m).allMatch(e -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b
                && (to[e] = b) > 0 && (nxt[e] = head[a]) >= -1 && (head[a] = e) >= 0 && ++indeg[b] > 0
                && (par[IntStream.iterate(a, y -> par[y] = par[par[y]]).filter(y -> par[y] == y).findFirst().getAsInt()] = IntStream.iterate(b, y -> par[y] = par[par[y]]).filter(y -> par[y] == y).findFirst().getAsInt()) >= 0)
            && new ArrayDeque<Integer>(IntStream.rangeClosed(1, n).filter(i -> indeg[i] == 0).boxed().toList()) instanceof ArrayDeque<Integer> q
            && new boolean[n + 1] instanceof boolean[] done
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(v -> (done[v] = true)
                && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> --indeg[to[e]] != 0 || q.add(to[e])))
            && new boolean[n + 1] instanceof boolean[] cyc
            && IntStream.rangeClosed(1, n).filter(v -> !done[v]).allMatch(v -> (cyc[IntStream.iterate(v, y -> par[y] = par[par[y]]).filter(y -> par[y] == y).findFirst().getAsInt()] = true))
            ? n - IntStream.rangeClosed(1, n).filter(v -> par[v] == v).count() + IntStream.rangeClosed(1, n).filter(v -> cyc[v]).count() : 0);
    }
}
