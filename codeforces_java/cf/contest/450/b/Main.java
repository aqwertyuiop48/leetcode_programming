import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long x && (Long) s.nextLong() instanceof Long y && (Long) s.nextLong() instanceof Long n
            ? (new long[]{x, y, y - x, -x, -y, x - y}[(int) ((n - 1) % 6)] % 1000000007L + 1000000007L) % 1000000007L : 0);
    }
}
