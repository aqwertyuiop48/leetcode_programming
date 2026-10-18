import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && Long.valueOf(s.nextLong()) instanceof Long m
            && Long.valueOf(s.nextLong()) instanceof Long k
            ? BigInteger.valueOf(m).modPow(BigInteger.valueOf(k == 1 || k > n ? n : k == n ? (n + 1) / 2 : k % 2 == 1 ? 2 : 1), BigInteger.valueOf(1_000_000_007L))
            : "");
    }
}
