import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in).next() instanceof String s && s.substring(0, s.indexOf('.')) instanceof String a && s.substring(s.indexOf('.') + 1) instanceof String rest
            && (rest.indexOf('(') < 0 ? rest : rest.substring(0, rest.indexOf('('))) instanceof String b && (rest.indexOf('(') < 0 ? "" : rest.substring(rest.indexOf('(') + 1, rest.indexOf(')'))) instanceof String c
            && new java.math.BigInteger(a + b + c) instanceof java.math.BigInteger all && new java.math.BigInteger(a + b) instanceof java.math.BigInteger ab
            && (c.isEmpty() ? ab : all.subtract(ab)) instanceof java.math.BigInteger num
            && java.math.BigInteger.TEN.pow(b.length()).multiply(c.isEmpty() ? java.math.BigInteger.ONE : java.math.BigInteger.TEN.pow(c.length()).subtract(java.math.BigInteger.ONE)) instanceof java.math.BigInteger den
            && num.gcd(den) instanceof java.math.BigInteger g ? num.divide(g) + "/" + den.divide(g) : "");
    }
}
