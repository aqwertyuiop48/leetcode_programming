import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long n && (Long) s.nextLong() instanceof Long m && (Long) s.nextLong() instanceof Long k
            ? k > n + m - 2 ? -1 : Math.max(k <= n - 1 ? n / (k + 1) * m : m / (k - n + 2), k <= m - 1 ? m / (k + 1) * n : n / (k - m + 2)) : 0);
    }
}
