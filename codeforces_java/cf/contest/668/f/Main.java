import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && new int[(n + 1) * 5] instanceof int[] low && new int[n + 1] instanceof int[] lc && new long[(n + 1) * 5] instanceof long[] val && new long[n + 1] instanceof long[] diag && new long[]{1} instanceof long[] dt
            && IntStream.rangeClosed(1, n).filter(v -> (lc[v] = Math.min(v - 1, k)) >= 0
                && IntStream.range(0, lc[v]).filter(j -> (low[v * 5 + j] = v <= k ? j + 1 : sc.nextInt()) > 0 & (val[v * 5 + j] = 1000000006L) > 0 & ++diag[v] > 0 & ++diag[low[v * 5 + j]] > 0).count() >= 0).count() >= 0
            && IntStream.range(0, n - 1).map(j -> n - j).filter(v -> Long.valueOf(diag[v] % 1000000007L) instanceof Long d
                && (dt[0] = dt[0] * d % 1000000007L) >= 0
                && Long.valueOf(BigInteger.valueOf(d).modInverse(BigInteger.valueOf(1000000007L)).longValue()) instanceof Long inv
                && Integer.valueOf(lc[v]) instanceof Integer c
                && IntStream.range(0, c * c).filter(pp -> pp / c <= pp % c && low[v * 5 + pp / c] != 1 && low[v * 5 + pp % c] != 1
                    && Long.valueOf(val[v * 5 + pp / c] * val[v * 5 + pp % c] % 1000000007L * inv % 1000000007L) instanceof Long w
                    && (pp / c == pp % c
                        ? (diag[low[v * 5 + pp / c]] = (diag[low[v * 5 + pp / c]] - w + 1000000007L) % 1000000007L) >= 0
                        : Integer.valueOf(Math.max(low[v * 5 + pp / c], low[v * 5 + pp % c])) instanceof Integer hi && Integer.valueOf(Math.min(low[v * 5 + pp / c], low[v * 5 + pp % c])) instanceof Integer lo
                            && Integer.valueOf(IntStream.range(0, lc[hi]).filter(j -> low[hi * 5 + j] == lo).findFirst().getAsInt()) instanceof Integer ps
                            && (val[hi * 5 + ps] = (val[hi * 5 + ps] - w + 1000000007L) % 1000000007L) >= 0)).count() >= 0).count() >= 0
            ? dt[0] % 1000000007L : "");
    }
}
