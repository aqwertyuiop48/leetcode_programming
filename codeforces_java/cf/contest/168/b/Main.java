import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().reduce(new ArrayList<String>(), (acc, l) ->
                (l.stripLeading().startsWith("#") ? acc.add("A" + l)
                    : !acc.isEmpty() && acc.getLast().startsWith("C") ? acc.set(acc.size() - 1, acc.getLast() + l.replace(" ", "")) != null
                    : acc.add("C" + l.replace(" ", ""))) | true ? acc : acc,
                (x, y) -> x).stream().filter(g -> !g.equals("C")).map(g -> g.substring(1)).collect(Collectors.joining("\n")));
    }
}
