import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer x0 && (Integer) s.nextInt() instanceof Integer y0
            ? IntStream.range(0, n).mapToObj(i -> (Integer) (s.nextInt() - x0) instanceof Integer dx && (Integer) (s.nextInt() - y0) instanceof Integer dy
                && (Integer) BigInteger.valueOf(dx).gcd(BigInteger.valueOf(dy)).intValue() instanceof Integer g
                ? (dx < 0 || dx == 0 && dy < 0 ? -dx / g : dx / g) + "," + (dx < 0 || dx == 0 && dy < 0 ? -dy / g : dy / g) : "").distinct().count() : 0);
    }
}
