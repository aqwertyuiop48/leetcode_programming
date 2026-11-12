import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n && Double.valueOf(sc.nextDouble()) instanceof Double l
            && Double.valueOf(sc.nextDouble()) instanceof Double v1 && Double.valueOf(sc.nextDouble()) instanceof Double v2
            && Long.valueOf(sc.nextLong()) instanceof Long k
            && Double.valueOf((n + k - 1) / k - 1) instanceof Double g1
            && Double.valueOf(l / (1 + 2 * v1 * g1 / (v1 + v2))) instanceof Double d
            ? String.format(Locale.US, "%.10f", g1 * 2 * d / (v1 + v2) + d / v2) : "");
    }
}
