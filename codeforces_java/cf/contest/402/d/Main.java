import java.math.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, m).boxed().map(i -> s.nextInt()).collect(Collectors.toSet()) instanceof Set<Integer> bad
            && IntStream.rangeClosed(2, 31623).filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i)).noneMatch(j -> i % j == 0)).toArray() instanceof int[] pr
            && new int[n] instanceof int[] g
            && IntStream.range(0, n).allMatch(i -> (g[i] = i == 0 ? a[0] : BigInteger.valueOf(g[i - 1]).gcd(BigInteger.valueOf(a[i])).intValue()) > 0)
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
            && fr.getAndSet(x -> x == 1 ? 0 : Arrays.stream(pr).takeWhile(p -> (long) p * p <= x).filter(p -> x % p == 0).findFirst() instanceof OptionalInt o && o.isPresent()
                ? (bad.contains(o.getAsInt()) ? -1 : 1) + fr.get().applyAsInt(x / o.getAsInt()) : bad.contains(x) ? -1 : 1) == null
            && fr.get() instanceof IntUnaryOperator f
            && new int[]{1} instanceof int[] st
            ? IntStream.range(0, n).map(k -> n - 1 - k).map(i -> (f.applyAsInt(g[i] / st[0]) < 0 && (st[0] = g[i]) > 0 ? 0 : 0) + f.applyAsInt(a[i]) - f.applyAsInt(st[0])).sum() : 0);
    }
}
