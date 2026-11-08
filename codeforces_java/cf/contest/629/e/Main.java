import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] nums && new int[]{0, 0, 0} instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length ? raw[i] : 32) >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((nums[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf(nums[0]) instanceof Integer n && Integer.valueOf(nums[1]) instanceof Integer m
            && new int[n] instanceof int[] deg && new int[n] instanceof int[] xr && new int[n] instanceof int[] par && new int[n] instanceof int[] dep
            && new int[n] instanceof int[] ord && new int[]{0} instanceof int[] tl && new int[n] instanceof int[] sz && new long[n] instanceof long[] down && new long[n] instanceof long[] full
            && new int[n] instanceof int[] pre && new int[n] instanceof int[] nx && new int[n] instanceof int[] ordp
            && (deg[0] = 1) > 0
            && IntStream.range(0, n - 1).allMatch(e -> ++deg[nums[2 + 2 * e] - 1] > 0 && ++deg[nums[3 + 2 * e] - 1] > 0
                && (xr[nums[2 + 2 * e] - 1] ^= nums[3 + 2 * e] - 1) >= 0 && (xr[nums[3 + 2 * e] - 1] ^= nums[2 + 2 * e] - 1) >= 0)
            && IntStream.range(1, n).filter(x -> deg[x] == 1).allMatch(x -> (ord[tl[0]++] = x) > 0)
            && IntStream.range(0, n - 1).allMatch(i -> (par[ord[i]] = xr[ord[i]]) >= 0 && (xr[par[ord[i]]] ^= ord[i]) >= 0
                && (--deg[par[ord[i]]] == 1 && par[ord[i]] != 0 ? (ord[tl[0]++] = par[ord[i]]) >= 0 : true))
            && IntStream.range(0, n).allMatch(i -> (sz[i] = 1) > 0)
            && IntStream.range(0, n - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0 && (down[par[ord[i]]] += down[ord[i]] + sz[ord[i]]) >= 0)
            && (full[0] = down[0]) >= 0 && (nx[0] = 1) > 0
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(ord[n - 2 - i]) instanceof Integer x && Integer.valueOf(par[x]) instanceof Integer p
                && (dep[x] = dep[p] + 1) > 0 && (full[x] = full[p] + n - 2 * sz[x]) > Long.MIN_VALUE
                && (pre[x] = nx[p]) > 0 && (nx[p] += sz[x]) > 0 && (nx[x] = pre[x] + 1) > 0 && (ordp[pre[x]] = x) > 0)
            && IntStream.range(0, n).mapToLong(pos -> ((long) dep[ordp[pos]] << 20) | (1048575 - pos)).toArray() instanceof long[] key
            && new long[17][] instanceof long[][] st
            && Stream.of(0).peek(z -> Arrays.setAll(st, k -> k == 0 ? key : IntStream.range(0, Math.max(0, n - (1 << k) + 1)).mapToLong(i -> Math.min(st[k - 1][i], st[k - 1][i + (1 << (k - 1))])).toArray())).findFirst().isPresent()
            ? IntStream.range(0, m).mapToObj(i -> Integer.valueOf(nums[2 + 2 * (n - 1) + 2 * i] - 1) instanceof Integer u && Integer.valueOf(nums[3 + 2 * (n - 1) + 2 * i] - 1) instanceof Integer v
                && Integer.valueOf(pre[u] < pre[v] ? u : v) instanceof Integer a && Integer.valueOf(pre[u] < pre[v] ? v : u) instanceof Integer b
                && Integer.valueOf(31 - Integer.numberOfLeadingZeros(pre[b] - pre[a])) instanceof Integer k
                && Long.valueOf(Math.min(st[k][pre[a] + 1], st[k][pre[b] - (1 << k) + 1])) instanceof Long best
                ? String.valueOf(1 + (pre[a] + sz[a] > pre[b]
                    ? dep[b] - dep[a] + (full[a] - down[ordp[1048575 - (int) (best & 1048575)]] - sz[ordp[1048575 - (int) (best & 1048575)]]) / (double) (n - sz[ordp[1048575 - (int) (best & 1048575)]]) + down[b] / (double) sz[b]
                    : dep[a] + dep[b] - 2 * ((best >> 20) - 1) + down[a] / (double) sz[a] + down[b] / (double) sz[b])) : "").collect(Collectors.joining("\n")) : "");
    }
}
