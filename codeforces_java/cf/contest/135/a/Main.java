import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.generate(s::nextInt).limit(n).sorted().toArray() instanceof int[] a
            ? IntStream.concat(Arrays.stream(a, 0, n - 1), IntStream.of(a[n - 1] == 1 ? 2 : 1))
                .sorted().mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}

