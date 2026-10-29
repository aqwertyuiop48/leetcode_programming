import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 4).mapToObj(i -> s.next()).toList() instanceof List<String> g
            && IntStream.range(0, 3).anyMatch(i -> IntStream.range(0, 3).anyMatch(j -> Integer.valueOf((int) Stream.of(g.get(i).charAt(j), g.get(i).charAt(j + 1), g.get(i + 1).charAt(j), g.get(i + 1).charAt(j + 1)).filter(c -> c == '#').count()) instanceof Integer c && c != 2))
            ? "YES" : "NO");
    }
}

