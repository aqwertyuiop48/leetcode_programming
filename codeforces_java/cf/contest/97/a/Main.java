import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt()} instanceof int[] h
            && IntStream.range(0, h[0]).mapToObj(i -> s.next()).collect(Collectors.joining()) instanceof String g
            && new int[h[0] + 1][h[1] + 1] instanceof int[][] sq
            && IntStream.range(0, h[0] + 1).allMatch(i -> IntStream.range(0, h[1] + 1).allMatch(j -> (sq[i][j] = -1) < 0))
            && new int[1] instanceof int[] nc
            && IntStream.range(0, h[0] * h[1]).allMatch(i ->
                g.charAt(i) == '.' || sq[i / h[1]][i % h[1]] >= 0
                || ((sq[i / h[1]][i % h[1]] = sq[i / h[1]][i % h[1] + 1] = sq[i / h[1] + 1][i % h[1]] = sq[i / h[1] + 1][i % h[1] + 1] = nc[0]) >= 0
                    && ++nc[0] > 0))
            && new int[128] instanceof int[] fi
            && IntStream.range(0, 128).allMatch(i -> (fi[i] = -1) < 0)
            && new ArrayList<int[]>() instanceof ArrayList<int[]> dl
            && IntStream.range(0, h[0] * h[1]).allMatch(i ->
                g.charAt(i) == '.'
                || (fi[g.charAt(i)] < 0
                    ? (fi[g.charAt(i)] = i) >= 0
                    : dl.add(new int[]{sq[fi[g.charAt(i)] / h[1]][fi[g.charAt(i)] % h[1]], sq[i / h[1]][i % h[1]]})))
            && dl.toArray(new int[0][]) instanceof int[][] dom
            && new int[14] instanceof int[] as
            && new int[14] instanceof int[] best
            && new int[7] instanceof int[] dc
            && new int[1] instanceof int[] mx
            && new int[1] instanceof int[] cw
            && new boolean[49] instanceof boolean[] used
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> f
            && f.getAndSet(c -> c == 14
                ? ++cw[0] > 0 && (cw[0] > 1 || IntStream.range(0, 14).allMatch(q -> (best[q] = as[q]) >= 0))
                : IntStream.range(0, 7).filter(d -> dc[d] < 2 && d <= mx[0]).allMatch(d ->
                    (as[c] = d) >= 0 && ++dc[d] > 0
                    && Integer.valueOf(mx[0]) instanceof Integer om
                    && (mx[0] = Math.max(om, d + 1)) > 0
                    && IntStream.range(0, dom.length).filter(q -> Math.max(dom[q][0], dom[q][1]) == c)
                        .map(q -> Math.min(as[dom[q][0]], as[dom[q][1]]) * 7 + Math.max(as[dom[q][0]], as[dom[q][1]]))
                        .toArray() instanceof int[] ks
                    && ((IntStream.of(ks).distinct().count() == ks.length
                            && IntStream.of(ks).noneMatch(k -> used[k])
                            && IntStream.of(ks).allMatch(k -> used[k] = true)
                            && f.get().test(c + 1)
                            && IntStream.of(ks).allMatch(k -> !(used[k] = false))) || true)
                    && --dc[d] >= 0 && (mx[0] = om) >= 0)) == null
            && f.get().test(0)
            ? (cw[0] * 5040L) + "\n" + IntStream.range(0, h[0]).mapToObj(i -> IntStream.range(0, h[1])
                .mapToObj(j -> g.charAt(i * h[1] + j) == '.' ? "." : String.valueOf(best[sq[i][j]]))
                .collect(Collectors.joining())).collect(Collectors.joining("\n"))
            : "");
    }
}

