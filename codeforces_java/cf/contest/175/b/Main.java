import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Stream.generate(() -> Map.entry(sc.next(), sc.nextInt())).limit(n).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Math::max, TreeMap::new)) instanceof TreeMap<String, Integer> best
            && Integer.valueOf(best.size()) instanceof Integer total
            ? total + "\n" + best.entrySet().stream().map(e -> e.getKey() + " " + (Long.valueOf(best.values().stream().filter(v -> v <= e.getValue()).count()) instanceof Long c
                ? c * 100 >= 99L * total ? "pro" : c * 100 >= 90L * total ? "hardcore" : c * 100 >= 80L * total ? "average" : c * 100 >= 50L * total ? "random" : "noob" : "")).collect(Collectors.joining("\n"))
            : "");
    }
}

