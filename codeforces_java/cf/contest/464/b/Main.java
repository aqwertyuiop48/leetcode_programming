import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : i < raw.length && raw[i] == '-'
                        ? (ps[3] = 1) > 0
                        : (ps[2] != 1 || ((g[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) * 0 == 0 && (ps[0] = 0) == 0 && (ps[3] = 0) == 0)) && (ps[2] = 0) == 0)
            && new int[] {0, 1, 2, 0, 2, 1, 1, 0, 2, 1, 2, 0, 2, 0, 1, 2, 1, 0} instanceof int[] pm
            && IntStream.range(0, 48).mapToLong(x -> x < 6 ? 0L
                : IntStream.range(0, 3).mapToLong(c -> (long) (g[3 * (x / 6) + pm[3 * (x % 6) + c]] - g[c]) * (g[3 * (x / 6) + pm[3 * (x % 6) + c]] - g[c])).sum()).toArray() instanceof long[] dd
            && Arrays.stream(dd, 6, 48).filter(v -> v > 0).distinct().toArray() instanceof long[] cand
            && ((LongFunction<String>) m ->
                IntStream.range(0, 48).map(x -> x < 6 ? 0 : dd[x] == m ? 1 : dd[x] == 2 * m ? 256 : dd[x] == 3 * m ? 65536 : 0).toArray() instanceof int[] cl
                && IntStream.rangeClosed(1, 7).mapToObj(k -> IntStream.range(0, 6).filter(q -> cl[6 * k + q] > 0).toArray()).toArray(int[][]::new) instanceof int[][] opt
                && IntStream.range(0, 7).map(k -> opt[k].length).toArray() instanceof int[] len
                && IntStream.range(0, 7).allMatch(k -> len[k] > 0)
                && IntStream.range(0, 7).map(k -> IntStream.range(0, k).map(j -> len[j]).reduce(1, (x, y) -> x * y)).toArray() instanceof int[] str
                && (Integer) IntStream.of(len).reduce(1, (x, y) -> x * y) instanceof Integer total
                && ((IntFunction<int[]>) code -> IntStream.range(0, 24).map(i ->
                    i < 3 ? g[i] : g[3 * (i / 3) + pm[3 * opt[i / 3 - 1][code / str[i / 3 - 1] % len[i / 3 - 1]] + i % 3]]).toArray()) instanceof IntFunction<int[]> pts
                ? IntStream.range(0, total).filter(code ->
                    IntStream.range(0, 7).map(k -> cl[6 * (k + 1) + opt[k][code / str[k] % len[k]]]).sum() == 66307
                    && pts.apply(code) instanceof int[] p
                    && IntStream.range(0, 8).allMatch(i -> IntStream.range(0, 8).filter(j -> j != i).mapToLong(j ->
                        (Long) IntStream.range(0, 3).mapToLong(c -> (long) (p[3 * i + c] - p[3 * j + c]) * (p[3 * i + c] - p[3 * j + c])).sum() instanceof Long d
                            ? d == m ? 1L : d == 2 * m ? 256L : d == 3 * m ? 65536L : 1L << 40
                            : 0L).sum() == 66307))
                    .findFirst().stream().mapToObj(code -> pts.apply(code) instanceof int[] p
                        ? "YES\n" + IntStream.range(0, 8).mapToObj(i -> p[3 * i] + " " + p[3 * i + 1] + " " + p[3 * i + 2]).collect(Collectors.joining("\n"))
                        : "").findFirst().orElse(null)
                : null) instanceof LongFunction<String> solve
            ? LongStream.of(cand).mapToObj(solve).filter(r -> r != null).findFirst().orElse("NO")
            : "NO");
    }
}
