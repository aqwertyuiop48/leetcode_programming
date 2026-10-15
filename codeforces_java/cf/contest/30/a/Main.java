import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            new BigInteger[]{s.nextBigInteger(), s.nextBigInteger()} instanceof BigInteger[] ab
            && (Integer) s.nextInt() instanceof Integer n
            ? ab[0].signum() == 0 && ab[1].signum() == 0
                ? "5"
                : IntStream.rangeClosed(0, 1000).boxed().flatMap(i -> Stream.of(i, -i))
                    .filter(x -> BigInteger.valueOf(x).pow(n).multiply(ab[0]).equals(ab[1]))
                    .findFirst().map(String::valueOf).orElse("No solution")
            : ""));
    }
}



