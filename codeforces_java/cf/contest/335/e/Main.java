import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String who && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer h
            && ((IntToDoubleFunction) v -> v <= h ? Math.pow(2, -v) : Math.pow(2, -h)) instanceof IntToDoubleFunction pv
            && ((IntToDoubleFunction) v -> v == 0 ? 0 : v <= h ? 1 - Math.pow(2, -v) : 1) instanceof IntToDoubleFunction sv
            ? who.equals("Alice")
                ? String.format("%.9f", 1 + IntStream.rangeClosed(1, h + 1).mapToDouble(v -> Math.pow(2, v - 1) * pv.applyAsDouble(v) * (IntStream.range(1, n).mapToDouble(k -> Math.pow(sv.applyAsDouble(v), k - 1) * (1 - Math.pow(sv.applyAsDouble(v - 1), n - k))).sum()
                    + IntStream.range(2, n + 1).mapToDouble(j -> Math.pow(sv.applyAsDouble(v), n - j) * (1 - Math.pow(sv.applyAsDouble(v), j - 1))).sum())).sum())
                : Integer.valueOf(IntStream.rangeClosed(1, h + 1).filter(u -> (1L << (u - 1)) <= n).max().orElse(0)) instanceof Integer K
                    && new HashMap<Integer, double[][]>() instanceof HashMap<Integer, double[][]> memoPhi && new HashMap<Integer, double[][]>() instanceof HashMap<Integer, double[][]> memoPsi
                    && ((BiFunction<double[][], Integer, double[][]>) (R, m) -> new double[2][n + 1] instanceof double[][] S
                        && IntStream.iterate(Math.min(m, K), u -> u >= 1, u -> u - 1).allMatch(u -> Integer.valueOf(1 << (u - 1)) instanceof Integer d && Double.valueOf(pv.applyAsDouble(u)) instanceof Double p
                            && Double.valueOf(1 / (1 - sv.applyAsDouble(u - 1))) instanceof Double i0 && Double.valueOf(sv.applyAsDouble(u - 1) * i0 * i0) instanceof Double i1
                            && new double[2][n + 1] instanceof double[][] T
                            && IntStream.rangeClosed(0, n).allMatch(c -> Double.valueOf(R[0][c] + S[0][c] + (c >= d ? p * T[0][c - d] : 0)) instanceof Double n0
                                && Double.valueOf(R[1][c] + S[0][c] + S[1][c] + (c >= d ? p * (T[0][c - d] + T[1][c - d]) : 0)) instanceof Double n1
                                && (T[0][c] = n0 * i0) >= 0 && (T[1][c] = n0 * i1 + n1 * i0) >= 0)
                            && IntStream.rangeClosed(d, n).allMatch(c -> (S[0][c] += p * T[0][c - d]) >= 0 && (S[1][c] += p * T[1][c - d]) >= 0))
                        ? new double[][]{IntStream.rangeClosed(0, n).mapToDouble(c -> R[0][c] + S[0][c]).toArray(), IntStream.rangeClosed(0, n).mapToDouble(c -> R[1][c] + S[0][c] + S[1][c]).toArray()} : null) instanceof BiFunction<double[][], Integer, double[][]> phiMul
                    && new double[2][n + 1] instanceof double[][] one && (one[0][0] = 1) == 1
                    ? IntStream.rangeClosed(1, h + 1).mapToObj(M -> Integer.valueOf(Math.min(M - 1, K)) instanceof Integer mm
                        && memoPhi.computeIfAbsent(mm, q -> phiMul.apply(one, q)) instanceof double[][] phi
                        && memoPsi.computeIfAbsent(mm, q -> phiMul.apply(memoPhi.get(q), q)) instanceof double[][] psi
                        && Double.valueOf(pv.applyAsDouble(M)) instanceof Double p && Double.valueOf(1 / (1 - sv.applyAsDouble(M - 1))) instanceof Double g0 && Double.valueOf(sv.applyAsDouble(M - 1) * g0 * g0) instanceof Double g1
                        && Double.valueOf(g0 * p) instanceof Double w0 && Double.valueOf(g0 * p + g1 * p) instanceof Double w1 && Long.valueOf(1L << (M - 1)) instanceof Long d
                        && new double[2][n] instanceof double[][] D
                        && IntStream.range(0, n).allMatch(c -> (D[0][c] = p * psi[0][c] + (c >= d ? w0 * D[0][c - (int) (long) d] : 0)) >= 0
                            && (D[1][c] = p * (psi[1][c] + psi[0][c]) + (c >= d ? w0 * D[1][c - (int) (long) d] + w1 * D[0][c - (int) (long) d] : 0)) >= 0)
                        ? new double[]{D[0][n - 1], D[1][n - 1]} : new double[2]).reduce(new double[2], (x, y) -> new double[]{x[0] + y[0], x[1] + y[1]}) instanceof double[] tot
                        ? String.format("%.9f", tot[1] / tot[0]) : ""
                    : "" : "");
    }
}
