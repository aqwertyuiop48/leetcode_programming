import java.util.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()}).ifPresent(nmk -> Optional.of(IntStream.range(0, (int) (3 * nmk[2])).allMatch(i -> sc.next() != null)).ifPresent(consumed -> Optional.of(sc.nextLong()).ifPresent(p -> System.out.println(((nmk[0] + nmk[1]) % 2 != 0) ? BigInteger.ZERO : BigInteger.valueOf(2).modPow(BigInteger.valueOf(Math.max(0L, (nmk[0] - 1) * (nmk[1] - 1) - nmk[2])), BigInteger.valueOf(p)))))));
    }
}

