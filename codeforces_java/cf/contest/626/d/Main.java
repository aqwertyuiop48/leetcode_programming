import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && new long[5002] instanceof long[] w && new long[10002] instanceof long[] suf
            && IntStream.range(0, n).filter(i -> IntStream.range(i + 1, n).filter(j -> a[i] != a[j] && ++w[Math.abs(a[i] - a[j])] > 0).count() >= 0).count() >= 0
            && IntStream.iterate(5000, d -> d >= 1, d -> d - 1).filter(d -> (suf[d] = suf[d + 1] + w[d]) >= 0).count() >= 0
            && Long.valueOf(suf[1]) instanceof Long W
            ? W == 0 ? "0.0000000000" : String.format(Locale.US, "%.10f", IntStream.rangeClosed(1, 4999).mapToLong(d1 -> w[d1] * IntStream.rangeClosed(1, 4999 - d1).mapToLong(d2 -> w[d2] * suf[d1 + d2 + 1]).sum()).sum() / ((double) W * W * W)) : "");
    }
}
