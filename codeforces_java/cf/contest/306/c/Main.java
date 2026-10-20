import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer w && Integer.valueOf(s.nextInt()) instanceof Integer b
            && Long.valueOf(1000000009L) instanceof Long M && new long[4001] instanceof long[] f && new long[4001] instanceof long[] fi
            && (f[0] = 1) > 0 && IntStream.rangeClosed(1, 4000).allMatch(i -> (f[i] = f[i - 1] * i % M) > 0)
            && IntStream.rangeClosed(0, 4000).allMatch(i -> (fi[i] = BigInteger.valueOf(f[i]).modInverse(BigInteger.valueOf(M)).longValue()) > 0)
            && ((IntBinaryOperator) (a, k) -> k < 0 || k > a ? 0 : (int) (f[a] * fi[k] % M * fi[a - k] % M)) instanceof IntBinaryOperator C
            ? IntStream.rangeClosed(1, n - 2).mapToLong(k -> (long) C.applyAsInt(b - 1, k - 1) * C.applyAsInt(w - 1, n - k - 1) % M * (n - k - 1) % M).sum() % M * f[w] % M * f[b] % M : "");
    }
}
