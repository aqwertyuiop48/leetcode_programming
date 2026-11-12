import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Long.valueOf(st.nextToken()) instanceof Long nn && Double.valueOf(Long.parseLong(st.nextToken()) / 1e9) instanceof Double p
            && Integer.valueOf((int) Math.min(nn, 60L)) instanceof Integer n && Integer.valueOf((int) Math.max(0L, nn - 60L)) instanceof Integer e
            && new double[61 * 51] instanceof double[] A && new double[61 * 51] instanceof double[] B && new double[61 * 51] instanceof double[] dp
            && IntStream.rangeClosed(1, 60).allMatch(L -> IntStream.rangeClosed(1, 50).allMatch(j ->
                (A[L * 51 + j] = j == 1 ? p : (j == 2 ? 1 - p : 0) + A[L * 51 + j - 1] * A[(L - 1) * 51 + j - 1]) >= 0
                && (B[L * 51 + j] = j == 1 ? 0 : j == 2 ? 1 - p : B[L * 51 + j - 1] * A[(L - 1) * 51 + j - 1]) >= 0))
            && ((ToDoubleBiFunction<Integer, Integer>) (L, j) -> A[L * 51 + j] * (1 - A[(L - 1) * 51 + j])) instanceof ToDoubleBiFunction<Integer, Integer> F
            && ((ToDoubleBiFunction<Integer, Integer>) (L, j) -> B[L * 51 + j] * (1 - A[(L - 1) * 51 + j])) instanceof ToDoubleBiFunction<Integer, Integer> G
            && IntStream.rangeClosed(1, n).allMatch(L -> IntStream.rangeClosed(1, 50).allMatch(j ->
                (dp[L * 51 + j] = j + (L == 1 ? 0.0
                    : (j == 1 ? Double.valueOf(IntStream.rangeClosed(2, 50).mapToDouble(k -> G.applyAsDouble(L - 1, k)).sum()) : Double.valueOf(IntStream.range(1, j).mapToDouble(k -> F.applyAsDouble(L - 1, k)).sum())) instanceof Double den
                        && den > 0 ? (j == 1 ? IntStream.rangeClosed(2, 50).mapToDouble(k -> G.applyAsDouble(L - 1, k) * dp[(L - 1) * 51 + k]).sum() : IntStream.range(1, j).mapToDouble(k -> F.applyAsDouble(L - 1, k) * dp[(L - 1) * 51 + k]).sum()) / den : 0.0)) > 0))
            && IntStream.range(0, 51).mapToDouble(j -> j == 0 ? 1 : dp[n * 51 + j]).toArray() instanceof double[] v
            && IntStream.range(0, 51 * 51).mapToDouble(i -> Integer.valueOf(i / 51) instanceof Integer r && Integer.valueOf(i % 51) instanceof Integer c
                ? (r == 0 ? (c == 0 ? 1.0 : 0.0)
                    : c == 0 ? r
                    : Double.valueOf(r == 1 ? IntStream.rangeClosed(2, 50).mapToDouble(k -> G.applyAsDouble(60, k)).sum() : IntStream.range(1, r).mapToDouble(k -> F.applyAsDouble(60, k)).sum()) instanceof Double dn
                        && dn > 0 ? (r == 1 ? (c >= 2 ? G.applyAsDouble(60, c) : 0.0) : (c < r ? F.applyAsDouble(60, c) : 0.0)) / dn : 0.0)
                : 0.0).toArray() instanceof double[] P
            && IntStream.range(0, 31).allMatch(bit -> ((e >> bit & 1) == 0
                    || IntStream.range(0, 51).mapToDouble(r -> IntStream.range(0, 51).mapToDouble(c -> P[r * 51 + c] * v[c]).sum()).toArray() instanceof double[] nv
                    && IntStream.range(0, 51).allMatch(r -> (v[r] = nv[r]) >= 0 || true))
                && IntStream.range(0, 51 * 51).mapToDouble(i -> IntStream.range(0, 51).mapToDouble(k -> P[i / 51 * 51 + k] * P[k * 51 + i % 51]).sum()).toArray() instanceof double[] P2
                && IntStream.range(0, 51 * 51).allMatch(i -> (P[i] = P2[i]) >= 0 || true))
            ? String.format(Locale.US, "%.9f", IntStream.rangeClosed(1, 50).mapToDouble(j -> F.applyAsDouble(n, j) * v[j]).sum()) : "");
    }
}
