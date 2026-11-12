import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long t && Long.valueOf(sc.nextLong()) instanceof Long s && Long.valueOf(sc.nextLong()) instanceof Long x
            && Long.valueOf(x - t) instanceof Long d
            ? (d == 0 || (d >= s && (d % s == 0 || d % s == 1)) ? "YES" : "NO") : "");
    }
}
