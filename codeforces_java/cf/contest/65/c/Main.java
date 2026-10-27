import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && IntStream.range(0, 3 * (n + 1) + 5).mapToDouble(i -> Double.parseDouble(tk[1 + i])).toArray() instanceof double[] v
            && Double.valueOf(v[3 * (n + 1)]) instanceof Double vp
            && Double.valueOf(v[3 * (n + 1) + 1]) instanceof Double vs
            && new double[]{v[3 * (n + 1) + 2], v[3 * (n + 1) + 3], v[3 * (n + 1) + 4]} instanceof double[] hp
            && new double[n + 1] instanceof double[] cum
            && IntStream.rangeClosed(1, n).allMatch(i ->
                (cum[i] = cum[i - 1] + Math.sqrt((v[3 * i] - v[3 * i - 3]) * (v[3 * i] - v[3 * i - 3])
                    + (v[3 * i + 1] - v[3 * i - 2]) * (v[3 * i + 1] - v[3 * i - 2])
                    + (v[3 * i + 2] - v[3 * i - 1]) * (v[3 * i + 2] - v[3 * i - 1]))) >= 0)
            && ((DoubleFunction<double[]>) t ->
                Double.valueOf(Math.min(t * vs, cum[n])) instanceof Double s
                && Integer.valueOf(Arrays.binarySearch(cum, s)) instanceof Integer r
                && Integer.valueOf(Math.max(0, Math.min(n - 1, r >= 0 ? r : -r - 2))) instanceof Integer sg
                && Double.valueOf(cum[sg + 1] - cum[sg] > 0 ? (s - cum[sg]) / (cum[sg + 1] - cum[sg]) : 0.0) instanceof Double fr
                ? IntStream.range(0, 3).mapToDouble(c -> v[3 * sg + c] + fr * (v[3 * sg + 3 + c] - v[3 * sg + c])).toArray()
                : new double[3]) instanceof DoubleFunction<double[]> pos
            && ((DoublePredicate) t -> pos.apply(t) instanceof double[] w
                && Math.sqrt((w[0] - hp[0]) * (w[0] - hp[0]) + (w[1] - hp[1]) * (w[1] - hp[1]) + (w[2] - hp[2]) * (w[2] - hp[2])) <= vp * t + 1e-11 * (1 + vp * t)) instanceof DoublePredicate ok
            && new double[]{0, cum[n] / vs} instanceof double[] lh
            ? (!ok.test(lh[1])
                ? "NO"
                : IntStream.range(0, 100).allMatch(it -> Double.valueOf((lh[0] + lh[1]) / 2) instanceof Double m && (ok.test(m) ? (lh[1] = m) : (lh[0] = m)) >= 0)
                    && pos.apply(lh[1]) instanceof double[] ans
                    ? String.format(Locale.US, "YES\n%.10f\n%.10f %.10f %.10f", lh[1], ans[0], ans[1], ans[2])
                    : "")
            : "");
    }
}

