import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            ? n == 1
                ? "YES\n1"
                : n == 4
                ? "YES\n1\n3\n2\n4"
                : IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(d -> n % d == 0)
                    && new int[n + 1] instanceof int[] inv
                    && (inv[1] = 1) > 0
                    && IntStream.range(2, n).allMatch(i -> (inv[i] = (int) ((n - (long) (n / i) * inv[n % i] % n) % n)) > 0)
                ? "YES\n" + IntStream.rangeClosed(1, n).mapToObj(i -> i == 1 ? "1" : i == n ? String.valueOf(n) : String.valueOf((long) (i - 1) * inv[i] % n)).collect(Collectors.joining("\n"))
                : "NO"
            : "");
    }
}
