import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && new double[n] instanceof double[] X && new double[n] instanceof double[] Y
            && IntStream.range(0, n).filter(i -> (X[i] = Integer.parseInt(tk.nextToken())) < -1e18 || (Y[i] = Integer.parseInt(tk.nextToken())) < -1e18).count() >= 0
            && IntStream.range(0, n).mapToDouble(k -> Math.hypot(X[(k + 1) % n] - X[k], Y[(k + 1) % n] - Y[k])).toArray() instanceof double[] len
            && new double[2][2 * n + 8] instanceof double[][] BX && new double[2][2 * n + 8] instanceof double[][] BY && new double[2 * n + 8] instanceof double[] gv
            && new int[2] instanceof int[] cc && new int[] {0, 0, 1, 0} instanceof int[] ctl && new double[] {0} instanceof double[] rr && new int[n] instanceof int[] memo && new double[n] instanceof double[] mx && new double[n] instanceof double[] my
            && Double.valueOf(1e-7) instanceof Double EPS
            && ((IntUnaryOperator) i0 -> memo[i0] >= 0 ? memo[i0]
                : IntStream.range(0, n).filter(j -> (BX[0][j] = X[j]) < -1e18 || (BY[0][j] = Y[j]) < -1e18).count() >= 0 && (cc[0] = n) == n && (ctl[0] = 0) == 0 && (ctl[1] = 0) == 0 && (ctl[2] = 1) == 1
                && IntStream.iterate(0, z -> ctl[1] < n && ctl[2] == 1, z -> z + 1).filter(z -> BX[ctl[0]] instanceof double[] px && BY[ctl[0]] instanceof double[] py && BX[1 - ctl[0]] instanceof double[] ox && BY[1 - ctl[0]] instanceof double[] oy
                    && Integer.valueOf((i0 + ctl[1]) % n) instanceof Integer k && Integer.valueOf((k + 1) % n) instanceof Integer k1
                    && IntStream.range(0, cc[ctl[0]]).filter(j -> (gv[j] = rr[0] * len[k] - ((X[k1] - X[k]) * (py[j] - Y[k]) - (Y[k1] - Y[k]) * (px[j] - X[k]))) < -1e18).count() >= 0 && (ctl[3] = 0) == 0
                    && IntStream.range(0, cc[ctl[0]]).filter(j -> Integer.valueOf(j + 1 == cc[ctl[0]] ? 0 : j + 1) instanceof Integer jb && (gv[j] >= -EPS ? (ox[ctl[3]] = px[j]) != Double.NaN && (oy[ctl[3]++] = py[j]) != Double.NaN : true)
                        && ((gv[j] >= -EPS) == (gv[jb] >= -EPS) || (Double.valueOf(Math.max(0, Math.min(1, gv[j] / (gv[j] - gv[jb])))) instanceof Double t && (ox[ctl[3]] = px[j] + t * (px[jb] - px[j])) != Double.NaN && (oy[ctl[3]++] = py[j] + t * (py[jb] - py[j])) != Double.NaN))).count() >= 0
                    && (ctl[3] > 0 ? (cc[1 - ctl[0]] = ctl[3]) > 0 && (ctl[0] = 1 - ctl[0]) >= 0 && ++ctl[1] > 0 : (ctl[2] = 0) < 0)).count() >= 0
                && (mx[i0] = IntStream.range(0, cc[ctl[0]]).mapToDouble(j -> BX[ctl[0]][j]).sum() / cc[ctl[0]]) != Double.NaN && (my[i0] = IntStream.range(0, cc[ctl[0]]).mapToDouble(j -> BY[ctl[0]][j]).sum() / cc[ctl[0]]) != Double.NaN
                && (memo[i0] = ctl[1]) >= 0 ? memo[i0] : 0) instanceof IntUnaryOperator reach
            && ((IntPredicate) b -> Integer.valueOf(reach.applyAsInt(b % n)) instanceof Integer rb && (rb >= n || reach.applyAsInt((b + rb) % n) >= n - rb)) instanceof IntPredicate ok2
            && new double[] {0, 30000} instanceof double[] bs
            && IntStream.iterate(0, it -> bs[1] - bs[0] > 4e-7 * Math.max(1, bs[1]), it -> it + 1).filter(it -> (rr[0] = (bs[0] + bs[1]) / 2) > 0 && IntStream.range(0, n).filter(i -> (memo[i] = -1) > 0).count() >= 0
                && (reach.applyAsInt(0) >= n || IntStream.rangeClosed(1, reach.applyAsInt(0)).anyMatch(ok2) ? (bs[1] = rr[0]) > 0 : (bs[0] = rr[0]) > 0)).count() >= 0
            && (rr[0] = bs[1]) > 0 && IntStream.range(0, n).filter(i -> (memo[i] = -1) > 0).count() >= 0
            ? (reach.applyAsInt(0) >= n ? String.format("%.9f%n%.9f %.9f%n%.9f %.9f", bs[1], mx[0], my[0], mx[0], my[0])
                : Integer.valueOf(IntStream.rangeClosed(1, reach.applyAsInt(0)).filter(ok2).findFirst().getAsInt()) instanceof Integer b && Integer.valueOf(reach.applyAsInt(b % n)) instanceof Integer rb
                    && Integer.valueOf(rb >= n ? b % n : (b + rb) % n) instanceof Integer s2 && Integer.valueOf(reach.applyAsInt(s2)) instanceof Integer unused
                    ? String.format("%.9f%n%.9f %.9f%n%.9f %.9f", bs[1], mx[b % n], my[b % n], mx[s2], my[s2]) : "") : "");
    }
}
