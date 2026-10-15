import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            (Integer) sc.nextInt() instanceof Integer n
            && (Integer) Integer.numberOfTrailingZeros(n) instanceof Integer k
            && (Integer) (n >> k) instanceof Integer m
            && (Integer) (m == 1 ? 1 : IntStream.rangeClosed(1, m).filter(i -> BigInteger.TWO.modPow(BigInteger.valueOf(i), BigInteger.valueOf(m)).equals(BigInteger.ONE)).findFirst().getAsInt()) instanceof Integer p
            && BigInteger.TWO.pow(p).subtract(BigInteger.ONE) instanceof BigInteger d
            && IntStream.range(0, p).mapToObj(i -> BigInteger.TWO.modPow(BigInteger.valueOf(i), BigInteger.valueOf(m)).shiftLeft(p - i)).reduce(BigInteger.ZERO, BigInteger::add)
                .add(d.multiply(BigInteger.valueOf(k))) instanceof BigInteger num
            ? num.divide(num.gcd(d)) + "/" + d.divide(num.gcd(d))
            : ""));
    }
}

