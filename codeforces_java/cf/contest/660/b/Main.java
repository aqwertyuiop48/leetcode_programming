import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            ? IntStream.rangeClosed(1, n).boxed().flatMap(i -> Stream.of(2 * n + 2 * i - 1, 2 * i - 1, 2 * n + 2 * i, 2 * i))
                .filter(x -> x <= m).map(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}
