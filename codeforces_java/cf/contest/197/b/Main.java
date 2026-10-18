import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.rangeClosed(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.rangeClosed(0, m).map(i -> s.nextInt()).toArray() instanceof int[] b
            ? n > m ? (a[0] < 0 ^ b[0] < 0 ? "-Infinity" : "Infinity")
                : n < m ? "0/1"
                : Long.valueOf(BigInteger.valueOf(a[0]).gcd(BigInteger.valueOf(b[0])).longValue()) instanceof Long g
                    ? (b[0] < 0 ? -a[0] / g : a[0] / g) + "/" + Math.abs(b[0]) / g : ""
            : "");
    }
}
