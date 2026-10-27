import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n && BigInteger.valueOf(s.nextLong()) instanceof BigInteger m
            ? BigInteger.valueOf(3).modPow(BigInteger.valueOf(n), m).subtract(BigInteger.ONE).mod(m) : "");
    }
}

