import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer l && (Integer) s.nextInt() instanceof Integer r && ((IntUnaryOperator) x -> x < 2 ? 0 : (Integer) (int) Math.sqrt(x) instanceof Integer q && new long[q + 2] instanceof long[] A && new long[q + 2] instanceof long[] B && new long[q + 2] instanceof long[] C && new long[q + 2] instanceof long[] D && IntStream.rangeClosed(1, q).allMatch(v -> (A[v] = v - 1) >= 0 && (B[v] = x / v - 1) >= 0 && (C[v] = (v % 4 == 1 || v % 4 == 2 ? 1 : 0) - 1) >= -1 && (D[v] = (x / v % 4 == 1 || x / v % 4 == 2 ? 1 : 0) - 1) >= -1) && IntStream.rangeClosed(2, q).filter(p -> A[p] != A[p - 1]).allMatch(p -> (Long) A[p - 1] instanceof Long cp && (Long) C[p - 1] instanceof Long sp && (Integer) (p % 4 == 1 ? 1 : p % 4 == 3 ? -1 : 0) instanceof Integer ch && IntStream.rangeClosed(1, Math.min(q, x / (p * p))).allMatch(i -> (B[i] -= (i * p <= q ? B[i * p] : A[x / (i * p)]) - cp) >= 0 && (D[i] -= ch * ((i * p <= q ? D[i * p] : C[x / (i * p)]) - sp)) > -1000000000) && IntStream.iterate(q, v -> v >= p * p, v -> v - 1).allMatch(v -> (A[v] -= A[v / p] - cp) >= 0 && (C[v] -= ch * (C[v / p] - sp)) > -1000000000)) ? (int) ((B[1] - 1 + D[1]) / 2 + 1) : 0) instanceof IntUnaryOperator f ? f.applyAsInt(r) - f.applyAsInt(l - 1) : 0).ifPresent(System.out::println);
    }
}
