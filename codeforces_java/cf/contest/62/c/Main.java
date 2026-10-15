import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> IntStream.range(0, 6).mapToDouble(q -> sc.nextInt()).toArray()).toList() instanceof List<double[]> t
                ? String.format(Locale.US, "%.10f", IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(0, 3).mapToObj(k -> new int[]{i, k}))
                    .mapToDouble(ik -> new double[]{t.get(ik[0])[2 * ik[1]], t.get(ik[0])[2 * ik[1] + 1], t.get(ik[0])[2 * ((ik[1] + 1) % 3)], t.get(ik[0])[2 * ((ik[1] + 1) % 3) + 1]} instanceof double[] s
                        && new double[]{0, 0} instanceof double[] st
                        && IntStream.range(0, n).filter(j -> j != ik[0]).mapToObj(j -> t.get(j) instanceof double[] c
                                && new double[]{0, 1} instanceof double[] lh
                                && Double.valueOf(Math.signum((c[2] - c[0]) * (c[5] - c[1]) - (c[3] - c[1]) * (c[4] - c[0]))) instanceof Double sg
                                && IntStream.range(0, 3).allMatch(e -> new double[]{c[2 * e], c[2 * e + 1], c[2 * ((e + 1) % 3)] - c[2 * e], c[2 * ((e + 1) % 3) + 1] - c[2 * e + 1]} instanceof double[] ab
                                    && Double.valueOf(sg * (ab[2] * (s[1] - ab[1]) - ab[3] * (s[0] - ab[0]))) instanceof Double a
                                    && Double.valueOf(sg * (ab[2] * (s[3] - s[1]) - ab[3] * (s[2] - s[0]))) instanceof Double b
                                    && (b == 0 ? a >= 0 : b > 0 ? (lh[0] = Math.max(lh[0], -a / b)) >= 0 : (lh[1] = Math.min(lh[1], -a / b)) <= 1))
                                ? lh : new double[]{0, 0})
                            .filter(lh -> lh[1] > lh[0] + 1e-12).sorted(Comparator.comparingDouble(lh -> lh[0]))
                            .allMatch(lh -> lh[1] <= st[0] || ((st[1] += lh[1] - Math.max(lh[0], st[0])) >= 0 && (st[0] = lh[1]) >= 0))
                        ? Math.hypot(s[2] - s[0], s[3] - s[1]) * (1 - st[1])
                        : 0).sum())
                : "")));
    }
}

