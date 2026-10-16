import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                sc.next().trim().split("@", -1) instanceof String[] p
                && p.length >= 2 && !p[0].isEmpty() && !p[p.length - 1].isEmpty()
                && IntStream.range(1, p.length - 1).allMatch(i -> p[i].length() >= 2)
                ? IntStream.range(0, p.length).mapToObj(i -> i == 0 ? p[0] + "@" : i == p.length - 1 ? p[i] : p[i].charAt(0) + "," + p[i].substring(1) + "@")
                    .collect(Collectors.joining())
                : "No solution"));
    }
}




