import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken())}).toArray(long[][]::new) instanceof long[][] raw
            && Arrays.stream(raw).map(p -> new long[]{p[0] - raw[0][0], p[1] - raw[0][1]}).toArray(long[][]::new) instanceof long[][] p
            && (Integer) Math.min(26, n - 2) instanceof Integer kk
            && IntStream.rangeClosed(0, kk).mapToDouble(k -> (Math.pow(2, -(k + 2)) - Math.pow(2, -n)) / (1 - (1.0 + n + n * (n - 1.0) / 2) * Math.pow(2, -n))).toArray() instanceof double[] pr
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] g && (g[0] = (a, b) -> b == 0 ? a : g[0].applyAsLong(b, a % b)) != null
            && (Double) IntStream.range(0, n).mapToDouble(i -> IntStream.rangeClosed(0, kk).mapToDouble(k -> pr[k] * (p[i][0] * p[(i + k + 1) % n][1] - p[(i + k + 1) % n][0] * p[i][1]) / 2.0).sum()).sum() instanceof Double area
            && (Double) IntStream.range(0, n).mapToDouble(i -> IntStream.rangeClosed(0, kk).mapToDouble(k -> pr[k] * g[0].applyAsLong(Math.abs(p[i][0] - p[(i + k + 1) % n][0]), Math.abs(p[i][1] - p[(i + k + 1) % n][1]))).sum()).sum() instanceof Double bd
            ? String.format(Locale.ROOT, "%.9f", Math.abs(area) - bd / 2 + 1) : "");
    }
}
