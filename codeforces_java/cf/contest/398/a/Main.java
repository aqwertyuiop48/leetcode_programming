import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer a && Integer.valueOf(sc.nextInt()) instanceof Integer b
            && ((LongBinaryOperator) (bb, g) -> (g - bb % g) * (bb / g) * (bb / g) + (bb % g) * (bb / g + 1) * (bb / g + 1)) instanceof LongBinaryOperator xsq
            ? b == 0 ? (long) a * a + "\n" + "o".repeat(a)
                : a == 0 ? -(long) b * b + "\n" + "x".repeat(b)
                : IntStream.rangeClosed(1, Math.min(a, b + 1)).boxed().max(Comparator.<Integer>comparingLong(k -> (long) (a - k + 1) * (a - k + 1) + (k - 1) - xsq.applyAsLong(b, Math.min(b, k + 1))).thenComparingInt(k -> k)).get() instanceof Integer k
                    && Integer.valueOf(Math.min(b, k + 1)) instanceof Integer g
                    ? ((long) (a - k + 1) * (a - k + 1) + (k - 1) - xsq.applyAsLong(b, g)) + "\n"
                        + IntStream.range(0, g + k).mapToObj(j -> (g >= k) == (j % 2 == 0)
                            ? "x".repeat(b / g + (j / 2 < b % g ? 1 : 0))
                            : "o".repeat(j / 2 == 0 ? a - k + 1 : 1)).collect(Collectors.joining()) : "" : "");
    }
}
