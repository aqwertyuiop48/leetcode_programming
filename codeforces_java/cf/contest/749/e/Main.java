import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sc && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer n
            && new int[n + 1] instanceof int[] p && IntStream.rangeClosed(1, n).filter(i -> (p[i] = Integer.parseInt(sc.nextToken())) > 0).count() >= 0
            && new double[n + 2] instanceof double[] b0 && new double[n + 2] instanceof double[] b1 && new double[n + 2] instanceof double[] b2 && new double[1] instanceof double[] acc
            && new double[3] instanceof double[] r
            && IntStream.rangeClosed(1, n).filter(j -> (r[0] = r[1] = r[2] = 0) == 0
                && IntStream.iterate(n - p[j], k -> k > 0, k -> k - (k & -k)).filter(k -> (r[0] += b0[k]) >= 0 && (r[1] += b1[k]) >= 0 && (r[2] += b2[k]) >= 0).count() >= 0
                && (Double) r[0] instanceof Double c && (Double) r[1] instanceof Double s1 && (Double) r[2] instanceof Double s2
                && (Double) (double) (n - j) instanceof Double m
                && (Double) (c * j - s1) instanceof Double sd && (Double) (c * (double) j * j - 2.0 * j * s1 + s2) instanceof Double sd2
                && (acc[0] += (s2 - s1) / 2 + c * m * (m + 1) / 2 + (n + 1) * sd - (sd2 + sd) / 2 + (n - j + 1) / 2.0 * ((double) j * (j - 1) / 2)) > Double.NEGATIVE_INFINITY
                && IntStream.iterate(n + 1 - p[j], k -> k <= n, k -> k + (k & -k)).filter(k -> (b0[k] += 1) > 0 && (b1[k] += j) > 0 && (b2[k] += (double) j * j) > 0).count() >= 0).count() >= 0
            ? String.format(Locale.US, "%.9f", acc[0] / ((double) n * (n + 1) / 2)) : "");
    }
}
