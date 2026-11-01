import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 && raw[i] <= 57
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[1] = 1) > 0
                : st[1] == 0 || (v[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n
            && Integer.valueOf(v[1 + n]) instanceof Integer q
            && Integer.valueOf(2 + n) instanceof Integer base
            && IntStream.range(0, n).map(i -> v[1 + i]).toArray() instanceof int[] a
            && Integer.valueOf(Arrays.stream(a).max().getAsInt()) instanceof Integer ma
            && IntStream.range(0, n).mapToObj(i -> new double[ma + 12]).toArray(double[][]::new) instanceof double[][] p
            && IntStream.range(0, n).allMatch(i -> (p[i][a[i]] = 1) == 1)
            && new double[][]{new double[ma + 12]} instanceof double[][] hold
            && a.clone() instanceof int[] t
            && ((DoubleBinaryOperator) (nn, r) -> r < 0 || nn < r ? 0 : r == 0 ? 1 : r == 1 ? nn : r == 2 ? nn * (nn - 1) / 2 : r == 3 ? nn * (nn - 1) * (nn - 2) / 6 : r == 4 ? nn * (nn - 1) * (nn - 2) * (nn - 3) / 24 : nn * (nn - 1) * (nn - 2) * (nn - 3) * (nn - 4) / 120) instanceof DoubleBinaryOperator cb
            && new double[1] instanceof double[] inv
            && new double[]{IntStream.range(0, n).filter(i -> a[i] == 0).count()} instanceof double[] zero
            && new double[q] instanceof double[] out
            && new int[8] instanceof int[] s
            && (IntStream.range(0, q * (ma + 9)).allMatch(z ->
                s[3] == 0
                    ? (s[4] = v[base + 3 * s[0]] - 1) >= 0 && (s[5] = v[base + 3 * s[0] + 1] - 1) >= 0 && (s[6] = v[base + 3 * s[0] + 2]) > 0
                        && (inv[0] = 1.0 / cb.applyAsDouble(t[s[4]], s[6])) > 0 && (s[1] = 0) == 0 && (s[3] = 1) == 1
                    : s[3] == 1
                        ? (s[1] > a[s[4]]
                            ? (hold[0][s[1]] = 0) == 0
                            : (hold[0][s[1]] = inv[0] * (
                                p[s[4]][s[1]] * cb.applyAsDouble(Math.max(0, t[s[4]] - s[1]), s[6])
                                + p[s[4]][s[1] + 1] * (s[1] + 1) * cb.applyAsDouble(Math.max(0, t[s[4]] - s[1] - 1), s[6] - 1)
                                + p[s[4]][s[1] + 2] * cb.applyAsDouble(s[1] + 2, 2) * cb.applyAsDouble(Math.max(0, t[s[4]] - s[1] - 2), s[6] - 2)
                                + p[s[4]][s[1] + 3] * cb.applyAsDouble(s[1] + 3, 3) * cb.applyAsDouble(Math.max(0, t[s[4]] - s[1] - 3), s[6] - 3)
                                + p[s[4]][s[1] + 4] * cb.applyAsDouble(s[1] + 4, 4) * cb.applyAsDouble(Math.max(0, t[s[4]] - s[1] - 4), s[6] - 4)
                                + p[s[4]][s[1] + 5] * cb.applyAsDouble(s[1] + 5, 5) * cb.applyAsDouble(Math.max(0, t[s[4]] - s[1] - 5), s[6] - 5))) >= 0)
                            && (++s[1] <= a[s[4]] + 5 || (s[3] = 2) == 2)
                        : (zero[0] += hold[0][0] - p[s[4]][0]) > -1e18 && (t[s[4]] -= s[6]) >= 0 && (t[s[5]] += s[6]) > 0
                            && (out[s[0]] = zero[0]) > -1e18
                            && Stream.of(p[s[4]]).peek(old -> p[s[4]] = hold[0]).peek(old -> hold[0] = old).findFirst().isPresent()
                            && ++s[0] > 0 && (s[3] = 0) == 0 && s[0] < q) || true)
            ? Arrays.stream(out).mapToObj(d -> Long.valueOf(Math.round(d * 1e12)) instanceof Long sc ? (sc / 1000000000000L) + "." + ("000000000000" + (sc % 1000000000000L)).substring(String.valueOf(sc % 1000000000000L).length()) : "").collect(Collectors.joining("\n")) : "");
    }
}
