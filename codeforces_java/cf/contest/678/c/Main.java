import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[0]) instanceof Long n && Long.valueOf(t[1]) instanceof Long a && Long.valueOf(t[2]) instanceof Long b
            && Long.valueOf(t[3]) instanceof Long p && Long.valueOf(t[4]) instanceof Long q
            ? n / a * p + n / b * q - n / (a / BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue() * b) * Math.min(p, q) : "");
    }
}
