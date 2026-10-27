import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().map(String::trim).filter(l -> !l.isEmpty())
                .map(l -> l.split("[ :]+")).toList() instanceof List<String[]> g
            && g.stream().flatMap(a -> Stream.of(a[0], a[1])).distinct().toList() instanceof List<String> teams
            && teams.stream().filter(t -> !t.equals("BERLAND") && g.stream().filter(a -> a[0].equals(t) || a[1].equals(t)).count() == 2).findFirst().orElse("") instanceof String opp
            && ((BiFunction<Integer, Integer, Boolean>) (d, y) -> Stream.concat(g.stream(), Stream.<String[]>of(new String[]{"BERLAND", opp, String.valueOf(y + d), String.valueOf(y)})).toList() instanceof List<String[]> all
                && ((Function<String, long[]>) t -> new long[]{
                    all.stream().mapToLong(a -> a[0].equals(t) ? Integer.signum(Integer.parseInt(a[2]) - Integer.parseInt(a[3])) + 1 == 2 ? 3 : Integer.parseInt(a[2]) == Integer.parseInt(a[3]) ? 1 : 0
                        : a[1].equals(t) ? Integer.parseInt(a[3]) > Integer.parseInt(a[2]) ? 3 : Integer.parseInt(a[2]) == Integer.parseInt(a[3]) ? 1 : 0 : 0).sum(),
                    all.stream().mapToLong(a -> a[0].equals(t) ? Integer.parseInt(a[2]) - Integer.parseInt(a[3]) : a[1].equals(t) ? Integer.parseInt(a[3]) - Integer.parseInt(a[2]) : 0).sum(),
                    all.stream().mapToLong(a -> a[0].equals(t) ? Integer.parseInt(a[2]) : a[1].equals(t) ? Integer.parseInt(a[3]) : 0).sum()}) instanceof Function<String, long[]> st
                && teams.stream().sorted(Comparator.<String>comparingLong(t -> -st.apply(t)[0]).thenComparingLong(t -> -st.apply(t)[1]).thenComparingLong(t -> -st.apply(t)[2]).thenComparing(Comparator.naturalOrder())).toList().indexOf("BERLAND") < 2) instanceof BiFunction<Integer, Integer, Boolean> ok
            ? IntStream.rangeClosed(1, 60).boxed().flatMap(d -> IntStream.rangeClosed(0, 60).boxed().filter(y -> ok.apply(d, y)).map(y -> (y + d) + ":" + y)).findFirst().orElse("IMPOSSIBLE")
            : "");
    }
}

