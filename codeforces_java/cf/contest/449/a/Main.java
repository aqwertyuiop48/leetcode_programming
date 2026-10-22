import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long m && Long.valueOf(s.nextLong()) instanceof Long k
            && (BinaryOperator<Long>) ((p, q) -> Long.valueOf(Math.min(k, p - 1)) instanceof Long a && k - a <= q - 1 ? p / (a + 1) * (q / (k - a + 1)) : -1L) instanceof BinaryOperator<Long> f
            ? k > n + m - 2 ? -1L : Math.max(f.apply(n, m), f.apply(m, n)) : "");
    }
}
