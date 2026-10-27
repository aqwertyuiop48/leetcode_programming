import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Stream.generate(() -> Integer.valueOf(s.nextInt()) instanceof Integer k && s.next() instanceof String name
                ? new Object[]{name, Stream.generate(() -> s.next().replace("-", "")).limit(k).map(d ->
                    d.chars().distinct().count() == 1 ? 0
                    : IntStream.range(1, 6).allMatch(i -> d.charAt(i - 1) > d.charAt(i)) ? 1 : 2)
                    .collect(() -> new int[3], (c, t) -> c[t]++, (x, y) -> { }) }
                : null).limit(n).toList() instanceof List<Object[]> p
            ? IntStream.range(0, 3).mapToObj(t -> new String[]{"call a taxi", "order a pizza", "go to a cafe with a wonderful girl"}[t]
                + ", you should call: " + p.stream().filter(f -> ((int[]) f[1])[t] == p.stream().mapToInt(g -> ((int[]) g[1])[t]).max().getAsInt())
                    .map(f -> (String) f[0]).collect(Collectors.joining(", ")) + ".")
                .map(l -> "If you want to " + l).collect(Collectors.joining("\n"))
            : "");
    }
}

