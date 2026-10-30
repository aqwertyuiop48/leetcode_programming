import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && (Integer) IntStream.range(0, raw.length).filter(i -> raw[i] == '\n').findFirst().orElse(raw.length) instanceof Integer f
            && (Integer) Integer.parseInt(new String(raw, 0, f).trim()) instanceof Integer n && (Integer) ((n + 63) / 64) instanceof Integer W
            && new int[2 * raw.length + 6] instanceof int[] tr && new int[raw.length + 2] instanceof int[] best && new int[760] instanceof int[] tf
            && new int[]{0, 0, 0, 1} instanceof int[] st
            && IntStream.rangeClosed(f + 1, raw.length).filter(i -> (Integer) (i < raw.length ? (int) raw[i] : 10) instanceof Integer b
                && (b == 'a' || b == 'b' ? (tr[2 * st[0] + b - 'a'] != 0 || (tr[2 * st[0] + b - 'a'] = st[3]++) >= 0) && (st[0] = tr[2 * st[0] + b - 'a']) >= 0 && (st[2] = 1) > 0
                    : st[2] == 1 && (best[st[0]] = ++st[1]) > 0 && (st[0] = 0) + (st[2] = 0) == 0)).count() >= 0
            && new int[st[3] + 1] instanceof int[] q && new int[st[3] + 1] instanceof int[] fq && new int[]{0} instanceof int[] tail
            && IntStream.range(0, 2).filter(c -> tr[c] != 0 && (q[tail[0]++] = tr[c]) > 0 && (best[tr[c]] == 0 || (tf[best[tr[c]]] = 0) >= 0)).count() >= 0
            && ((IntBinaryOperator) (i, c) -> tr[2 * q[i] + c] != 0
                ? (fq[tail[0]] = tr[2 * fq[i] + c]) >= 0 && (best[tr[2 * q[i] + c]] != 0 ? (tf[best[tr[2 * q[i] + c]]] = tr[2 * fq[i] + c]) >= 0 : (best[tr[2 * q[i] + c]] = best[tr[2 * fq[i] + c]]) >= 0) && (q[tail[0]++] = tr[2 * q[i] + c]) > 0 ? 1 : 0
                : (tr[2 * q[i] + c] = tr[2 * fq[i] + c]) >= 0 ? 1 : 0) instanceof IntBinaryOperator relax
            && IntStream.iterate(0, i -> i < tail[0], i -> i + 1).filter(i -> relax.applyAsInt(i, 0) + relax.applyAsInt(i, 1) >= 0).count() >= 0
            && new long[n][W] instanceof long[][] reach && new int[]{0, 0, 0} instanceof int[] sc
            && ((IntPredicate) j -> j < 0 || j == sc[1] || (reach[sc[1]][j >> 6] |= 1L << (j & 63)) != 0) instanceof IntPredicate mark
            && IntStream.rangeClosed(f + 1, raw.length).filter(i -> (Integer) (i < raw.length ? (int) raw[i] : 10) instanceof Integer b
                && (b == 'a' || b == 'b' ? (sc[0] = tr[2 * sc[0] + b - 'a']) >= 0 && (sc[2] = 1) > 0 && mark.test(best[sc[0]] - 1)
                    : sc[2] == 1 && mark.test(best[tf[best[sc[0]]]] - 1) && (sc[1]++) + (sc[0] = 0) + (sc[2] = 0) >= 0)).count() >= 0
            && IntStream.range(0, n).filter(k -> IntStream.range(0, n).filter(i -> (reach[i][k >> 6] >> (k & 63) & 1L) == 1 && IntStream.range(0, W).filter(w -> (reach[i][w] |= reach[k][w]) != 0).count() >= 0).count() >= 0).count() >= 0
            && new int[n] instanceof int[] mt && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] mt2 && new IntPredicate[1] instanceof IntPredicate[] tryK && new long[1][] instanceof long[][] visH
            && (tryK[0] = u -> IntStream.range(0, W).anyMatch(w -> IntStream.iterate(0, x -> (reach[u][w] & ~visH[0][w]) != 0, x -> x + 1).anyMatch(x -> (Integer) Long.numberOfTrailingZeros(reach[u][w] & ~visH[0][w]) instanceof Integer bt
                && (Integer) (w * 64 + bt) instanceof Integer v && (visH[0][w] |= 1L << bt) != 0 && (mt2[v] < 0 || tryK[0].test(mt2[v])) && (mt2[v] = u) >= 0))) != null
            && IntStream.range(0, n).filter(u -> (visH[0] = new long[W]) != null && tryK[0].test(u)).count() >= 0
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] ml && IntStream.range(0, n).filter(v -> mt2[v] >= 0 && (ml[mt2[v]] = v) >= 0).count() >= 0
            && new boolean[n] instanceof boolean[] zl && new boolean[n] instanceof boolean[] zr && new int[n + 1] instanceof int[] stk && new int[]{0} instanceof int[] sp
            && IntStream.range(0, n).filter(u -> ml[u] < 0 && (zl[u] = true) && (stk[sp[0]++] = u) >= 0).count() >= 0
            && IntStream.iterate(0, x -> sp[0] > 0, x -> x + 1).filter(x -> (Integer) stk[--sp[0]] instanceof Integer u
                && IntStream.range(0, n).filter(v -> (reach[u][v >> 6] >> (v & 63) & 1L) == 1 && !zr[v] && (zr[v] = true) && mt2[v] >= 0 && !zl[mt2[v]] && (zl[mt2[v]] = true) && (stk[sp[0]++] = mt2[v]) >= 0).count() >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> zl[i] && !zr[i]).toArray() instanceof int[] ans
            ? ans.length + "\n" + Arrays.stream(ans).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
