import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] t && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length + 1).filter(i -> (i < raw.length && raw[i] > 47) ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (st[3] = 1) > 0
                : st[1] == 1 && (t[st[2]++] = st[3] == 1 ? -st[0] : st[0]) * 0 + (st[0] = 0) + (st[1] = 0) + (st[3] = 0) == 0).count() >= 0
            && Double.valueOf(1.0 * t[2] * t[3]) instanceof Double R && Integer.valueOf(t[4]) instanceof Integer n
            && IntStream.range(0, n).noneMatch(i -> (long) (t[5 + 3 * i] - t[0]) * (t[5 + 3 * i] - t[0]) + (long) (t[6 + 3 * i] - t[1]) * (t[6 + 3 * i] - t[1]) <= (long) t[7 + 3 * i] * t[7 + 3 * i])
            ? ((new double[2 * n + 2][] instanceof double[][] iv && new int[]{0} instanceof int[] cnt
                && ((BiPredicate<Double, Double>) (x, y) -> (iv[cnt[0]++] = new double[]{x, y}) != null) instanceof BiPredicate<Double, Double> add
                && IntStream.range(0, n).filter(i -> Double.valueOf(t[5 + 3 * i] - t[0]) instanceof Double dx && Double.valueOf(t[6 + 3 * i] - t[1]) instanceof Double dy && Double.valueOf(t[7 + 3 * i]) instanceof Double r
                    && Double.valueOf(Math.sqrt(dx * dx + dy * dy)) instanceof Double d && d < R + r
                    && Double.valueOf(R * R >= d * d - r * r ? Math.asin(r / d) : Math.acos(Math.max(-1.0, Math.min(1.0, (d * d + R * R - r * r) / (2 * d * R))))) instanceof Double al
                    && Double.valueOf(Math.atan2(dy, dx)) instanceof Double c
                    && (c - al >= -Math.PI ? true : (add.test(c - al + 2 * Math.PI, Math.PI) && add.test(-Math.PI, c + al)))
                    && (c + al <= Math.PI ? (c - al < -Math.PI ? true : add.test(c - al, c + al)) : (add.test(c - al, Math.PI) && add.test(-Math.PI, c + al - 2 * Math.PI)))).count() >= 0
                && Stream.of(0).peek(z -> Arrays.sort(iv, 0, cnt[0], Comparator.comparingDouble((double[] q) -> q[0]))).findFirst().isPresent()
                && new double[]{0, -10, -10} instanceof double[] m
                && IntStream.range(0, cnt[0]).filter(k -> iv[k][0] > m[2] ? (m[0] += m[2] - m[1]) * 0 + (m[1] = iv[k][0]) * 0 + (m[2] = iv[k][1]) == iv[k][1] : (m[2] = Math.max(m[2], iv[k][1])) >= -100).count() >= 0)
                ? String.format("%.10f", Math.min(1.0, (m[0] + m[2] - m[1]) / (2 * Math.PI))) : "")
            : "1.0000000000");
    }
}
