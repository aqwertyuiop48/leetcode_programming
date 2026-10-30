import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && (Integer) (n * m) instanceof Integer k && new boolean[20] instanceof boolean[] bl && new long[][]{new long[20]} instanceof long[][] vv && (vv[0][0] = 1) == 1 && new int[]{1} instanceof int[] cur && new long[1][][] instanceof long[][][] ph
            && ((ToLongBiFunction<long[], long[]>) (a, b) -> ((a[0] * b[0] + a[1] * b[1] + a[2] * b[2] + a[3] * b[3] + a[4] * b[4] + a[5] * b[5] + a[6] * b[6] + a[7] * b[7]) % 1000000007L
                + (a[8] * b[8] + a[9] * b[9] + a[10] * b[10] + a[11] * b[11] + a[12] * b[12] + a[13] * b[13] + a[14] * b[14] + a[15] * b[15]) % 1000000007L
                + (a[16] * b[16] + a[17] * b[17] + a[18] * b[18] + a[19] * b[19]) % 1000000007L) % 1000000007L) instanceof ToLongBiFunction<long[], long[]> dot
            && ((BiFunction<long[][], long[], long[]>) (P, v) -> IntStream.range(0, 20).mapToLong(i -> dot.applyAsLong(P[i], v)).toArray()) instanceof BiFunction<long[][], long[], long[]> mv
            && new long[1][][] instanceof long[][][] qq && ((UnaryOperator<long[][]>) P -> (qq[0] = new long[20][]) != null
                && IntStream.range(0, 20).allMatch(i -> (qq[0][i] = IntStream.range(0, 20).mapToLong(j -> j < i ? qq[0][j][i] : dot.applyAsLong(P[i], P[j])).toArray()) != null) ? qq[0] : qq[0]) instanceof UnaryOperator<long[][]> sq
            ? IntStream.range(0, q).mapToObj(e -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer tp && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer y
                && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer t && (Integer) ((x - 1) * m + y - 1) instanceof Integer idx && (Integer) (t - cur[0]) instanceof Integer dt
                && (ph[0] = IntStream.range(0, 20).mapToObj(i -> IntStream.range(0, 20).mapToLong(j -> (i < k && j < k && !bl[i] && !bl[j] && (i == j || (i / m == j / m && Math.abs(i - j) == 1) || Math.abs(i - j) == m)) ? 1 : 0).toArray()).toArray(long[][]::new)) != null
                && IntStream.range(0, 31).takeWhile(b -> (dt >> b) > 0).allMatch(b -> (((dt >> b) & 1) == 0 || (vv[0] = mv.apply(ph[0], vv[0])) != null) && ((dt >> (b + 1)) == 0 || (ph[0] = sq.apply(ph[0])) != null))
                && (cur[0] = t) > 0
                ? ((tp == 2 ? (vv[0][idx] = 0) == 0 && (bl[idx] = true) : tp == 3 ? (bl[idx] = false) || true : true) ? (tp == 1 ? String.valueOf(vv[0][idx]) : null) : null) : null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
