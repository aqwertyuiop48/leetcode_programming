import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).mapToObj(j -> IntStream.range(0, n / 2).boxed().flatMap(t -> Stream.of(j * (n / 2) + t + 1, n * n - (j * (n / 2) + t))).map(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
