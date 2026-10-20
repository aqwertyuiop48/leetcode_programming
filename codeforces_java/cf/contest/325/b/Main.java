import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).nextBigInteger() instanceof BigInteger n
            && IntStream.rangeClosed(0, 64).mapToObj(k -> BigInteger.TWO.pow(k + 1).subtract(BigInteger.valueOf(3)) instanceof BigInteger b
                && b.multiply(b).add(n.multiply(BigInteger.valueOf(8))) instanceof BigInteger dd && dd.sqrt() instanceof BigInteger s
                && s.multiply(s).equals(dd) && s.subtract(b) instanceof BigInteger num && num.signum() > 0 && !num.testBit(0)
                && num.shiftRight(1) instanceof BigInteger x && x.testBit(0)
                ? x.shiftLeft(k) : BigInteger.ZERO).filter(v -> v.signum() > 0).sorted().map(BigInteger::toString).collect(Collectors.toList()) instanceof List<String> res
            ? res.isEmpty() ? "-1" : String.join("\n", res) : "");
    }
}
