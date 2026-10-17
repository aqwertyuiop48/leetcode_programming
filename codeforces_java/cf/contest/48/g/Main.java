import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] first
            && new int[2 * n] instanceof int[] eto
            && new int[2 * n] instanceof int[] ew
            && new int[2 * n] instanceof int[] enext
            && new int[n] instanceof int[] deg
            && IntStream.range(0, n).allMatch(i ->
                (eto[2 * i] = t[2 + 3 * i] - 1) >= 0 && (ew[2 * i] = t[3 + 3 * i]) > 0 && (enext[2 * i] = first[t[1 + 3 * i] - 1]) >= -1 && (first[t[1 + 3 * i] - 1] = 2 * i) >= 0
                && (eto[2 * i + 1] = t[1 + 3 * i] - 1) >= 0 && (ew[2 * i + 1] = t[3 + 3 * i]) > 0 && (enext[2 * i + 1] = first[t[2 + 3 * i] - 1]) >= -1 && (first[t[2 + 3 * i] - 1] = 2 * i + 1) >= 0
                && ++deg[t[1 + 3 * i] - 1] > 0 && ++deg[t[2 + 3 * i] - 1] > 0)
            && new boolean[n] instanceof boolean[] removed
            && new int[n] instanceof int[] par
            && new long[n] instanceof long[] pw
            && new int[n] instanceof int[] q
            && new int[]{0} instanceof int[] tail
            && IntStream.range(0, n).filter(v -> deg[v] == 1 && (q[tail[0]++] = v) < 0).count() >= 0
            && IntStream.range(0, n).filter(qi ->
                qi < tail[0]
                && (Integer) q[qi] instanceof Integer v
                && (removed[v] = true)
                && IntStream.iterate(first[v], e -> e >= 0, e -> enext[e]).filter(e ->
                    !removed[eto[e]] && (par[v] = eto[e]) >= 0 && (pw[v] = ew[e]) >= 0 && --deg[eto[e]] == 1 && (q[tail[0]++] = eto[e]) >= 0).count() >= 0
                && false).count() >= 0
            && LongStream.generate(() -> 1L).limit(n).toArray() instanceof long[] sz
            && new long[n] instanceof long[] down
            && IntStream.range(0, tail[0]).allMatch(i ->
                (Integer) q[i] instanceof Integer v
                && (sz[par[v]] += sz[v]) > 0
                && (down[par[v]] += down[v] + pw[v] * sz[v]) >= 0)
            && (Integer) IntStream.range(0, n).filter(v -> !removed[v]).findFirst().getAsInt() instanceof Integer c0
            && new int[n] instanceof int[] cn
            && new long[n + 1] instanceof long[] cwt
            && new int[]{c0, -1, 1, 0} instanceof int[] cs
            && (cn[0] = c0) >= 0
            && IntStream.range(0, n).filter(step ->
                cs[3] == 0
                && (Integer) IntStream.iterate(first[cs[0]], e -> e >= 0, e -> enext[e]).filter(e -> !removed[eto[e]] && eto[e] != cs[1]).findFirst().getAsInt() instanceof Integer e0
                && (eto[e0] == c0
                    ? (cwt[n] = ew[e0]) > 0 && (cs[3] = 1) > 0
                    : (cn[cs[2]] = eto[e0]) >= 0 && (cwt[cs[2]] = ew[e0]) > 0 && (cs[1] = cs[0]) >= 0 && (cs[0] = eto[e0]) >= 0 && ++cs[2] > 0)
                && false).count() >= 0
            && Integer.valueOf(cs[2]) instanceof Integer k
            && new long[2 * k] instanceof long[] p
            && IntStream.range(1, k).allMatch(i -> (p[i] = p[i - 1] + cwt[i]) > 0)
            && Long.valueOf(p[k - 1] + cwt[n]) instanceof Long L
            && IntStream.range(0, k).allMatch(i -> (p[i + k] = p[i] + L) > 0)
            && new long[2 * k] instanceof long[] pz
            && new long[2 * k] instanceof long[] pp
            && IntStream.range(0, 2 * k).allMatch(j -> (pz[j] = (j > 0 ? pz[j - 1] : 0) + sz[cn[j % k]]) > 0
                && (pp[j] = (j > 0 ? pp[j - 1] : 0) + sz[cn[j % k]] * p[j]) >= 0)
            && Long.valueOf(IntStream.range(0, k).mapToLong(i -> down[cn[i]]).sum()) instanceof Long totalDown
            && new long[n] instanceof long[] ans
            && IntStream.range(0, k).allMatch(i ->
                Integer.valueOf(Arrays.binarySearch(p, i, i + k, p[i] + L / 2)) instanceof Integer r
                && Integer.valueOf(r >= 0 ? r : -r - 2) instanceof Integer h
                && (ans[cn[i]] = totalDown
                    + (pp[h] - pp[i]) - p[i] * (pz[h] - pz[i])
                    + (p[i] + L) * (pz[i + k - 1] - pz[h]) - (pp[i + k - 1] - pp[h])) > 0)
            && IntStream.iterate(tail[0] - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                (ans[q[i]] = ans[par[q[i]]] + pw[q[i]] * (n - 2 * sz[q[i]])) > 0)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}

