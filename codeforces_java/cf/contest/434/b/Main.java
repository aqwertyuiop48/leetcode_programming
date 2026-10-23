import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && new int[n + 2][m + 2] instanceof int[][] g && new int[n + 2][m + 2] instanceof int[][] U && new int[n + 2][m + 2] instanceof int[][] D && new int[n + 2][m + 2] instanceof int[][] L && new int[n + 2][m + 2] instanceof int[][] R
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> (g[i][j] = Integer.parseInt(tk.nextToken())) >= 0))
            && ((IntPredicate) y -> IntStream.rangeClosed(1, n).allMatch(i -> (U[i][y] = g[i][y] == 1 ? U[i - 1][y] + 1 : 0) >= 0) && IntStream.rangeClosed(1, n).map(i -> n + 1 - i).allMatch(i -> (D[i][y] = g[i][y] == 1 ? D[i + 1][y] + 1 : 0) >= 0)) instanceof IntPredicate col
            && ((IntPredicate) x -> IntStream.rangeClosed(1, m).allMatch(j -> (L[x][j] = g[x][j] == 1 ? L[x][j - 1] + 1 : 0) >= 0) && IntStream.rangeClosed(1, m).map(j -> m + 1 - j).allMatch(j -> (R[x][j] = g[x][j] == 1 ? R[x][j + 1] + 1 : 0) >= 0)) instanceof IntPredicate row
            && IntStream.rangeClosed(1, m).allMatch(col::test) && IntStream.rangeClosed(1, n).allMatch(row::test)
            && ((ToIntBiFunction<int[], Integer>) (arr, pos) -> new int[]{pos, pos, arr[pos], arr[pos]} instanceof int[] st
                && (IntStream.range(0, arr.length).allMatch(t -> (Integer) (st[0] > 0 ? arr[st[0] - 1] : 0) instanceof Integer cl && (Integer) (st[1] < arr.length - 1 ? arr[st[1] + 1] : 0) instanceof Integer cr && Math.max(cl, cr) > 0
                    && (cl >= cr ? (st[2] = Math.min(st[2], cl)) >= 0 && --st[0] >= 0 : (st[2] = Math.min(st[2], cr)) >= 0 && ++st[1] >= 0) && (st[3] = Math.max(st[3], st[2] * (st[1] - st[0] + 1))) >= 0) || true) ? st[3] : 0) instanceof ToIntBiFunction<int[], Integer> best
            ? IntStream.range(0, q).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer t && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer y
                ? t == 1 ? (g[x][y] ^= 1) >= 0 && col.test(y) && row.test(x) ? "" : "" : g[x][y] == 0 ? "0" : String.valueOf(IntStream.of(
                    best.applyAsInt(IntStream.rangeClosed(1, m).map(j -> D[x][j]).toArray(), y - 1), best.applyAsInt(IntStream.rangeClosed(1, m).map(j -> U[x][j]).toArray(), y - 1),
                    best.applyAsInt(IntStream.rangeClosed(1, n).map(j -> R[j][y]).toArray(), x - 1), best.applyAsInt(IntStream.rangeClosed(1, n).map(j -> L[j][y]).toArray(), x - 1)).max().getAsInt()) : "").filter(z -> !z.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
