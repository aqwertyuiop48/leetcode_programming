import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            Optional.of(s.next().charAt(0)).ifPresent(prez ->
                System.out.println(
                    IntStream.range(0, nm[0]).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] grid
                    && IntStream.range(0, nm[0] * nm[1])
                        .filter(idx -> grid[idx / nm[1]].charAt(idx % nm[1]) == prez)
                        .boxed().flatMap(idx -> Stream.of(idx - nm[1], idx + nm[1], idx - 1, idx + 1)
                            .filter(n2 -> n2 >= 0 && n2 < nm[0] * nm[1])
                            .filter(n2 -> !(idx % nm[1] == 0 && n2 == idx - 1) && !(idx % nm[1] == nm[1] - 1 && n2 == idx + 1))
                            .map(n2 -> grid[n2 / nm[1]].charAt(n2 % nm[1])))
                        .filter(c -> c != '.' && c != prez)
                        .collect(Collectors.toSet()) instanceof Set<Character> distinctSet
                    ? distinctSet.size()
                    : 0))));
    }
}





