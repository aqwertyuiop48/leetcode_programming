import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Long) Long.parseLong(tk.nextToken()) instanceof Long k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] trap
            && new int[n][n] instanceof int[][] cnt && new int[n] instanceof int[] deg
            && IntStream.range(0, m).allMatch(i -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer u && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer v && ++cnt[u][v] > 0 && ++cnt[v][u] > 0 && ++deg[u] > 0 && ++deg[v] > 0)
            && IntStream.range(0, n).filter(i -> trap[i] == 0).toArray() instanceof int[] nt && IntStream.range(0, n).filter(i -> trap[i] == 1).toArray() instanceof int[] tr
            && (Integer) nt.length instanceof Integer N && (Integer) tr.length instanceof Integer t
            && new int[n] instanceof int[] pos && IntStream.range(0, N).allMatch(i -> (pos[nt[i]] = i) >= 0) && IntStream.range(0, t).allMatch(i -> (pos[tr[i]] = i) >= 0)
            && new double[N][N + t] instanceof double[][] A && new int[N] instanceof int[] perm && IntStream.range(0, N).allMatch(i -> (perm[i] = i) >= 0)
            && IntStream.range(0, N).allMatch(i -> (A[i][i] += 1) > 0 && IntStream.range(0, n).allMatch(v -> cnt[nt[i]][v] == 0 || (trap[v] == 0 ? (A[i][pos[v]] -= cnt[nt[i]][v] / (double) deg[nt[i]]) < 100 : (A[i][N + pos[v]] += cnt[nt[i]][v] / (double) deg[nt[i]]) > -1)))
            && IntStream.range(0, N).allMatch(c -> (Integer) IntStream.range(c, N).boxed().max(Comparator.comparingDouble(r -> Math.abs(A[perm[r]][c]))).get() instanceof Integer pv
                && (Integer) perm[c] instanceof Integer tmp && (perm[c] = perm[pv]) >= 0 && (perm[pv] = tmp) >= 0
                && IntStream.range(c + 1, N).allMatch(r -> (Double) (A[perm[r]][c] / A[perm[c]][c]) instanceof Double fct && (fct == 0 || IntStream.range(c, N + t).allMatch(j -> (A[perm[r]][j] -= fct * A[perm[c]][j]) < 1e300))))
            && new double[N][t] instanceof double[][] F
            && IntStream.range(0, N).map(i -> N - 1 - i).allMatch(i -> IntStream.range(0, t).allMatch(b -> (F[i][b] = (A[perm[i]][N + b] - IntStream.range(i + 1, N).mapToDouble(j -> A[perm[i]][j] * F[j][b]).sum()) / A[perm[i]][i]) < 1e300))
            && new double[t][t] instanceof double[][] T0
            && IntStream.range(0, t).allMatch(a -> IntStream.range(0, n).allMatch(v -> cnt[tr[a]][v] == 0 || IntStream.range(0, t).allMatch(b -> (T0[a][b] += cnt[tr[a]][v] / (double) deg[tr[a]] * (trap[v] == 1 ? (pos[v] == b ? 1 : 0) : F[pos[v]][b])) < 1e300)))
            && new double[][][]{T0} instanceof double[][][] mh && new double[][]{F[pos[0]]} instanceof double[][] rv
            && IntStream.range(0, 31).allMatch(bit -> (((k - 2) >> bit & 1) == 0 || (rv[0] = IntStream.range(0, t).mapToDouble(b -> IntStream.range(0, t).mapToDouble(a -> rv[0][a] * mh[0][a][b]).sum()).toArray()) != null)
                && (bit == 30 || (mh[0] = IntStream.range(0, t).mapToObj(a -> IntStream.range(0, t).mapToDouble(b -> IntStream.range(0, t).mapToDouble(x -> mh[0][a][x] * mh[0][x][b]).sum()).toArray()).toArray(double[][]::new)) != null))
            ? String.format("%.8f", rv[0][pos[n - 1]]) : "");
    }
}
