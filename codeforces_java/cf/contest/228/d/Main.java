import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long M
            && new long[n + 1] instanceof long[] a && new long[30][n + 1] instanceof long[][] bit
            && ((IntBinaryOperator) (z, c) -> (z - 2) * (z - 1) + c) instanceof IntBinaryOperator id
            && ((IntBinaryOperator) (b, i) -> (int) (IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).mapToLong(j -> bit[b][j]).sum() % M)) instanceof IntBinaryOperator sum
            && ((BiPredicate<int[], Long>) (arg, d) -> IntStream.iterate(arg[1], j -> j <= n, j -> j + (j & -j)).allMatch(j -> (bit[arg[0]][j] = (bit[arg[0]][j] + d) % M) >= 0)) instanceof BiPredicate<int[], Long> add
            && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = it.next()) >= 0 && IntStream.rangeClosed(2, 6).allMatch(z -> add.test(new int[]{id.applyAsInt(z, i % (2 * (z - 1))), i}, a[i])))
            && Integer.valueOf(it.next()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(q -> Integer.valueOf(it.next()) instanceof Integer t
                ? (t == 1
                    ? ((Integer.valueOf(it.next()) instanceof Integer i && Long.valueOf(it.next()) instanceof Long v && Long.valueOf(((v - a[i]) % M + M) % M) instanceof Long d
                        && (a[i] = v) >= 0 && IntStream.rangeClosed(2, 6).allMatch(z -> add.test(new int[]{id.applyAsInt(z, i % (2 * (z - 1))), i}, d))) ? (String) null : (String) null)
                    : (Integer.valueOf(it.next()) instanceof Integer l && Integer.valueOf(it.next()) instanceof Integer r && Integer.valueOf(it.next()) instanceof Integer z && Integer.valueOf(2 * (z - 1)) instanceof Integer p
                        ? String.valueOf(IntStream.range(0, p).mapToLong(c -> Integer.valueOf((c - l % p + p) % p) instanceof Integer tt
                            && Long.valueOf((tt <= z - 1 ? tt + 1 : p - tt + 1) * (((long) sum.applyAsInt(id.applyAsInt(z, c), r) - sum.applyAsInt(id.applyAsInt(z, c), l - 1) + M) % M) % M) instanceof Long term ? term : 0).sum() % M) : (String) null))
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }


}
