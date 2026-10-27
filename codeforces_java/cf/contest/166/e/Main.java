import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && BigInteger.valueOf(1_000_000_007L) instanceof BigInteger p
            ? BigInteger.valueOf(3).modPow(BigInteger.valueOf(n), p).add(BigInteger.valueOf(n % 2 == 0 ? 3 : -3)).multiply(BigInteger.valueOf(4).modInverse(p)).mod(p)
            : "");
    }
}

