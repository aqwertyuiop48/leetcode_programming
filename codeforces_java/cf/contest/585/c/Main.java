import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long x && (Long) s.nextLong() instanceof Long y ? (BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).equals(BigInteger.ONE) ? Stream.iterate(new long[]{x, y}, a -> a[0] != 1 || a[1] != 1, a -> a[0] > a[1] ? new long[]{a[0] - (a[0] - 1) / a[1] * a[1], a[1]} : new long[]{a[0], a[1] - (a[1] - 1) / a[0] * a[0]}).map(a -> a[0] > a[1] ? (a[0] - 1) / a[1] + "A" : (a[1] - 1) / a[0] + "B").collect(Collectors.joining()) : "Impossible") : "");
    }
}
