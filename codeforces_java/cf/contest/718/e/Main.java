import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && tk.nextToken() instanceof String s
            && IntStream.range(0, n).map(i -> s.charAt(i) - 'a').toArray() instanceof int[] lt
            && IntStream.range(0, 8).mapToObj(l -> IntStream.range(0, n).filter(i -> lt[i] == l).toArray()).toArray(int[][]::new) instanceof int[][] pos
            && new int[8][n] instanceof int[][] dd && new int[n + 1] instanceof int[] q && new int[1] instanceof int[] qt
            && IntStream.range(0, 8).allMatch(c -> dd[c] instanceof int[] dc && IntStream.range(0, n).allMatch(i -> (dc[i] = pos[c].length == 0 ? 1000 : -1) != 0 || true)
                && (pos[c].length == 0 || (new boolean[8] instanceof boolean[] used && (used[c] = true) && (qt[0] = 0) == 0
                    && IntStream.of(pos[c]).allMatch(p -> (dc[p] = 0) == 0 && (q[qt[0]++] = p) >= 0)
                    && IntStream.iterate(0, i -> i < qt[0], i -> i + 1).allMatch(i -> Integer.valueOf(q[i]) instanceof Integer x
                        && (!(x > 0 && dc[x - 1] < 0) || ((dc[x - 1] = dc[x] + 1) > 0 && (q[qt[0]++] = x - 1) >= 0))
                        && (!(x + 1 < n && dc[x + 1] < 0) || ((dc[x + 1] = dc[x] + 1) > 0 && (q[qt[0]++] = x + 1) >= 0))
                        && (used[lt[x]] || ((used[lt[x]] = true) && IntStream.of(pos[lt[x]]).filter(p -> dc[p] < 0).allMatch(p -> (dc[p] = dc[x] + 1) > 0 && (q[qt[0]++] = p) >= 0))) || true)))
                || true)
            && IntStream.range(0, 8).mapToObj(l -> IntStream.range(0, 8).map(c -> pos[l].length == 0 || pos[c].length == 0 ? 1000 : IntStream.of(pos[l]).map(p -> dd[c][p]).min().getAsInt()).toArray()).toArray(int[][]::new) instanceof int[][] ee
            && new long[2048] instanceof long[] cnt
            && IntStream.range(0, n).allMatch(u -> ++cnt[lt[u] * 256 + IntStream.range(0, 8).filter(c -> pos[c].length > 0 && dd[c][u] - ee[lt[u]][c] == 1).map(c -> 1 << c).sum()] > 0)
            && IntStream.range(0, 2048).filter(k -> cnt[k] > 0).toArray() instanceof int[] keys
            && new long[64] instanceof long[] hist
            && ((IntBinaryOperator) (k1, k2) -> IntStream.range(0, 8).filter(c -> pos[c].length > 0).map(c -> ee[k1 >> 8][c] + (k1 >> c & 1) + ee[k2 >> 8][c] + (k2 >> c & 1) + 1).min().getAsInt()) instanceof IntBinaryOperator ft
            && IntStream.range(0, keys.length).allMatch(i -> IntStream.rangeClosed(i, keys.length - 1).allMatch(j ->
                (hist[ft.applyAsInt(keys[i], keys[j])] += (i == j ? cnt[keys[i]] * (cnt[keys[i]] - 1) / 2 : cnt[keys[i]] * cnt[keys[j]])) >= 0))
            && IntStream.range(0, n).allMatch(u -> IntStream.rangeClosed(u + 1, Math.min(n - 1, u + 15)).allMatch(v ->
                Integer.valueOf(IntStream.range(0, 8).filter(c -> pos[c].length > 0).map(c -> dd[c][u] + dd[c][v] + 1).min().getAsInt()) instanceof Integer f
                && --hist[f] > -1000000000000L && ++hist[Math.min(v - u, f)] > -1))
            ? IntStream.range(0, 64).filter(k -> hist[k] > 0).max().getAsInt() + " " + hist[IntStream.range(0, 64).filter(k -> hist[k] > 0).max().getAsInt()] : "");
    }
}
