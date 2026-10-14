import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(yw ->
            System.out.println(
                new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> ref
                && ref.getAndSet((a, b) -> b == 0 ? a : ref.get().applyAsInt(b, a % b)) == null
                && new int[]{7 - Math.max(yw[0], yw[1])} instanceof int[] num
                && new int[]{ref.get().applyAsInt(num[0], 6)} instanceof int[] g
                && g[0] != 0
                ? (num[0] / g[0]) + "/" + (6 / g[0])
                : "0/1")));
    }
}
