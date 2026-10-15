import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : s.nextInt()).toArray() instanceof int[] a
            && (Integer) IntStream.rangeClosed(1, n).filter(i -> a[i] > 0).max().getAsInt() instanceof Integer M
            && ((IntFunction<int[]>) e -> IntStream.rangeClosed(0, M + 1).map(i -> i == 0 || i == M + 1 ? 0 : Math.max(1, a[i] + (i <= e ? 1 : 0))).toArray()) instanceof IntFunction<int[]> mk
            && ((IntUnaryOperator) e -> mk.apply(e) instanceof int[] r
                ? 3 * IntStream.rangeClosed(1, M).map(i -> r[i]).sum() - e + 2 * IntStream.rangeClosed(1, M).map(i -> Math.max(0, r[i] - r[i + 1])).sum()
                : 0) instanceof IntUnaryOperator cost
            && IntStream.rangeClosed(0, M).boxed().min(Comparator.comparingInt(cost::applyAsInt)).get() instanceof Integer e
            && mk.apply(e) instanceof int[] R
            && new AtomicReference<BiFunction<Integer, Integer, String>>() instanceof AtomicReference<BiFunction<Integer, Integer, String>> lp
            && lp.getAndSet((x, t) -> (Integer) IntStream.rangeClosed(x + 1, M).takeWhile(i -> R[i] >= t).max().getAsInt() instanceof Integer f
                ? (R[x + 1] > t ? lp.get().apply(x, t + 1) : "")
                    + IntStream.range(x, f).mapToObj(p -> (p > x && R[p + 1] > R[p] ? lp.get().apply(p, R[p] + 1) : "") + "AR").collect(Collectors.joining())
                    + "A" + "L".repeat(f - (x == 0 && t == 1 ? e : x)) + "A"
                : "") == null
            ? lp.get().apply(0, 1)
            : ""));
    }
}

