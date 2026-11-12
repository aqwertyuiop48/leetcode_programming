
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] ln
            && ln[0] instanceof String s && java.math.BigInteger.valueOf(Long.parseLong(ln[1])) instanceof java.math.BigInteger k
            && java.math.BigInteger.valueOf(1000000007L) instanceof java.math.BigInteger M
            && new long[]{1, 0} instanceof long[] st
            && IntStream.range(0, s.length()).allMatch(i -> ((s.charAt(i) == '0' || s.charAt(i) == '5' ? (st[1] = (st[1] + st[0]) % 1000000007L) : 0) >= 0) && (st[0] = st[0] * 2 % 1000000007L) > 0)
            && java.math.BigInteger.valueOf(st[0]) instanceof java.math.BigInteger P
            ? java.math.BigInteger.valueOf(st[1]).multiply(P.equals(java.math.BigInteger.ONE) ? k : P.modPow(k, M).subtract(java.math.BigInteger.ONE).multiply(P.subtract(java.math.BigInteger.ONE).modInverse(M))).mod(M) : "");
    }
}



