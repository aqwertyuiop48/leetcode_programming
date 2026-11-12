import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer q && Integer.valueOf(n + 1) instanceof Integer S
            && new int[q] instanceof int[] opAt && new int[]{2} instanceof int[] pp && new int[q] instanceof int[] ans
            && IntStream.range(0, q).filter(i -> (opAt[i] = pp[0]) >= 0 & (pp[0] += tok[pp[0]] == 1 ? 5 : 3) > 0).count() >= 0
            && new int[(2 * n + 1) * S] instanceof int[] m && new int[]{0} instanceof int[] dw && new int[48] instanceof int[] aa && new int[48] instanceof int[] bb && new int[2] instanceof int[] cn
            && new int[3] instanceof int[] hv && new IntUnaryOperator[4] instanceof IntUnaryOperator[] g
            && (g[0] = j -> j > n ? 0 : (m[hv[0] + j] += hv[2]) * 0 + g[0].applyAsInt(j + (j & -j))) != null
            && (g[1] = i -> i > dw[0] ? 0 : (hv[0] = i * S) * 0 + g[0].applyAsInt(hv[1]) + g[1].applyAsInt(i + (i & -i))) != null
            && (g[2] = j -> j <= 0 ? 0 : m[hv[0] + j] + g[2].applyAsInt(j - (j & -j))) != null
            && (g[3] = i -> i <= 0 ? 0 : (hv[0] = i * S) * 0 + g[2].applyAsInt(hv[1]) + g[3].applyAsInt(i - (i & -i))) != null
            && ((ToIntFunction<int[]>) r -> r[0] > dw[0] || r[1] > n ? 0 : (hv[1] = r[1]) * 0 + (hv[2] = r[2]) * 0 + g[1].applyAsInt(r[0]) * 0) instanceof ToIntFunction<int[]> pt
            && ((ToIntFunction<int[]>) r -> (hv[1] = r[1]) * 0 + g[3].applyAsInt(r[0])) instanceof ToIntFunction<int[]> qf
            && ((ToIntFunction<int[]>) r -> Integer.valueOf(Math.max(r[0], 1)) instanceof Integer w1 && Integer.valueOf(Math.min(r[1], dw[0])) instanceof Integer w2
                && Integer.valueOf(Math.max(r[2], 1)) instanceof Integer c1 && Integer.valueOf(Math.min(r[3], n)) instanceof Integer c2 && w1 <= w2 && c1 <= c2
                && pt.applyAsInt(new int[]{w1, c1, r[4]}) + pt.applyAsInt(new int[]{w2 + 1, c1, -r[4]}) + pt.applyAsInt(new int[]{w1, c2 + 1, -r[4]}) + pt.applyAsInt(new int[]{w2 + 1, c2 + 1, r[4]}) >= 0 ? 0 : 0) instanceof ToIntFunction<int[]> ra
            && IntStream.rangeClosed(0, 4).filter(P -> Stream.of(0).peek(z -> Arrays.fill(m, 0)).findFirst().isPresent() && (dw[0] = P == 0 ? n : 2 * n) > 0
                && IntStream.range(0, q).filter(i -> Integer.valueOf(opAt[i]) instanceof Integer b && (tok[b] == 1
                    ? Integer.valueOf(tok[b + 1]) instanceof Integer T && Integer.valueOf(tok[b + 2]) instanceof Integer x0 && Integer.valueOf(tok[b + 3]) instanceof Integer y0 && Integer.valueOf(tok[b + 4]) instanceof Integer k
                        && Integer.valueOf(T == 1 || T == 2 ? 1 : -1) instanceof Integer sx && Integer.valueOf(T == 1 || T == 3 ? 1 : -1) instanceof Integer sy
                        && Integer.valueOf(x0 - y0 + n) instanceof Integer v0
                        && Integer.valueOf(sx == sy ? (sx > 0 ? x0 + y0 + k + 1 : 1) : (sx > 0 ? v0 + k + 1 : 1)) instanceof Integer h1
                        && Integer.valueOf(sx == sy ? (sx > 0 ? 2 * n : x0 + y0 - k - 1) : (sx > 0 ? 2 * n : v0 - k - 1)) instanceof Integer h2
                        && (P == 0 ? ra.applyAsInt(new int[]{sx > 0 ? x0 : 1, sx > 0 ? n : x0, sy > 0 ? y0 : 1, sy > 0 ? n : y0, 1}) >= 0
                            : (P <= 2) == (sx == sy) && ra.applyAsInt(P % 2 == 1 ? new int[]{h1, h2, sx > 0 ? x0 : 1, sx > 0 ? n : x0, -1} : new int[]{h1, h2, sy > 0 ? 1 : y0 + 1, sy > 0 ? y0 - 1 : n, 1}) >= 0)
                    : Integer.valueOf(tok[b + 1]) instanceof Integer x && Integer.valueOf(tok[b + 2]) instanceof Integer y
                        && (ans[i] += qf.applyAsInt(new int[]{P == 0 ? x : P <= 2 ? x + y : x - y + n, P % 2 == 1 ? x : y})) >= 0)).count() >= 0).count() >= 0
            ? IntStream.range(0, q).filter(i -> tok[opAt[i]] == 2).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining("\n")) : "");
    }
}
