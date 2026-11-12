import java.math.BigInteger;
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && BigInteger.valueOf(t[0]) instanceof BigInteger a1 && BigInteger.valueOf(t[1]) instanceof BigInteger b1 && BigInteger.valueOf(t[2]) instanceof BigInteger a2 && BigInteger.valueOf(t[3]) instanceof BigInteger b2
            && a1.gcd(a2) instanceof BigInteger g
            && b2.subtract(b1) instanceof BigInteger diff
            && a2.divide(g) instanceof BigInteger m2
            && a1.multiply(m2) instanceof BigInteger M
            && BigInteger.valueOf(Math.max(t[4], Math.max(t[1], t[3]))) instanceof BigInteger lo && BigInteger.valueOf(t[5]) instanceof BigInteger hi
            && ((Function<BigInteger, BigInteger>) v -> v.subtract(v.mod(M)).divide(M)) instanceof Function<BigInteger, BigInteger> fd
            ? (diff.mod(g).signum() != 0 || lo.compareTo(hi) > 0 ? BigInteger.ZERO
                : (b1.add(a1.multiply(diff.divide(g).mod(m2).multiply(a1.divide(g).modInverse(m2)).mod(m2))) instanceof BigInteger x0
                ? fd.apply(hi.subtract(x0)).subtract(fd.apply(lo.subtract(BigInteger.ONE).subtract(x0))) : BigInteger.ZERO)) : "");
    }
}
