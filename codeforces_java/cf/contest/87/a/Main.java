import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            BigInteger.valueOf(s.nextLong()) instanceof BigInteger a
            && BigInteger.valueOf(s.nextLong()) instanceof BigInteger b
            && (Long) a.gcd(b).longValue() instanceof Long g
            && (Long) Math.abs(a.longValue() / g - b.longValue() / g) instanceof Long d
            ? d <= 1 ? "Equal" : a.compareTo(b) < 0 ? "Dasha" : "Masha"
            : ""));
    }
}

