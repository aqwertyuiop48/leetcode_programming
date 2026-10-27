import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && new BigInteger(s.next()) instanceof BigInteger a
            && new BigInteger(s.next()) instanceof BigInteger b
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? Stream.iterate(new BigInteger[]{a, b}, p -> new BigInteger[]{p[1], p[0].add(p[1])}).skip(n).findFirst().get()[0]
            : "");
    }
}

