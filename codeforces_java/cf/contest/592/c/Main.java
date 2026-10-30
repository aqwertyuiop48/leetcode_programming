import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.nextBigInteger() instanceof BigInteger t && s.nextBigInteger() instanceof BigInteger w && s.nextBigInteger() instanceof BigInteger b
            && w.divide(w.gcd(b)).multiply(b) instanceof BigInteger l && w.min(b) instanceof BigInteger mn && t.divide(l) instanceof BigInteger K
            && t.min(mn.subtract(BigInteger.ONE)).add(K.signum() == 0 ? BigInteger.ZERO : K.subtract(BigInteger.ONE).multiply(mn).add(t.min(K.multiply(l).add(mn).subtract(BigInteger.ONE)).subtract(K.multiply(l)).add(BigInteger.ONE))) instanceof BigInteger cnt
            && cnt.gcd(t) instanceof BigInteger g
            ? cnt.divide(g) + "/" + t.divide(g) : "");
    }
}
