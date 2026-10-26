import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt() - 1).toArray() instanceof int[] f
            && ((java.util.function.IntBinaryOperator) (x, k) -> IntStream.range(0, k).reduce(x, (v, i) -> f[v])) instanceof java.util.function.IntBinaryOperator it
            && IntStream.range(0, n).map(x -> IntStream.rangeClosed(1, n).filter(k -> it.applyAsInt(x, k) == x).findFirst().orElse(0)).toArray() instanceof int[] cyc
            && (Integer) IntStream.range(0, n).map(x -> IntStream.rangeClosed(0, n).filter(k -> cyc[it.applyAsInt(x, k)] > 0).findFirst().getAsInt()).max().getAsInt() instanceof Integer t
            && IntStream.of(cyc).filter(c -> c > 0).distinct().boxed().reduce(BigInteger.ONE, (acc, c) -> acc.multiply(BigInteger.valueOf(c)).divide(acc.gcd(BigInteger.valueOf(c))), BigInteger::multiply) instanceof BigInteger l
            ? l.multiply(BigInteger.valueOf(Math.max(1, (t + l.min(BigInteger.valueOf(1000)).intValue() - 1) / l.min(BigInteger.valueOf(1000)).intValue() * (l.compareTo(BigInteger.valueOf(1000)) > 0 ? 0 : 1) + (l.compareTo(BigInteger.valueOf(1000)) > 0 ? 1 : 0)))) : "");
    }
}
