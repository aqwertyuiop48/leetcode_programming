import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] tk
            && Long.valueOf(Long.parseLong(tk[0])) instanceof Long n
            && tk[1].chars().map(c -> c - 'A').toArray() instanceof int[] v
            && Integer.valueOf(v.length) instanceof Integer m
            && new int[13][] instanceof int[][] arr
            && (arr[1] = v) == v
            && new long[16] instanceof long[] d
            && IntStream.rangeClosed(2, 12).allMatch(len ->
                (arr[len] = new int[m]) != null
                && IntStream.range(0, Math.max(m - len + 1, 0)).allMatch(i -> (arr[len][i] = arr[len - 1][i] * 4 + v[i + len - 1]) >= 0)
                && new long[16] instanceof long[] cnt
                && Arrays.stream(arr[len], 0, Math.max(m - len + 1, 0)).sorted().distinct().allMatch(code -> ++cnt[(code >> (2 * (len - 1))) * 4 + (code & 3)] > 0)
                && IntStream.range(0, 16).allMatch(p -> d[p] != 0 || cnt[p] >= (1L << (2 * (len - 2))) || (d[p] = len) > 0))
            && new long[62][] instanceof long[][] pw
            && (pw[0] = IntStream.range(0, 16).mapToLong(p -> d[p] - 1).toArray()) != null
            && IntStream.range(1, 62).allMatch(i ->
                (pw[i] = IntStream.range(0, 16).mapToLong(p ->
                    Math.min(2000000000000000000L, IntStream.range(0, 4).mapToLong(k -> Math.min(2000000000000000000L, pw[i - 1][p / 4 * 4 + k] + pw[i - 1][k * 4 + p % 4])).min().getAsLong())).toArray()) != null)
            && new long[]{0, 0, 0, 0} instanceof long[] vec
            && new long[1] instanceof long[] e
            && IntStream.range(0, 62).map(i -> 61 - i).allMatch(i ->
                (Long) Math.min(2000000000000000000L, 0L) instanceof Long z
                && IntStream.range(0, 4).mapToLong(b ->
                    IntStream.range(0, 4).mapToLong(a -> Math.min(2000000000000000000L, vec[a] + pw[i][a * 4 + b])).min().getAsLong()).toArray() instanceof long[] nv
                && (LongStream.of(nv).min().getAsLong() > n - 1
                    || (IntStream.range(0, 4).allMatch(b -> (vec[b] = nv[b]) >= 0) && (e[0] += 1L << i) > 0)))
            ? String.valueOf(e[0] + 1)
            : "");
    }
}
