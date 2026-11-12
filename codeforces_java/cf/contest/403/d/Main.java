
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && new long[46][1001] instanceof long[][] q && (q[0][0] = 1) > 0
            && IntStream.rangeClosed(1, 45).allMatch(k -> IntStream.rangeClosed(k, 1000).allMatch(l -> (q[k][l] = (q[k][l - k] + q[k - 1][l - k]) % 1000000007L) >= 0))
            && new long[1051][46] instanceof long[][] c
            && IntStream.rangeClosed(0, 1050).allMatch(m -> (c[m][0] = 1) > 0 && IntStream.rangeClosed(1, Math.min(m, 45)).allMatch(j -> (c[m][j] = (c[m - 1][j - 1] + c[m - 1][j]) % 1000000007L) >= 0))
            && new long[46] instanceof long[] f && (f[0] = 1) > 0
            && IntStream.rangeClosed(1, 45).allMatch(i -> (f[i] = f[i - 1] * i % 1000000007L) > 0)
            && new long[1001][46] instanceof long[][] a
            && IntStream.range(0, 45000).allMatch(x -> (a[x / 45 + 1][x % 45 + 1] = f[x % 45 + 1] * (IntStream.rangeClosed(x % 45 + 1, x / 45 + 1).mapToLong(l -> q[x % 45 + 1][l] * c[x / 45 + 1 - l + x % 45 + 1][x % 45 + 1] % 1000000007L).sum() % 1000000007L) % 1000000007L) >= 0)
            ? IntStream.range(0, v[0]).mapToObj(i -> v[2 * i + 2] > 45 || v[2 * i + 1] > 1000 ? "0" : String.valueOf(a[v[2 * i + 1]][v[2 * i + 2]])).collect(Collectors.joining("\n")) : "");
    }
}



