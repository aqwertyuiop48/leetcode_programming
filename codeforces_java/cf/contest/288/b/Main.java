import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long M
            ? java.math.BigInteger.valueOf(k).modPow(java.math.BigInteger.valueOf(k - 1), java.math.BigInteger.valueOf(M))
                .multiply(java.math.BigInteger.valueOf(n - k).modPow(java.math.BigInteger.valueOf(n - k), java.math.BigInteger.valueOf(M))).mod(java.math.BigInteger.valueOf(M)) : "");
    }
}

