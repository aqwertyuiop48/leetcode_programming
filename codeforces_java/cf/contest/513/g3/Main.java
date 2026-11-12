
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(n + 2) instanceof Integer W
            && Integer.valueOf((int) Math.min(Long.parseLong(tk[1]), 500L)) instanceof Integer K
            && Double.valueOf(2.0 / (n * (n + 1))) instanceof Double inv
            && new int[n + 1] instanceof int[] v
            && new double[W * W] instanceof double[] d && new double[W * W] instanceof double[] c && new double[W * W] instanceof double[] g
            && new double[W * W] instanceof double[] p && new double[W * W] instanceof double[] pp
            && IntStream.rangeClosed(1, n).allMatch(i -> (v[i] = Integer.parseInt(tk[1 + i])) > 0)
            && IntStream.range(0, n * n).filter(i -> i % n < i / n).map(i -> (i / n + 1) * W + i % n + 1).toArray() instanceof int[] cell
            && IntStream.of(cell).map(i -> i % W).toArray() instanceof int[] xs && IntStream.of(cell).map(i -> i / W).toArray() instanceof int[] ys
            && IntStream.of(cell).allMatch(i -> (d[i] = 0.5) > 0)
            && IntStream.range(0, K).allMatch(s -> IntStream.range(0, cell.length).filter(i ->
                    (pp[cell[i]] = (p[cell[i]] = d[cell[i]] + p[cell[i] - W - 1]) + pp[cell[i] - W - 1]) > Double.NEGATIVE_INFINITY
                    && (g[cell[i]] = g[cell[i] - 1] + (c[cell[i]] = c[cell[i] - 1] + d[cell[i]])) > Double.NEGATIVE_INFINITY).count() >= 0
                && IntStream.range(0, cell.length).filter(i ->
                    (d[cell[i]] = (((xs[i] - 1) * xs[i] / 2 + (ys[i] - xs[i] - 1) * (ys[i] - xs[i]) / 2 + (n - ys[i]) * (n - ys[i] + 1) / 2) * d[cell[i]]
                        + g[ys[i] * W + ys[i] - 1] - g[ys[i] * W + ys[i] - 1 - Math.min(xs[i], ys[i] - xs[i])] - g[ys[i] * W + Math.min(xs[i], ys[i] - xs[i]) - 1]
                        + g[(n + 1 - xs[i]) * W + (n + 1 - xs[i]) - 1] - g[(n + 1 - xs[i]) * W + (n + 1 - xs[i]) - 1 - Math.min(n + 1 - ys[i], ys[i] - xs[i])] - g[(n + 1 - xs[i]) * W + Math.min(n + 1 - ys[i], ys[i] - xs[i]) - 1]
                        - pp[n * W + xs[i] + n - ys[i]] + pp[(n - xs[i]) * W + n - ys[i]] + pp[(ys[i] - 1) * W + xs[i] - 1]) * inv) > Double.NEGATIVE_INFINITY).count() >= 0)
            ? String.format(java.util.Locale.ROOT, "%.12f", n * (n - 1) / 4.0 + Math.pow((n - 1.0) / (n + 1), Long.parseLong(tk[1]) - K) * IntStream.rangeClosed(1, n).mapToDouble(j -> IntStream.range(1, j).mapToDouble(i -> (v[i] > v[j] ? 1 : -1) * d[j * W + i]).sum()).sum()) : "");
    }
}



