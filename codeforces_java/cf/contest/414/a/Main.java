import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && (Integer) (n / 2) instanceof Integer p
            ? p > k || p == 0 && k > 0 ? "-1" : p == 0 ? "1" : (k - p + 1) + " " + 2 * (k - p + 1) + IntStream.range(0, n - 2).mapToObj(i -> " " + (2 * (k - p + 1) + 1 + i)).collect(Collectors.joining()) : "");
    }
}
