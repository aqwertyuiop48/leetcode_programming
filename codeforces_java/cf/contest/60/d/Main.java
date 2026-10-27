import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextToken())).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).map(i -> Integer.parseInt(sc.nextToken())).toArray() instanceof int[] a
                && Integer.valueOf(Arrays.stream(a).max().getAsInt()) instanceof Integer mx
                && new int[mx + 1] instanceof int[] id
                && IntStream.range(0, n).allMatch(i -> (id[a[i]] = i + 1) > 0)
                && IntStream.range(0, n).toArray() instanceof int[] par
                && new int[n] instanceof int[] sz
                && Arrays.stream(par).allMatch(i -> (sz[i] = 1) > 0)
                && new int[]{n} instanceof int[] comps
                && new IntBinaryOperator[1] instanceof IntBinaryOperator[] gh
                && (gh[0] = (x, y) -> y == 0 ? x : gh[0].applyAsInt(y, x % y)) != null
                && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
                && (fh[0] = x -> par[x] == x ? x : (par[x] = fh[0].applyAsInt(par[x]))) != null
                && IntStream.rangeClosed(2, (int) Math.sqrt(1.21 * mx) + 3).allMatch(m ->
                    IntStream.range(1, m).filter(q -> (m - q) % 2 == 1 && (long) m * m - (long) q * q <= mx && 2L * m * q <= mx && (id[m * m - q * q] > 0 ? 1 : 0) + (id[2 * m * q] > 0 ? 1 : 0) + (m * m + q * q <= mx && id[m * m + q * q] > 0 ? 1 : 0) >= 2 && gh[0].applyAsInt(m, q) == 1)
                        .mapToObj(q -> IntStream.of(m * m - q * q, 2 * m * q, m * m + q * q).filter(v -> v <= mx).map(v -> id[v]).filter(i -> i > 0).map(i -> i - 1).toArray())
                        .allMatch(pr -> IntStream.range(1, pr.length).allMatch(i ->
                            Integer.valueOf(fh[0].applyAsInt(pr[0])) instanceof Integer ra && Integer.valueOf(fh[0].applyAsInt(pr[i])) instanceof Integer rb
                            && (ra.equals(rb) || (sz[ra] < sz[rb]
                                ? (par[ra] = rb) >= 0 && (sz[rb] += sz[ra]) > 0 && --comps[0] >= 0
                                : (par[rb] = ra) >= 0 && (sz[ra] += sz[rb]) > 0 && --comps[0] >= 0)))))
                ? comps[0]
                : -1)));
    }
}





