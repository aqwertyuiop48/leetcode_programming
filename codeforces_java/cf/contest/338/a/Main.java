import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long m && Long.valueOf(s.nextLong()) instanceof Long k
            && Long.valueOf(1000000009L) instanceof Long M && Long.valueOf(m - (n / k * (k - 1) + n % k)) instanceof Long x
            ? x <= 0 ? m % M : (k % M * ((java.math.BigInteger.TWO.modPow(java.math.BigInteger.valueOf(x + 1), java.math.BigInteger.valueOf(M)).longValue() - 2 + M) % M) % M + (m - x * k) % M) % M : "");
    }
}
