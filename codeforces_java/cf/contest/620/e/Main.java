import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new int[n] instanceof int[] deg && new int[n] instanceof int[] xr && new int[n + 1] instanceof int[] ord && new int[n] instanceof int[] par
            && new int[n] instanceof int[] size && new int[n] instanceof int[] tin && new int[n] instanceof int[] nx && new int[1] instanceof int[] oc
            && IntStream.range(0, n).allMatch(i -> (size[i] = 1) > 0)
            && IntStream.range(0, n - 1).allMatch(i -> ++deg[t[2 + n + 2 * i] - 1] > 0 && ++deg[t[3 + n + 2 * i] - 1] > 0
                && (xr[t[2 + n + 2 * i] - 1] ^= t[3 + n + 2 * i] - 1) >= 0 && (xr[t[3 + n + 2 * i] - 1] ^= t[2 + n + 2 * i] - 1) >= 0)
            && ++deg[0] > 0
            && IntStream.range(0, n).filter(v -> deg[v] == 1).allMatch(v -> (ord[oc[0]++] = v) >= 0)
            && (n > 1 || (ord[0] = 0) == 0)
            && IntStream.range(0, n - 1).allMatch(qi -> Integer.valueOf(ord[qi]) instanceof Integer v && Integer.valueOf(xr[v]) instanceof Integer p
                && (par[v] = p) >= 0 && (xr[p] ^= v) >= 0 && (size[p] += size[v]) > 0 && (--deg[p] == 1 ? (ord[oc[0]++] = p) >= 0 : true))
            && IntStream.iterate(n - 1, k -> k >= 0, k -> k - 1).allMatch(k -> Integer.valueOf(ord[k]) instanceof Integer v
                && (k == n - 1 ? (tin[v] = 0) == 0 : (tin[v] = nx[par[v]]) >= 0 && (nx[par[v]] += size[v]) > 0) && (nx[v] = tin[v] + 1) > 0)
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(Math.max(n - 1, 1))) instanceof Integer LOG && Integer.valueOf(1 << LOG) instanceof Integer N
            && new long[2 * N] instanceof long[] val && new long[2 * N] instanceof long[] lz && new long[1] instanceof long[] la && new int[2] instanceof int[] ia
            && IntStream.range(0, n).allMatch(v -> (val[N + tin[v]] = 1L << (t[2 + v] - 1)) > 0)
            && IntStream.iterate(N - 1, p -> p >= 1, p -> p - 1).allMatch(p -> (val[p] = val[2 * p] | val[2 * p + 1]) >= 0)
            && ((IntPredicate) p -> lz[p] == 0 || ((val[2 * p] = val[2 * p + 1] = lz[2 * p] = lz[2 * p + 1] = lz[p]) > 0 && (lz[p] = 0) == 0)) instanceof IntPredicate push
            && ((ToLongFunction<long[]>) a -> Integer.valueOf((int) a[0]) instanceof Integer l0 && Integer.valueOf((int) a[1]) instanceof Integer r0
                && IntStream.iterate(LOG, h -> h >= 1, h -> h - 1).allMatch(h -> (((l0 >> h) << h) == l0 || push.test(l0 >> h)) && (((r0 >> h) << h) == r0 || push.test((r0 - 1) >> h)))
                && (la[0] = 0) == 0 && (ia[0] = l0) > 0 && (ia[1] = r0) > 0
                && IntStream.rangeClosed(0, LOG).allMatch(z -> (ia[0] >= ia[1]
                        || (((ia[0] & 1) == 0 || (a[2] != 0 ? (val[ia[0]] = lz[ia[0]] = a[2]) > 0 && ++ia[0] > 0 : (la[0] |= val[ia[0]++]) >= 0))
                            && ((ia[1] & 1) == 0 || (a[2] != 0 ? (val[--ia[1]] = lz[ia[1]] = a[2]) > 0 : (la[0] |= val[--ia[1]]) >= 0))))
                    && (ia[0] >>= 1) >= 0 && (ia[1] >>= 1) >= 0)
                && IntStream.rangeClosed(1, LOG).allMatch(h -> a[2] == 0 || ((((l0 >> h) << h) == l0 || (val[l0 >> h] = val[2 * (l0 >> h)] | val[2 * (l0 >> h) + 1]) >= 0)
                    && (((r0 >> h) << h) == r0 || (val[(r0 - 1) >> h] = val[2 * ((r0 - 1) >> h)] | val[2 * ((r0 - 1) >> h) + 1]) >= 0)))
                ? la[0] : -1L) instanceof ToLongFunction<long[]> op
            && new int[]{3 * n} instanceof int[] qp && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, m).allMatch(q -> t[qp[0]] == 1
                ? Integer.valueOf(t[qp[0] + 1] - 1) instanceof Integer v && op.applyAsLong(new long[]{tin[v] + N, tin[v] + size[v] + N, 1L << (t[qp[0] + 2] - 1)}) >= 0 && (qp[0] += 3) > 0
                : Integer.valueOf(t[qp[0] + 1] - 1) instanceof Integer v2 && sb.append(Long.bitCount(op.applyAsLong(new long[]{tin[v2] + N, tin[v2] + size[v2] + N, 0}))).append((char) 10) != null && (qp[0] += 2) > 0)
            ? sb.toString().trim() : "");
    }
}
