import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) g[0] instanceof Integer n
            && (Integer) g[n + 1] instanceof Integer p
            && new int[n + 2] instanceof int[] st
            && IntStream.range(0, p).allMatch(q -> ++st[g[n + 3 + 2 * q] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(b -> (st[b] += st[b - 1]) >= 0)
            && Arrays.copyOf(st, n + 2) instanceof int[] pos
            && new int[p] instanceof int[] ord
            && IntStream.range(0, p).allMatch(q -> (ord[pos[g[n + 3 + 2 * q]]++] = q) >= 0)
            && new long[2 * n + 2] instanceof long[] dp
            && new long[p] instanceof long[] ans
            && IntStream.rangeClosed(1, n).allMatch(b ->
                st[b] == st[b + 1]
                || ((Long) IntStream.range(st[b], st[b + 1]).mapToLong(k -> (n - g[n + 2 + 2 * ord[k]]) / b + 1).sum() instanceof Long td
                    && (Integer) (IntStream.range(st[b], st[b + 1]).map(k -> g[n + 2 + 2 * ord[k]]).min().getAsInt() - 1) instanceof Integer lo
                    && (3 * td > n - lo
                        ? IntStream.range(0, n - lo).mapToLong(t -> dp[n - 1 - t] = g[n - t] + dp[n - 1 - t + b]).sum() >= Long.MIN_VALUE
                            && IntStream.range(st[b], st[b + 1]).allMatch(k -> (ans[ord[k]] = dp[g[n + 2 + 2 * ord[k]] - 1]) >= 0)
                        : IntStream.range(st[b], st[b + 1]).allMatch(k ->
                            (Integer) g[n + 2 + 2 * ord[k]] instanceof Integer a
                            && (ans[ord[k]] = IntStream.range(0, (n - a) / b + 1).mapToLong(t -> g[a + t * b]).sum()) >= 0))))
            && new StringBuilder() instanceof StringBuilder sb
            && Arrays.stream(ans).allMatch(v -> sb.append(v).append('\n') != null)
            ? sb
            : "");
    }
}
