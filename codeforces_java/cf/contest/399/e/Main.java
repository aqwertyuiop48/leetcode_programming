import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n && Integer.valueOf(n / 2) instanceof Integer m
            ? n == 5 ? "3 1 1\n1 2 2\n2 4 1\n4 5 1\n3 4\n3 5"
                : Stream.of(IntStream.rangeClosed(1, m).mapToObj(i -> i + " " + (m + i) + " 1"),
                        IntStream.range(1, m).mapToObj(i -> (m + i) + " " + (m + i + 1) + " " + (2 * i - 1)),
                        IntStream.range(0, n % 2).mapToObj(i -> 2 * m + " " + (2 * m + 1) + " 1"),
                        IntStream.range(1, m).mapToObj(i -> i + " " + (i + 1)),
                        Stream.of("1 3")).flatMap(s -> s).collect(Collectors.joining("\n")) : "");
    }
}
