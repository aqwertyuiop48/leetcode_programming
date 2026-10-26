import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long r && (Long) s.nextLong() instanceof Long x && (Long) s.nextLong() instanceof Long y
            && (Long) s.nextLong() instanceof Long x2 && (Long) s.nextLong() instanceof Long y2
            ? (long) Math.ceil(Math.sqrt((double) ((x - x2) * (x - x2) + (y - y2) * (y - y2))) / (2.0 * r) - 1e-9) : 0);
    }
}
