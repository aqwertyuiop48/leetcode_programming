import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(s -> !s.isEmpty()).toArray(String[]::new) instanceof String[] w
            && Long.valueOf(w[1]) instanceof Long x && Integer.valueOf(w[2]) instanceof Integer h
            ? (w[0].equals("Bob") || x <= 1 ? String.format(Locale.ROOT, "%.9f", w[0].equals("Bob") ? (double) x : 1.0)
                : Integer.valueOf(Math.min(h + 1, 34 + 64 - Long.numberOfLeadingZeros(x))) instanceof Integer L
                && IntStream.rangeClosed(0, L + 2).mapToDouble(i -> i >= 1 && i <= L ? Math.pow(0.5, i - 1) : 0.0).toArray() instanceof double[] G
                && Integer.valueOf(L * (L + 1) / 2) instanceof Integer tot
                && IntStream.range(0, tot).map(k -> (int) ((1 + Math.sqrt(1 + 8.0 * k)) / 2)).toArray() instanceof int[] cc
                && IntStream.range(0, tot).map(k -> k - cc[k] * (cc[k] - 1) / 2 + 1).toArray() instanceof int[] aa
                && IntStream.range(0, tot).mapToDouble(k -> 1 - G[cc[k] + 1]).toArray() instanceof double[] Fc
                && IntStream.range(0, tot).mapToDouble(k -> (G[aa[k]] - G[aa[k] + 1]) / Fc[k]).toArray() instanceof double[] Pc
                && IntStream.range(0, tot).mapToDouble(k -> (G[aa[k]] - G[cc[k] + 1]) / Fc[k]).toArray() instanceof double[] Gc
                && IntStream.range(0, tot).mapToDouble(k -> 1 - Gc[k]).toArray() instanceof double[] q1
                && IntStream.range(0, tot).mapToDouble(k -> (1 - G[aa[k] + 1]) / Fc[k]).toArray() instanceof double[] q2
                && IntStream.range(0, tot).mapToDouble(k -> Math.pow(2.0, aa[k] - 1)).toArray() instanceof double[] p2
                && IntStream.range(0, tot).map(k -> aa[k] * (aa[k] + 1) / 2 - 1).toArray() instanceof int[] dg
                && IntStream.range(0, tot).boxed().sorted(Comparator.<Integer>comparingInt(k -> cc[k]).thenComparing(k -> -aa[k])).mapToInt(k -> k).toArray() instanceof int[] ordB
                && new double[tot] instanceof double[] E && new double[tot] instanceof double[] T && new double[tot] instanceof double[] S && new double[tot] instanceof double[] Y
                && DoubleStream.generate(() -> 1.0).limit(tot).toArray() instanceof double[] pw && new double[]{0} instanceof double[] acc
                && LongStream.range(1, x).allMatch(r -> IntStream.range(0, tot).allMatch(k -> (S[k] = q1[k] * S[k] + pw[k] * Pc[k] * (p2[k] + E[dg[k]])) >= 0 && (S[k] = S[k] < 1e-250 ? 0 : S[k]) >= 0
                        && (pw[k] *= q2[k]) >= 0 && (pw[k] = pw[k] < 1e-250 ? 0 : pw[k]) >= 0)
                    && Arrays.stream(ordB).allMatch(k -> (acc[0] = (aa[k] == cc[k] ? 0 : acc[0]) + Pc[k] * E[k]) >= 0 && (Y[k] = p2[k] * Gc[k] + acc[0]) >= 0)
                    && IntStream.range(0, tot).allMatch(k -> (T[k] = Y[k] + q1[k] * T[k]) >= 0 && (E[k] = T[k] + (aa[k] == 1 ? (acc[0] = 0) : acc[0])) >= 0 && (acc[0] += S[k]) >= 0))
                ? String.format(Locale.ROOT, "%.9f", 1 + IntStream.rangeClosed(1, L).mapToDouble(a -> (G[a] - G[a + 1]) * E[L * (L - 1) / 2 + a - 1]).sum()) : "") : "");
    }
}
