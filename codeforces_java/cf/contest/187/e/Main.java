import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] g0
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf((int) g0[0]) instanceof Integer n
            && Long.valueOf(g0[1]) instanceof Long l
            && Integer.valueOf((int) g0[2]) instanceof Integer s
            && (Function<long[], long[]>) (in ->
                Integer.valueOf(in.length - 2) instanceof Integer nn
                && Integer.valueOf((int) in[0]) instanceof Integer ss
                && Long.valueOf(in[1]) instanceof Long ll
                && new PriorityQueue<Long>() instanceof PriorityQueue<Long> rest
                && new long[]{Long.MAX_VALUE, 0, 0} instanceof long[] best
                && new long[2] instanceof long[] cs
                && IntStream.rangeClosed(ss + 1, nn).allMatch(e ->
                    (e - 2 < ss + 1 || rest.add(in[e] - in[e - 1]))
                    && Long.valueOf(ll - (ss - 1) - (nn - e)) instanceof Long k
                    && (k <= 0 || cs[0] >= k || rest.isEmpty() || ((cs[1] += rest.poll()) >= 0 && cs[0]++ >= 0))
                    && (ll < (ss > 1 ? 1 : 0) + (e < nn ? 1 : 0)
                        || (k > 0 && cs[0] < k)
                        || (Long.valueOf(2 * (in[ss + 1] - in[2]) + (in[e + 1] - in[ss + 1]) + 2 * (in[nn + 1] - in[e + 1]) + (k > 0 ? 2 * cs[1] : 0)) instanceof Long cost
                            && (cost >= best[0]
                                || ((best[0] = cost) >= 0 && (best[1] = e) >= 0 && (best[2] = Math.max(k, 0)) >= 0)))))
                ? best : null) instanceof Function<long[], long[]> sa
            && (Function<long[], int[]>) (in ->
                Integer.valueOf(in.length - 4) instanceof Integer nn
                && Integer.valueOf((int) in[0]) instanceof Integer ss
                && Long.valueOf(in[1]) instanceof Long ll
                && Integer.valueOf((int) in[2]) instanceof Integer e
                && Integer.valueOf((int) in[3]) instanceof Integer k
                && new boolean[nn + 2] instanceof boolean[] sel
                && IntStream.rangeClosed(ss + 1, e - 2).boxed().sorted(Comparator.comparingLong(i -> in[i + 4] - in[i + 3])).limit(k).allMatch(i -> (sel[i] = true))
                && Integer.valueOf(e < nn ? 1 : 0) instanceof Integer b1
                && Integer.valueOf(k > 0 ? ss - 1 : (int) Math.min(ss - 1, ll - k - b1)) instanceof Integer la
                && Integer.valueOf((int) (ll - k - la)) instanceof Integer lb
                && new int[nn - 1] instanceof int[] ord
                && new int[1] instanceof int[] pt
                && IntStream.range(1, la).allMatch(t -> (ord[pt[0]++] = ss - t) > 0)
                && (ss == 1 || (ord[pt[0]++] = 1) > 0)
                && IntStream.rangeClosed(2, ss - la).allMatch(p -> (ord[pt[0]++] = p) > 0)
                && new int[nn + 2] instanceof int[] bst
                && IntStream.rangeClosed(ss + 1, e - 1).allMatch(p -> (bst[p] = sel[p - 1] ? bst[p - 1] : p) > 0)
                && IntStream.rangeClosed(ss + 1, e - 1).allMatch(p ->
                    (p < e - 1 && sel[p])
                    || IntStream.iterate(p, q -> q >= bst[p], q -> q - 1).allMatch(q -> (ord[pt[0]++] = q) > 0))
                && Integer.valueOf(nn - e - lb) instanceof Integer t0
                && IntStream.rangeClosed(e + 1, e + t0).allMatch(p -> (ord[pt[0]++] = p) > 0)
                && IntStream.iterate(nn, p -> p > e + t0, p -> p - 1).allMatch(p -> (ord[pt[0]++] = p) > 0)
                && (ord[pt[0]++] = e) > 0
                ? ord : null) instanceof Function<long[], int[]> bd
            && new long[n + 2] instanceof long[] ia
            && (ia[0] = s) >= 0
            && (ia[1] = l) >= 0
            && IntStream.rangeClosed(1, n).allMatch(i -> (ia[i + 1] = g0[i + 2]) >= 0)
            && new long[n + 2] instanceof long[] ib
            && (ib[0] = n + 1 - s) > 0
            && (ib[1] = n - 1 - l) >= 0
            && IntStream.rangeClosed(1, n).allMatch(i -> (ib[i + 1] = g0[n + 2] - g0[n + 3 - i]) >= 0)
            && sa.apply(ia) instanceof long[] ra
            && sa.apply(ib) instanceof long[] rb
            && (Boolean) (rb[0] < ra[0]) instanceof Boolean useB
            && (useB ? rb : ra) instanceof long[] bs
            && (useB ? ib : ia) instanceof long[] cur
            && new StringBuilder() instanceof StringBuilder sb
            && (bs[0] == Long.MAX_VALUE
                ? sb.append("-1\n") != null
                : new long[n + 4] instanceof long[] bin
                    && (bin[0] = cur[0]) >= 0
                    && (bin[1] = cur[1]) >= 0
                    && (bin[2] = bs[1]) > 0
                    && (bin[3] = bs[2]) >= 0
                    && IntStream.rangeClosed(1, n).allMatch(i -> (bin[i + 3] = cur[i + 1]) >= 0)
                    && bd.apply(bin) instanceof int[] od
                    && sb.append(bs[0]).append('\n') != null
                    && Arrays.stream(od).allMatch(v -> sb.append(useB ? n + 1 - v : v).append(' ') != null))
            ? sb : "");
    }
}

