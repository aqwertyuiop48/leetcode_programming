import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k && Long.valueOf(1000000007L) instanceof Long MOD
            && new long[52][52] instanceof long[][] C && IntStream.range(0, 52).allMatch(i -> (C[i][0] = 1) > 0 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD) >= 0))
            && new long[52][60][2] instanceof long[][][] A && (A[1][0][0] = 1) > 0
            && IntStream.rangeClosed(2, n).allMatch(s -> IntStream.range(0, 26).allMatch(m1 -> IntStream.range(0, 2).allMatch(t1 -> (A[s][t1 == 0 ? m1 + 1 : m1][t1 == 0 ? 1 : 0] = (A[s][t1 == 0 ? m1 + 1 : m1][t1 == 0 ? 1 : 0] + s * A[s - 1][m1][t1]) % MOD) >= 0))
                && IntStream.rangeClosed(1, s - 2).allMatch(a -> IntStream.range(0, 26).allMatch(m1 -> IntStream.range(0, 26).allMatch(m2 -> IntStream.range(0, 4).allMatch(tt -> Integer.valueOf(tt / 2) instanceof Integer t1 && Integer.valueOf(tt % 2) instanceof Integer t2
                    && Integer.valueOf(t1 == 0 || t2 == 0 ? 1 : 0) instanceof Integer f && (A[s][m1 + m2 + f][f] = (A[s][m1 + m2 + f][f]
                        + s * C[s - 1][a] % MOD * A[a][m1][t1] % MOD * A[s - 1 - a][m2][t2] % MOD * 500000004L) % MOD) >= 0)))))
            ? (k >= 60 ? 0 : (A[n][k][0] + A[n][k][1]) % MOD * java.math.BigInteger.valueOf(n).modInverse(java.math.BigInteger.valueOf(MOD)).longValue() % MOD) : "");
    }
}
