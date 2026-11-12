import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t
            && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(t.nextToken())).toArray() instanceof long[] a
            && new long[n + 1] instanceof long[] P && new long[n + 1] instanceof long[] Q
            && IntStream.range(0, n).filter(i -> (P[i + 1] = P[i] + a[i]) == 0 | (Q[i + 1] = Q[i] + (i + 1) * a[i]) == 0 | true).count() >= 0
            && ((Predicate<long[]>) v -> Math.multiplyHigh(v[0], v[1]) > Math.multiplyHigh(v[2], v[3])
                || Math.multiplyHigh(v[0], v[1]) == Math.multiplyHigh(v[2], v[3]) && Long.compareUnsigned(v[0] * v[1], v[2] * v[3]) >= 0) instanceof Predicate<long[]> ge
            && new long[n + 2] instanceof long[] hs && new long[n + 2] instanceof long[] hb
            && new int[]{0, 0} instanceof int[] sz && new long[]{0} instanceof long[] ans
            && IntStream.range(0, n + 1).filter(r -> Long.valueOf(r * P[r] - Q[r]) instanceof Long b
                && IntStream.iterate(0, i -> sz[0] >= 2 && ge.test(new long[]{b - hb[sz[0] - 1], hs[sz[0] - 2] - hs[sz[0] - 1], hb[sz[0] - 1] - hb[sz[0] - 2], hs[sz[0] - 1] + r}), i -> i + 1)
                    .filter(i -> --sz[0] >= 0).count() >= 0
                && (hs[sz[0]] = -r) <= 0 && (hb[sz[0]++] = b) == b
                && (sz[1] = 0) == 0
                && IntStream.iterate(1 << 18, s -> s > 0, s -> s >> 1)
                    .filter(s -> sz[1] + s < sz[0] && hs[sz[1] + s - 1] * P[r] + hb[sz[1] + s - 1] < hs[sz[1] + s] * P[r] + hb[sz[1] + s] && (sz[1] += s) > 0).count() >= 0
                && (ans[0] = Math.max(ans[0], Q[r] + hs[sz[1]] * P[r] + hb[sz[1]])) >= 0).count() >= 0
            ? ans[0]
            : "");
    }
}
