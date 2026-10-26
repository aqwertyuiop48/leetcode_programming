import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long k && (Long) s.nextLong() instanceof Long n && (Long) s.nextLong() instanceof Long w
            ? Math.max(0, k * w * (w + 1) / 2 - n) : 0);
    }
}
