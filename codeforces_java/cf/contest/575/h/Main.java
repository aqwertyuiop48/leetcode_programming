import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println((Integer) new Scanner(System.in).nextInt() instanceof Integer n
            ? (LongStream.rangeClosed(1, 2L * n + 2).reduce(1L, (a, b) -> a * b % 1000000007L) * BigInteger.valueOf(LongStream.rangeClosed(1, n + 1L).reduce(1L, (a, b) -> a * b % 1000000007L)).pow(2).mod(BigInteger.valueOf(1000000007L)).modInverse(BigInteger.valueOf(1000000007L)).longValue() % 1000000007L + 1000000006L) % 1000000007L : -1L);
    }
}
