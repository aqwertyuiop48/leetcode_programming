import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && (Integer) IntStream.range(0, raw.length).filter(i -> raw[i] == '\n').findFirst().getAsInt() instanceof Integer start
            && (Integer) Integer.parseInt(new String(raw, 0, start).trim()) instanceof Integer n && (Integer) (n * n) instanceof Integer nn
            && new byte[nn] instanceof byte[] px && new int[]{0} instanceof int[] k
            && IntStream.range(start, raw.length).filter(i -> raw[i] == '0' || raw[i] == '1').allMatch(i -> (px[k[0]++] = (byte) (raw[i] - '0')) >= 0)
            && new int[(n + 1) * (n + 1)] instanceof int[] ps
            && IntStream.range(0, nn).allMatch(t -> (ps[(t / n + 1) * (n + 1) + t % n + 1] = px[t] + ps[(t / n) * (n + 1) + t % n + 1] + ps[(t / n + 1) * (n + 1) + t % n] - ps[(t / n) * (n + 1) + t % n]) >= 0)
            && new byte[nn] instanceof byte[] dn
            && IntStream.range(0, nn).allMatch(t -> (Integer) Math.max(0, t / n - 2) instanceof Integer i0 && (Integer) Math.min(n, t / n + 3) instanceof Integer i1
                && (Integer) Math.max(0, t % n - 2) instanceof Integer j0 && (Integer) Math.min(n, t % n + 3) instanceof Integer j1
                && (dn[t] = (byte) (2 * (ps[i1 * (n + 1) + j1] - ps[i0 * (n + 1) + j1] - ps[i1 * (n + 1) + j0] + ps[i0 * (n + 1) + j0]) > (i1 - i0) * (j1 - j0) ? 1 : 0)) >= 0)
            && new boolean[nn] instanceof boolean[] seen && new int[nn] instanceof int[] q && new int[]{0, 0} instanceof int[] qs
            && new int[][]{{1, 0}, {0, 1}, {1, 1}, {1, -1}, {2, 1}, {1, 2}, {2, -1}, {1, -2}, {3, 1}, {1, 3}, {3, -1}, {1, -3}, {3, 2}, {2, 3}, {3, -2}, {2, -3}} instanceof int[][] dirs
            && ((IntUnaryOperator) c -> c >= 0 && dn[c] == 1 && !seen[c] && (seen[c] = true) && (q[qs[1]++] = c) >= 0 ? 1 : 0) instanceof IntUnaryOperator visit
            && IntStream.range(0, nn).filter(s -> dn[s] == 1 && !seen[s]).map(s -> (Integer) qs[1] instanceof Integer base && (qs[0] = base) >= 0 && visit.applyAsInt(s) == 1
                    && Stream.generate(() -> 0).takeWhile(z -> qs[0] < qs[1]).allMatch(z -> (Integer) q[qs[0]++] instanceof Integer p
                        && visit.applyAsInt(p >= n ? p - n : -1) + visit.applyAsInt(p + n < nn ? p + n : -1) + visit.applyAsInt(p % n > 0 ? p - 1 : -1) + visit.applyAsInt(p % n < n - 1 ? p + 1 : -1) >= 0)
                    && (Integer) (qs[1] - base) instanceof Integer area
                    ? area < 150 ? 0
                        : area / Arrays.stream(dirs).mapToDouble(d -> IntStream.range(base, qs[1]).map(t -> q[t] / n * d[0] + q[t] % n * d[1]).summaryStatistics() instanceof IntSummaryStatistics st
                            ? (st.getMax() - st.getMin() + 1.0) * (st.getMax() - st.getMin() + 1.0) / (d[0] * d[0] + d[1] * d[1]) : 0).max().getAsDouble() > 0.64 ? 1 : 2
                    : 0).toArray() instanceof int[] codes
            ? IntStream.of(codes).filter(c -> c == 1).count() + " " + IntStream.of(codes).filter(c -> c == 2).count() : "");
    }
}
