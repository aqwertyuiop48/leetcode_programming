import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> (long) v[3 + 2 * i] - v[1]).toArray() instanceof long[] X
            && IntStream.range(0, n).mapToLong(i -> (long) v[4 + 2 * i] - v[2]).toArray() instanceof long[] Y
            && (Long) IntStream.range(0, n).mapToLong(i -> X[i] * X[i] + Y[i] * Y[i]).max().getAsLong() instanceof Long rmax
            && ((IntFunction<long[]>) i -> Integer.valueOf((i + 1) % n) instanceof Integer k
                && Long.valueOf(X[k] - X[i]) instanceof Long dx && Long.valueOf(Y[k] - Y[i]) instanceof Long dy
                ? (X[i] * dx + Y[i] * dy >= 0 ? new long[]{0, X[i] * X[i] + Y[i] * Y[i], 1}
                    : X[k] * dx + Y[k] * dy <= 0 ? new long[]{0, X[k] * X[k] + Y[k] * Y[k], 1}
                    : new long[]{1, X[i] * dy - Y[i] * dx, dx * dx + dy * dy}) : null) instanceof IntFunction<long[]> g
            && IntStream.range(0, n).boxed().min(Comparator.comparingDouble(i -> g.apply(i)[0] == 0 ? (double) g.apply(i)[1] : (double) g.apply(i)[1] * g.apply(i)[1] / g.apply(i)[2])).get() instanceof Integer i0
            && g.apply(i0) instanceof long[] w
            ? new BigDecimal("3.14159265358979323846264338327950288419716939937510")
                .multiply(BigDecimal.valueOf(rmax).subtract(w[0] == 0 ? BigDecimal.valueOf(w[1]) : new BigDecimal(BigInteger.valueOf(w[1]).pow(2)).divide(BigDecimal.valueOf(w[2]), new MathContext(60))))
                .setScale(9, RoundingMode.HALF_UP).toPlainString() : "");
    }
}
