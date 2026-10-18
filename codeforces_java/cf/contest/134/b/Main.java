import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> f
            && f.getAndSet((a, b) -> b == 0 ? (a == 1 ? 0 : 1000000000) : a / b + f.get().applyAsInt(b, a % b)) == null
            ? IntStream.rangeClosed(1, n).map(k -> f.get().applyAsInt(n, k)).min().getAsInt() - 1
            : -1);
    }
}
