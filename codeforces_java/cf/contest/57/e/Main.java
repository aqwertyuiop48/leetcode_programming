import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] g
            && new long[4] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : i < raw.length && raw[i] == '-' ? (ps[3] = 1) > 0
                    : (ps[2] != 1 || ((g[(int) ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) != Long.MIN_VALUE && (ps[0] = ps[3] = ps[2] = 0) == 0)))
            && Integer.valueOf(200) instanceof Integer S
            && Integer.valueOf(2 * S + 20) instanceof Integer O
            && Integer.valueOf(2 * O + 1) instanceof Integer W
            && new int[W * W] instanceof int[] dist
            && IntStream.range(0, W * W).allMatch(i -> (dist[i] = -1) < 0)
            && IntStream.range(0, (int) g[1]).allMatch(e -> (dist[(int) (g[2 + 2 * e] + O) * W + (int) g[3 + 2 * e] + O] = -2) < 0)
            && IntStream.range(0, 8).map(m -> new int[]{1, 1, -1, -1, 2, 2, -2, -2}[m] * W + new int[]{2, -2, 2, -2, 1, -1, 1, -1}[m]).toArray() instanceof int[] off
            && new int[W * W] instanceof int[] q
            && new int[]{1} instanceof int[] tail
            && new long[S + 1] instanceof long[] cnt
            && (cnt[0] = 1) == 1
            && (dist[O * W + O] = 0) == 0
            && (q[0] = O * W + O) > 0
            && (IntStream.range(0, 8 * W * W).allMatch(i ->
                (i >> 3) < tail[0]
                && (dist[q[i >> 3]] >= S
                    || dist[q[i >> 3] + off[i & 7]] != -1
                    || ((dist[q[i >> 3] + off[i & 7]] = dist[q[i >> 3]] + 1) > 0
                        && (q[tail[0]++] = q[i >> 3] + off[i & 7]) > 0
                        && ++cnt[dist[q[i >> 3] + off[i & 7]]] > 0))) || true)
            && IntStream.rangeClosed(1, S).allMatch(t -> (cnt[t] += cnt[t - 1]) > 0)
            ? (g[0] <= S
                ? BigInteger.valueOf(cnt[(int) g[0]])
                : BigInteger.valueOf(cnt[S]).add(BigInteger.valueOf(g[0] - S).multiply(BigInteger.valueOf(cnt[S] - cnt[S - 1])))
                    .add(BigInteger.valueOf((cnt[S] - cnt[S - 1]) - (cnt[S - 1] - cnt[S - 2])).multiply(BigInteger.valueOf(g[0] - S)).multiply(BigInteger.valueOf(g[0] - S + 1)).shiftRight(1))).mod(BigInteger.valueOf(1000000007))
            : BigInteger.ZERO);
    }
}

