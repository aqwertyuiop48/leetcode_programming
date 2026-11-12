import java.math.BigInteger;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] h
            && Long.valueOf(h[0]) instanceof Long n && Integer.valueOf(h[1]) instanceof Integer p && Integer.valueOf(h[2]) instanceof Integer q
            && Integer.valueOf((int) Math.min(p, n - 1)) instanceof Integer d && new int[d + 1] instanceof int[] c && new BigInteger[]{BigInteger.ONE} instanceof BigInteger[] cur && (c[0] = 1) == 1
            && IntStream.rangeClosed(1, d).filter(j -> (cur[0] = cur[0].multiply(BigInteger.valueOf(n - j + 1)).divide(BigInteger.valueOf(j))) != null & (c[j] = cur[0].intValue()) * 0 == 0).count() >= 0
            ? Integer.toUnsignedString(IntStream.rangeClosed(1, q).parallel().map(i -> i * IntStream.range(0, d + 1).reduce(0, (r, j) -> r * i + c[d - j])).reduce(0, (a, b) -> a ^ b)) : "");
    }
}
