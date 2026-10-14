import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new TreeMap<Integer, TreeSet<Integer>>() instanceof TreeMap<Integer, TreeSet<Integer>> m
                ? IntStream.range(0, s.nextInt())
                    .mapToObj(i -> new String[]{s.next(), s.next(), s.next()})
                    .map(r -> r[0].equals("add")
                        ? (m.computeIfAbsent(Integer.parseInt(r[1]), k -> new TreeSet<>()).add(Integer.parseInt(r[2])) ? "" : "")
                        : r[0].equals("remove")
                        ? (m.get(Integer.parseInt(r[1])).remove(Integer.parseInt(r[2])) ? "" : "")
                        : m.tailMap(Integer.parseInt(r[1]), false).entrySet().stream()
                            .filter(e -> !e.getValue().isEmpty() && e.getValue().last() > Integer.parseInt(r[2]))
                            .findFirst()
                            .map(e -> e.getKey() + " " + e.getValue().higher(Integer.parseInt(r[2])))
                            .orElse("-1"))
                    .filter(r -> !r.isEmpty())
                    .collect(Collectors.joining("\n"))
                : ""));
    }
}
