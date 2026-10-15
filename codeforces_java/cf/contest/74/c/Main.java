import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                BigInteger.valueOf(s.nextLong() - 1).gcd(BigInteger.valueOf(s.nextLong() - 1)).longValue() + 1));
    }
}

