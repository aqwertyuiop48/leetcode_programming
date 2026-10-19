import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(1, 2 * n + 1).boxed().collect(Collectors.groupingBy(i -> s.nextInt(), TreeMap::new, Collectors.toList())) instanceof TreeMap<Integer, List<Integer>> g
            ? g.values().stream().allMatch(l -> l.size() % 2 == 0)
                ? g.values().stream().flatMap(l -> IntStream.range(0, l.size() / 2).mapToObj(i -> l.get(2 * i) + " " + l.get(2 * i + 1))).collect(Collectors.joining("\n")) : "-1" : "");
    }
}
