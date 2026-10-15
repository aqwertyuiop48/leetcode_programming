import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.next().trim()).ifPresent(raw ->
            System.out.println(
                IntStream.range(0, raw.length()).mapToObj(i -> (i > 0 && raw.charAt(i) != 'X' && raw.charAt(i) == raw.charAt(i - 1) ? "X" : "") + raw.charAt(i)).collect(Collectors.joining()) instanceof String t
                && (Long) t.chars().filter(c -> c != 'X').count() instanceof Long steps
                && (t.charAt(0) == t.charAt(t.length() - 1) && t.charAt(0) != 'X' ? List.of(t + "X", "X" + t) : List.of(t)) instanceof List<String> variants
                && ((ToLongFunction<char[]>) cs ->
                    Stream.iterate(new long[]{0, 1, 0}, st -> st[2] == 0, st ->
                        new double[]{(double) st[0] / st[1]} instanceof double[] lam
                        && new double[]{0, Double.NEGATIVE_INFINITY} instanceof double[] f
                        && new long[]{0, 0} instanceof long[] pk
                        && IntStream.range(0, cs.length).allMatch(i ->
                            (Boolean) (f[1] - lam[0] > f[0]) instanceof Boolean u0
                            && (Boolean) (f[0] - lam[0] > f[1]) instanceof Boolean u1
                            && new double[]{u0 ? f[1] - lam[0] : f[0], u1 ? f[0] - lam[0] : f[1]} instanceof double[] g
                            && new long[]{u0 ? pk[1] + 1 : pk[0], u1 ? pk[0] + 1 : pk[1]} instanceof long[] gp
                            && (f[1] = g[0] + (cs[i] == 'L' ? 1 : 0) - lam[0]) == f[1]
                            && (pk[1] = gp[0] + ((cs[i] == 'L' ? 1L : 0L) << 22) + 1) > 0
                            && (f[0] = g[1] + (cs[i] == 'R' ? 1 : 0) - lam[0]) == f[0]
                            && (pk[0] = gp[1] + ((cs[i] == 'R' ? 1L : 0L) << 22) + 1) > 0)
                        && (Long) (f[0] >= f[1] - lam[0] ? pk[0] : pk[1] + 1) instanceof Long best
                        ? (best >> 22) * st[1] > st[0] * (best & 4194303L)
                            ? new long[]{best >> 22, best & 4194303L, 0}
                            : new long[]{st[0], st[1], 1}
                        : new long[]{st[0], st[1], 1})
                        .reduce((a, b) -> b).map(r -> r[0] << 32 | r[1]).get()) instanceof ToLongFunction<char[]> solve
                && variants.stream().mapToLong(v -> solve.applyAsLong(v.toCharArray())).toArray() instanceof long[] evens
                && (Long) Arrays.stream(evens).reduce((a, b) -> (a >> 32) * (b & 4294967295L) >= (b >> 32) * (a & 4294967295L) ? a : b).getAsLong() instanceof Long ev
                && new long[]{ev >> 32, ev & 4294967295L} instanceof long[] e
                && new long[]{steps, 2L * variants.stream().mapToLong(v -> v.length() % 2 == 1 ? v.length() : v.length() + 1).min().getAsLong()} instanceof long[] od
                && new long[]{e[0] * od[1] >= od[0] * e[1] ? e[0] : od[0], e[0] * od[1] >= od[0] * e[1] ? e[1] : od[1]} instanceof long[] r
                && (Long) (r[0] * 100_000_000L / r[1]) instanceof Long v
                ? (v / 1000000) + "." + String.format("%06d", v % 1000000)
                : "")));
    }
}



