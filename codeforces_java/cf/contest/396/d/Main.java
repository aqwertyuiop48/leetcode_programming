import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long P && Long.valueOf(250000002L) instanceof Long inv4
            && new long[n + 1] instanceof long[] f && IntStream.rangeClosed(0, n).allMatch(i -> (f[i] = i == 0 ? 1 : f[i - 1] * i % P) > 0)
            && new int[n + 1] instanceof int[] bit && new long[2] instanceof long[] st
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer x
                && Long.valueOf(x - 1 - IntStream.iterate(x - 1, j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum()) instanceof Long c
                && IntStream.iterate(x, j -> j <= n, j -> j + (j & -j)).allMatch(j -> ++bit[j] > 0)
                && Long.valueOf(n - i - 1) instanceof Long r
                && (st[1] = (st[1] + st[0] % P * c % P * f[(int) (long) r] % P + c * (c - 1) / 2 % P * f[(int) (long) r] % P
                    + c * f[(int) (long) r] % P * (r * (r - 1) % P) % P * inv4 % P) % P) >= 0
                && (st[0] += c) >= 0)
            ? (st[0] + st[1]) % P : "");
    }
}
