import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer b
            ? Stream.generate(s::next).limit(n).map(x -> new BigInteger(x, b)).reduce(BigInteger.ZERO, BigInteger::add).toString(b).toUpperCase()
            : "");
    }
}
