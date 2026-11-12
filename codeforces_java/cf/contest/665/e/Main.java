import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer k
            && new int[n + 1] instanceof int[] p
            && IntStream.rangeClosed(1, n).filter(i -> (p[i] = p[i - 1] ^ tok[1 + i]) >= 0).count() >= 0
            && Arrays.stream(p).parallel().sorted().toArray() instanceof int[] s
            && new int[n + 2] instanceof int[] u && new int[n + 2] instanceof int[] cum && new int[]{0} instanceof int[] uc
            && IntStream.range(0, n + 1).filter(i -> (i == 0 || s[i] != s[i - 1]) && (u[uc[0]] = s[i]) >= 0 && (cum[uc[0]++] = i) >= 0).count() >= 0
            && Integer.valueOf(uc[0]) instanceof Integer U && (cum[U] = n + 1) > 0
            && new int[2][4][U + 2] instanceof int[][][] F && new int[]{1, 0} instanceof int[] cnts && new int[8] instanceof int[] w && new long[]{0} instanceof long[] tot
            && (F[0][0][0] = 0) == 0 && (F[0][1][0] = U) >= 0 && (F[0][2][0] = 0) == 0 && (F[0][3][0] = U) >= 0
            && IntStream.range(0, 30).filter(lv -> F[lv & 1] instanceof int[][] cu && F[(lv + 1) & 1] instanceof int[][] nx
                && Integer.valueOf((lv + 1) & 1) instanceof Integer np && (cnts[np] = 0) == 0
                && Integer.valueOf(29 - lv) instanceof Integer b && Integer.valueOf((k >> b) & 1) instanceof Integer kb
                && IntStream.range(0, cnts[lv & 1]).filter(e -> (w[0] = cu[0][e]) >= 0 & (w[1] = cu[1][e]) >= 0 & (w[2] = cu[2][e]) >= 0 & (w[3] = cu[3][e]) >= 0
                    && (w[1] - w[0] == 1 && w[3] - w[2] == 1
                        ? (tot[0] += (((u[w[0]] ^ u[w[2]]) & ((2 << b) - 1)) >= (k & ((2 << b) - 1)) ? (long) (cum[w[1]] - cum[w[0]]) * (cum[w[3]] - cum[w[2]]) : 0)) >= 0
                        : (w[4] = Arrays.binarySearch(u, w[0], w[1], ((u[w[0]] >> b) | 1) << b)) > Integer.MIN_VALUE & (w[4] = w[4] >= 0 ? w[4] : -w[4] - 1) >= 0
                            & (w[5] = Arrays.binarySearch(u, w[2], w[3], ((u[w[2]] >> b) | 1) << b)) > Integer.MIN_VALUE & (w[5] = w[5] >= 0 ? w[5] : -w[5] - 1) >= 0
                            && (kb == 1
                                ? ((w[4] > w[0] && w[3] > w[5] ? (nx[0][cnts[np]] = w[0]) + (nx[1][cnts[np]] = w[4]) + (nx[2][cnts[np]] = w[5]) + (nx[3][cnts[np]++] = w[3]) : 0)
                                    + (w[1] > w[4] && w[5] > w[2] ? (nx[0][cnts[np]] = w[4]) + (nx[1][cnts[np]] = w[1]) + (nx[2][cnts[np]] = w[2]) + (nx[3][cnts[np]++] = w[5]) : 0)) >= 0
                                : (tot[0] += (long) (cum[w[4]] - cum[w[0]]) * (cum[w[3]] - cum[w[5]]) + (long) (cum[w[1]] - cum[w[4]]) * (cum[w[5]] - cum[w[2]])) >= 0
                                    && ((w[4] > w[0] && w[5] > w[2] ? (nx[0][cnts[np]] = w[0]) + (nx[1][cnts[np]] = w[4]) + (nx[2][cnts[np]] = w[2]) + (nx[3][cnts[np]++] = w[5]) : 0)
                                        + (w[1] > w[4] && w[3] > w[5] ? (nx[0][cnts[np]] = w[4]) + (nx[1][cnts[np]] = w[1]) + (nx[2][cnts[np]] = w[5]) + (nx[3][cnts[np]++] = w[3]) : 0)) >= 0))).count() >= 0).count() >= 0
            && IntStream.range(0, cnts[0]).filter(e -> (tot[0] += (long) (cum[F[0][1][e]] - cum[F[0][0][e]]) * (cum[F[0][3][e]] - cum[F[0][2][e]])) >= 0).count() >= 0
            ? (tot[0] - (k == 0 ? n + 1 : 0)) / 2 : "");
    }
}
