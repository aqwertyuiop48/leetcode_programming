import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            BigInteger.valueOf(Long.parseLong(new String(System.in.readAllBytes()).trim())) instanceof BigInteger a
            && BigInteger.TEN.pow(18) instanceof BigInteger t
            ? a.subtract(t.multiply(BigInteger.valueOf(81)).mod(a)) + " " + a.subtract(t.multiply(BigInteger.valueOf(81)).mod(a)).add(t).subtract(BigInteger.ONE)
            : "");
    }
}
