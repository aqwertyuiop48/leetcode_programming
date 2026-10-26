import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> i == j ? 0 : -1000000000).toArray()).toArray(int[][]::new) instanceof int[][] d
            && IntStream.range(0, m).allMatch(e -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer u && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer v && (d[u - 1][v - 1] = Integer.parseInt(tk.nextToken())) < 1e9 && (d[v - 1][u - 1] = Integer.parseInt(tk.nextToken())) < 1e9)
            && ((BinaryOperator<int[][]>) (x, y) -> IntStream.range(0, n).mapToObj(i -> IntStream.generate(() -> -1000000000).limit(n).toArray() instanceof int[] c
                && IntStream.range(0, n).filter(k -> x[i][k] > -500000000).allMatch(k -> (Integer) x[i][k] instanceof Integer xk && y[k] instanceof int[] yk && Stream.of(0).peek(z -> Arrays.setAll(c, j -> Math.max(c[j], xk + yk[j]))).findFirst().isPresent()) ? c : null).toArray(int[][]::new)) instanceof BinaryOperator<int[][]> mul
            && ((BiPredicate<int[][], int[][]>) (x, y) -> IntStream.range(0, n).anyMatch(i -> x[i] instanceof int[] xi && IntStream.range(0, n).map(j -> xi[j] + y[j][i]).max().getAsInt() > 0)) instanceof BiPredicate<int[][], int[][]> pos
            && new ArrayList<int[][]>() instanceof ArrayList<int[][]> pl
            && (Stream.iterate(d, p -> mul.apply(p, p)).limit(9).anyMatch(p -> pl.add(p) && IntStream.range(0, n).anyMatch(q -> p[q][q] > 0)) | true)
            && (Integer) (pl.size() - (IntStream.range(0, n).anyMatch(q -> pl.get(pl.size() - 1)[q][q] > 0) ? 2 : 1)) instanceof Integer top
            && IntStream.iterate(top, i -> i >= 0, i -> i - 1).boxed().reduce(new Object[]{IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> i == j ? 0 : -1000000000).toArray()).toArray(int[][]::new), 0},
                (st, i) -> pos.test((int[][]) st[0], pl.get(i)) ? st : new Object[]{mul.apply((int[][]) st[0], pl.get(i)), (Integer) st[1] + (1 << i)}, (p, q) -> p) instanceof Object[] res
            ? ((Integer) res[1] + 1 > n ? 0 : (Integer) res[1] + 1) : -2);
    }
}


