import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt()} instanceof int[] tArr
            ? IntStream.range(0, tArr[0]).mapToObj(tc ->
                new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()} instanceof double[] m
                && new double[]{2 * (m[2] - m[0]), 2 * (m[3] - m[1]), 2 * (m[4] - m[2]), 2 * (m[5] - m[3])} instanceof double[] pq
                && new double[]{pq[0] * pq[3] - pq[1] * pq[2]} instanceof double[] detArr
                ? (Math.abs(detArr[0]) <= 1e-9 * Math.hypot(pq[0], pq[1]) * Math.hypot(pq[2], pq[3])
                    ? "NO"
                    : new double[]{(pq[0] * pq[0] + pq[1] * pq[1]) / 2.0, (pq[2] * pq[2] + pq[3] * pq[3]) / 2.0} instanceof double[] rhs
                        && new double[]{(rhs[0] * pq[3] - pq[1] * rhs[1]) / detArr[0], (pq[0] * rhs[1] - rhs[0] * pq[2]) / detArr[0]} instanceof double[] v
                        && new double[]{pq[0] - v[0], pq[1] - v[1], pq[2] - v[0], pq[3] - v[1]} instanceof double[] uw
                        && new double[]{Math.hypot(v[0], v[1])} instanceof double[] vlenArr
                        ? (vlenArr[0] <= 1e-9 * (Math.hypot(pq[0], pq[1]) + Math.hypot(pq[2], pq[3]))
                            ? "NO"
                            : new double[]{m[0] - uw[0] / 2.0, m[1] - uw[1] / 2.0} instanceof double[] a
                                && new double[]{a[0] + uw[0], a[1] + uw[1]} instanceof double[] b
                                && new double[]{b[0] + v[0], b[1] + v[1]} instanceof double[] c
                                && new double[]{c[0] + uw[2], c[1] + uw[3]} instanceof double[] d
                                && new double[]{uw[0], v[0], uw[2], a[0] - d[0]} instanceof double[] ex
                                && new double[]{uw[1], v[1], uw[3], a[1] - d[1]} instanceof double[] ey
                                && new double[]{0} instanceof double[] signArr
                                && IntStream.range(0, 4).allMatch(i ->
                                    Math.abs(ex[i] * ey[(i + 1) % 4] - ey[i] * ex[(i + 1) % 4]) > 1e-9 * Math.hypot(ex[i], ey[i]) * Math.hypot(ex[(i + 1) % 4], ey[(i + 1) % 4])
                                    && (signArr[0] != 0 || (signArr[0] = Math.signum(ex[i] * ey[(i + 1) % 4] - ey[i] * ex[(i + 1) % 4])) != 0)
                                    && Math.signum(ex[i] * ey[(i + 1) % 4] - ey[i] * ex[(i + 1) % 4]) == signArr[0])
                                ? String.format("YES%n%.9f %.9f %.9f %.9f %.9f %.9f %.9f %.9f", a[0], a[1], b[0], b[1], c[0], c[1], d[0], d[1])
                                : "NO")
                        : "NO")
                : "NO").collect(Collectors.joining("\n"))
            : "");
    }
}



