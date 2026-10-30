import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s ? IntStream.range(0, s.nextInt()).mapToObj(i -> s.nextLong()).map(n -> n * (n + 1) / 2 - 2 * (2 * Long.highestOneBit(n) - 1)).map(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
