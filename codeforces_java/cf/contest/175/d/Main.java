import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && ((Function<double[], double[]>) tk -> (Integer) (int) tk[0] instanceof Integer hp
                && (Integer) (int) tk[2] instanceof Integer lo
                && (Integer) (int) tk[3] instanceof Integer hi
                && (Double) (tk[4] / 100.0) instanceof Double miss
                && new double[400001] instanceof double[] kp
                && new double[][]{new double[hp], new double[hp]} instanceof double[][] buf && (buf[0][0] = 1) == 1
                && new double[hp + 1] instanceof double[] pre
                && IntStream.range(0, hp).mapToDouble(h -> (1 - miss) * Math.max(0, hi - Math.max(lo, hp - h) + 1) / (hi - lo + 1.0)).toArray() instanceof double[] coef
                && new double[]{1, 0, 0} instanceof double[] st
                && (Double) ((1 - miss) / (hi - lo + 1.0)) instanceof Double cc && ((DoubleUnaryOperator) v -> v < 1e-30 ? 0 : v) instanceof DoubleUnaryOperator flush
                && IntStream.rangeClosed(1, 400000).takeWhile(k -> st[0] > 1e-13 && miss < 1).allMatch(k -> buf[(k - 1) & 1] instanceof double[] cur && buf[k & 1] instanceof double[] nxt
                    && IntStream.range(0, hp).map(h -> (pre[h + 1] = pre[h] + cur[h]) >= 0
                        && (nxt[h] = flush.applyAsDouble(miss * cur[h] + (h - lo < 0 ? 0 : cc * (pre[h - lo + 1] - pre[Math.max(0, h - hi)])))) >= 0 ? 0 : 1).sum() == 0
                    && (kp[k] = IntStream.range(Math.max(0, hp - hi), hp).mapToDouble(h -> cur[h] * coef[h]).sum()) >= 0
                    && (st[0] -= kp[k]) < 2 && (st[1] = k) > 0)
                ? Arrays.copyOf(kp, (int) st[1] + 1) : null) instanceof Function<double[], double[]> dist
            && new double[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()} instanceof double[] t1
            && new double[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()} instanceof double[] t2
            && dist.apply(new double[]{t2[0], t1[1], t1[2], t1[3], t1[4]}) instanceof double[] k1
            && dist.apply(new double[]{t1[0], t2[1], t2[2], t2[3], t2[4]}) instanceof double[] k2
            && Arrays.copyOf(k2, k2.length) instanceof double[] cum
            && IntStream.range(1, cum.length).allMatch(i -> (cum[i] += cum[i - 1]) >= 0)
            ? String.format(java.util.Locale.ROOT, "%.6f", IntStream.range(1, k1.length).mapToDouble(i -> k1[i] * (1 - cum[(int) Math.min(cum.length - 1, ((long) (i - 1) * (long) t1[1] + (long) t2[1] - 1) / (long) t2[1])])).sum())
            : "");
    }
}



