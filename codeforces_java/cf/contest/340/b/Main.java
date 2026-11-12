
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).flatMap(i -> IntStream.of(sc.nextInt(), sc.nextInt())).toArray() instanceof int[] p
            ? String.format(Locale.US, "%.6f", IntStream.range(0, n * n).filter(z -> z / n < z % n).mapToLong(z -> Integer.valueOf(z / n) instanceof Integer i && Integer.valueOf(z % n) instanceof Integer j
                && Integer.valueOf(p[2 * j] - p[2 * i]) instanceof Integer dx && Integer.valueOf(p[2 * j + 1] - p[2 * i + 1]) instanceof Integer dy
                && IntStream.range(0, n).map(k -> dx * (p[2 * k + 1] - p[2 * i + 1]) - dy * (p[2 * k] - p[2 * i])).summaryStatistics() instanceof IntSummaryStatistics st
                && st.getMax() > 0 && st.getMin() < 0 ? (long) st.getMax() - st.getMin() : 0L).max().orElse(0L) / 2.0) : "");
    }
}



