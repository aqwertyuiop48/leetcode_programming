import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && IntStream.range(0, n).map(i -> t[2 + i] - 1).toArray() instanceof int[] g
            && IntStream.range(0, n).toArray() instanceof int[] par
            && new int[n] instanceof int[] w
            && new boolean[n] instanceof boolean[] dead
            && new long[1] instanceof long[] acc
            && ((Function<Integer, int[]>) x -> par[x] == x ? new int[]{x, 0} : par[par[x]] == par[x] ? new int[]{par[x], w[x]} :
                IntStream.iterate(x, y -> par[y] != y, y -> par[y]).toArray() instanceof int[] path
                && (Integer) (path.length == 0 ? x : par[path[path.length - 1]]) instanceof Integer root
                && (acc[0] = 0) == 0
                && IntStream.iterate(path.length - 1, i -> i >= 0, i -> i - 1).filter(i ->
                    (acc[0] += w[path[i]]) >= 0 && (w[path[i]] = (int) acc[0]) >= 0 && (par[path[i]] = root) >= 0 && i == 0).count() >= 0
                ? new int[]{root, path.length == 0 ? 0 : w[path[0]]}
                : null) instanceof Function<Integer, int[]> find
            && new int[4] instanceof int[] sq
            ? IntStream.range(0, m).mapToObj(q ->
                (sq[0] = (t[2 + n + q] + sq[3] - 1) % n) >= 0
                && (sq[1] = t[2 + n + m + q]) > 0
                && (sq[2] = 0) == 0
                && IntStream.iterate(0, z -> sq[1] > 0, z -> z + 1).filter(z ->
                    find.apply(sq[0]) instanceof int[] rd
                    && (dead[rd[0]] || rd[1] >= sq[1]
                        ? (sq[1] = 0) == 0
                        : (sq[1] -= rd[1] + 1) > -2
                            && ++sq[2] > 0
                            && find.apply(g[rd[0]]) instanceof int[] r2
                            && (r2[0] == rd[0] ? (dead[rd[0]] = true) : (par[rd[0]] = g[rd[0]]) >= 0 && (w[rd[0]] = 1) > 0)
                            && (sq[0] = g[rd[0]]) >= 0)).count() >= 0
                && (sq[3] = sq[2]) >= 0
                ? "" + sq[2] : "").collect(Collectors.joining("\n"))
            : "");
    }
}
