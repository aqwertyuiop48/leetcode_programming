import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && BigInteger.valueOf(1000000007L) instanceof BigInteger m
            && new BigInteger(t[0]) instanceof BigInteger a && new BigInteger(t[1]) instanceof BigInteger b
            && new BigInteger(t[2]) instanceof BigInteger n && new BigInteger(t[3]) instanceof BigInteger x
            && a.modPow(n, m) instanceof BigInteger an
            ? an.multiply(x).add(a.equals(BigInteger.ONE) ? b.multiply(n) : b.multiply(an.subtract(BigInteger.ONE)).multiply(a.subtract(BigInteger.ONE).modInverse(m))).mod(m) : "");
    }
}
