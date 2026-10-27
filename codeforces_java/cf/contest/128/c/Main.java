import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.<Function<Integer, BigInteger>>of(x -> IntStream.rangeClosed(1, x).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)).ifPresent(f -> Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt() - 1, s.nextInt() - 1, s.nextInt() * 2}).ifPresent(a -> System.out.print(IntStream.of(a[0], a[1]).mapToObj(n -> a[2] > n ? BigInteger.ZERO : f.apply(n).divide(f.apply(a[2]).multiply(f.apply(n - a[2])))).reduce(BigInteger.ONE, BigInteger::multiply).mod(BigInteger.valueOf(1000000007))))));
    }
}

