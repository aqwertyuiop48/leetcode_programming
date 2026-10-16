import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))).ifPresent(txt -> System.out.println(
            new StringTokenizer(txt) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni
            && IntStream.range(0, 3).mapToObj(z -> (Integer) ni.getAsInt() instanceof Integer c
                ? IntStream.range(0, c).mapToObj(i -> new long[]{ni.getAsInt(), ni.getAsInt()}).toArray(long[][]::new)
                : new long[0][]).toArray(long[][][]::new) instanceof long[][][] polys
            && (Long) Arrays.stream(polys).mapToLong(v -> Arrays.stream(v).min(Comparator.<long[]>comparingLong(q -> q[1]).thenComparingLong(q -> q[0])).get()[0]).sum() instanceof Long sx
            && (Long) Arrays.stream(polys).mapToLong(v -> Arrays.stream(v).min(Comparator.<long[]>comparingLong(q -> q[1]).thenComparingLong(q -> q[0])).get()[1]).sum() instanceof Long sy
            && ((ToIntFunction<long[]>) e -> e[1] > 0 || e[1] == 0 && e[0] > 0 ? 0 : 1) instanceof ToIntFunction<long[]> half
            && Arrays.stream(polys).flatMap(v -> (Long) IntStream.range(0, v.length).mapToLong(i -> v[i][0] * v[(i + 1) % v.length][1] - v[(i + 1) % v.length][0] * v[i][1]).sum() instanceof Long area
                ? IntStream.range(0, v.length).mapToObj(i -> new long[]{(area > 0 ? 1 : -1) * (v[(i + 1) % v.length][0] - v[i][0]), (area > 0 ? 1 : -1) * (v[(i + 1) % v.length][1] - v[i][1])})
                : Stream.<long[]>empty())
                .sorted((a, b) -> half.applyAsInt(a) != half.applyAsInt(b) ? half.applyAsInt(a) - half.applyAsInt(b) : Long.compare(0, a[0] * b[1] - a[1] * b[0]))
                .toList() instanceof List<long[]> es
            && new ArrayList<long[]>() instanceof ArrayList<long[]> mg
            && es.stream().allMatch(e -> !mg.isEmpty() && mg.get(mg.size() - 1) instanceof long[] lt
                && lt[0] * e[1] - lt[1] * e[0] == 0 && lt[0] * e[0] + lt[1] * e[1] > 0
                ? (lt[0] += e[0]) * 0 == (lt[1] += e[1]) * 0
                : mg.add(new long[]{e[0], e[1]}))
            && (Integer) mg.size() instanceof Integer m
            && IntStream.range(0, m).mapToObj(j -> new long[]{sx, sy}).toArray(long[][]::new) instanceof long[][] vt
            && IntStream.range(1, m).allMatch(j -> (vt[j][0] = vt[j - 1][0] + mg.get(j - 1)[0]) * 0 == (vt[j][1] = vt[j - 1][1] + mg.get(j - 1)[1]) * 0)
            && ((ToLongBiFunction<long[], long[]>) (u, w) -> u[0] * w[1] - u[1] * w[0]) instanceof ToLongBiFunction<long[], long[]> cr
            && ((BinaryOperator<long[]>) (u, w) -> new long[]{u[0] - w[0], u[1] - w[1]}) instanceof BinaryOperator<long[]> sb
            && (Integer) ni.getAsInt() instanceof Integer qn
            ? IntStream.range(0, qn).mapToObj(z -> new long[]{3L * ni.getAsInt() - vt[0][0], 3L * ni.getAsInt() - vt[0][1]} instanceof long[] qv
                && cr.applyAsLong(sb.apply(vt[1], vt[0]), qv) >= 0
                && cr.applyAsLong(sb.apply(vt[m - 1], vt[0]), qv) <= 0
                && new int[]{1, m - 2} instanceof int[] lh
                && IntStream.range(0, 20).allMatch(it -> lh[0] >= lh[1]
                    || ((Integer) ((lh[0] + lh[1] + 1) / 2) instanceof Integer mid && cr.applyAsLong(sb.apply(vt[mid], vt[0]), qv) >= 0
                        ? (lh[0] = mid) : (lh[1] = (lh[0] + lh[1] + 1) / 2 - 1)) >= 0)
                && cr.applyAsLong(sb.apply(vt[lh[0] + 1], vt[lh[0]]), sb.apply(qv, sb.apply(vt[lh[0]], vt[0]))) >= 0
                ? "YES" : "NO").collect(Collectors.joining("\n"))
            : ""));
    }
}



