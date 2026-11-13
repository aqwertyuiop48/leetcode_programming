import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk && Integer.valueOf(tk[0]) instanceof Integer n && tk[1] instanceof String s
            && new int[26 * (2 * n + 3)] instanceof int[] nx && new int[2 * n + 3] instanceof int[] link && new int[2 * n + 3] instanceof int[] len && new int[2 * n + 3] instanceof int[] pos && new int[2 * n + 3] instanceof int[] rt
            && new int[n * 42 + 100] instanceof int[] L && new int[n * 42 + 100] instanceof int[] R && new int[] {0} instanceof int[] tc && new int[] {1, 1, 0} instanceof int[] sz && new int[1] instanceof int[] pp
            && ((IntUnaryOperator) p -> Integer.valueOf(++tc[0]) instanceof Integer top && new int[] {top, 0, n - 1} instanceof int[] sg
                && IntStream.iterate(0, z -> sg[1] < sg[2], z -> z + 1).filter(z -> Integer.valueOf(++tc[0]) instanceof Integer ch && Integer.valueOf((sg[1] + sg[2]) >> 1) instanceof Integer mid
                    && (p <= mid ? (L[sg[0]] = ch) > 0 && (sg[2] = mid) >= 0 : (R[sg[0]] = ch) > 0 && (sg[1] = mid + 1) > 0) && (sg[0] = ch) < 0).count() >= 0 ? top : 0) instanceof IntUnaryOperator insf
            && ((IntBinaryOperator) (i, c) -> Integer.valueOf(++sz[0]) instanceof Integer cur && (len[cur] = len[sz[1]] + 1) > 0 && (pos[cur] = i) >= 0 && (rt[cur] = insf.applyAsInt(i)) > 0
                && IntStream.iterate(sz[1], x -> (pp[0] = x) != 0 && nx[x * 26 + c] == 0, x -> link[x]).filter(x -> (nx[x * 26 + c] = cur) < 0).count() >= 0
                && (pp[0] == 0 ? (link[cur] = 1) > 0
                    : Integer.valueOf(nx[pp[0] * 26 + c]) instanceof Integer q && (len[pp[0]] + 1 == len[q] ? (link[cur] = q) > 0
                        : Integer.valueOf(++sz[0]) instanceof Integer cl && (len[cl] = len[pp[0]] + 1) > 0 && IntStream.range(0, 26).filter(k -> (nx[cl * 26 + k] = nx[q * 26 + k]) < 0).count() >= 0 && (link[cl] = link[q]) >= 0 && (pos[cl] = pos[q]) >= 0
                            && IntStream.iterate(pp[0], x -> (pp[0] = x) != 0 && nx[x * 26 + c] == q, x -> link[x]).filter(x -> (nx[x * 26 + c] = cl) < 0).count() >= 0 && (link[q] = cl) > 0 && (link[cur] = cl) > 0))
                && (sz[1] = cur) > 0 ? 1 : 0) instanceof IntBinaryOperator ext
            && IntStream.range(0, n).filter(i -> ext.applyAsInt(i, s.charAt(i) - 'a') < 0).count() >= 0
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] mg
            && (mg[0] = (a, b) -> a == 0 ? b : b == 0 ? a : Integer.valueOf(++tc[0]) instanceof Integer c && (L[c] = mg[0].applyAsInt(L[a], L[b])) >= 0 && (R[c] = mg[0].applyAsInt(R[a], R[b])) >= 0 ? c : 0) != null
            && new int[n + 2] instanceof int[] cl2 && IntStream.rangeClosed(2, sz[0]).filter(v -> cl2[len[v] + 1]++ < 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(i -> (cl2[i] += cl2[i - 1]) < 0).count() >= 0
            && new int[sz[0]] instanceof int[] ord && IntStream.rangeClosed(2, sz[0]).filter(v -> (ord[cl2[len[v]]++] = v) < 0).count() >= 0
            && IntStream.iterate(sz[0] - 2, i -> i >= 0, i -> i - 1).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v && link[v] != 1 && (rt[link[v]] = mg[0].applyAsInt(rt[link[v]], rt[v])) < 0).count() >= 0
            && new long[2] instanceof long[] qa && new LongBinaryOperator[1] instanceof LongBinaryOperator[] qf
            && (qf[0] = (nd, pk) -> nd == 0 || qa[1] < (pk >> 20) || (pk & 1048575) < qa[0] ? 0 : qa[0] <= (pk >> 20) && (pk & 1048575) <= qa[1] ? 1
                : Long.valueOf(((pk >> 20) + (pk & 1048575)) >> 1) instanceof Long mid && (qf[0].applyAsLong(L[(int) nd], ((pk >> 20) << 20) | mid) == 1 || qf[0].applyAsLong(R[(int) nd], ((mid + 1) << 20) | (pk & 1048575)) == 1) ? 1 : 0) != null
            && new int[sz[0] + 1] instanceof int[] dp && new int[sz[0] + 1] instanceof int[] top2
            && IntStream.range(0, sz[0] - 1).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v && Integer.valueOf(link[v]) instanceof Integer u0
                && (u0 == 1 ? (dp[v] = 1) > 0 && (top2[v] = v) > 0
                    : Integer.valueOf(top2[u0]) instanceof Integer u && (qa[0] = pos[v] - len[v] + len[u]) > Long.MIN_VALUE && (qa[1] = pos[v] - 1) > Long.MIN_VALUE
                        && (qf[0].applyAsLong(rt[u], n - 1) == 1 ? (dp[v] = dp[u] + 1) > 0 && (top2[v] = v) > 0 : (dp[v] = dp[u]) > 0 && (top2[v] = u) > 0)) ? true : true).count() >= 0
            ? Integer.toString(Arrays.stream(dp).max().getAsInt()) : "");
    }
}
