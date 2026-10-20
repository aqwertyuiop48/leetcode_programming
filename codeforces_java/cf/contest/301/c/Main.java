import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Stream.of(
            IntStream.range(0, 10).mapToObj(d -> "??" + d + ">>" + d + "??"),
            Stream.of("??>>?"),
            IntStream.range(0, 9).mapToObj(d -> d + "?<>" + (d + 1)),
            Stream.of("9?>>?0", "?<>1", ">>??")).flatMap(s -> s).collect(Collectors.joining("\n")));
    }
}
