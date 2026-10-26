import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer k
            ? k % 2 == 0 ? "NO" : Stream.concat(Stream.concat(
                IntStream.range(0, 2).boxed().flatMap(c -> Stream.concat(Stream.concat(
                    IntStream.rangeClosed(1, k - 1).mapToObj(i -> (c * (2 * k - 1) + 1) + " " + (c * (2 * k - 1) + 1 + i)),
                    IntStream.rangeClosed(1, k - 1).boxed().flatMap(i -> IntStream.rangeClosed(1, k - 1).mapToObj(j -> (c * (2 * k - 1) + 1 + i) + " " + (c * (2 * k - 1) + k + j)))),
                    IntStream.range(0, (k - 1) / 2).mapToObj(i -> (c * (2 * k - 1) + k + 2 * i + 1) + " " + (c * (2 * k - 1) + k + 2 * i + 2)))),
                Stream.of("1 " + (2 * k))), Stream.<String>empty()).toList() instanceof List<String> e
                ? "YES\n" + (4 * k - 2) + " " + e.size() + "\n" + String.join("\n", e) : "" : "");
    }
}
