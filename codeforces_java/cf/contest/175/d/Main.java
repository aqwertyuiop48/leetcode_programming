import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && ((Function<double[], double[]>) tk -> Integer.valueOf((int) tk[0]) instanceof Integer hp
                && Integer.valueOf((int) tk[2]) instanceof Integer lo
                && Integer.valueOf((int) tk[3]) instanceof Integer hi
                && Double.valueOf(tk[4] / 100.0) instanceof Double miss
                && new double[hp] instanceof double[] g
                && (g[0] = 1) == 1
                && new double[]{1} instanceof double[] mass
                && new ArrayList<Double>(List.of(0.0)) instanceof ArrayList<Double> kp
                && IntStream.iterate(1, k -> k < 400000 && mass[0] > 1e-13, k -> k + 1).allMatch(k -> new double[hp + 1] instanceof double[] pre
                    && IntStream.range(0, hp).allMatch(h -> (pre[h + 1] = pre[h] + g[h]) >= 0)
                    && kp.add(IntStream.range(0, hp).mapToDouble(h -> g[h] * (1 - miss) * Math.max(0, hi - Math.max(lo, hp - h) + 1) / (hi - lo + 1.0)).sum())
                    && new double[hp] instanceof double[] ng
                    && IntStream.range(0, hp).allMatch(h -> Integer.valueOf(Math.max(0, h - hi)) instanceof Integer a && (h - lo < a
                        ? (ng[h] = miss * g[h]) >= 0
                        : (ng[h] = miss * g[h] + (1 - miss) / (hi - lo + 1.0) * (pre[h - lo + 1] - pre[a])) >= 0))
                    && (mass[0] = Arrays.stream(ng).sum()) >= 0
                    && IntStream.range(0, hp).allMatch(h -> (g[h] = ng[h]) >= 0))
                ? kp.stream().mapToDouble(x -> x).toArray() : null) instanceof Function<double[], double[]> dist
            && new double[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()} instanceof double[] t1
            && new double[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()} instanceof double[] t2
            && dist.apply(t1) instanceof double[] k1
            && dist.apply(t2) instanceof double[] k2
            && Arrays.copyOf(k2, k2.length) instanceof double[] cum
            && IntStream.range(1, cum.length).allMatch(i -> (cum[i] += cum[i - 1]) >= 0)
            ? String.format("%.6f", IntStream.range(1, k1.length).mapToDouble(i -> k1[i] * (1 - cum[(int) Math.min(cum.length - 1, ((long) (i - 1) * (long) t1[1] + (long) t2[1] - 1) / (long) t2[1])])).sum())
            : "");
    }
}
