import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            ? LongStream.rangeClosed(0, (long) Math.sqrt(n) + 1).anyMatch(a -> a * a <= n && Math.round(Math.sqrt(n - a * a)) * Math.round(Math.sqrt(n - a * a)) == n - a * a) ? "YES" : "NO"
            : "");
    }
}
