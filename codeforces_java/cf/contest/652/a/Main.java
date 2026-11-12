import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long h1 && Long.valueOf(sc.nextLong()) instanceof Long h2
            && Long.valueOf(sc.nextLong()) instanceof Long a && Long.valueOf(sc.nextLong()) instanceof Long b
            ? (h1 + 8 * a >= h2 ? 0 : a <= b ? -1 : (h2 - h1 - 8 * a + 12 * (a - b) - 1) / (12 * (a - b))) : "");
    }
}
