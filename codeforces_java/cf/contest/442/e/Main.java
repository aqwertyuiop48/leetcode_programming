import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer W && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer H
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer N
            && IntStream.range(0, 2 * N).mapToDouble(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof double[] xy
            && new double[2] instanceof double[] ans && new double[2] instanceof double[] lo
            && ((BiFunction<Double, Double, Stream<double[]>>) (st, en) -> st < -Math.PI ? Stream.of(new double[]{st + 2 * Math.PI, Math.PI}, new double[]{-Math.PI, en})
                : en > Math.PI ? Stream.of(new double[]{st, Math.PI}, new double[]{-Math.PI, en - 2 * Math.PI}) : Stream.of(new double[]{st, en})) instanceof BiFunction<Double, Double, Stream<double[]>> sp
            && ((BiPredicate<Integer, Double>) (pv, r) -> new double[]{xy[2 * pv + 1], W - xy[2 * pv], H - xy[2 * pv + 1], xy[2 * pv]} instanceof double[] wd && new double[]{-Math.PI / 2, 0, Math.PI / 2, Math.PI} instanceof double[] wc
                && Stream.concat(IntStream.range(0, N).filter(i -> i != pv && Math.hypot(xy[2 * i] - xy[2 * pv], xy[2 * i + 1] - xy[2 * pv + 1]) >= 1e-11 && Math.hypot(xy[2 * i] - xy[2 * pv], xy[2 * i + 1] - xy[2 * pv + 1]) <= 2 * r).boxed()
                        .flatMap(i -> (Double) Math.hypot(xy[2 * i] - xy[2 * pv], xy[2 * i + 1] - xy[2 * pv + 1]) instanceof Double d && (Double) Math.atan2(xy[2 * i + 1] - xy[2 * pv + 1], xy[2 * i] - xy[2 * pv]) instanceof Double a
                            && (Double) Math.acos(d / (2 * r)) instanceof Double th ? sp.apply(a - th, a + th) : Stream.<double[]>empty()),
                    IntStream.range(0, 8).filter(j -> wd[j / 2] < r).boxed().flatMap(j -> (Double) Math.acos(wd[j / 2] / r) instanceof Double th ? sp.apply(wc[j / 2] - th, wc[j / 2] + th) : Stream.<double[]>empty()))
                    .sorted(Comparator.comparingDouble(a -> a[0])).toArray(double[][]::new) instanceof double[][] iv
                && new double[]{Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY} instanceof double[] f
                && (IntStream.range(0, iv.length).anyMatch(i -> (i > 0 && iv[i][0] >= iv[i - 1][0] + 1e-11 && f[1] + 1e-11 < iv[i][0])
                    || !(iv[i][1] > f[0] ? (f[1] = f[0]) == f[1] && (f[0] = iv[i][1]) == f[0] : iv[i][1] > f[1] ? (f[1] = iv[i][1]) == f[1] : true)) || f[1] + 1e-11 < Math.PI)) instanceof BiPredicate<Integer, Double> gap
            && new Random(7).ints(N).toArray() instanceof int[] pri
            && IntStream.range(0, N).boxed().sorted(Comparator.comparingInt(i -> pri[i])).allMatch(pv -> !gap.test(pv, ans[0] + 2e-9)
                || ((lo[0] = ans[0] + 2e-9) > 0 && (lo[1] = 1414214) > 0
                    && IntStream.range(0, 50).allMatch(z -> (Double) ((lo[0] + lo[1]) / 2) instanceof Double mid && (gap.test(pv, mid) ? (lo[0] = mid) == mid : (lo[1] = mid) == mid))
                    && (ans[0] = Math.max(ans[0], lo[0])) >= 0))
            ? ans[0] : "");
    }
}
