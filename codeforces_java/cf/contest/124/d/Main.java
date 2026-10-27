import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Long) s.nextLong() instanceof Long a
            && (Long) s.nextLong() instanceof Long b
            && (Long) s.nextLong() instanceof Long x1
            && (Long) s.nextLong() instanceof Long y1
            && (Long) s.nextLong() instanceof Long x2
            && (Long) s.nextLong() instanceof Long y2
            ? Math.max(
                Math.abs(Math.floorDiv(x1 + y1, 2 * a) - Math.floorDiv(x2 + y2, 2 * a)),
                Math.abs(Math.floorDiv(x1 - y1, 2 * b) - Math.floorDiv(x2 - y2, 2 * b)))
            : 0L);
    }
}

