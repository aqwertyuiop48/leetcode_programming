import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(java.util.regex.Pattern.compile("\\s+") instanceof java.util.regex.Pattern pt && new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> pt.splitAsStream(l.trim())).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf(n / 2) instanceof Integer k
            && IntStream.range(0, n).mapToLong(i -> t[1 + 2 * i]).toArray() instanceof long[] xs && IntStream.range(0, n).mapToLong(i -> t[2 + 2 * i]).toArray() instanceof long[] ys
            && LongStream.of(xs).sorted().toArray() instanceof long[] sx && LongStream.of(ys).sorted().toArray() instanceof long[] sy
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> xs[i])).mapToInt(i -> i).toArray() instanceof int[] xo
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> ys[i])).mapToInt(i -> i).toArray() instanceof int[] yo
            && new int[n] instanceof int[] xr && new int[n] instanceof int[] yr
            && IntStream.range(0, n).allMatch(r -> (xr[xo[r]] = r) >= 0 && (yr[yo[r]] = r) >= 0)
            && Long.valueOf(2 * (LongStream.range(n - k, n).map(i -> sx[(int) i] + sy[(int) i]).sum() - LongStream.range(0, k).map(i -> sx[(int) i] + sy[(int) i]).sum())) instanceof Long B
            && Long.valueOf(IntStream.range(0, n).filter(i -> xr[i] < k && yr[i] < k).count()) instanceof Long p
            ? B - (n % 2 == 0
                ? (p > 0 && IntStream.range(0, n).anyMatch(i -> xr[i] < k && yr[i] >= k) ? 2 * Math.min(sx[k] - sx[k - 1], sy[k] - sy[k - 1]) : 0L)
                : (IntStream.range(0, n).anyMatch(i -> xr[i] == k && yr[i] == k) && p > 0 && IntStream.range(0, n).anyMatch(i -> xr[i] < k && yr[i] > k)
                    ? 2 * Math.min(Math.min(sx[k] - sx[k - 1], sx[k + 1] - sx[k]), Math.min(sy[k] - sy[k - 1], sy[k + 1] - sy[k])) : 0L)) : "");
    }
}
