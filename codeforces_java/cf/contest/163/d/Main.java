import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer t
            ? Stream.generate(() -> Stream.generate(() -> new long[]{s.nextLong(), s.nextLong()}).limit(s.nextInt()).toList() instanceof List<long[]> prs
                    && Long.valueOf(prs.stream().mapToLong(pa -> LongStream.iterate(1, x -> x * pa[0]).limit(pa[1] + 1).reduce(1, (x, y) -> y)).reduce(1, (x, y) -> x * y)) instanceof Long v
                    && prs.stream().sorted(Comparator.comparingLong(pa -> -pa[1])).toList() instanceof List<long[]> sp
                    && new long[]{1, 1} instanceof long[] pr2
                    && sp.stream().mapToInt(pa -> pr2[0] <= pr2[1] ? (pr2[0] *= pa[1] + 1) > 0 ? 0 : 0 : (pr2[1] *= pa[1] + 1) > 0 ? 1 : 1).toArray() instanceof int[] grp
                    && ((IntFunction<long[]>) g -> new long[(int) pr2[g]] instanceof long[] arr && (arr[0] = 1) == 1 && new int[]{1} instanceof int[] szz
                        && IntStream.range(0, sp.size()).filter(k -> grp[k] == g).allMatch(k -> (Integer) szz[0] instanceof Integer sl
                            && IntStream.range(sl, sl * (int) (sp.get(k)[1] + 1)).allMatch(q -> (arr[q] = arr[q - sl] * sp.get(k)[0]) > 0) && (szz[0] = sl * (int) (sp.get(k)[1] + 1)) > 0)
                        ? Arrays.stream(arr).sorted().toArray() : null) instanceof IntFunction<long[]> gen
                    && gen.apply(0) instanceof long[] la && gen.apply(1) instanceof long[] lb
                    && Long.valueOf((long) Math.cbrt(v)) instanceof Long c0
                    && Long.valueOf((c0 + 1) * (c0 + 1) * (c0 + 1) <= v ? c0 + 1 : c0 * c0 * c0 > v ? c0 - 1 : c0) instanceof Long c3
                    && Stream.of(0.9, 0.5, 0.1, 0.0).map(f -> Long.valueOf(Math.max(1L, (long) (c3 * f))) instanceof Long lo
                            && Long.valueOf((long) Math.sqrt((double) (v / lo)) + 1) instanceof Long hiB
                            && Arrays.stream(la).flatMap(x -> Integer.valueOf(Arrays.binarySearch(lb, (lo + x - 1) / x)) instanceof Integer b0 && Integer.valueOf(Arrays.binarySearch(lb, hiB / x)) instanceof Integer b1
                                ? IntStream.range(b0 >= 0 ? b0 : -b0 - 1, b1 >= 0 ? b1 + 1 : -b1 - 1).mapToLong(k -> x * lb[k]) : LongStream.empty()).sorted().toArray() instanceof long[] d
                            && new long[]{Long.MAX_VALUE, 0, 0, 0} instanceof long[] best
                            && Integer.valueOf(Arrays.binarySearch(d, c3 + 1)) instanceof Integer tp
                            && Integer.valueOf(tp >= 0 ? tp : -tp - 2) instanceof Integer top
                            && (d.length == 0 || IntStream.iterate(Math.max(top, 0), i -> i >= 0, i -> i - 1)
                                .filter(i -> d[i] * d[i] * d[i] <= v)
                                .takeWhile(i -> 2 * (2 * d[i] * Math.sqrt((double) (v / d[i])) + v / d[i]) <= best[0] + 1.0)
                                .allMatch(i -> Long.valueOf(v / d[i]) instanceof Long w
                                    && Long.valueOf((long) Math.sqrt((double) w)) instanceof Long r0
                                    && Long.valueOf((r0 + 1) * (r0 + 1) <= w ? r0 + 1 : r0 * r0 > w ? r0 - 1 : r0) instanceof Long r
                                    && Integer.valueOf(Arrays.binarySearch(d, r)) instanceof Integer pos
                                    && Integer.valueOf(pos >= 0 ? pos : -pos - 2) instanceof Integer start
                                    && IntStream.iterate(start, j -> j >= 0, j -> j - 1)
                                        .takeWhile(j -> 2 * (d[i] * (d[j] + w / d[j]) + w) < best[0])
                                        .filter(j -> w % d[j] == 0).findFirst().stream()
                                        .allMatch(j -> (best[0] = 2 * (d[i] * (d[j] + w / d[j]) + w)) > 0 && (best[1] = d[i]) > 0 && (best[2] = d[j]) > 0 && (best[3] = w / d[j]) > 0) || true) || true)
                            ? new long[]{best[0], best[1], best[2], best[3], lo == 1 || best[0] <= (4 * Math.sqrt((double) lo * v) + 2.0 * v / lo) * (1 - 1e-9) ? 1 : 0}
                            : new long[]{0, 0, 0, 0, 0})
                        .filter(rs -> rs[4] == 1).findFirst().get() instanceof long[] res
                    ? res[0] + " " + res[1] + " " + res[2] + " " + res[3] : "").limit(t).collect(Collectors.joining("\n"))
            : "");
    }


}
