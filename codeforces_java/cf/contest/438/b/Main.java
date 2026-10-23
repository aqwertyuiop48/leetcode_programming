import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.range(0, m).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken()) - 1}).map(e -> new int[]{e[0], e[1], Math.min(a[e[0]], a[e[1]])})
                .sorted((x, y) -> y[2] - x[2]).toList() instanceof List<int[]> es
            && IntStream.range(0, n).toArray() instanceof int[] par && IntStream.range(0, n).map(i -> 1).toArray() instanceof int[] sz
            && ((IntUnaryOperator) x -> IntStream.iterate(x, p -> par[p] != p, p -> par[p]).reduce((u, w) -> w) instanceof OptionalInt o && o.isPresent() ? par[o.getAsInt()] : x) instanceof IntUnaryOperator find
            ? String.format("%.6f", es.stream().mapToDouble(e -> (Integer) find.applyAsInt(e[0]) instanceof Integer ra && (Integer) find.applyAsInt(e[1]) instanceof Integer rb
                ? ra.equals(rb) ? 0.0 : (Double) ((double) sz[ra] * sz[rb] * e[2]) instanceof Double add && (Integer) (sz[ra] >= sz[rb] ? ra : rb) instanceof Integer big && (Integer) (big.equals(ra) ? rb : ra) instanceof Integer small
                    && (par[small] = big) >= 0 && (sz[big] += sz[small]) > 0 ? add : 0.0 : 0.0).sum() / (n * (n - 1) / 2.0)) : "");
    }
}
