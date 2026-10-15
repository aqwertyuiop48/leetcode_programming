import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(k -> Optional.of(s.nextInt()).ifPresent(c ->
            Optional.of(IntStream.generate(s::nextInt).limit(c).boxed().collect(Collectors.toSet())).ifPresent(hol ->
                System.out.println(Optional.of(new int[1]).map(last -> IntStream.rangeClosed(1, n).filter(d -> (hol.contains(d) || d - last[0] == k) && (last[0] = d) > 0).count()).get()))))));
    }
}


