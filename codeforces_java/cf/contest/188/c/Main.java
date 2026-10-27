import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && new BigInteger(s.next()) instanceof BigInteger a
            && new BigInteger(s.next()) instanceof BigInteger b
            ? a.multiply(b).divide(a.gcd(b))
            : "");
    }
}

