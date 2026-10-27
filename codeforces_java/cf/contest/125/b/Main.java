import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in).next().split("(?<=>)") instanceof String[] t
            ? IntStream.range(0, t.length)
                .mapToObj(i -> " ".repeat(2 * (IntStream.range(0, i).map(j -> t[j].charAt(1) == '/' ? -1 : 1).sum() - (t[i].charAt(1) == '/' ? 1 : 0))) + t[i])
                .collect(Collectors.joining("\n"))
            : "");
    }
}

