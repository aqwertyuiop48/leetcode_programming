import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && s.next() instanceof String w
            && IntStream.range(0, 10).mapToObj(i -> s.next()).toList() instanceof List<String> d
            ? IntStream.range(0, 8)
                .mapToObj(i -> String.valueOf(d.indexOf(w.substring(i * 10, i * 10 + 10))))
                .collect(Collectors.joining())
            : "");
    }
}

