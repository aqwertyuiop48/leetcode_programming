import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new TreeMap<String, Integer>() instanceof TreeMap<String, Integer> m
                && s.next() instanceof String me
                && Integer.valueOf(s.nextInt()) instanceof Integer n
                && IntStream.range(0, n).allMatch(i ->
                    s.next() instanceof String x
                    && s.next() instanceof String v
                    && (v.equals("likes") ? "" : s.next()) != null
                    && s.next().replaceAll("'s$", "") instanceof String y
                    && s.next() != null
                    && Integer.valueOf(v.equals("likes") ? 5 : v.equals("commented") ? 10 : 15) instanceof Integer pt
                    && (x.equals(me) ? 0 : m.merge(x, y.equals(me) ? pt : 0, Integer::sum)) >= 0
                    && (y.equals(me) ? 0 : m.merge(y, x.equals(me) ? pt : 0, Integer::sum)) >= 0)
                ? m.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.joining("\n"))
                : ""));
    }
}
