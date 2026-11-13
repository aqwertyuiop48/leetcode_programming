import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long s && Long.valueOf(sc.nextLong()) instanceof Long x1 && Long.valueOf(sc.nextLong()) instanceof Long x2
            && Long.valueOf(sc.nextLong()) instanceof Long t1 && Long.valueOf(sc.nextLong()) instanceof Long t2 && Long.valueOf(sc.nextLong()) instanceof Long p && Long.valueOf(sc.nextLong()) instanceof Long d
            && Long.valueOf(d == 1 ? p : 2 * s - p) instanceof Long u && Long.valueOf(x2 > x1 ? x1 : 2 * s - x1) instanceof Long tg
            ? Math.min(Math.abs(x2 - x1) * t2, (((tg - u) % (2 * s) + 2 * s) % (2 * s) + Math.abs(x2 - x1)) * t1) : "");
    }
}
