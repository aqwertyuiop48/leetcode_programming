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
            && new double[3 * n + 10] instanceof double[] qx && new double[3 * n + 10] instanceof double[] qy && new int[3 * n + 10] instanceof int[] nx && new int[3 * n + 10] instanceof int[] pv && new int[12] instanceof int[] st && new double[3] instanceof double[] ds
            && ((IntToDoubleFunction) v -> ds[2] - (ds[0] * (qy[v] - Y[st[10]]) - ds[1] * (qx[v] - X[st[10]]))) instanceof IntToDoubleFunction G
            && ((BooleanSupplier) () -> G.applyAsDouble(nx[st[0]]) < G.applyAsDouble(st[0]) ? (st[0] = nx[st[0]]) >= 0 : G.applyAsDouble(pv[st[0]]) < G.applyAsDouble(st[0]) ? (st[0] = pv[st[0]]) >= 0 : false) instanceof BooleanSupplier tm
            && ((IntUnaryOperator) i0 -> memo[i0] >= 0 ? memo[i0]
                : IntStream.range(0, n).filter(v -> (qx[v] = X[v]) != Double.NaN && (qy[v] = Y[v]) != Double.NaN && (nx[v] = (v + 1) % n) >= 0 && (pv[v] = (v + n - 1) % n) >= 0).count() >= 0
                && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[2] = 1) == 1 && (st[5] = n) == n && (st[9] = n) == n
                && IntStream.iterate(0, z -> st[1] < n && st[2] == 1, z -> z + 1).filter(z -> (st[10] = (i0 + st[1]) % n) >= 0
                    && (ds[0] = X[(st[10] + 1) % n] - X[st[10]]) != Double.NaN && (ds[1] = Y[(st[10] + 1) % n] - Y[st[10]]) != Double.NaN && (ds[2] = rr[0] * len[st[10]]) != Double.NaN
                    && ((tm.getAsBoolean() && tm.getAsBoolean() && tm.getAsBoolean() && IntStream.iterate(0, y -> tm.getAsBoolean(), y -> y + 1).count() >= 0) || true)
                    && (G.applyAsDouble(st[0]) >= -1e-7 ? ++st[1] > 0
                        : (Integer.valueOf(IntStream.iterate(st[0], v -> G.applyAsDouble(v) < -1e-7, v -> nx[v]).limit(st[5]).map(v -> 1 + 0 * (st[6] = v)).sum()) instanceof Integer fc && fc < st[5])
                        ? Integer.valueOf(IntStream.iterate(st[0], v -> G.applyAsDouble(v) < -1e-7, v -> pv[v]).limit(st[5]).map(v -> 1 + 0 * (st[7] = v)).sum()) instanceof Integer bc
                            && Integer.valueOf(st[7]) instanceof Integer b && Integer.valueOf(st[6]) instanceof Integer f && Integer.valueOf(pv[b]) instanceof Integer a && Integer.valueOf(nx[f]) instanceof Integer c
                            && Double.valueOf(Math.max(0, Math.min(1, G.applyAsDouble(a) / (G.applyAsDouble(a) - G.applyAsDouble(b))))) instanceof Double t1
                            && Double.valueOf(Math.max(0, Math.min(1, G.applyAsDouble(f) / (G.applyAsDouble(f) - G.applyAsDouble(c))))) instanceof Double t2
                            && Integer.valueOf(st[9]) instanceof Integer p1
                            && (qx[p1] = qx[a] + t1 * (qx[b] - qx[a])) != Double.NaN && (qy[p1] = qy[a] + t1 * (qy[b] - qy[a])) != Double.NaN
                            && (qx[p1 + 1] = qx[f] + t2 * (qx[c] - qx[f])) != Double.NaN && (qy[p1 + 1] = qy[f] + t2 * (qy[c] - qy[f])) != Double.NaN
                            && (nx[a] = p1) >= 0 && (pv[p1] = a) >= 0 && (nx[p1] = p1 + 1) >= 0 && (pv[p1 + 1] = p1) >= 0 && (nx[p1 + 1] = c) >= 0 && (pv[c] = p1 + 1) >= 0
                            && (st[9] += 2) > 0 && (st[5] += 3 - fc - bc) > 0 && (st[0] = p1) >= 0 && ++st[1] > 0
                        : (st[2] = 0) < 0)).count() >= 0
                && (mx[i0] = IntStream.iterate(st[0], v -> nx[v]).limit(st[5]).mapToDouble(v -> qx[v]).sum() / st[5]) != Double.NaN
                && (my[i0] = IntStream.iterate(st[0], v -> nx[v]).limit(st[5]).mapToDouble(v -> qy[v]).sum() / st[5]) != Double.NaN
                && (memo[i0] = st[1]) >= 0 ? memo[i0] : 0) instanceof IntUnaryOperator reach
            && ((IntPredicate) b -> Integer.valueOf(reach.applyAsInt(b % n)) instanceof Integer rb && (rb >= n || reach.applyAsInt((b + rb) % n) >= n - rb)) instanceof IntPredicate ok2
            && new double[] {0, 30000} instanceof double[] bs
            && (rr[0] = bs[1] - 4e-7 * Math.max(1, bs[1])) > 0 && IntStream.range(0, n).filter(i -> (memo[i] = -1) > 0).count() >= 0
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> i * 0x9E3779B97F4A7C15L)).mapToInt(Integer::intValue)
                .filter(b -> rr[0] > 0 && ok2.test(b) && new double[] {0, rr[0]} instanceof double[] ab
                    && IntStream.iterate(0, it -> ab[1] - ab[0] > 4e-7 * Math.max(1, ab[1]), it -> it + 1).filter(it -> (rr[0] = (ab[0] + ab[1]) / 2) > 0 && IntStream.range(0, n).filter(i -> (memo[i] = -1) > 0).count() >= 0
                        && (ok2.test(b) ? (ab[1] = rr[0]) > 0 : (ab[0] = rr[0]) > 0)).count() >= 0
                    && (bs[1] = ab[1]) > 0 && (rr[0] = bs[1] - 4e-7 * Math.max(1, bs[1])) != Double.NaN && IntStream.range(0, n).filter(i -> (memo[i] = -1) > 0).count() >= 0).count() >= 0
            && (rr[0] = bs[1]) > 0 && IntStream.range(0, n).filter(i -> (memo[i] = -1) > 0).count() >= 0
            ? (reach.applyAsInt(0) >= n ? String.format("%.9f%n%.9f %.9f%n%.9f %.9f", bs[1], mx[0], my[0], mx[0], my[0])
                : Integer.valueOf(IntStream.rangeClosed(1, reach.applyAsInt(0)).filter(ok2).findFirst().getAsInt()) instanceof Integer b && Integer.valueOf(reach.applyAsInt(b % n)) instanceof Integer rb
                    && Integer.valueOf(rb >= n ? b % n : (b + rb) % n) instanceof Integer s2 && Integer.valueOf(reach.applyAsInt(s2)) instanceof Integer unused
                    ? String.format("%.9f%n%.9f %.9f%n%.9f %.9f", bs[1], mx[b % n], my[b % n], mx[s2], my[s2]) : "") : "");
    }
}
