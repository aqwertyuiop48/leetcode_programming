import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.nextInt()).ifPresent(m ->
            Optional.of(IntStream.range(0, n * m).mapToObj(i -> s.next()).toArray(String[]::new)).ifPresent(t ->
            Optional.of(Arrays.stream(t).filter(x -> x.charAt(0) == 'J' && x.charAt(1) < 'A').toList()).ifPresent(jk ->
            Optional.of(Stream.of("23456789TJQKA".split("")).flatMap(r -> Stream.of("CDHS".split("")).map(u -> r + u)).filter(c -> !Arrays.asList(t).contains(c)).toList()).ifPresent(un ->
            Optional.of(jk.size() == 0 ? List.<String[]>of(new String[0]) : jk.size() == 1 ? un.stream().map(c -> new String[]{c}).toList() : un.stream().flatMap(c -> un.stream().filter(d -> !d.equals(c)).map(d -> new String[]{c, d})).toList()).ifPresent(reps ->
                System.out.print(reps.stream().map(rep -> Optional.of(Arrays.stream(t).map(x -> x.equals("J1") ? rep[0] : x.equals("J2") ? rep[jk.size() - 1] : x).toArray(String[]::new)).map(g ->
                    IntStream.range(0, (n - 2) * (m - 2) > 0 ? (n - 2) * (m - 2) : 0).map(p -> (p / (m - 2)) * 100 + p % (m - 2)).filter(p -> IntStream.range(0, 9).mapToObj(i -> g[(p / 100 + i / 3) * m + p % 100 + i % 3]).map(x -> x.substring(1)).distinct().count() == 1 || IntStream.range(0, 9).mapToObj(i -> g[(p / 100 + i / 3) * m + p % 100 + i % 3]).map(x -> x.substring(0, 1)).distinct().count() == 9).toArray())
                    .flatMap(pos -> IntStream.range(0, pos.length).boxed().flatMap(i -> IntStream.range(i + 1, pos.length).filter(j -> Math.abs(pos[i] / 100 - pos[j] / 100) >= 3 || Math.abs(pos[i] % 100 - pos[j] % 100) >= 3).mapToObj(j -> new int[]{pos[i], pos[j]})).findFirst())
                    .map(q -> "Solution exists.\n" + (jk.size() == 0 ? "There are no jokers." : jk.size() == 1 ? "Replace " + jk.get(0) + " with " + rep[0] + "." : "Replace J1 with " + rep[0] + " and J2 with " + rep[1] + ".")
                        + "\nPut the first square to (" + (q[0] / 100 + 1) + ", " + (q[0] % 100 + 1) + ").\nPut the second square to (" + (q[1] / 100 + 1) + ", " + (q[1] % 100 + 1) + ").").orElse(null)).filter(Objects::nonNull).findFirst().orElse("No solution.")))))))));
    }
}

