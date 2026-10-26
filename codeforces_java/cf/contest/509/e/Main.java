import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String t && (Integer) t.length() instanceof Integer n
            && new long[n + 1] instanceof long[] p && new long[n + 1] instanceof long[] q
            && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = p[i - 1] + ("AEIOUY".indexOf(t.charAt(i - 1)) >= 0 ? 1 : 0)) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (q[i] = q[i - 1] + p[i]) >= 0)
            ? String.format(Locale.ROOT, "%.7f", IntStream.rangeClosed(1, n).mapToDouble(l -> ((q[n] - q[l - 1]) - q[n - l]) / (double) l).sum()) : "");
    }
}
