import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Collections.list(new StringTokenizer(new String(System.in.readAllBytes()))).stream().map(Object::toString).toArray(String[]::new) instanceof String[] t
            && (Integer) Integer.parseInt(t[0]) instanceof Integer n && (Integer) Integer.parseInt(t[1]) instanceof Integer q
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[2 + i])).toArray() instanceof int[] cur
            && new int[]{2 + n} instanceof int[] ptr
            && IntStream.range(0, q).mapToObj(i -> t[ptr[0]].equals("1") ? new int[]{1, Integer.parseInt(t[ptr[0] + 1]) - 1, Integer.parseInt(t[(ptr[0] += 3) - 1])} : new int[]{2, Integer.parseInt(t[(ptr[0] += 2) - 1]), 0}).toArray(int[][]::new) instanceof int[][] qs
            && IntStream.concat(IntStream.of(cur), Arrays.stream(qs).filter(x -> x[0] == 1).mapToInt(x -> x[2])).distinct().sorted().toArray() instanceof int[] vals
            && (Integer) vals.length instanceof Integer K && new long[K + 1] instanceof long[] fc && new long[K + 1] instanceof long[] fs
            && ((java.util.function.BiFunction<Integer, Integer, Boolean>) (pos, sg) -> IntStream.iterate(Arrays.binarySearch(vals, pos) + 1, j -> j <= K, j -> j + (j & -j)).allMatch(j -> (fc[j] += sg) > Long.MIN_VALUE && (fs[j] += (long) sg * pos) > Long.MIN_VALUE)) instanceof java.util.function.BiFunction<Integer, Integer, Boolean> upd
            && IntStream.of(cur).allMatch(v -> upd.apply(v, 1))
            && ((java.util.function.IntFunction<long[]>) i -> new long[]{IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).mapToLong(j -> fc[j]).sum(), IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).mapToLong(j -> fs[j]).sum()}) instanceof java.util.function.IntFunction<long[]> pre
            ? Arrays.stream(qs).map(x -> x[0] == 1 ? upd.apply(cur[x[1]], -1) && upd.apply(x[2], 1) && (cur[x[1]] = x[2]) > 0 ? "" : ""
                : new int[]{1, K} instanceof int[] r && IntStream.range(0, 18).allMatch(it -> (Integer) ((r[0] + r[1] + 1) / 2) instanceof Integer mid
                    && ((Long) (pre.apply(mid - 1)[0] * vals[mid - 1] - pre.apply(mid - 1)[1]) <= x[1] ? (r[0] = mid) > 0 : (r[1] = mid - 1) > 0)) && pre.apply(r[0]) instanceof long[] pb
                    ? String.format("%.5f", (x[1] + pb[1]) / (double) pb[0]) : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
