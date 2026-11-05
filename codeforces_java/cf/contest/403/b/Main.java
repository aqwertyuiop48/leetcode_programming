import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] in
            && (Integer) in[0] instanceof Integer n && (Integer) in[1] instanceof Integer m
            && Arrays.copyOfRange(in, 2, 2 + n) instanceof int[] a
            && Arrays.stream(in, 2 + n, 2 + n + m).boxed().collect(Collectors.toSet()) instanceof Set<Integer> bad
            && IntStream.rangeClosed(2, 31623).filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i)).noneMatch(j -> i % j == 0)).toArray() instanceof int[] pr
            && new int[n] instanceof int[] g
            && IntStream.range(0, n).allMatch(i -> (g[i] = i == 0 ? a[0] : BigInteger.valueOf(g[i - 1]).gcd(BigInteger.valueOf(a[i])).intValue()) > 0)
            && new Object[1] instanceof Object[] hr
            && (hr[0] = (IntBinaryOperator) (x, i) -> x == 1 ? 0
                : IntStream.range(i, pr.length).filter(j -> x % pr[j] == 0 || (long) pr[j] * pr[j] > x).findFirst() instanceof OptionalInt o && o.isPresent() && x % pr[o.getAsInt()] == 0
                    ? (bad.contains(pr[o.getAsInt()]) ? -1 : 1) + ((IntBinaryOperator) hr[0]).applyAsInt(x / pr[o.getAsInt()], o.getAsInt())
                    : bad.contains(x) ? -1 : 1) != null
            && (IntUnaryOperator) (x -> ((IntBinaryOperator) hr[0]).applyAsInt(x, 0)) instanceof IntUnaryOperator f
            && IntStream.range(0, n).map(i -> f.applyAsInt(a[i])).toArray() instanceof int[] fa
            && new int[n] instanceof int[] fg
            && IntStream.range(0, n).allMatch(i -> (fg[i] = i > 0 && g[i] == g[i - 1] ? fg[i - 1] : f.applyAsInt(g[i])) > -1000000)
            && new int[]{0} instanceof int[] fs
            ? IntStream.range(0, n).map(k -> n - 1 - k).map(i -> (fg[i] - fs[0] < 0 && (fs[0] = fg[i]) > -1000000 ? 0 : 0) + fa[i] - fs[0]).sum() : 0);
    }
}

