import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Double.valueOf(Long.parseLong(st.nextToken()) / 1e9) instanceof Double p
            && new double[(n + 1) * 51] instanceof double[] A && new double[(n + 1) * 51] instanceof double[] B && new double[(n + 1) * 51] instanceof double[] dp
            && IntStream.rangeClosed(1, n).allMatch(L -> IntStream.rangeClosed(1, 50).allMatch(j ->
                (A[L * 51 + j] = j == 1 ? p : (j == 2 ? 1 - p : 0) + A[L * 51 + j - 1] * A[(L - 1) * 51 + j - 1]) >= 0
                && (B[L * 51 + j] = j == 1 ? 0 : j == 2 ? 1 - p : B[L * 51 + j - 1] * A[(L - 1) * 51 + j - 1]) >= 0))
            && ((IntBinaryOperator) (L, j) -> 0) instanceof IntBinaryOperator unused
            && ((ToDoubleBiFunction<Integer, Integer>) (L, j) -> A[L * 51 + j] * (1 - A[(L - 1) * 51 + j])) instanceof ToDoubleBiFunction<Integer, Integer> F
            && ((ToDoubleBiFunction<Integer, Integer>) (L, j) -> B[L * 51 + j] * (1 - A[(L - 1) * 51 + j])) instanceof ToDoubleBiFunction<Integer, Integer> G
            && IntStream.rangeClosed(1, n).allMatch(L -> IntStream.rangeClosed(1, 50).allMatch(j ->
                (dp[L * 51 + j] = j + (L == 1 ? 0.0
                    : (j == 1 ? Double.valueOf(IntStream.rangeClosed(2, 50).mapToDouble(k -> G.applyAsDouble(L - 1, k)).sum()) : Double.valueOf(IntStream.range(1, j).mapToDouble(k -> F.applyAsDouble(L - 1, k)).sum())) instanceof Double den
                        && den > 0 ? (j == 1 ? IntStream.rangeClosed(2, 50).mapToDouble(k -> G.applyAsDouble(L - 1, k) * dp[(L - 1) * 51 + k]).sum() : IntStream.range(1, j).mapToDouble(k -> F.applyAsDouble(L - 1, k) * dp[(L - 1) * 51 + k]).sum()) / den : 0.0)) > 0))
            ? IntStream.rangeClosed(1, 50).mapToDouble(j -> F.applyAsDouble(n, j) * dp[n * 51 + j]).sum() : "");
    }
}
