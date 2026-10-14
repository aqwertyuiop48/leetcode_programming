import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                IntStream.range(0, nm[0]).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
                && IntStream.range(0, nm[0]).boxed().flatMap(r -> IntStream.range(0, nm[1]).filter(c -> g[r].charAt(c) == '*').mapToObj(c -> new int[]{r, c}))
                    .collect(Collectors.toList()) instanceof List<int[]> stars
                && new int[]{
                    stars.stream().mapToInt(p -> p[0]).min().orElse(0),
                    stars.stream().mapToInt(p -> p[0]).max().orElse(-1),
                    stars.stream().mapToInt(p -> p[1]).min().orElse(0),
                    stars.stream().mapToInt(p -> p[1]).max().orElse(-1)
                } instanceof int[] bb
                ? IntStream.rangeClosed(bb[0], bb[1]).mapToObj(r -> g[r].substring(bb[2], bb[3] + 1)).collect(Collectors.joining("\n"))
                : "")));
    }
}
