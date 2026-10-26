import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> Integer.parseInt(tk.nextToken())).toArray()).toArray(int[][]::new) instanceof int[][] g
            && ((IntUnaryOperator) r -> IntStream.of(g[r]).boxed().reduce(new int[]{0, 0}, (acc, v) -> v == 1 ? new int[]{acc[0] + 1, Math.max(acc[1], acc[0] + 1)} : new int[]{0, acc[1]}, (x, y) -> x)[1]) instanceof IntUnaryOperator rowBest
            && IntStream.range(0, n).map(rowBest).toArray() instanceof int[] best
            ? IntStream.range(0, q).mapToObj(i -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer r && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer c
                && (g[r][c] ^= 1) >= 0 && (best[r] = rowBest.applyAsInt(r)) >= 0 ? String.valueOf(IntStream.of(best).max().getAsInt()) : "").collect(Collectors.joining("\n")) : "");
    }
}
