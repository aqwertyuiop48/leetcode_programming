import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            ? IntStream.rangeClosed(1, n).map(i -> s.nextInt()).reduce(0, (a, b) -> a ^ b)
                ^ IntStream.rangeClosed(1, n).map(k -> ((n / k & 1) == 1 ? new int[]{k - 1, 1, k, 0}[(k - 1) % 4] : 0) ^ new int[]{n % k, 1, n % k + 1, 0}[(n % k) % 4]).reduce(0, (a, b) -> a ^ b) : 0);
    }
}
