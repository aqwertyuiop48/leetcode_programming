import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextLong()).ifPresent(n ->
            System.out.println(((2 * LongStream.rangeClosed(n + 1, 2 * n - 1).reduce(1, (a, b) -> a * b % 1000000007L)
                % 1000000007L * BigInteger.valueOf(LongStream.rangeClosed(1, n - 1).reduce(1, (a, b) -> a * b % 1000000007L)).modInverse(BigInteger.valueOf(1000000007L)).longValue()
                % 1000000007L - n) % 1000000007L + 1000000007L) % 1000000007L)));
    }
}



