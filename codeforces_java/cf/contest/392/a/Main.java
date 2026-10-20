import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n
            && Long.valueOf(2 * n * n) instanceof Long q && Long.valueOf((long) Math.sqrt(q)) instanceof Long r0
            && Long.valueOf(r0 * r0 > q ? r0 - 1 : (r0 + 1) * (r0 + 1) <= q ? r0 + 1 : r0) instanceof Long r
            ? n == 0 ? 1 : 4 * r : "");
    }
}
