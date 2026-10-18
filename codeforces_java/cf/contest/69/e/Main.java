import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.nextInt()).ifPresent(k ->
            Optional.of(IntStream.generate(s::nextInt).limit(n).toArray()).ifPresent(a ->
            Optional.of(new HashMap<Integer, Integer>()).ifPresent(cnt ->
            Optional.of(new TreeSet<Integer>()).ifPresent(set ->
                System.out.print(IntStream.range(0, n).mapToObj(i ->
                    ((cnt.merge(a[i], 1, Integer::sum) == 1 ? set.add(a[i]) : set.remove(a[i])) & (i < k || (cnt.merge(a[i - k], -1, Integer::sum) == 1 ? set.add(a[i - k]) : set.remove(a[i - k]))) | true)
                    ? (i >= k - 1 ? (set.isEmpty() ? "Nothing" : String.valueOf(set.last())) : null) : null).filter(Objects::nonNull).collect(Collectors.joining("\n")))))))));
    }
}




