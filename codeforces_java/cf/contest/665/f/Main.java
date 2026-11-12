import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n
            && Integer.valueOf(IntStream.rangeClosed(Math.max(0, (int) Math.sqrt(n) - 2), (int) Math.sqrt(n) + 2).filter(x -> (long) x * x <= n).max().getAsInt()) instanceof Integer r
            && IntStream.rangeClosed(0, r + 1).mapToLong(v -> Math.max(v - 1, 0)).toArray() instanceof long[] lo
            && IntStream.rangeClosed(0, r + 1).mapToLong(k -> k == 0 ? 0 : n / k - 1).toArray() instanceof long[] hi
            && IntStream.rangeClosed(2, r).filter(p -> lo[p] > lo[p - 1] && Long.valueOf(lo[p - 1]) instanceof Long pc && Long.valueOf((long) p * p) instanceof Long p2
                && IntStream.rangeClosed(1, (int) Math.min(r, n / p2)).filter(k -> (hi[k] -= ((long) k * p <= r ? hi[k * p] : lo[(int) (n / ((long) k * p))]) - pc) > Long.MIN_VALUE).count() >= 0
                && (p2 > r || IntStream.range(0, r - (int) (long) p2 + 1).map(j -> r - j).filter(v -> (lo[v] -= lo[v / p] - pc) > Long.MIN_VALUE).count() >= 0)).count() >= 0
            ? IntStream.rangeClosed(2, r).filter(p -> lo[p] > lo[p - 1]).mapToLong(p -> hi[p] - lo[p]).sum() + lo[IntStream.rangeClosed(0, 5000).filter(c -> (long) c * c * c <= n).max().getAsInt()] : "");
    }
}
