import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLine().trim().split(" +")).map(w -> Arrays.stream(w).mapToInt(x -> IntStream.range(0, 6).filter(i -> x.endsWith(new String[]{"lios", "liala", "etr", "etra", "initis", "inites"}[i])).findFirst().orElse(-1)).toArray() instanceof int[] c && IntStream.of(c).allMatch(v -> v >= 0) && (c.length == 1 || (IntStream.of(c).allMatch(v -> v % 2 == c[0] % 2) && IntStream.range(0, c.length - 1).allMatch(i -> c[i] / 2 <= c[i + 1] / 2) && IntStream.of(c).filter(v -> v / 2 == 1).count() == 1)) ? "YES" : "NO").ifPresent(System.out::println);
    }
}
