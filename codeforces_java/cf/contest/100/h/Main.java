import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.print(IntStream.range(0, s.nextInt()).mapToObj(i -> Stream.generate(s::next).limit(10).toArray(String[]::new)).map(g -> Optional.<BiPredicate<Integer, Integer>>of((r, c) -> r >= 0 && r < 10 && c >= 0 && c < 10 && g[r].charAt(c) == '*').map(q -> Optional.of(IntStream.range(0, 100).filter(x -> q.test(x / 10, x % 10)).boxed().toList()).map(cs -> cs.stream().noneMatch(x -> q.test(x / 10 + 1, x % 10 + 1) || q.test(x / 10 + 1, x % 10 - 1) || ((q.test(x / 10, x % 10 + 1) || q.test(x / 10, x % 10 - 1)) && (q.test(x / 10 + 1, x % 10) || q.test(x / 10 - 1, x % 10)))) && cs.stream().filter(x -> !q.test(x / 10, x % 10 - 1) && !q.test(x / 10 - 1, x % 10)).map(x -> Math.max((int) IntStream.rangeClosed(x % 10, 9).takeWhile(c -> q.test(x / 10, c)).count(), (int) IntStream.rangeClosed(x / 10, 9).takeWhile(r -> q.test(r, x % 10)).count())).sorted().toList().equals(List.of(1, 1, 1, 1, 2, 2, 2, 3, 3, 4)) ? "YES" : "NO").get()).get()).collect(Collectors.joining("\n"))));
    }
}





