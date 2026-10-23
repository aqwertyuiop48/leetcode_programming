import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && (Integer) (n + 205) instanceof Integer N && new long[N] instanceof long[] f && new long[N] instanceof long[] iv && (f[0] = 1) > 0
            && IntStream.range(1, N).allMatch(i -> (f[i] = f[i - 1] * i % 1000000007L) > 0)
            && (iv[N - 1] = BigInteger.valueOf(f[N - 1]).modInverse(BigInteger.valueOf(1000000007L)).longValue()) > 0
            && IntStream.range(1, N).map(i -> N - i).allMatch(i -> (iv[i - 1] = iv[i] * i % 1000000007L) > 0)
            && new int[101][n + 2] instanceof int[][] d
            && IntStream.range(0, m).allMatch(q -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
                && (d[k][l] = (d[k][l] + 1) % 1000000007) >= 0
                && IntStream.rangeClosed(0, k).allMatch(j -> (d[j][r + 1] = (int) ((d[j][r + 1] - f[k - j + r - l] * iv[k - j] % 1000000007L * iv[r - l] % 1000000007L + 1000000007L) % 1000000007L)) >= 0))
            && new int[2][n + 2] instanceof int[][] sv
            && IntStream.range(0, 101).map(t -> 100 - t).allMatch(j -> IntStream.rangeClosed(1, n).allMatch(i -> (sv[j & 1][i] = (int) (((long) sv[j & 1][i - 1] + (j == 100 ? 0 : sv[(j + 1) & 1][i]) + d[j][i] + 1000000007L) % 1000000007L)) >= 0)
                && (j == 0 || IntStream.rangeClosed(0, n + 1).allMatch(i -> (sv[(j + 1) & 1][i] = 0) == 0) || true))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf((a[i - 1] + sv[0][i]) % 1000000007L)).collect(Collectors.joining(" ")) : "");
    }
}
