import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf((int) (long) it.next()) instanceof Integer n && new long[n][2] instanceof long[][] g
            && IntStream.range(0, n).allMatch(i -> (g[i][0] = it.next()) > Long.MIN_VALUE && (g[i][1] = it.next()) > Long.MIN_VALUE)
            && Integer.valueOf((int) (long) it.next()) instanceof Integer m && new long[m][2] instanceof long[][] p
            && IntStream.range(0, m).allMatch(i -> (p[i][0] = it.next()) > Long.MIN_VALUE && (p[i][1] = it.next()) > Long.MIN_VALUE)
            && Double.valueOf((double) Arrays.stream(g).mapToLong(a -> a[0]).sum() / n) instanceof Double cx
            && Double.valueOf((double) Arrays.stream(g).mapToLong(a -> a[1]).sum() / n) instanceof Double cy
            && Double.valueOf(Arrays.stream(g).mapToDouble(a -> (a[0] - cx) * (a[0] - cx) + (a[1] - cy) * (a[1] - cy)).sum()) instanceof Double s
            && Long.valueOf(IntStream.range(0, m).mapToLong(i -> p[i][0] * p[(i + 1) % m][1] - p[i][1] * p[(i + 1) % m][0]).sum()) instanceof Long area
            && Boolean.valueOf(IntStream.range(0, m).allMatch(i -> (p[(i + 1) % m][0] - p[i][0]) * (cy - p[i][1]) - (p[(i + 1) % m][1] - p[i][1]) * (cx - p[i][0]) >= 0)) instanceof Boolean pos
            && Boolean.valueOf(IntStream.range(0, m).allMatch(i -> (p[(i + 1) % m][0] - p[i][0]) * (cy - p[i][1]) - (p[(i + 1) % m][1] - p[i][1]) * (cx - p[i][0]) <= 0)) instanceof Boolean neg
            ? String.format(Locale.ROOT, "%.8f", s + (area > 0 && pos || area < 0 && neg ? 0.0 : n * IntStream.range(0, m).mapToDouble(i -> Double.valueOf(p[(i + 1) % m][0] - p[i][0]) instanceof Double dx && Double.valueOf(p[(i + 1) % m][1] - p[i][1]) instanceof Double dy
                && Double.valueOf(Math.max(0, Math.min(1, ((cx - p[i][0]) * dx + (cy - p[i][1]) * dy) / (dx * dx + dy * dy)))) instanceof Double t
                ? Math.pow(p[i][0] + t * dx - cx, 2) + Math.pow(p[i][1] + t * dy - cy, 2) : 0).min().getAsDouble())) : "");
    }
}
