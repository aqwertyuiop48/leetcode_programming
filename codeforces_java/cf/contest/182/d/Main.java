import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String a
            && sc.next() instanceof String b
            && Integer.valueOf(BigInteger.valueOf(a.length()).gcd(BigInteger.valueOf(b.length())).intValue()) instanceof Integer g
            ? IntStream.rangeClosed(1, g).filter(l -> g % l == 0 && a.substring(0, l).repeat(a.length() / l).equals(a) && a.substring(0, l).repeat(b.length() / l).equals(b)).count()
            : 0);
    }
}

