import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 8).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            && (Integer) IntStream.range(0, 8).map(c -> IntStream.range(0, 8).filter(r -> g[r].charAt(c) != '.').limit(1).filter(r -> g[r].charAt(c) == 'W').findFirst().orElse(99)).min().getAsInt() instanceof Integer w
            && (Integer) IntStream.range(0, 8).map(c -> IntStream.range(0, 8).map(i -> 7 - i).filter(r -> g[r].charAt(c) != '.').limit(1).filter(r -> g[r].charAt(c) == 'B').map(r -> 7 - r).findFirst().orElse(99)).min().getAsInt() instanceof Integer b
            ? (w <= b ? "A" : "B") : "");
    }
}
