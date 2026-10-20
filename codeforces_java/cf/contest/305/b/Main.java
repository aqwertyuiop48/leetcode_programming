import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.nextBigInteger() instanceof BigInteger p && s.nextBigInteger() instanceof BigInteger q
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Stream.generate(s::nextBigInteger).limit(n).toArray(BigInteger[]::new) instanceof BigInteger[] a
            && IntStream.range(1, n).boxed().reduce(new BigInteger[] {a[n - 1], BigInteger.ONE}, (v, i) -> new BigInteger[] {a[n - 1 - i].multiply(v[0]).add(v[1]), v[0]}, (x, y) -> x) instanceof BigInteger[] f
            ? f[0].multiply(q).equals(f[1].multiply(p)) ? "YES" : "NO" : "");
    }
}
