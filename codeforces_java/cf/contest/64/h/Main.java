import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new String[]{sc.next(), sc.next()}).sorted(Comparator.<String[]>comparingInt(p -> -Integer.parseInt(p[1])).thenComparing(p -> p[0])).toList() instanceof List<String[]> l
                ? l.stream().map(p -> Integer.valueOf(1 + (int) l.stream().filter(q -> Integer.parseInt(q[1]) > Integer.parseInt(p[1])).count()) instanceof Integer st
                    && Integer.valueOf(st + (int) l.stream().filter(q -> q[1].equals(p[1])).count() - 1) instanceof Integer en
                    ? (st.equals(en) ? "" + st : st + "-" + en) + " " + p[0] : "").collect(Collectors.joining("\n"))
                : "")));
    }
}

