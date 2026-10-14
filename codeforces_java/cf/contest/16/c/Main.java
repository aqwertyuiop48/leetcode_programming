import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong()}).ifPresent(v ->
            System.out.println(
                new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> gr
                && gr.getAndSet((x, y) -> y == 0 ? x : gr.get().applyAsLong(y, x % y)) == null
                && gr.get() instanceof LongBinaryOperator gcd
                && new long[]{gcd.applyAsLong(v[2], v[3])} instanceof long[] g
                && new long[]{v[2] / g[0], v[3] / g[0]} instanceof long[] ab
                && new long[]{Math.min(v[0] / ab[0], v[1] / ab[1])} instanceof long[] k
                ? (k[0] * ab[0]) + " " + (k[0] * ab[1])
                : "0 0")));
    }
}

