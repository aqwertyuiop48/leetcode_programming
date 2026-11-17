
import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] all && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((all[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf(all[0]) instanceof Integer n && Long.valueOf(all[1]) instanceof Long M
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] head
            && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to && new int[n] instanceof int[] dg
            && IntStream.range(0, n - 1).allMatch(i -> (to[2 * i] = all[3 + 3 * i]) >= 0 && (nxt[2 * i] = head[all[2 + 3 * i]]) > -5 && (head[all[2 + 3 * i]] = 2 * i) >= 0
                && (to[2 * i + 1] = all[2 + 3 * i]) >= 0 && (nxt[2 * i + 1] = head[all[3 + 3 * i]]) > -5 && (head[all[3 + 3 * i]] = 2 * i + 1) >= 0
                && (dg[i] = all[4 + 3 * i]) > 0)
            && new long[n + 2] instanceof long[] pw && new long[n + 2] instanceof long[] ipw
            && (pw[0] = 1 % M) >= 0 && (ipw[0] = 1 % M) >= 0
            && Long.valueOf(BigInteger.valueOf(10).modInverse(BigInteger.valueOf(M)).longValue()) instanceof Long inv
            && IntStream.range(1, n + 2).allMatch(i -> (pw[i] = pw[i - 1] * 10 % M) >= 0 && (ipw[i] = ipw[i - 1] * inv % M) >= 0)
            && new boolean[n] instanceof boolean[] removed
            && new int[n] instanceof int[] par && new int[n] instanceof int[] sz && new int[n] instanceof int[] ord
            && new int[n] instanceof int[] len && new int[n] instanceof int[] br
            && new long[n] instanceof long[] dn && new long[n] instanceof long[] up
            && new long[2 * n + 4] instanceof long[] buf && new int[1] instanceof int[] tl
            && new long[4] instanceof long[] cs && new int[3] instanceof int[] bq && Long.valueOf(M) instanceof Long MM && MM.longValue() > 0 && new long[1] instanceof long[] ans
            && new int[2 * n + 5] instanceof int[] stack && new int[]{1} instanceof int[] sp && (stack[0] = 0) == 0
            && ((IntUnaryOperator) r -> (ord[0] = r) >= 0 && (par[r] = -1) < 0 && (sz[r] = 1) > 0 && (len[r] = 0) == 0 && (dn[r] = 0) == 0 && (up[r] = 0) == 0
                && (br[r] = r) >= 0 && (tl[0] = 1) > 0
                && (bq[0] = 0) == 0 && (bq[1] = head[r]) > -5
                && IntStream.iterate(0, t -> bq[0] < tl[0], t -> t + 1).filter(t -> bq[1] >= 0
                    ? (to[bq[1]] == par[ord[bq[0]]] || removed[to[bq[1]]]
                        || ((par[to[bq[1]]] = ord[bq[0]]) >= 0 && (sz[to[bq[1]]] = 1) > 0 && (len[to[bq[1]]] = len[ord[bq[0]]] + 1) > 0
                            && (bq[2] == 0 || ((dn[to[bq[1]]] = (dn[ord[bq[0]]] * 10 + dg[bq[1] >> 1]) % M) >= 0 && (up[to[bq[1]]] = (dg[bq[1] >> 1] * pw[len[ord[bq[0]]]] + up[ord[bq[0]]]) % M) >= 0))
                            && (br[to[bq[1]]] = bq[0] == 0 ? to[bq[1]] : br[ord[bq[0]]]) >= 0 && (ord[tl[0]++] = to[bq[1]]) >= 0))
                        && (bq[1] = nxt[bq[1]]) > -5
                    : ++bq[0] > 0 && (bq[0] >= tl[0] || (bq[1] = head[ord[bq[0]]]) > -5)).count() >= 0
                ? tl[0] : 0) instanceof IntUnaryOperator bfs
            && ((IntToLongFunction) k -> (cs[0] = -1) < 0 && (cs[1] = 0) == 0 && (cs[2] = 0) == 0 && (cs[3] = 0) == 0
                && Stream.of(0).peek(z -> Arrays.sort(buf, 0, k)).findFirst().isPresent()
                && IntStream.range(0, k).allMatch(i -> (cs[3] += ((buf[i] >> 1) == cs[0] ? 0 : (cs[0] = buf[i] >> 1) * 0 + (cs[1] = cs[2] = 0))
                    + ((buf[i] & 1) == 0 ? cs[2] + 0 * cs[1]++ : cs[1] + 0 * cs[2]++)) >= 0)
                ? cs[3] : 0L) instanceof IntToLongFunction cntf
            && ((IntPredicate) r -> Integer.valueOf(sz[r]) instanceof Integer c0
                && Integer.valueOf(IntStream.iterate(r, cur -> cur >= 0, cur -> IntStream.iterate(head[cur], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[cur] && !removed[to[e]] && 2 * sz[to[e]] > c0).map(e -> to[e]).findFirst().orElse(-1)).reduce((x, y) -> y).getAsInt()) instanceof Integer cen
                && (bq[2] = 1) == 1 && Integer.valueOf(bfs.applyAsInt(cen)) instanceof Integer cnt
                && IntStream.range(0, cnt).allMatch(i -> (buf[2 * i] = up[ord[i]] * 2) >= 0
                    && (buf[2 * i + 1] = (M - dn[ord[i]]) % M * ipw[len[ord[i]]] % M * 2 + 1) > 0)
                && Long.valueOf(cntf.applyAsLong(2 * cnt)) instanceof Long tot
                && IntStream.range(0, cnt).allMatch(i -> (buf[2 * i] = ((long) br[ord[i]] << 30 | up[ord[i]]) * 2) >= 0
                    && (buf[2 * i + 1] = ((long) br[ord[i]] << 30 | (M - dn[ord[i]]) % M * ipw[len[ord[i]]] % M) * 2 + 1) > 0)
                && (ans[0] += tot - cntf.applyAsLong(2 * cnt)) > -1
                && IntStream.rangeClosed(1, cnt - 1).allMatch(j -> (sz[par[ord[cnt - j]]] += sz[ord[cnt - j]]) > 0)
                && (removed[cen] = true)
                && IntStream.iterate(head[cen], e -> e >= 0, e -> nxt[e]).filter(e -> !removed[to[e]]).allMatch(e -> (stack[sp[0]++] = to[e]) >= 0)) instanceof IntPredicate proc
            && (bq[2] = 0) == 0 && Integer.valueOf(bfs.applyAsInt(0)) instanceof Integer c00
            && IntStream.rangeClosed(1, c00 - 1).allMatch(j -> (sz[par[ord[c00 - j]]] += sz[ord[c00 - j]]) > 0)
            && IntStream.range(0, n + 1).takeWhile(z -> sp[0] > 0).allMatch(z -> proc.test(stack[--sp[0]]))
            ? ans[0] : "");
    }
}
