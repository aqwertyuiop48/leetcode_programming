import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            ? n <= 2 ? "1\n1" : n == 3 ? "2\n1 3" : n == 4 ? "4\n2 4 1 3"
                : n + "\n" + IntStream.concat(IntStream.iterate(1, i -> i <= n, i -> i + 2), IntStream.iterate(2, i -> i <= n, i -> i + 2)).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
