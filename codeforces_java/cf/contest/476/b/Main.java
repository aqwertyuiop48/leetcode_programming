import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String a
            && sc.next() instanceof String b
            && (Integer) (int) b.chars().filter(c -> c == '?').count() instanceof Integer q
            && (Integer) (a.chars().map(c -> c == '+' ? 1 : -1).sum() - b.chars().filter(c -> c != '?').map(c -> c == '+' ? 1 : -1).sum() + q) instanceof Integer v
            ? String.format(Locale.US, "%.12f", v % 2 == 0 && v >= 0 && v / 2 <= q
                ? IntStream.rangeClosed(1, v / 2).mapToDouble(i -> (double) (q - v / 2 + i) / i).reduce(1.0, (x, y) -> x * y) / (1 << q)
                : 0.0)
            : "");
    }
}
