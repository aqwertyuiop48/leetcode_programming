import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && (Integer) IntStream.range(0, raw.length).filter(i -> raw[i] == '.' || raw[i] == 'X').findFirst().getAsInt() instanceof Integer gs
            && (Integer) IntStream.iterate(raw.length - 1, i -> i >= 0, i -> i - 1).filter(i -> raw[i] == '.' || raw[i] == 'X').findFirst().getAsInt() instanceof Integer ge
            && new int[9000] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && ((IntPredicate) (i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)) instanceof IntPredicate pr
            && IntStream.range(0, gs + 1).allMatch(pr)
            && IntStream.rangeClosed(ge + 1, raw.length).allMatch(pr)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer m
            && Integer.valueOf(g0[2]) instanceof Integer k
            && Integer.valueOf(n * m) instanceof Integer nm
            && new int[nm] instanceof int[] occ
            && IntStream.range(gs, ge + 1).reduce(0, (c, i) -> raw[i] == 'X' ? (occ[c] = 1) + c : raw[i] == '.' ? c + 1 : c) >= 0
            && IntStream.range(0, k).allMatch(q -> (occ[(g0[3 + 2 * q] - 1) * m + g0[4 + 2 * q] - 1] = 1) > 0)
            && new int[nm] instanceof int[] up
            && new int[nm] instanceof int[] down
            && new int[nm] instanceof int[] dp
            && new int[1] instanceof int[] ans
            && IntStream.range(0, nm).reduce(0, (u, p) -> (up[p] = occ[p] == 1 ? 0 : (p >= m ? up[p - m] : 0) + 1) < 0 ? 1 : 0) >= 0
            && IntStream.range(0, nm).reduce(0, (u, t) -> (down[nm - 1 - t] = occ[nm - 1 - t] == 1 ? 0 : (t >= m ? down[nm - 1 - t + m] : 0) + 1) < 0 ? 1 : 0) >= 0
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).reduce(0, (u, j) ->
                (dp[i * m + j] = occ[i * m + j] == 1 ? 0 : 1 + (i == 0 || j == 0 ? 0 : Math.min(dp[(i - 1) * m + j - 1], Math.min(dp[(i - 1) * m + j], dp[i * m + j - 1]))))
                    > ans[0] ? (ans[0] = dp[i * m + j]) : 0) >= 0)
            && new int[m] instanceof int[] lu
            && new int[m] instanceof int[] ld
            && new int[m] instanceof int[] ru
            && new int[m] instanceof int[] rd
            && new int[k] instanceof int[] res
            && ((IntBinaryOperator) ((L, p) -> (Integer) (p / m) instanceof Integer x
                && (Integer) (p % m) instanceof Integer y
                && L <= Math.min(n, m)
                && up[p] + down[p] - 1 >= L
                && (Integer) Math.max(0, y - L + 1) instanceof Integer lo
                && (Integer) Math.min(m - 1, y + L - 1) instanceof Integer hi
                && (IntStream.range(0, y - lo + 1).reduce(0, (u, t) ->
                        (lu[y - t] = t == 0 ? up[p] : Math.min(lu[y - t + 1], up[p - t])) + (ld[y - t] = t == 0 ? down[p] : Math.min(ld[y - t + 1], down[p - t])) < 0 ? 1 : 0) >= 0
                    & IntStream.range(0, hi - y + 1).reduce(0, (u, t) ->
                        (ru[y + t] = t == 0 ? up[p] : Math.min(ru[y + t - 1], up[p + t])) + (rd[y + t] = t == 0 ? down[p] : Math.min(rd[y + t - 1], down[p + t])) < 0 ? 1 : 0) >= 0)
                && IntStream.rangeClosed(Math.max(0, y - L + 1), Math.min(y, m - L)).anyMatch(c ->
                    Math.min(lu[c], ru[c + L - 1]) + Math.min(ld[c], rd[c + L - 1]) - 1 >= L) ? 1 : 0)) instanceof IntBinaryOperator chk
            && IntStream.range(0, k).allMatch(z -> (Integer) (k - 1 - z) instanceof Integer q
                && (Integer) (g0[3 + 2 * q] - 1) instanceof Integer x
                && (Integer) (g0[4 + 2 * q] - 1) instanceof Integer y
                && (res[q] = ans[0]) >= 0
                && (occ[x * m + y] = 0) == 0
                && IntStream.range(0, n).reduce(0, (u, i) -> (up[i * m + y] = occ[i * m + y] == 1 ? 0 : (i > 0 ? up[(i - 1) * m + y] : 0) + 1) < 0 ? 1 : 0) >= 0
                && IntStream.range(0, n).reduce(0, (u, t) -> (down[(n - 1 - t) * m + y] = occ[(n - 1 - t) * m + y] == 1 ? 0 : (t > 0 ? down[(n - t) * m + y] : 0) + 1) < 0 ? 1 : 0) >= 0
                && (IntStream.rangeClosed(0, 2001).anyMatch(w -> chk.applyAsInt(ans[0] + 1, x * m + y) == 0 || ++ans[0] < 0) | true))
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
