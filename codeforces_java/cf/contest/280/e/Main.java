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
                && Integer.valueOf(IntStream.range(0, c).filter(i -> SL[i] * X[i + 1] + IC[i] >= 0).findFirst().orElse(c)) instanceof Integer z0
                && Double.valueOf(z0.intValue() == c.intValue() ? X[c] : SL[z0] * X[z0] + IC[z0] >= 0 ? X[z0] : -IC[z0] / SL[z0]) instanceof Double zs
                && (z[j] = zs) == zs
                && (j == n - 1 || B[1 - st[1]][0] instanceof double[] X2 && B[1 - st[1]][1] instanceof double[] SL2 && B[1 - st[1]][2] instanceof double[] IC2
                    && Double.valueOf(q - (n - 2 - j) * a) instanceof Double hiB
                    && Integer.valueOf(z0.intValue() == c.intValue() ? c : z0 + (X[z0] < zs ? 1 : 0)) instanceof Integer kL
                    && Integer.valueOf(z0.intValue() == c.intValue() ? c : z0 + (X[z0 + 1] > zs ? 0 : 1)) instanceof Integer iR
                    && Integer.valueOf((int) IntStream.range(iR, c).filter(i -> Math.max(X[i], zs) + b <= hiB).count()) instanceof Integer vr
                    && Integer.valueOf(kL + 1 + vr) instanceof Integer cn
                    && Stream.of(0).peek(w -> IntStream.rangeClosed(0, cn).forEach(d -> X2[d] = d < kL ? X[d] + a : d == kL ? zs + a : d == cn ? Math.min(X[c] + b, hiB) : Math.max(X[iR + d - kL - 1], zs) + b)).findFirst().isPresent()
                    && Stream.of(0).peek(w -> IntStream.range(0, cn).forEach(d -> SL2[d] = d < kL ? SL[d] + 2 : d == kL ? 2 : SL[iR + d - kL - 1] + 2)).findFirst().isPresent()
                    && Stream.of(0).peek(w -> IntStream.range(0, cn).forEach(d -> IC2[d] = d < kL ? IC[d] - SL[d] * a - 2 * x[j + 1] : d == kL ? -2 * x[j + 1] : IC[iR + d - kL - 1] - SL[iR + d - kL - 1] * b - 2 * x[j + 1])).findFirst().isPresent()
                    && (st[0] = cn) > 0 && (st[1] = 1 - st[1]) >= 0))
            && new double[n] instanceof double[] y && (y[n - 1] = z[n - 1]) == z[n - 1]
            && IntStream.iterate(n - 2, j -> j >= 0, j -> j - 1).allMatch(j -> (y[j] = Math.min(Math.max(z[j], y[j + 1] - b), y[j + 1] - a)) == y[j])
            ? Arrays.stream(y).mapToObj(v -> String.format("%.9f", v)).collect(Collectors.joining(" ")) + "\n" + String.format("%.9f", IntStream.range(0, n).mapToDouble(i -> (x[i] - y[i]) * (x[i] - y[i])).sum()) : "");
    }
}
