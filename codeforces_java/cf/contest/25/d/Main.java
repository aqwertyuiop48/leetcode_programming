import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).toArray() instanceof int[] p
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> h
            && h.getAndSet(x -> p[x] == x ? x : (p[x] = h.get().applyAsInt(p[x]))) == null
            && h.get() instanceof IntUnaryOperator f
            && IntStream.range(0, n - 1).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()})
                .filter(e -> f.applyAsInt(e[0] - 1) == f.applyAsInt(e[1] - 1) || (p[f.applyAsInt(e[0] - 1)] = f.applyAsInt(e[1] - 1)) < 0)
                .toList() instanceof List<int[]> ex
            && IntStream.range(0, n).map(f).distinct().toArray() instanceof int[] rt
            && Arrays.stream(rt).map(r -> IntStream.range(0, n).filter(i -> f.applyAsInt(i) == r).max().getAsInt() + 1).toArray() instanceof int[] mx
            ? ex.size() + IntStream.range(0, ex.size())
                .mapToObj(j -> "\n" + ex.get(j)[0] + " " + ex.get(j)[1] + " " + mx[j] + " " + mx[j + 1]).collect(Collectors.joining())
            : ""));
    }
}
