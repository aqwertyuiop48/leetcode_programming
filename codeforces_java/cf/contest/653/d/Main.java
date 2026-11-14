import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer m && Long.valueOf(st.nextToken()) instanceof Long x
            && new int[m] instanceof int[] eu && new int[m] instanceof int[] ev && new double[m] instanceof double[] ec
            && IntStream.range(0, m).filter(e -> (eu[e] = Integer.parseInt(st.nextToken()) - 1) + (ev[e] = Integer.parseInt(st.nextToken()) - 1) + (long) (ec[e] = Double.parseDouble(st.nextToken())) < 0).count() == 0
            && new long[n][n] instanceof long[][] cap && new int[n] instanceof int[] prev && new int[n] instanceof int[] q && new int[1] instanceof int[] tl && new long[1] instanceof long[] fl
            && ((DoublePredicate) w -> IntStream.of(0).peek(z -> Arrays.stream(cap).forEach(r -> Arrays.fill(r, 0L)))
                    .peek(z -> IntStream.range(0, m).forEach(e -> cap[eu[e]][ev[e]] += Math.min(x, (long) (ec[e] / w))))
                    .peek(z -> fl[0] = 0).sum() == 0
                && IntStream.range(0, 1000000).takeWhile(r -> fl[0] < x
                    && IntStream.of(0).peek(z -> Arrays.fill(prev, -1)).peek(z -> q[0] = prev[0] = 0).peek(z -> tl[0] = 1)
                        .peek(z -> IntStream.range(0, n).takeWhile(i -> i < tl[0] && prev[n - 1] < 0)
                            .forEach(i -> IntStream.range(0, n).filter(v -> prev[v] < 0 && cap[q[i]][v] > 0).forEach(v -> q[tl[0]++] = (prev[v] = q[i]) * 0 + v))).sum() == 0
                    && prev[n - 1] >= 0)
                    .filter(r -> Long.valueOf(IntStream.iterate(n - 1, v -> v != 0, v -> prev[v]).mapToLong(v -> cap[prev[v]][v]).min().getAsLong()) instanceof Long bn
                        && IntStream.iterate(n - 1, v -> v != 0, v -> prev[v]).peek(v -> cap[v][prev[v]] += (cap[prev[v]][v] -= bn) * 0 + bn).count() + (fl[0] += bn) < 0).count() == 0
                && fl[0] >= x) instanceof DoublePredicate ok
            && new double[]{0, 1000001} instanceof double[] d
            && IntStream.range(0, 64).filter(i -> Double.valueOf((d[0] + d[1]) / 2) instanceof Double mid && (ok.test(mid) ? (d[0] = mid) < 0 : (d[1] = mid) < 0)).count() == 0
            ? String.format(Locale.ROOT, "%.9f", x * d[0]) : "");
    }
}
