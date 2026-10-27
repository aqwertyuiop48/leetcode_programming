import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).map(n -> IntStream.range(0, n).mapToObj(i -> String.valueOf("abcd".charAt(i % 4))).collect(Collectors.joining())).ifPresent(System.out::println);
    }
}

