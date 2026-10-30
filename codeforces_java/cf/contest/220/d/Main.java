import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && (Long) 1000000007L instanceof Long P
            && LongStream.of(n / 2 + 1, (n + 1) / 2).boxed().toList() instanceof List<Long> cx && LongStream.of(m / 2 + 1, (m + 1) / 2).boxed().toList() instanceof List<Long> cy
            && IntStream.range(0, 4).mapToLong(k -> cx.get(k / 2) * cy.get(k % 2)).toArray() instanceof long[] c
            && Long.valueOf((long) (n + 1) * (m + 1)) instanceof Long N
            && ((ToIntFunction<int[]>) t -> ((t[1] >> 1 ^ t[0] >> 1) & (t[2] & 1 ^ t[0] & 1)) ^ ((t[1] & 1 ^ t[0] & 1) & (t[2] >> 1 ^ t[0] >> 1))) instanceof ToIntFunction<int[]> par
            && new int[Math.max(n, m) + 1] instanceof int[] phi
            && IntStream.rangeClosed(1, Math.max(n, m)).allMatch(i -> (phi[i] = i - IntStream.range(1, i).filter(e -> i % e == 0).map(e -> phi[e]).sum()) > 0)
            && ((LongBinaryOperator) (nn, d) -> (nn / d) * (nn + 1) - d * (nn / d) * (nn / d + 1) / 2) instanceof LongBinaryOperator A
            && (Long) IntStream.rangeClosed(1, Math.min(n, m)).mapToLong(d -> phi[d] * (A.applyAsLong(n, d) * A.applyAsLong(m, d) % P) % P).sum() instanceof Long inter
            && (Long) (IntStream.rangeClosed(1, n).mapToLong(x -> (long) (n - x + 1) * (x - 1)).sum() * (m + 1) + IntStream.rangeClosed(1, m).mapToLong(y -> (long) (m - y + 1) * (y - 1)).sum() * (n + 1)) instanceof Long axis
            && (Long) Math.floorMod(axis + 2 * (inter - A.applyAsLong(n, 1) * A.applyAsLong(m, 1) % P), P) instanceof Long T
            ? String.valueOf(Math.floorMod(IntStream.range(0, 64).filter(k -> par.applyAsInt(new int[]{k / 16, k / 4 % 4, k % 4}) == 0).mapToLong(k -> c[k / 16] * c[k / 4 % 4] % P * c[k % 4] % P).sum() - N - 3 * N * (N - 1) % P - 6 * T, P)) : "");
    }
}
