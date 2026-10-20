import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer b
            && Integer.valueOf(n + 1) instanceof Integer p
            && ((IntPredicate) q -> q > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(q)).noneMatch(d -> q % d == 0)) instanceof IntPredicate pr
            && IntStream.rangeClosed(2, p - 1).filter(q -> (p - 1) % q == 0 && pr.test(q)).toArray() instanceof int[] fs
            ? n == 1 ? (b > 2 ? b - 1 : -1)
                : !pr.test(p) ? -1
                : IntStream.iterate(b - 1, x -> x > 1, x -> x - 1)
                    .filter(x -> x % p != 0 && Arrays.stream(fs)
                        .noneMatch(q -> java.math.BigInteger.valueOf(x % p).modPow(java.math.BigInteger.valueOf((p - 1) / q), java.math.BigInteger.valueOf(p)).equals(java.math.BigInteger.ONE)))
                    .findFirst().orElse(-1) : "");
    }
}
