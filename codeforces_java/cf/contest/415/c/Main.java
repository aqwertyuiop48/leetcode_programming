import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? n == 1 ? (k == 0 ? "1" : "-1") : n / 2 > k ? "-1"
                : IntStream.range(0, n).mapToObj(i -> String.valueOf(i == 0 ? k - n / 2 + 1 : i == 1 ? 2 * (k - n / 2 + 1) : 2 * (k - n / 2 + 1) + i - 1)).collect(Collectors.joining(" ")) : "");
    }
}
