import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n * n).filter(t -> t / n <= t % n).toArray() instanceof int[] rev
            && IntStream.range(0, rev.length * n).map(t -> (Integer) (rev[t / n] / n) instanceof Integer l && (Integer) (rev[t / n] % n) instanceof Integer r
                ? t % n >= l && t % n <= r ? l + r - t % n : t % n : 0).toArray() instanceof int[] ref
            && IntStream.range(0, n * n).filter(t -> t / n < t % n).toArray() instanceof int[] cells
            && new double[2][n * n] instanceof double[][] buf && IntStream.range(0, n * n).allMatch(t -> (buf[0][t] = 0) >= 0)
            && IntStream.range(0, k).allMatch(st -> buf[st & 1] instanceof double[] p && buf[(st + 1) & 1] instanceof double[] q
                && IntStream.of(cells).allMatch(t -> (q[t] = IntStream.range(0, rev.length).mapToDouble(j ->
                    ref[j * n + t / n] < ref[j * n + t % n] ? p[ref[j * n + t / n] * n + ref[j * n + t % n]] : 1 - p[ref[j * n + t % n] * n + ref[j * n + t / n]]).sum() / rev.length) >= 0))
            ? String.format(Locale.ROOT, "%.15f", IntStream.of(cells).mapToDouble(t -> a[t / n] > a[t % n] ? 1 - buf[k & 1][t] : buf[k & 1][t]).sum()) : "");
    }
}
