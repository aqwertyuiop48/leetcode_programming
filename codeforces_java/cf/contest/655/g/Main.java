import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n
            && Double.valueOf(Double.parseDouble(tk.nextToken())) instanceof Double a && Double.valueOf(2 * a) instanceof Double tw
            && new double[n] instanceof double[] th && new double[n] instanceof double[] d && new double[n] instanceof double[] rho
            && IntStream.range(0, n).filter(i -> Double.valueOf(Double.parseDouble(tk.nextToken())) instanceof Double x && Double.valueOf(Double.parseDouble(tk.nextToken())) instanceof Double y
                && (th[i] = Math.atan2(y, x - a)) + (d[i] = Math.hypot(x - a, y)) + (rho[i] = Math.hypot(x + a, y)) < -1e18).count() == 0
            && Boolean.valueOf(IntStream.range(0, n).anyMatch(i -> d[i] == 0 || rho[i] == 0)) instanceof Boolean degEx
            && new long[2 * n] instanceof long[] keys && new int[n + 1] instanceof int[] stk && new int[n + 1] instanceof int[] mark && new int[4] instanceof int[] st
            && new double[]{0, 0} instanceof double[] tmp
            && ((DoubleToLongFunction) ang -> ((long) ((ang < 0 ? ang + 2 * Math.PI : ang >= 2 * Math.PI ? ang - 2 * Math.PI : ang) / (2 * Math.PI) * 35184372088832.0)) << 17) instanceof DoubleToLongFunction kf
            && ((DoublePredicate) r -> IntStream.of(0).peek(z -> Arrays.fill(mark, 0)).peek(z -> Arrays.fill(st, 0)).sum() == 0
                && IntStream.range(0, n).filter(i -> (keys[2 * i] = keys[2 * i + 1] = Long.MAX_VALUE) < 0
                    || (d[i] > 0 && rho[i] > 0 && (r >= tw && d[i] + rho[i] <= r ? (st[1] = 1) < 0
                        : Math.abs(rho[i] - r) < d[i] && d[i] < rho[i] + r
                            && (tmp[1] = Math.acos((r * r + d[i] * d[i] - rho[i] * rho[i]) / (2 * r * d[i]))) >= 0
                            && ((keys[2 * i] = kf.applyAsLong(th[i] + tmp[1]) | i) < 0 | (keys[2 * i + 1] = kf.applyAsLong(th[i] - tmp[1]) | i) < 0 | (st[0] += 2) < 0)))).count() == 0
                && (r >= tw
                    ? (degEx || st[1] == 1 || (IntStream.of(0).peek(z -> Arrays.sort(keys)).sum() == 0 && st[0] >= 4
                        && IntStream.range(0, st[0] / 2).anyMatch(k -> (keys[k] & 131071) != (keys[k + st[0] / 2] & 131071))))
                    : IntStream.of(0).peek(z -> Arrays.sort(keys)).sum() == 0
                        && IntStream.range(0, st[0]).takeWhile(k -> st[2] == 0)
                            .filter(k -> Integer.valueOf((int) (keys[k] & 131071)) instanceof Integer id
                                && (mark[id] == 0 ? (mark[id] = 1) + (stk[st[3]++] = id) : stk[st[3] - 1] == id ? --st[3] : (st[2] = 1)) < -100).count() == 0 && st[2] == 1)) instanceof DoublePredicate feas
            && new double[]{0, 1048573.7} instanceof double[] lh
            && IntStream.range(0, 48).filter(it -> Double.valueOf((lh[0] + lh[1]) / 2) instanceof Double mid && (feas.test(mid) ? (lh[1] = mid) < 0 : (lh[0] = mid) < 0)).count() == 0
            ? String.format(Locale.ROOT, "%.10f", lh[1]) : "");
    }
}
