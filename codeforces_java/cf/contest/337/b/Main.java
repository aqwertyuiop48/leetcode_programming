import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long b
            && Long.valueOf(s.nextLong()) instanceof Long c && Long.valueOf(s.nextLong()) instanceof Long d
            && Long.valueOf(a * d > b * c ? a * d - b * c : b * c - a * d) instanceof Long num && Long.valueOf(a * d > b * c ? a * d : b * c) instanceof Long den
            && Long.valueOf(java.math.BigInteger.valueOf(num).gcd(java.math.BigInteger.valueOf(den)).longValue()) instanceof Long g
            ? num == 0 ? "0/1" : num / g + "/" + den / g : "");
    }
}
