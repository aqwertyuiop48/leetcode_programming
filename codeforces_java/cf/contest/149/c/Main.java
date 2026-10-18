import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(IntStream.generate(s::nextInt).limit(n).toArray()).ifPresent(a -> Optional.of(IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> a[i])).toList()).ifPresent(o -> System.out.print(IntStream.of(0, 1).mapToObj(par -> IntStream.range(0, n).filter(i -> i % 2 == par).mapToObj(i -> String.valueOf(o.get(i) + 1)).collect(Collectors.toList())).map(l -> l.size() + "\n" + String.join(" ", l)).collect(Collectors.joining("\n")))))));
    }
}
