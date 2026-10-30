import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] toks && new int[3] instanceof int[] ac
            && IntStream.rangeClosed(0, raw.length).filter(i -> (i < raw.length && raw[i] >= 65 ? (toks[ac[1]++] = -raw[i]) < 0 : i < raw.length && raw[i] >= 48 ? (ac[0] = ac[0] * 10 + raw[i] - 48) >= 0 && (ac[2] = 1) > 0 : ac[2] == 1 && (toks[ac[1]++] = ac[0]) >= 0 && (ac[0] = 0) == 0 && (ac[2] = 0) == 0) && false).count() >= 0
            && (Integer) toks[0] instanceof Integer n && (Integer) toks[1] instanceof Integer m
            && new int[m + 2] instanceof int[] ty && new int[m + 2] instanceof int[] p1 && new int[m + 2] instanceof int[] p2 && new int[]{2} instanceof int[] pp
            && IntStream.rangeClosed(1, m).filter(i -> (ty[i] = -toks[pp[0]]) > 0 && (p1[i] = toks[pp[0] + 1]) > 0 && (p2[i] = ty[i] == 85 || ty[i] == 77 ? toks[pp[0] + 2] : 0) >= 0 && (pp[0] += ty[i] == 85 || ty[i] == 77 ? 3 : 2) > 0 && false).count() >= 0
            && IntStream.rangeClosed(0, n + 1).toArray() instanceof int[] uh && IntStream.rangeClosed(0, n + 1).toArray() instanceof int[] ut && IntStream.rangeClosed(0, n + 1).toArray() instanceof int[] oh && IntStream.rangeClosed(0, n + 1).toArray() instanceof int[] ot
            && IntStream.rangeClosed(0, n + 1).map(i -> 1).toArray() instanceof int[] usz && new int[n + 2] instanceof int[] unext && new int[n + 2] instanceof int[] onext
            && new int[m + 2] instanceof int[] r1 && new int[m + 2] instanceof int[] r2 && new int[m + 2] instanceof int[] rv
            && IntStream.rangeClosed(1, m).filter(i -> (Integer) p1[i] instanceof Integer a && (Integer) p2[i] instanceof Integer b
                && (ty[i] == 85 ? (unext[ut[a]] = uh[b]) >= 0 && (ut[a] = ut[b]) > 0 && (usz[a] += usz[b]) > 0
                    : ty[i] == 77 ? (onext[ot[a]] = oh[b]) >= 0 && (ot[a] = ot[b]) > 0
                    : ty[i] == 65 ? (r1[i] = uh[a]) > 0 && (r2[i] = ut[a]) > 0 && (rv[i] = usz[a]) > 0
                    : ty[i] == 90 ? (r1[i] = oh[a]) > 0 && (r2[i] = ot[a]) > 0 : true) && false).count() >= 0
            && new boolean[n + 2] instanceof boolean[] hpU && new boolean[n + 2] instanceof boolean[] hpO && new int[n + 2] instanceof int[] upos && new int[n + 2] instanceof int[] opos && new int[2] instanceof int[] cn
            && IntStream.rangeClosed(1, n).filter(v -> (unext[v] == 0 || (hpU[unext[v]] = true)) && (onext[v] == 0 || (hpO[onext[v]] = true)) && false).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> !hpU[v] && IntStream.iterate(v, u -> u != 0, u -> unext[u]).filter(u -> (upos[u] = cn[0]++) < 0).count() >= 0 && false).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> !hpO[v] && IntStream.iterate(v, u -> u != 0, u -> onext[u]).filter(u -> (opos[u] = cn[1]++) < 0).count() >= 0 && false).count() >= 0
            && (Integer) Integer.highestOneBit(2 * n - 1) instanceof Integer sz && new int[2 * sz] instanceof int[] tag && new int[2] instanceof int[] lr && new int[m + 2] instanceof int[] t0
            && IntStream.rangeClosed(1, m).filter(i -> (ty[i] == 90 ? (lr[0] = opos[r1[i]] + sz) >= 0 && (lr[1] = opos[r2[i]] + sz + 1) > 0
                    && IntStream.iterate(0, k -> lr[0] < lr[1], k -> k + 1).filter(k -> ((((lr[0] & 1) == 1 ? (tag[lr[0]++] = i) : 0) | ((lr[1] & 1) == 1 ? (tag[--lr[1]] = i) : 0)) >= 0) && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0 && false).count() >= 0
                : ty[i] == 81 ? (t0[i] = IntStream.iterate(opos[p1[i]] + sz, p -> p >= 1, p -> p >> 1).map(p -> tag[p]).max().getAsInt()) >= 0 : true) && false).count() >= 0
            && new int[m + 2] instanceof int[] reqHead && new int[m + 2] instanceof int[] reqNext && new long[m + 2] instanceof long[] snap && new long[n + 3] instanceof long[] bit
            && IntStream.rangeClosed(1, m).filter(i -> ty[i] == 81 && t0[i] > 0 && (reqNext[i] = reqHead[t0[i]]) >= 0 && (reqHead[t0[i]] = i) > 0 && false).count() >= 0
            && ((LongBinaryOperator) (i, v) -> IntStream.iterate((int) i, j -> j <= n, j -> j + (j & -j)).filter(j -> (bit[j] += v) < Long.MIN_VALUE / 2).count()) instanceof LongBinaryOperator addOp
            && ((IntToLongFunction) i -> IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).mapToLong(j -> bit[j]).sum()) instanceof IntToLongFunction prefix
            ? IntStream.rangeClosed(1, m).filter(i -> ty[i] == 65 || ty[i] == 90 || ty[i] == 81).mapToObj(i -> ty[i] == 65 ? addOp.applyAsLong(upos[r1[i]] + 1, rv[i]) + addOp.applyAsLong(upos[r2[i]] + 2, -rv[i]) < 0 ? "" : null
                    : ty[i] == 90 ? IntStream.iterate(reqHead[i], k -> k != 0, k -> reqNext[k]).filter(k -> (snap[k] = prefix.applyAsLong(upos[p1[k]] + 1)) < Long.MIN_VALUE / 2).count() < 0 ? "" : null
                    : "" + (prefix.applyAsLong(upos[p1[i]] + 1) - (t0[i] > 0 ? snap[i] : 0L))).filter(Objects::nonNull).collect(Collectors.joining("\n")).trim() : "");
    }
}
