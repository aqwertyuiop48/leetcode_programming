import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).ifPresent(n -> System.out.print(IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> (i + j) % 2 == 0 ? "." : "#").collect(Collectors.joining())).collect(Collectors.joining("\n"))));
    }
}
