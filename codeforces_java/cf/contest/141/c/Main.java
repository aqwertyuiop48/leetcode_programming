import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Optional.of(s.nextInt()).map(n ->
                    IntStream.range(0, n).mapToObj(i -> new Object[]{s.next(), s.nextInt()})
                        .sorted(Comparator.comparingInt(o -> (Integer) o[1]))
                        .toList()).map(P ->
                    IntStream.range(0, P.size()).anyMatch(i -> (Integer) P.get(i)[1] > i)
                        ? "-1"
                        : new ArrayList<Integer>() instanceof ArrayList<Integer> O
                            && IntStream.range(0, P.size()).allMatch(i -> O.addAll(i - (Integer) P.get(i)[1], List.of(i)))
                            ? IntStream.range(0, P.size()).mapToObj(i -> P.get(i)[0] + " " + (O.indexOf(i) + 1)).collect(Collectors.joining("\n"))
                            : "").get()));
    }
}

