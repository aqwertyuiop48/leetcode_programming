import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.generate(s::nextInt).limit(n).toArray() instanceof int[] p
            && new int[n + 1] instanceof int[] inv
            && IntStream.range(0, n).allMatch(i -> (inv[p[i]] = i + 1) > 0)
            ? Arrays.stream(inv, 1, n + 1).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}

