import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n
            && Long.valueOf((long) Math.sqrt(2.0 * n * n)) instanceof Long r0
            && Long.valueOf(r0 * r0 > 2 * n * n ? r0 - 1 : (r0 + 1) * (r0 + 1) <= 2 * n * n ? r0 + 1 : r0) instanceof Long r
            ? n == 0 ? 1 : 4 * r : "");
    }
}
