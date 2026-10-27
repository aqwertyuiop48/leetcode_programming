import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && new BigInteger(s.next()) instanceof BigInteger n
            && BigInteger.valueOf(1_000_000_007L) instanceof BigInteger p
            ? n.signum() == 0 ? 1 : BigInteger.TWO.modPow(n.subtract(BigInteger.ONE), p).multiply(BigInteger.TWO.modPow(n, p).add(BigInteger.ONE)).mod(p)
            : "");
    }
}

