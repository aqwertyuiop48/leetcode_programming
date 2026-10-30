import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && LongStream.generate(s::nextLong).limit(6).toArray() instanceof long[] a
                && (Long) ((a[0] - a[3]) * (a[0] - a[3]) + (a[1] - a[4]) * (a[1] - a[4])) instanceof Long d2
                ? String.format(Locale.ROOT, "%.20f", d2 >= (a[2] + a[5]) * (a[2] + a[5]) ? 0.0
                : d2 <= (a[2] - a[5]) * (a[2] - a[5]) ? Math.PI * Math.min(a[2], a[5]) * Math.min(a[2], a[5])
                : (Long) (d2 + a[2] * a[2] - a[5] * a[5]) instanceof Long n1 && (Long) (d2 + a[5] * a[5] - a[2] * a[2]) instanceof Long n2
                && (Double) Math.sqrt(BigInteger.valueOf(4).multiply(BigInteger.valueOf(d2)).multiply(BigInteger.valueOf(a[2] * a[2])).subtract(BigInteger.valueOf(n1).pow(2)).doubleValue()) instanceof Double sk
                && ((DoubleUnaryOperator) x -> x < 0.5 ? x * x * x * (1 / 6.0 - x * x * (1 / 120.0 - x * x * (1 / 5040.0 - x * x * (1 / 362880.0 - x * x / 39916800.0)))) : x - Math.sin(x)) instanceof DoubleUnaryOperator g
                ? (double) (a[2] * a[2]) / 2 * g.applyAsDouble(2 * Math.atan2(sk, n1)) + (double) (a[5] * a[5]) / 2 * g.applyAsDouble(2 * Math.atan2(sk, n2)) : 0.0) : "");
    }
}
