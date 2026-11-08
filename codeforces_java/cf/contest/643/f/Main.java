import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Long.valueOf(t[0]) instanceof Long n && Integer.valueOf((int) Math.min(t[1], n - 1)) instanceof Integer p && Integer.valueOf((int) t[2]) instanceof Integer q
            && new BigInteger[p + 1] instanceof BigInteger[] cb
            && Stream.of(0).peek(z -> Arrays.setAll(cb, k -> k == 0 ? BigInteger.ONE : cb[k - 1].multiply(BigInteger.valueOf(n - k + 1)).divide(BigInteger.valueOf(k)))).findFirst().isPresent()
            && Arrays.stream(cb).mapToInt(BigInteger::intValue).toArray() instanceof int[] c
            && new int[q + 1] instanceof int[] r
            && IntStream.rangeClosed(0, p).filter(k -> Stream.of(0).peek(z -> Arrays.setAll(r, d -> r[d] * d + c[p - k])).findFirst().isPresent() && false).count() == 0
            ? Integer.toUnsignedString(IntStream.rangeClosed(1, q).reduce(0, (acc, d) -> acc ^ d * r[d])) : "");
    }
}
