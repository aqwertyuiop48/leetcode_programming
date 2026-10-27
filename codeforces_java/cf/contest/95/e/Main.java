import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] a
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((a[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) a[0] instanceof Integer n
            && (Integer) a[1] instanceof Integer m
            && IntStream.range(0, n).toArray() instanceof int[] par
            && IntStream.range(0, n).map(i -> 1).toArray() instanceof int[] size
            && new int[2] instanceof int[] cur
            && ((java.util.function.IntUnaryOperator) v ->
                (cur[0] = v) >= 0
                && (par[cur[0]] == cur[0] || par[par[cur[0]]] == par[cur[0]] && (cur[0] = par[cur[0]]) >= 0 || IntStream.range(0, 20).allMatch(z -> par[cur[0]] != cur[0] && (cur[0] = par[cur[0]]) >= 0) || true)
                ? cur[0] : -1) instanceof java.util.function.IntUnaryOperator find
            && IntStream.range(0, m).allMatch(e ->
                (Integer) find.applyAsInt(a[2 + 2 * e] - 1) instanceof Integer ra
                && (Integer) find.applyAsInt(a[3 + 2 * e] - 1) instanceof Integer rb
                && (ra.equals(rb)
                    || (size[ra] < size[rb]
                        ? (par[ra] = rb) >= 0 && (size[rb] += size[ra]) > 0
                        : (par[rb] = ra) >= 0 && (size[ra] += size[rb]) > 0)))
            && new int[n + 1] instanceof int[] cnt
            && IntStream.range(0, n).filter(i -> par[i] == i).allMatch(i -> cnt[size[i]]++ >= 0)
            && new int[] {1, 10, 100, 1000, 10000, 100000} instanceof int[] pw
            && IntStream.rangeClosed(2, 63).map(k -> IntStream.range(0, 31 - Integer.numberOfLeadingZeros(k))
                .map(j -> ((k >> j) & 1) == 1 ? 7 * pw[j] : 4 * pw[j]).sum()).filter(v -> v <= n).sorted().toArray() instanceof int[] lk
            && (Integer) IntStream.of(lk).max().orElse(0) instanceof Integer lim
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : 1000000000).toArray() instanceof int[] dp
            && new int[1] instanceof int[] tot
            && IntStream.rangeClosed(1, n).filter(sv -> cnt[sv] > 0).allMatch(sv ->
                new int[] {cnt[sv], 1} instanceof int[] rem
                && IntStream.range(0, 20).allMatch(z ->
                    rem[0] <= 0
                    || (Integer) Math.min(rem[1], rem[0]) instanceof Integer t
                    && (Integer) (sv * t) instanceof Integer wt
                    && (Integer) Math.min(lim, tot[0] + wt) instanceof Integer top
                    && (tot[0] += wt) > 0
                    && (rem[0] -= t) >= 0
                    && (rem[1] *= 2) > 0
                    && (top < wt || IntStream.rangeClosed(0, top - wt).filter(i ->
                        (dp[top - i] = Math.min(dp[top - i], dp[top - i - wt] + t)) < 0).count() >= 0)))
            ? IntStream.of(lk).filter(x -> dp[x] < 1000000000).map(x -> dp[x] - 1).min().orElse(-1)
            : 0);
    }
}

