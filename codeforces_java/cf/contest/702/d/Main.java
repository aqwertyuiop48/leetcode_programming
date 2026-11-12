import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long d && Long.valueOf(sc.nextLong()) instanceof Long k
            && Long.valueOf(sc.nextLong()) instanceof Long a && Long.valueOf(sc.nextLong()) instanceof Long b
            && Long.valueOf(sc.nextLong()) instanceof Long t
            ? (d <= k ? d * a : Math.min(k * a + (d - k) * b,
                k * a + (d - k) / k * (t + k * a) + Math.min(t + (d - k) % k * a, (d - k) % k * b))) : "");
    }
}
