import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long k && (Long) s.nextLong() instanceof Long a && (Long) s.nextLong() instanceof Long b
            ? Math.floorDiv(b, k) - Math.floorDiv(a - 1, k) : 0);
    }
}
