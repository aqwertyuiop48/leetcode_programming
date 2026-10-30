import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] a
            && (Integer) (n / k) instanceof Integer q && (Integer) (n % k) instanceof Integer r && (Integer) (k - r + 1) instanceof Integer w && new long[w] instanceof long[] dp
            && IntStream.range(0, r + 1).filter(i -> IntStream.range(0, w).filter(j -> (dp[j] = i + j == 0 ? 0L : Math.min(i > 0 ? dp[j] + a[(i - 1) * (q + 1) + j * q + q] - a[(i - 1) * (q + 1) + j * q] : Long.MAX_VALUE,
                    j > 0 ? dp[j - 1] + a[i * (q + 1) + (j - 1) * q + q - 1] - a[i * (q + 1) + (j - 1) * q] : Long.MAX_VALUE)) < 0).count() >= 0).count() >= 0
            ? dp[w - 1] : -1L);
    }
}
