import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                Stream.generate(s::next).limit(3L * n - 1).filter(x -> !x.equals("**")).toList() instanceof List<String> t
                ? IntStream.range(0, n).mapToObj(i -> t.get(2 * i) + t.get(2 * i + 1))
                    .map(x -> "" + x.charAt(0) + x.charAt(1) + x.charAt(3) + x.charAt(2))
                    .map(q -> IntStream.range(0, 4).mapToObj(i -> (q + q).substring(i, i + 4)).min(Comparator.naturalOrder()).get())
                    .distinct().count()
                : 0L)));
    }
}



