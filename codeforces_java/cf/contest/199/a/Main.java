import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]}).limit(50).map(f -> f[0]).toList() instanceof List<Long> fib
            ? n <= 3 ? n == 0 ? "0 0 0" : n == 1 ? "0 0 1" : n == 2 ? "0 1 1" : "1 1 1"
                : Integer.valueOf(fib.indexOf(n)) instanceof Integer k ? fib.get(k - 4) + " " + fib.get(k - 3) + " " + fib.get(k - 1) : ""
            : "");
    }
}
