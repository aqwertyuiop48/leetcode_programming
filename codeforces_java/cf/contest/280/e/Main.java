
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Double.valueOf(sc.nextDouble()) instanceof Double q
            && Double.valueOf(sc.nextDouble()) instanceof Double a && Double.valueOf(sc.nextDouble()) instanceof Double b
            && IntStream.range(0, n).mapToDouble(i -> sc.nextDouble()).toArray() instanceof double[] x
            && new double[2][3][2 * n + 8] instanceof double[][][] B
            && (B[0][0][0] = 1) == 1 && (B[0][0][1] = q - (n - 1) * a) == B[0][0][1] && (B[0][1][0] = 2) == 2 && (B[0][2][0] = -2 * x[0]) == B[0][2][0]
            && new int[]{1, 0} instanceof int[] st && new double[n] instanceof double[] z
            && IntStream.range(0, n).allMatch(j -> B[st[1]][0] instanceof double[] X && B[st[1]][1] instanceof double[] SL && B[st[1]][2] instanceof double[] IC
                && Integer.valueOf(st[0]) instanceof Integer c
                && new int[]{0, c} instanceof int[] bsz && IntStream.range(0, 15).allMatch(it -> bsz[0] >= bsz[1] || Integer.valueOf((bsz[0] + bsz[1]) >> 1) instanceof Integer md && (SL[md] * X[md + 1] + IC[md] >= 0 ? (bsz[1] = md) >= 0 : (bsz[0] = md + 1) >= 0))
                && Integer.valueOf(bsz[0]) instanceof Integer z0
                && Double.valueOf(z0.intValue() == c.intValue() ? X[c] : SL[z0] * X[z0] + IC[z0] >= 0 ? X[z0] : -IC[z0] / SL[z0]) instanceof Double zs
                && (z[j] = zs) == zs
                && (j == n - 1 || B[1 - st[1]][0] instanceof double[] X2 && B[1 - st[1]][1] instanceof double[] SL2 && B[1 - st[1]][2] instanceof double[] IC2
                    && Double.valueOf(q - (n - 2 - j) * a) instanceof Double hiB
                    && Integer.valueOf(z0.intValue() == c.intValue() ? c : z0 + (X[z0] < zs ? 1 : 0)) instanceof Integer kL
                    && Integer.valueOf(z0.intValue() == c.intValue() ? c : z0 + (X[z0 + 1] > zs ? 0 : 1)) instanceof Integer iR
                    && new int[]{iR, c} instanceof int[] bsv && IntStream.range(0, 15).allMatch(it -> bsv[0] >= bsv[1] || Integer.valueOf((bsv[0] + bsv[1]) >> 1) instanceof Integer md2 && (Math.max(X[md2], zs) + b > hiB ? (bsv[1] = md2) >= 0 : (bsv[0] = md2 + 1) >= 0))
                    && Integer.valueOf(bsv[0] - iR) instanceof Integer vr
                    && Integer.valueOf(kL + 1 + vr) instanceof Integer cn
                    && Double.valueOf(-2 * x[j + 1]) instanceof Double mx
                    && IntStream.range(0, kL).mapToDouble(d -> (X2[d] = X[d] + a) * 0 + (SL2[d] = SL[d] + 2) * 0 + (IC2[d] = IC[d] - SL[d] * a + mx) * 0).sum() == 0
                    && (X2[kL] = zs + a) * 0 == 0 && (SL2[kL] = 2) * 0 == 0 && (IC2[kL] = mx) * 0 == 0
                    && IntStream.range(kL + 1, cn).mapToDouble(d -> (X2[d] = Math.max(X[iR + d - kL - 1], zs) + b) * 0 + (SL2[d] = SL[iR + d - kL - 1] + 2) * 0 + (IC2[d] = IC[iR + d - kL - 1] - SL[iR + d - kL - 1] * b + mx) * 0).sum() == 0
                    && (X2[cn] = Math.min(X[c] + b, hiB)) * 0 == 0
                    && (st[0] = cn) > 0 && (st[1] = 1 - st[1]) >= 0))
            && new double[n] instanceof double[] y && (y[n - 1] = z[n - 1]) == z[n - 1]
            && IntStream.iterate(n - 2, j -> j >= 0, j -> j - 1).allMatch(j -> (y[j] = Math.min(Math.max(z[j], y[j + 1] - b), y[j + 1] - a)) == y[j])
            ? Arrays.stream(y).mapToObj(v -> String.format("%.9f", v)).collect(Collectors.joining(" ")) + "\n" + String.format("%.9f", IntStream.range(0, n).mapToDouble(i -> (x[i] - y[i]) * (x[i] - y[i])).sum()) : "");
    }
}



