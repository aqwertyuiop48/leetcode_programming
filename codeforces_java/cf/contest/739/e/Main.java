import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer a
            && Integer.valueOf(sc.nextInt()) instanceof Integer b
            && IntStream.range(0, n).mapToLong(i -> Math.round(Double.parseDouble(sc.next()) * 1000) * 1000000L).toArray() instanceof long[] P
            && IntStream.range(0, n).mapToLong(i -> Math.round(Double.parseDouble(sc.next()) * 1000) * 1000000L).toArray() instanceof long[] U
            && IntStream.range(0, n).mapToLong(i -> P[i] + U[i] - P[i] / 1000 * (U[i] / 1000) / 1000).toArray() instanceof long[] B
            && ((LongUnaryOperator) lam -> new long[a + 1] instanceof long[] d
                && IntStream.range(0, n).allMatch(i -> IntStream.range(0, a + 1).map(j -> a - j).allMatch(j ->
                    (d[j] = Math.max(Math.max(d[j], d[j] + (U[i] - lam) * 4096 + 1),
                        j > 0 ? Math.max(d[j - 1] + P[i] * 4096, d[j - 1] + (B[i] - lam) * 4096 + 1) : Long.MIN_VALUE)) > Long.MIN_VALUE)) ? d[a] : 0) instanceof LongUnaryOperator ev
            && new long[]{0, 1000000000L} instanceof long[] r
            && IntStream.range(0, 32).allMatch(t -> r[0] >= r[1]
                || ((Math.floorMod(ev.applyAsLong((r[0] + r[1]) / 2), 4096L) <= b ? (r[1] = (r[0] + r[1]) / 2) : (r[0] = (r[0] + r[1]) / 2 + 1)) >= 0))
            && Long.valueOf(Math.min(Math.floorDiv(ev.applyAsLong(r[0]), 4096L) + r[0] * b,
                r[0] > 0 ? Math.floorDiv(ev.applyAsLong(r[0] - 1), 4096L) + (r[0] - 1) * b : Long.MAX_VALUE)) instanceof Long best
            ? String.format(Locale.US, "%.9f", best / 1e9) : "");
    }
}
