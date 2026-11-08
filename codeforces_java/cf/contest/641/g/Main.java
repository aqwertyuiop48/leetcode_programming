import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && new int[(n + 1) * 5] instanceof int[] par && new int[n + 1] instanceof int[] cnt && new long[(n + 1) * 5] instanceof long[] w && new long[n + 1] instanceof long[] d && new long[]{1} instanceof long[] ans
            && IntStream.rangeClosed(1, n).filter(i -> (cnt[i] = Math.min(i - 1, k)) >= 0
                & IntStream.range(0, cnt[i]).filter(j -> (par[i * 5 + j] = i <= k ? j + 1 : Integer.parseInt(tk.nextToken())) > 0
                    & (w[i * 5 + j] = 1000000006L) > 0 & ++d[i] > 0 & ++d[par[i * 5 + j]] > 0).count() >= 0).count() >= 0
            && IntStream.rangeClosed(2, n).map(x -> n + 2 - x).filter(i -> (ans[0] = ans[0] * d[i] % 1000000007L) >= 0
                && Long.valueOf(BigInteger.valueOf(d[i]).modInverse(BigInteger.valueOf(1000000007L)).longValue()) instanceof Long inv
                && IntStream.range(0, 25).filter(t -> t / 5 < cnt[i] && t % 5 < cnt[i] && par[i * 5 + t / 5] >= 2 && par[i * 5 + t % 5] >= 2
                    && (par[i * 5 + t / 5] > par[i * 5 + t % 5] || t / 5 == t % 5)
                    && Long.valueOf(w[i * 5 + t / 5] * w[i * 5 + t % 5] % 1000000007L * inv % 1000000007L) instanceof Long dl
                    && (t / 5 == t % 5
                        ? (d[par[i * 5 + t / 5]] = (d[par[i * 5 + t / 5]] - dl + 1000000007L) % 1000000007L) >= 0
                        : IntStream.range(0, 5).filter(jj -> jj < cnt[par[i * 5 + t / 5]] && par[par[i * 5 + t / 5] * 5 + jj] == par[i * 5 + t % 5]
                            && (w[par[i * 5 + t / 5] * 5 + jj] = (w[par[i * 5 + t / 5] * 5 + jj] - dl + 1000000007L) % 1000000007L) >= 0).count() >= 0)
                    && false).count() >= 0 && false).count() >= 0
            ? ans[0] : "");
    }
}
