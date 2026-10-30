import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && ((IntPredicate) x -> x > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(q -> x % q == 0)) instanceof IntPredicate pr && (Integer) IntStream.iterate(n, k -> k - 1).filter(pr).findFirst().getAsInt() instanceof Integer p ? (p.equals(n) ? "1\n" + n : n - p == 2 ? "2\n" + p + " 2" : (Integer) IntStream.rangeClosed(2, n - p).filter(a -> pr.test(a) && pr.test(n - p - a)).findFirst().getAsInt() instanceof Integer a ? "3\n" + p + " " + a + " " + (n - p - a) : "") : "");
    }
}
