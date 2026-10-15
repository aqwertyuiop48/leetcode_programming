import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new Scanner(System.in).nextLine().trim().split(",")).map(String::trim).mapToInt(Integer::parseInt).distinct().sorted().boxed().toList() instanceof List<Integer> l
            ? IntStream.range(0, l.size()).boxed()
                .collect(Collectors.groupingBy(i -> l.get(i) - i, TreeMap::new, Collectors.toList())).values().stream()
                .map(g -> g.size() == 1 ? "" + l.get(g.get(0)) : l.get(g.get(0)) + "-" + l.get(g.get(g.size() - 1)))
                .collect(Collectors.joining(","))
            : "");
    }
}


