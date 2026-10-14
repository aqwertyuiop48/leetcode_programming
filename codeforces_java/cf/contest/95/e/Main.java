import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split("\\s+") instanceof String[] tk
            && Arrays.stream(tk).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && new int[a[0]] instanceof int[] p
            && IntStream.range(0, a[0]).allMatch(i -> (p[i] = i) >= 0)
            && new int[a[0]] instanceof int[] sz
            && IntStream.range(0, a[0]).allMatch(i -> (sz[i] = 1) > 0)
            && ((IntUnaryOperator) v -> Stream.iterate(v, w -> p[w]).filter(w -> p[w] == w).findFirst().get()) instanceof IntUnaryOperator fd
            && IntStream.range(0, a[1]).allMatch(e ->
                Integer.valueOf(fd.applyAsInt(a[2 + 2 * e] - 1)) instanceof Integer ra
                && Integer.valueOf(fd.applyAsInt(a[3 + 2 * e] - 1)) instanceof Integer rb
                && (ra.equals(rb)
                    || (sz[ra] < sz[rb]
                        ? (p[ra] = rb) >= 0 && (sz[rb] += sz[ra]) > 0
                        : (p[rb] = ra) >= 0 && (sz[ra] += sz[rb]) > 0)))
            && new int[a[0] + 1] instanceof int[] cnt
            && IntStream.range(0, a[0]).filter(i -> p[i] == i).allMatch(i -> cnt[sz[i]]++ >= 0)
            && Integer.valueOf(IntStream.rangeClosed(1, a[0]).filter(x -> Integer.toString(x).chars().allMatch(c -> c == '4' || c == '7')).max().orElse(0)) instanceof Integer bd
            && new int[1] instanceof int[] tot
            && new int[a[0] + 1] instanceof int[] dp
            && IntStream.rangeClosed(1, a[0]).allMatch(i -> (dp[i] = 1000000000) > 0)
            && IntStream.rangeClosed(1, a[0]).filter(sv -> cnt[sv] > 0).allMatch(sv ->
                Stream.iterate(new int[]{1, cnt[sv]}, q -> q[1] > 0, q -> new int[]{q[0] * 2, q[1] - Math.min(q[0], q[1])})
                    .allMatch(q -> Integer.valueOf(Math.min(q[0], q[1])) instanceof Integer t
                        && Integer.valueOf(sv * t) instanceof Integer wt
                        && Integer.valueOf(Math.min(bd, tot[0] + wt)) instanceof Integer top
                        && (tot[0] += wt) > 0
                        && (top < wt || IntStream.rangeClosed(0, top - wt).map(i -> top - i)
                            .allMatch(j -> (dp[j] = Math.min(dp[j], dp[j - wt] + t)) >= 0))))
            ? IntStream.rangeClosed(1, a[0])
                .filter(x -> Integer.toString(x).chars().allMatch(c -> c == '4' || c == '7') && dp[x] < 1000000000)
                .map(x -> dp[x] - 1).min().orElse(-1)
            : 0);
    }
}
