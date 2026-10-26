import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).mapToObj(i -> Long.valueOf(s.nextLong()) instanceof Long k && Long.valueOf(s.nextLong()) instanceof Long b
                ? k == 0 ? "" : Long.valueOf(k < 0 ? -k : k) instanceof Long den && Long.valueOf(k < 0 ? b : -b) instanceof Long num
                    && Long.valueOf(BigInteger.valueOf(num).gcd(BigInteger.valueOf(den)).longValue()) instanceof Long g
                    ? (num / g) + "/" + (den / g) : "" : "").filter(x -> !x.isEmpty()).distinct().count()
            : "");
    }
}
