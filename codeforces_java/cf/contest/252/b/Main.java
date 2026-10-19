import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && Long.valueOf(IntStream.range(0, n - 1).filter(k -> a[k] < a[k + 1]).count()) instanceof Long A
            && Long.valueOf(IntStream.range(0, n - 1).filter(k -> a[k] > a[k + 1]).count()) instanceof Long D
            && ((IntBinaryOperator) (i, k) -> k == i ? a[i + 1] : k == i + 1 ? a[i] : a[k]) instanceof IntBinaryOperator g
            && ((IntFunction<IntStream>) i -> IntStream.rangeClosed(Math.max(0, i - 1), Math.min(n - 2, i + 1))) instanceof IntFunction<IntStream> ks
            ? IntStream.range(0, n - 1).filter(i -> a[i] != a[i + 1]
                    && A - ks.apply(i).filter(k -> a[k] < a[k + 1]).count() + ks.apply(i).filter(k -> g.applyAsInt(i, k) < g.applyAsInt(i, k + 1)).count() > 0
                    && D - ks.apply(i).filter(k -> a[k] > a[k + 1]).count() + ks.apply(i).filter(k -> g.applyAsInt(i, k) > g.applyAsInt(i, k + 1)).count() > 0)
                .mapToObj(i -> (i + 1) + " " + (i + 2)).findFirst().orElse("-1") : "");
    }
}
