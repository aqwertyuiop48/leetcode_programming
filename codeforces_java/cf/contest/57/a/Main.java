import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextLong()).ifPresent(n ->
            System.out.println(Optional.of((LongBinaryOperator) (x, y) -> y == 0 ? x : x == n ? n + y : y == n ? 3 * n - x : 4 * n - y).map(pos ->
                Optional.of(Math.abs(pos.applyAsLong(s.nextLong(), s.nextLong()) - pos.applyAsLong(s.nextLong(), s.nextLong()))).map(d -> Math.min(d, 4 * n - d)).get()).get())));
    }
}
