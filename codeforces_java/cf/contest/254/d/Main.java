import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer d
            && IntStream.range(0, n).mapToObj(i -> sc.next()).collect(Collectors.joining()).toCharArray() instanceof char[] g
            && IntStream.range(0, n * m).filter(x -> g[x] == 'R').toArray() instanceof int[] rats
            && new int[n * m] instanceof int[] seen && new int[n * m] instanceof int[] killed && new int[]{0, 0} instanceof int[] tg
            && new int[]{-1, 1, 0, 0} instanceof int[] dr && new int[]{0, 0, -1, 1} instanceof int[] dc
            && ((Function<Integer, int[]>) c -> new int[400] instanceof int[] buf && new int[400] instanceof int[] dd && new int[]{1} instanceof int[] tail
                && (buf[0] = c) >= 0 && (dd[0] = 0) == 0 && (seen[c] = ++tg[0]) > 0
                && IntStream.iterate(0, h -> h < tail[0], h -> h + 1).allMatch(h -> dd[h] >= d || IntStream.range(0, 4).allMatch(q -> Integer.valueOf(buf[h] / m + dr[q]) instanceof Integer nr && Integer.valueOf(buf[h] % m + dc[q]) instanceof Integer nc
                    && (nr < 0 || nc < 0 || nr >= n || nc >= m || g[nr * m + nc] == 'X' || seen[nr * m + nc] == tg[0] || (seen[nr * m + nc] = tg[0]) > 0 && (buf[tail[0]] = nr * m + nc) >= 0 && (dd[tail[0]++] = dd[h] + 1) > 0 || true)))
                ? Arrays.copyOf(buf, tail[0]) : null) instanceof Function<Integer, int[]> cells
            && new int[]{0} instanceof int[] ver
            ? Arrays.stream(cells.apply(rats[0])).boxed().flatMap(c1 -> cells.apply(c1) instanceof int[] k1 && Integer.valueOf(++ver[0]) instanceof Integer v
                    && Arrays.stream(k1).allMatch(x -> (killed[x] = v) > 0) && Integer.valueOf((int) Arrays.stream(k1).filter(x -> g[x] == 'R').count()) instanceof Integer cnt1
                    ? Integer.valueOf(Arrays.stream(rats).filter(r -> killed[r] != v).findFirst().orElse(-1)) instanceof Integer rem
                        ? rem < 0 ? Stream.of(new int[]{c1, IntStream.range(0, n * m).filter(x -> g[x] != 'X' && x != c1).findFirst().orElse(c1)})
                        : Arrays.stream(cells.apply(rem)).boxed().filter(c2 -> cnt1 + Arrays.stream(cells.apply(c2)).filter(x -> g[x] == 'R' && killed[x] != v).count() == rats.length).map(c2 -> new int[]{c1, c2}) : Stream.<int[]>empty()
                    : Stream.<int[]>empty()).findFirst().map(p -> (p[0] / m + 1) + " " + (p[0] % m + 1) + " " + (p[1] / m + 1) + " " + (p[1] % m + 1)).orElse("-1") : "");
    }
}
