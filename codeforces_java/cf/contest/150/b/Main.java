import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(3).toArray()).ifPresent(a -> System.out.print(BigInteger.valueOf(a[1]).modPow(BigInteger.valueOf(a[2] == 1 || a[2] > a[0] ? a[0] : a[2] == a[0] ? (a[0] + 1) / 2 : a[2] % 2 == 1 ? 2 : 1), BigInteger.valueOf(1000000007L)))));
    }
}
