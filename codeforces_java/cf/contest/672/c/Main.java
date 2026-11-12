import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[]{0, 0, 0, 0, 0} instanceof int[] ps
            && Stream.of(0).peek(z -> IntStream.rangeClosed(0, raw.length).forEach(i -> ps[4] = i < raw.length && raw[i] >= 48 ? (ps[3] = 1) + (ps[0] = ps[0] * 10 + raw[i] - 48)
                : i < raw.length && raw[i] == 45 ? (ps[2] = 1)
                : ps[3] == 1 ? (a[ps[1]++] = ps[2] == 1 ? -ps[0] : ps[0]) + (ps[0] = ps[2] = ps[3] = 0) : 0)).findFirst().isPresent()
            && Integer.valueOf(a[6]) instanceof Integer n
            && IntStream.range(0, n).mapToDouble(i -> Math.hypot((double) a[7 + 2 * i] - a[4], (double) a[8 + 2 * i] - a[5])).toArray() instanceof double[] d
            && IntStream.range(0, n).mapToDouble(i -> Math.hypot((double) a[7 + 2 * i] - a[0], (double) a[8 + 2 * i] - a[1]) - d[i]).toArray() instanceof double[] da
            && IntStream.range(0, n).mapToDouble(i -> Math.hypot((double) a[7 + 2 * i] - a[2], (double) a[8 + 2 * i] - a[3]) - d[i]).toArray() instanceof double[] db
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble(i -> da[i])).limit(2).mapToInt(Integer::intValue).toArray() instanceof int[] ia
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble(i -> db[i])).limit(2).mapToInt(Integer::intValue).toArray() instanceof int[] ib
            ? String.format(Locale.US, "%.12f", 2 * Arrays.stream(d).sum() + Math.min(Math.min(da[ia[0]], db[ib[0]]),
                n < 2 ? 1e18 : ia[0] != ib[0] ? da[ia[0]] + db[ib[0]] : Math.min(da[ia[0]] + db[ib[1]], da[ia[1]] + db[ib[0]]))) : "");
    }
}
