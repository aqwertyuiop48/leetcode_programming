import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n && Long.valueOf(Long.parseLong(tk.nextToken())) instanceof Long k
            && new long[n + 3] instanceof long[] c && IntStream.rangeClosed(1, n).allMatch(i -> (c[i] = c[i - 1] + Integer.parseInt(tk.nextToken())) > Long.MIN_VALUE)
            && new long[n + 3] instanceof long[] r && (r[n] = c[n]) > Long.MIN_VALUE && IntStream.rangeClosed(1, n - 1).allMatch(z -> (r[n - z] = Math.max(r[n - z + 1], c[n - z])) > Long.MIN_VALUE)
            && LongStream.concat(LongStream.of(0), Arrays.stream(c, 1, n + 1)).sorted().distinct().toArray() instanceof long[] du && Integer.valueOf(du.length) instanceof Integer m
            && IntStream.rangeClosed(0, n + 1).map(i -> 1 + Arrays.binarySearch(du, c[i])).toArray() instanceof int[] o
            && IntStream.range(0, m + 2).map(i -> n + 1).toArray() instanceof int[] b
            && IntStream.rangeClosed(0, n + 1).allMatch(z -> (b[o[n + 1 - z]] = n + 1 - z) >= 0)
            && IntStream.rangeClosed(2, m).allMatch(i -> (b[i] = Math.min(b[i], b[i - 1])) >= 0)
            && new long[m + 2] instanceof long[] fe && new long[m + 2] instanceof long[] ge && new int[n + 3] instanceof int[] l && new int[n + 3] instanceof int[] q && new int[n + 3] instanceof int[] u
            && new long[n + 3] instanceof long[] s && new long[2] instanceof long[] hw && new long[1] instanceof long[] tt && new int[1] instanceof int[] pc
            && new int[(m + 1) * 17] instanceof int[] QP && new int[(m + 1) * 17] instanceof int[] UP
            && IntStream.rangeClosed(0, m).allMatch(p -> IntStream.range(0, 17).allMatch(t -> (QP[p * 17 + t] = t == 0 ? p : QP[p * 17 + t - 1] & (QP[p * 17 + t - 1] - 1)) >= 0
                && (UP[p * 17 + t] = t == 0 ? p : UP[p * 17 + t - 1] > m ? m + 1 : Math.min(m + 1, UP[p * 17 + t - 1] + (UP[p * 17 + t - 1] & -UP[p * 17 + t - 1]))) >= 0))
            && new int[2] instanceof int[] sm
            && ((LongSupplier) () -> (hw[0] = 0) == 0 && (hw[1] = 0) == 0 && IntStream.iterate(o[n + 1], y -> y <= m, y -> y + (y & -y)).filter(y -> (fe[y] += 1) < 0).count() == 0
                && IntStream.rangeClosed(1, n).allMatch(i -> Long.valueOf(c[i] - tt[0]) instanceof Long ct && Integer.valueOf(Arrays.binarySearch(du, ct)) instanceof Integer bs
                    && Integer.valueOf(bs >= 0 ? bs + 1 : -bs - 1) instanceof Integer j
                    && (j == 0 || b[j] >= i || (Long.valueOf((fe[QP[j * 17 + 0]] + fe[QP[j * 17 + 1]] + fe[QP[j * 17 + 2]] + fe[QP[j * 17 + 3]] + fe[QP[j * 17 + 4]] + fe[QP[j * 17 + 5]] + fe[QP[j * 17 + 6]] + fe[QP[j * 17 + 7]] + fe[QP[j * 17 + 8]] + fe[QP[j * 17 + 9]] + fe[QP[j * 17 + 10]] + fe[QP[j * 17 + 11]] + fe[QP[j * 17 + 12]] + fe[QP[j * 17 + 13]] + fe[QP[j * 17 + 14]] + fe[QP[j * 17 + 15]] + fe[QP[j * 17 + 16]])) instanceof Long fq && Long.valueOf((ge[QP[j * 17 + 0]] + ge[QP[j * 17 + 1]] + ge[QP[j * 17 + 2]] + ge[QP[j * 17 + 3]] + ge[QP[j * 17 + 4]] + ge[QP[j * 17 + 5]] + ge[QP[j * 17 + 6]] + ge[QP[j * 17 + 7]] + ge[QP[j * 17 + 8]] + ge[QP[j * 17 + 9]] + ge[QP[j * 17 + 10]] + ge[QP[j * 17 + 11]] + ge[QP[j * 17 + 12]] + ge[QP[j * 17 + 13]] + ge[QP[j * 17 + 14]] + ge[QP[j * 17 + 15]] + ge[QP[j * 17 + 16]])) instanceof Long gq
                        && (hw[0] += fq) > Long.MIN_VALUE && (hw[1] += fq * ct - gq) > Long.MIN_VALUE && ++l[b[j] + 1] > Integer.MIN_VALUE && --l[i + 1] > Integer.MIN_VALUE))
                    && ((fe[UP[o[i] * 17 + 0]] += 1) * 0 + (ge[UP[o[i] * 17 + 0]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 1]] += 1) * 0 + (ge[UP[o[i] * 17 + 1]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 2]] += 1) * 0 + (ge[UP[o[i] * 17 + 2]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 3]] += 1) * 0 + (ge[UP[o[i] * 17 + 3]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 4]] += 1) * 0 + (ge[UP[o[i] * 17 + 4]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 5]] += 1) * 0 + (ge[UP[o[i] * 17 + 5]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 6]] += 1) * 0 + (ge[UP[o[i] * 17 + 6]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 7]] += 1) * 0 + (ge[UP[o[i] * 17 + 7]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 8]] += 1) * 0 + (ge[UP[o[i] * 17 + 8]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 9]] += 1) * 0 + (ge[UP[o[i] * 17 + 9]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 10]] += 1) * 0 + (ge[UP[o[i] * 17 + 10]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 11]] += 1) * 0 + (ge[UP[o[i] * 17 + 11]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 12]] += 1) * 0 + (ge[UP[o[i] * 17 + 12]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 13]] += 1) * 0 + (ge[UP[o[i] * 17 + 13]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 14]] += 1) * 0 + (ge[UP[o[i] * 17 + 14]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 15]] += 1) * 0 + (ge[UP[o[i] * 17 + 15]] += c[i]) * 0 + (fe[UP[o[i] * 17 + 16]] += 1) * 0 + (ge[UP[o[i] * 17 + 16]] += c[i]) * 0) == 0)
                && (pc[0] = 0) == 0 && IntStream.rangeClosed(1, n).allMatch(i -> (l[i] += l[i - 1]) > Integer.MIN_VALUE && (l[i] != 0 || (q[++pc[0]] = i) > 0))
                && Stream.of(0).peek(z -> Arrays.fill(l, 1, n + 1, 0)).peek(z -> Arrays.fill(fe, 0L)).peek(z -> Arrays.fill(ge, 0L)).findFirst().isPresent()
                && (pc[0] == 0 || ((s[0] = -LongStream.concat(LongStream.of(1000000000000000000L), Arrays.stream(c, 0, q[1])).min().getAsLong()) > Long.MIN_VALUE && (u[0] = 0) == 0
                    && (sm[0] = 1) == 1 && (s[1] = s[0] + r[q[1]] - tt[0]) > Long.MIN_VALUE && (u[1] = u[0] + 1) > 0 && (sm[1] = q[1]) >= 0
                    && IntStream.iterate(0, z -> sm[0] <= pc[0], z -> z + 1).filter(z -> sm[1] < q[sm[0] + 1]
                        ? (s[sm[0]] - c[sm[1]] < s[0] || ((s[0] = s[sm[0]] - c[sm[1]]) * 0 + (u[0] = u[sm[0]]) * 0 == 0)) && ++sm[1] < 0
                        : (++sm[0] > pc[0] || ((s[sm[0]] = s[0] + r[q[sm[0]]] - tt[0]) > Long.MIN_VALUE && (u[sm[0]] = u[0] + 1) > 0 && (sm[1] = q[sm[0]]) < 0)) && sm[0] < 0).count() == 0
                    && (hw[1] += s[pc[0]]) > Long.MIN_VALUE && (hw[0] += u[pc[0]]) > Long.MIN_VALUE)) ? hw[0] : -1L) instanceof LongSupplier chk
            && new long[]{-5000000000L, 5000000000L, 0} instanceof long[] lr
            && IntStream.range(0, 40).allMatch(z -> lr[0] > lr[1] || ((tt[0] = (lr[0] + lr[1]) >> 1) > Long.MIN_VALUE
                && (chk.getAsLong() >= k ? (lr[2] = tt[0]) > Long.MIN_VALUE && (lr[0] = tt[0] + 1) > Long.MIN_VALUE : (lr[1] = tt[0] - 1) > Long.MIN_VALUE)))
            && (tt[0] = lr[2]) > Long.MIN_VALUE && chk.getAsLong() > Long.MIN_VALUE
            ? String.valueOf(hw[1] + tt[0] * k) : "");
    }
}
