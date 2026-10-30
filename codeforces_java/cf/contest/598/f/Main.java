import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk && Arrays.stream(tk).mapToDouble(Double::parseDouble).toArray() instanceof double[] v
                && (Integer) (int) v[0] instanceof Integer n && (Integer) (int) v[1] instanceof Integer m
                ? IntStream.range(0, m).mapToObj(j -> IntStream.range(0, 4).mapToLong(c -> Math.round(v[2 + 2 * n + 4 * j + c] * 100)).toArray() instanceof long[] ln
                        && IntStream.range(0, n).mapToLong(i -> (ln[2] - ln[0]) * (Math.round(v[3 + 2 * i] * 100) - ln[1]) - (ln[3] - ln[1]) * (Math.round(v[2 + 2 * i] * 100) - ln[0])).toArray() instanceof long[] S
                        && IntStream.range(0, n).mapToDouble(i -> ((Math.round(v[2 + 2 * i] * 100) - ln[0]) * (ln[2] - ln[0]) + (Math.round(v[3 + 2 * i] * 100) - ln[1]) * (ln[3] - ln[1])) / Math.hypot(ln[2] - ln[0], ln[3] - ln[1])).toArray() instanceof double[] T
                        && new double[]{0, -1e18} instanceof double[] st
                        && Stream.concat(Stream.of(0, 1).flatMap(s -> IntStream.range(0, n)
                                        .filter(i -> ((S[i] > 0 || (S[i] == 0 && s == 1)) ? 1 : 0) != ((S[(i + 1) % n] > 0 || (S[(i + 1) % n] == 0 && s == 1)) ? 1 : 0))
                                        .mapToDouble(i -> T[i] + (T[(i + 1) % n] - T[i]) * S[i] / (double) (S[i] - S[(i + 1) % n])).sorted().toArray() instanceof double[] c
                                        ? IntStream.range(0, c.length / 2).mapToObj(k -> new double[]{c[2 * k], c[2 * k + 1]}) : Stream.<double[]>empty()),
                                IntStream.range(0, n).filter(i -> S[i] == 0 && S[(i + 1) % n] == 0).mapToObj(i -> new double[]{Math.min(T[i], T[(i + 1) % n]), Math.max(T[i], T[(i + 1) % n])}))
                        .sorted(Comparator.comparingDouble(a -> a[0]))
                        .filter(a -> (st[0] += Math.max(0, a[1] - Math.max(a[0], st[1]))) >= 0 && (st[1] = Math.max(st[1], a[1])) > -1e300).count() >= 0
                        ? String.format(Locale.ROOT, "%.10f", st[0] / 100) : "").collect(Collectors.joining("\n")) : "");
    }
}
