import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long r && (Long) s.nextLong() instanceof Long x && (Long) s.nextLong() instanceof Long y
            && (Long) s.nextLong() instanceof Long x2 && (Long) s.nextLong() instanceof Long y2
            ? LongStream.iterate(0, k -> k + 1).filter(k -> 4 * r * r * k * k >= (x - x2) * (x - x2) + (y - y2) * (y - y2)).findFirst().getAsLong() : 0);
    }
}
