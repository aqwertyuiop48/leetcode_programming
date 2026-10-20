import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long x && Long.valueOf(s.nextLong()) instanceof Long y && Long.valueOf(s.nextLong()) instanceof Long m
            ? Math.max(x, y) >= m ? 0 : Math.max(x, y) <= 0 ? -1
                : Long.valueOf(Math.min(x, y)) instanceof Long a && Long.valueOf(Math.max(x, y)) instanceof Long b
                && Long.valueOf(a < 0 ? (-a + b - 1) / b : 0) instanceof Long k
                ? k + Stream.iterate(new long[]{a + k * b, b}, v -> v[1] < m, v -> new long[]{v[1], v[0] + v[1]}).count() : ""
            : "");
    }
}
