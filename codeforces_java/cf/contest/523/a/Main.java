import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer w && (Integer) s.nextInt() instanceof Integer h
            && IntStream.range(0, h).mapToObj(i -> s.next()).toList() instanceof List<String> g
            ? IntStream.range(0, 2 * w).mapToObj(i -> IntStream.range(0, 2 * h).mapToObj(j -> String.valueOf(g.get(j / 2).charAt(i / 2))).collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
