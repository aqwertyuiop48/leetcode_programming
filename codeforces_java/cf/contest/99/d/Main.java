import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).ifPresent(n -> Optional.of(n / (n & -n)).ifPresent(m -> Optional.of(IntStream.iterate(1 % m, r -> r * 2 % m).limit(m + 1).toArray()).ifPresent(rs -> Optional.of(IntStream.range(1, m + 1).filter(i -> rs[i] == rs[0]).findFirst().getAsInt()).ifPresent(L -> Optional.of(BigInteger.ONE.shiftLeft(L).subtract(BigInteger.ONE)).ifPresent(den -> Optional.of(IntStream.range(0, L).mapToObj(t -> BigInteger.valueOf(rs[t]).shiftLeft(L - t)).reduce(BigInteger.ZERO, BigInteger::add).add(den.multiply(BigInteger.valueOf(Integer.numberOfTrailingZeros(n))))).ifPresent(num -> System.out.print(num.divide(num.gcd(den)) + "/" + den.divide(num.gcd(den)))))))));
    }
}

