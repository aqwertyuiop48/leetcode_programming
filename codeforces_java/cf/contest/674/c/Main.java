import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer k
            && new double[n + 1] instanceof double[] S && new double[n + 1] instanceof double[] A && new double[n + 1] instanceof double[] B && new double[n + 1] instanceof double[] c
            && new double[2][n + 1] instanceof double[][] d && new int[n + 2] instanceof int[] hl && new int[4] instanceof int[] s
            && IntStream.rangeClosed(1, n).filter(i -> (S[i] = S[i - 1] + tok[i + 1]) > 0 & (A[i] = A[i - 1] + S[i] / tok[i + 1]) > 0 & (B[i] = B[i - 1] + 1.0 / tok[i + 1]) > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> (d[1][i] = A[i]) > 0).count() >= 0
            && IntStream.rangeClosed(2, k).filter(j -> d[(j + 1) & 1] instanceof double[] pv && d[j & 1] instanceof double[] cur
                && (s[0] = j) == j && (s[1] = 0) == 0 && (s[2] = 0) == 0 && (s[3] = 0) == 0
                && IntStream.range(0, 4 * n + 10).allMatch(tick -> s[1] == 0
                    ? (c[s[0] - 1] = pv[s[0] - 1] - A[s[0] - 1] + S[s[0] - 1] * B[s[0] - 1]) > -1e300
                        && (s[3] - s[2] >= 2 && (c[s[0] - 1] - c[hl[s[3] - 2]]) * (S[hl[s[3] - 1]] - S[hl[s[3] - 2]]) <= (c[hl[s[3] - 1]] - c[hl[s[3] - 2]]) * (S[s[0] - 1] - S[hl[s[3] - 2]])
                            ? --s[3] >= 0
                            : (hl[s[3]++] = s[0] - 1) >= 0 & (s[1] = 1) == 1)
                    : (s[3] - s[2] >= 2 && c[hl[s[2] + 1]] - S[hl[s[2] + 1]] * B[s[0]] <= c[hl[s[2]]] - S[hl[s[2]]] * B[s[0]]
                        ? ++s[2] > 0
                        : (cur[s[0]] = pv[hl[s[2]]] + A[s[0]] - A[hl[s[2]]] - S[hl[s[2]]] * (B[s[0]] - B[hl[s[2]]])) > -1e300 & (s[1] = 0) == 0 & ++s[0] <= n)) || true).count() >= 0
            ? String.format("%.9f", d[k & 1][n]) : "");
    }
}
