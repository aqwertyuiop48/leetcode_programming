import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n - 1).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}).sorted(Comparator.comparingInt(e -> e[2])).toArray(int[][]::new) instanceof int[][] es
            && new long[n + 1] instanceof long[] cap && IntStream.rangeClosed(1, n).allMatch(i -> (cap[i] = Long.parseLong(tk.nextToken())) > 0) && (Long) LongStream.of(cap).sum() instanceof Long X
            && IntStream.range(0, n + 1).toArray() instanceof int[] par && new int[n + 1] instanceof int[] sz && IntStream.rangeClosed(1, n).allMatch(i -> (sz[i] = 1) == 1)
            && ((IntUnaryOperator) x -> IntStream.iterate(x, p -> par[p] != p, p -> par[p]).reduce((u, w) -> w) instanceof OptionalInt o && o.isPresent() ? par[o.getAsInt()] : x) instanceof IntUnaryOperator find
            && new int[]{0, 0} instanceof int[] st
            && (IntStream.range(0, n).allMatch(g -> st[1] >= es.length ? false : IntStream.rangeClosed(1, n).filter(v -> find.applyAsInt(v) == v).allMatch(v -> sz[v] <= X - cap[v])
                && (st[0] = es[st[1]][2]) >= 0
                && (IntStream.range(0, es.length).anyMatch(z -> !(st[1] < es.length && es[st[1]][2] == st[0] && (Integer) find.applyAsInt(es[st[1]][0]) instanceof Integer ra && (Integer) find.applyAsInt(es[st[1]][1]) instanceof Integer rb
                    && (ra.equals(rb) || (Integer) (sz[ra] >= sz[rb] ? ra : rb) instanceof Integer big && (Integer) (big.equals(ra) ? rb : ra) instanceof Integer small && (par[small] = big) >= 0 && (sz[big] += sz[small]) > 0 && (cap[big] += cap[small]) > 0) && ++st[1] > 0)) || true)) || true)
            ? st[0] : 0);
    }
}
