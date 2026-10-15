import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.generate(s::nextInt).limit(n).toArray() instanceof int[] a
            && IntStream.generate(s::nextInt).limit(n).toArray() instanceof int[] d
            && IntStream.range(0, n).toArray() instanceof int[] p
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> h
            && h.getAndSet(x -> p[x] == x ? x : (p[x] = h.get().applyAsInt(p[x]))) == null
            && h.get() instanceof IntUnaryOperator f
            && IntStream.range(0, n).allMatch(i -> IntStream.of(i - d[i], i + d[i]).filter(j -> j >= 0 && j < n)
                .allMatch(j -> (p[f.applyAsInt(i)] = f.applyAsInt(j)) >= 0))
            ? IntStream.range(0, n).allMatch(i -> f.applyAsInt(i) == f.applyAsInt(a[i] - 1)) ? "YES" : "NO"
            : ""));

    }
}


