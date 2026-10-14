import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.generate(s::nextInt).limit(n).boxed().collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Integer> cur
                && IntStream.generate(s::nextInt).limit(n).boxed().toList() instanceof List<Integer> b
                && new ArrayList<String>() instanceof ArrayList<String> log
                && IntStream.range(0, n).allMatch(i -> Optional.of(cur.subList(i, n).indexOf(b.get(i)) + i)
                    .map(j -> IntStream.iterate(j - 1, k -> k >= i, k -> k - 1).allMatch(k -> cur.set(k, cur.set(k + 1, cur.get(k))) != null && log.add((k + 1) + " " + (k + 2)))).get())
                ? log.size() + (log.isEmpty() ? "" : "\n" + String.join("\n", log))
                : "")));
    }
}
