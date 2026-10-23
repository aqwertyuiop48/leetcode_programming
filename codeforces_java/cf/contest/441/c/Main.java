import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n * m).mapToObj(t -> (t / m + 1) + " " + (t / m % 2 == 0 ? t % m + 1 : m - t % m)).toList() instanceof List<String> cells
            ? IntStream.range(0, k).mapToObj(i -> i < k - 1 ? "2 " + cells.get(2 * i) + " " + cells.get(2 * i + 1) : (n * m - 2 * (k - 1)) + " " + cells.subList(2 * (k - 1), n * m).stream().collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
