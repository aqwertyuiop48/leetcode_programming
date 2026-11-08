import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Arrays.stream(t, 1, n + 1).collect(Collectors.groupingBy(u -> u.indexOf('/', 7) < 0 ? u : u.substring(0, u.indexOf('/', 7)),
                Collectors.mapping(u -> u.indexOf('/', 7) < 0 ? "" : u.substring(u.indexOf('/', 7)), Collectors.toSet()))) instanceof Map<String, Set<String>> m
            && m.entrySet().stream().collect(Collectors.groupingBy(e -> e.getValue(), Collectors.mapping(e -> e.getKey(), Collectors.toList()))).values().stream().filter(l -> l.size() > 1).toList() instanceof List<List<String>> g
            ? g.size() + (g.isEmpty() ? "" : "\n" + g.stream().map(l -> String.join(" ", l)).collect(Collectors.joining("\n"))) : "");
    }
}
