import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer a
            && (Integer) s.nextInt() instanceof Integer b
            && (Integer) BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue() instanceof Integer g
            ? Math.abs(a / g - b / g) == 1 ? "Equal" : a < b ? "Dasha" : "Masha"
            : ""));
    }
}


