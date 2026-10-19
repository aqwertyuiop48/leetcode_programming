import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? IntStream.range(0, n).map(i -> 2 * k + 1 <= n ? i >= 2 * k + 1 ? i + 1 : i % 2 == 0 ? 1 + i / 2 : 2 * k + 1 - i / 2 : i < k ? n - i : i - k + 1)
                .mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
