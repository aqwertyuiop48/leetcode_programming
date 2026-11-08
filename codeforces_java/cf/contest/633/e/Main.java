import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : k > 0 && raw[k - 1] > 47 && raw[k - 1] < 58 && (v[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n && Integer.valueOf((int) v[1]) instanceof Integer k
            && new int[n] instanceof int[] p && new long[]{0} instanceof long[] cur
            && IntStream.range(0, n).allMatch(t -> Integer.valueOf(n - 1 - t) instanceof Integer l
                && (p[l] = (int) (cur[0] = Math.max(Math.min(100 * v[2 + l], v[n + 2 + l]), Math.min(v[n + 2 + l], cur[0])))) >= 0)
            && Stream.of(0).peek(z -> Arrays.sort(p)).findFirst().isPresent()
            && new double[]{(double) k / n, 0} instanceof double[] ac
            && IntStream.rangeClosed(1, n).allMatch(i -> (ac[1] += ac[0] * p[i - 1]) + (ac[0] = ac[0] * (n - i - k + 1) / (n - i)) > Double.NEGATIVE_INFINITY || true)
            ? String.format(Locale.US, "%.9f", ac[1]) : "");
    }
}
