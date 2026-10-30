import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && BigInteger.valueOf(1000000007) instanceof BigInteger m ? BigInteger.valueOf(27).modPow(BigInteger.valueOf(n), m).subtract(BigInteger.valueOf(7).modPow(BigInteger.valueOf(n), m)).mod(m) : "");
    }
}
