import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).mapToDouble(i -> Double.parseDouble(tk.nextToken())).toArray() instanceof double[] t
            && new double[n + 1] instanceof double[] P && new double[n + 1] instanceof double[] A && new double[n + 1] instanceof double[] B
            && Stream.of(0).peek(z -> Arrays.setAll(P, i -> i == 0 ? 0 : P[i - 1] + t[i - 1])).findFirst().isPresent()
            && Stream.of(0).peek(z -> Arrays.setAll(A, i -> i == 0 ? 0 : A[i - 1] + 1.0 / t[i - 1])).findFirst().isPresent()
            && Stream.of(0).peek(z -> Arrays.setAll(B, i -> i == 0 ? 0 : B[i - 1] + P[i] / t[i - 1])).findFirst().isPresent()
            && new double[2][n + 1] instanceof double[][] d
            && Stream.of(0).peek(z -> Arrays.setAll(d[0], i -> i == 0 ? 0 : 1e18)).findFirst().isPresent()
            && new double[n + 2] instanceof double[] hs && new double[n + 2] instanceof double[] hb && new int[4] instanceof int[] st
            && IntStream.rangeClosed(1, k).filter(j -> d[(j - 1) & 1] instanceof double[] pv && d[j & 1] instanceof double[] cu
                && Stream.of(0).peek(z -> Arrays.setAll(st, i -> i == 2 ? 1 : 0)).findFirst().isPresent() && (cu[0] = 1e18) > 0
                && IntStream.range(0, 3 * n + 4).filter(step -> st[2] <= n
                    && (st[3] == 0 && pv[st[2] - 1] < 1e17 && st[1] - st[0] >= 2 && (pv[st[2] - 1] - B[st[2] - 1] + P[st[2] - 1] * A[st[2] - 1] - hb[st[1] - 2]) * (hs[st[1] - 2] - hs[st[1] - 1]) <= (hb[st[1] - 1] - hb[st[1] - 2]) * (hs[st[1] - 2] + P[st[2] - 1])
                        ? --st[1] >= 0
                        : (st[3] != 0 || ((pv[st[2] - 1] >= 1e17 || Double.isFinite(hs[st[1]] = -P[st[2] - 1]) & Double.isFinite(hb[st[1]] = pv[st[2] - 1] - B[st[2] - 1] + P[st[2] - 1] * A[st[2] - 1]) & ++st[1] > 0) && (st[3] = 1) == 1))
                        && (st[0] + 1 < st[1] && hs[st[0] + 1] * A[st[2]] + hb[st[0] + 1] <= hs[st[0]] * A[st[2]] + hb[st[0]]
                            ? ++st[0] >= 0
                            : (cu[st[2]] = st[1] > st[0] ? B[st[2]] + hs[st[0]] * A[st[2]] + hb[st[0]] : 1e18) >= 0 & (st[3] = 0) == 0 & ++st[2] > 0)) && false).count() >= 0).count() >= 0
            ? String.format(Locale.ROOT, "%.10f", d[k & 1][n]) : "");
    }
}
