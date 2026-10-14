import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextLong()).ifPresent(n ->
            System.out.println(
                new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> gr
                && gr.getAndSet((base, exp) -> exp == 0 ? 1L : (gr.get().applyAsLong(base * base % 1_000_000_009L, exp / 2) * (exp % 2 == 1 ? base : 1)) % 1_000_000_009L) == null
                && gr.get() instanceof LongBinaryOperator pw
                ? (pw.applyAsLong(8, n / 2 + 1) + 6) % 1_000_000_009L * pw.applyAsLong(7, 1_000_000_009L - 2) % 1_000_000_009L
                : 0L)));
    }
}

