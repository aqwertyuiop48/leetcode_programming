import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).map(String::trim).toList()).ifPresent(ls ->
            System.out.println(
                Arrays.asList(ls.get(0).split(" +")) instanceof List<String> names
                && Arrays.stream(ls.get(1).split(", *")).map(r -> r.trim().split(" +")).toList() instanceof List<String[]> rules
                ? ls.stream().skip(2).map(l -> l.split(" +")).sorted((x, y) -> rules.stream().mapToInt(r -> (r[1].equals("ASC") ? 1 : -1) * x[names.indexOf(r[0])].compareTo(y[names.indexOf(r[0])])).filter(c -> c != 0).findFirst().orElse(0))
                    .map(r -> String.join(" ", r)).collect(Collectors.joining("\n"))
                : ""));
    }
}
