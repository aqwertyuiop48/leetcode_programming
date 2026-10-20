import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().map(String::trim).toArray(String[]::new) instanceof String[] ln
            && ln[0] instanceof String s && java.math.BigInteger.valueOf(Long.parseLong(ln[1])) instanceof java.math.BigInteger k
            && java.math.BigInteger.valueOf(1000000007L) instanceof java.math.BigInteger M
            && java.math.BigInteger.TWO.modPow(java.math.BigInteger.valueOf(s.length()), M) instanceof java.math.BigInteger P
            && IntStream.range(0, s.length()).filter(i -> s.charAt(i) == '0' || s.charAt(i) == '5').mapToObj(i -> java.math.BigInteger.TWO.modPow(java.math.BigInteger.valueOf(i), M)).reduce(java.math.BigInteger.ZERO, java.math.BigInteger::add) instanceof java.math.BigInteger S
            ? S.multiply(P.equals(java.math.BigInteger.ONE) ? k : P.modPow(k, M).subtract(java.math.BigInteger.ONE).multiply(P.subtract(java.math.BigInteger.ONE).modInverse(M))).mod(M) : "");
    }
}
