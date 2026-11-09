import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n
            && IntStream.range(0, 2 * n).mapToLong(i -> tk[1 + 2 * (i % n)] - tk[1]).toArray() instanceof long[] px
            && IntStream.range(0, 2 * n).mapToLong(i -> tk[2 + 2 * (i % n)] - tk[2]).toArray() instanceof long[] py
            && (Integer) Math.min(48, n - 2) instanceof Integer kk && (Integer) Math.min(n <= 10000 ? 48 : 38, n - 2) instanceof Integer kg
            && (Double) Math.signum((double) (px[1] * py[2] - px[2] * py[1])) instanceof Double sg
            && IntStream.rangeClosed(0, kk).mapToDouble(k -> (Math.pow(2, -(k + 2)) - Math.pow(2, -n)) / (1 - (1.0 + n + n * (n - 1.0) / 2) * Math.pow(2, -n))).toArray() instanceof double[] pr
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] g && (g[0] = (a, b) -> b == 0 ? a : g[0].applyAsInt(b, a % b)) != null
            && (Double) IntStream.rangeClosed(0, kk).mapToDouble(k -> pr[k] * sg * IntStream.range(0, n).mapToDouble(i -> px[i] * py[i + k + 1] - px[i + k + 1] * py[i]).sum() / 2.0).sum() instanceof Double area
            && (Double) (n <= 10000 ? 0.0 : 2e-10 * area / (46.0 * n)) instanceof Double tau
            ? String.format(Locale.ROOT, "%.9f", 1 + area - IntStream.rangeClosed(0, kg).mapToDouble(k -> pr[k] / 2.0 * IntStream.range(0, n).filter(i -> pr[k] * Math.max(Math.abs(px[i] - px[i + k + 1]), Math.abs(py[i] - py[i + k + 1])) >= tau)
                .mapToDouble(i -> g[0].applyAsInt((int) Math.abs(px[i] - px[i + k + 1]), (int) Math.abs(py[i] - py[i + k + 1]))).sum()).sum()) : "");
    }
}
