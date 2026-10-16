import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
                System.out.print(IntStream.range(0, n).mapToObj(i -> s.next()).map(w -> w.length() > 10 ? w.charAt(0) + String.valueOf(w.length() - 2) + w.charAt(w.length() - 1) : w).collect(Collectors.joining("\n")))));
    }
}



