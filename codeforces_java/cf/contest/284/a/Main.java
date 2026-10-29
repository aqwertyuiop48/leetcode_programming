import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt() - 1) instanceof Integer m
            ? IntStream.rangeClosed(1, m).filter(k -> java.math.BigInteger.valueOf(k).gcd(java.math.BigInteger.valueOf(m)).intValue() == 1).count() : "");
    }
}

