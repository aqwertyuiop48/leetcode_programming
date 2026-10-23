import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(LongStream.generate(sc::nextLong).limit(3).toArray()).ifPresent(v -> System.out.print(
            v[1] == v[2]
                ? (v[0] == 1 && v[1] == 1 ? "inf" : v[0] == v[1] ? "2" : "1")
                : v[1] == 1 ? "0"
                : Optional.of(LongStream.iterate(v[2], x -> x > 0, x -> x / v[1]).map(x -> x % v[1]).toArray()).map(dg ->
                    "" + ((IntStream.range(0, dg.length).mapToObj(i -> BigInteger.valueOf(dg[i]).multiply(BigInteger.valueOf(v[0]).pow(i)))
                            .reduce(BigInteger.ZERO, BigInteger::add).equals(BigInteger.valueOf(v[1])) ? 1 : 0)
                        + (v[0] == 1 && Long.valueOf(LongStream.iterate(v[2], x -> x % v[1] == 0, x -> x / v[1]).count()) instanceof Long k
                            && k >= 2 && BigInteger.valueOf(v[1]).pow(k.intValue()).equals(BigInteger.valueOf(v[2])) ? 1 : 0))).get())));
    }
}
