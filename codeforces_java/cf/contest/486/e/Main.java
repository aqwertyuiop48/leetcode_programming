import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Arrays.copyOfRange(g0, 1, n + 1) instanceof int[] a
            && ((Function<int[], int[]>) seq ->
                new int[n] instanceof int[] res
                && new int[n] instanceof int[] t
                && new int[1] instanceof int[] len
                && IntStream.range(0, n).allMatch(i ->
                    (Integer) Arrays.binarySearch(t, 0, len[0], seq[i]) instanceof Integer r
                    && Integer.valueOf(r >= 0 ? r : -r - 1) instanceof Integer pos
                    && (t[pos] = seq[i]) != Integer.MIN_VALUE + 1
                    && (res[i] = pos + 1) > 0
                    && (pos < len[0] || ++len[0] > 0))
                ? res : null) instanceof Function<int[], int[]> lis
            && lis.apply(a) instanceof int[] f
            && lis.apply(IntStream.range(0, n).map(i -> -a[n - 1 - i]).toArray()) instanceof int[] gr
            && Integer.valueOf(IntStream.of(f).max().getAsInt()) instanceof Integer big
            && new int[n + 2] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> f[i] + gr[n - 1 - i] - 1 != big || ++cnt[f[i]] > 0)
            ? IntStream.range(0, n).mapToObj(i -> f[i] + gr[n - 1 - i] - 1 != big ? "1" : cnt[f[i]] == 1 ? "3" : "2").collect(Collectors.joining())
            : "");
    }
}
