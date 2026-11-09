import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 3] instanceof long[] a
            && new long[]{0, 0, 0, 0} instanceof long[] ps
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) * 0 + (ps[1] = 1) : raw[i] == 45 ? (ps[3] = 1) : ps[1] == 1 ? (a[(int) ps[2]++] = ps[3] == 1 ? -ps[0] : ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) + (ps[3] = 0) : 0) >= 0).count() >= 0
            && (Integer) (int) a[0] instanceof Integer n
            && new double[n] instanceof double[] ang
            && IntStream.range(0, n).filter(i -> (ang[i] = Math.atan2(a[3 * i + 1] < 0 || (a[3 * i + 1] == 0 && a[3 * i + 2] > 0) ? -a[3 * i + 1] : a[3 * i + 1], a[3 * i + 1] < 0 || (a[3 * i + 1] == 0 && a[3 * i + 2] > 0) ? a[3 * i + 2] : -a[3 * i + 2])) * 0 == 0).count() >= 0
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble(i -> ang[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && IntStream.range(0, n).mapToDouble(k -> (double) a[3 * ord[k] + 1]).toArray() instanceof double[] A
            && IntStream.range(0, n).mapToDouble(k -> (double) a[3 * ord[k] + 2]).toArray() instanceof double[] B
            && IntStream.range(0, n).mapToDouble(k -> (double) a[3 * ord[k] + 3]).toArray() instanceof double[] C
            ? String.format(Locale.ROOT, "%.15f", IntStream.range(0, n).mapToDouble(L -> (Double) (A[L] * A[L] + B[L] * B[L]) instanceof Double r2
                ? IntStream.range(0, n).filter(m -> m != L).mapToDouble(m -> (2.0 * (m - L) + (m < L ? n : -n)) * C[L] * (C[m] * r2 - C[L] * (A[L] * A[m] + B[L] * B[m])) / ((A[L] * B[m] - A[m] * B[L]) * r2)).sum() : 0.0).sum() / 2 / ((double) n * (n - 1) * (n - 2) / 6)) : "");
    }
}
