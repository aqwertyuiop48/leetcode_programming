import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Long) s.nextLong() instanceof Long x && (Long) s.nextLong() instanceof Long y ? y < n || (y - n + 1) * (y - n + 1) + n - 1 < x ? "-1" : IntStream.range(0, n).mapToObj(i -> String.valueOf(i == 0 ? y - n + 1 : 1)).collect(Collectors.joining("\n")) : "").ifPresent(System.out::println);
    }
}
