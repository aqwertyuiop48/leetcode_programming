import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && LongStream.of(n / 2 + 1, (n + 1) / 2).boxed().toList() instanceof List<Long> cx && LongStream.of(m / 2 + 1, (m + 1) / 2).boxed().toList() instanceof List<Long> cy
            && IntStream.range(0, 4).mapToLong(k -> cx.get(k / 2) * cy.get(k % 2)).toArray() instanceof long[] c
            && Long.valueOf((long) (n + 1) * (m + 1)) instanceof Long N
            && ((ToIntFunction<int[]>) t -> ((t[1] >> 1 ^ t[0] >> 1) & (t[2] & 1 ^ t[0] & 1)) ^ ((t[1] & 1 ^ t[0] & 1) & (t[2] >> 1 ^ t[0] >> 1))) instanceof ToIntFunction<int[]> par
            ? String.valueOf(IntStream.range(0, 64).filter(k -> par.applyAsInt(new int[]{k / 16, k / 4 % 4, k % 4}) == 0).mapToLong(k -> c[k / 16] * c[k / 4 % 4] * c[k % 4]).sum() - N - 3 * N * (N - 1)
                - 6 * IntStream.rangeClosed(0, n).mapToLong(dx -> IntStream.rangeClosed(0, m).filter(dy -> dx + dy > 0).mapToLong(dy -> (long) (n - dx + 1) * (m - dy + 1) * (dx > 0 && dy > 0 ? 2 : 1) * (BigInteger.valueOf(dx).gcd(BigInteger.valueOf(dy)).intValue() - 1)).sum()).sum()) : "");
    }
}
