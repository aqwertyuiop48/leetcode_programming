import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(LongStream.range(0, 2L * n).map(i -> s.nextLong()).toArray()).ifPresent(arr ->
                Optional.of(new HashMap<Long, List<Long>>()).ifPresent(adj ->
                    Optional.of(IntStream.range(0, n).allMatch(i ->
                        adj.computeIfAbsent(arr[2 * i], k -> new ArrayList<Long>()).add(arr[2 * i + 1])
                        && adj.computeIfAbsent(arr[2 * i + 1], k -> new ArrayList<Long>()).add(arr[2 * i])))
                    .ifPresent(ignored ->
                        Optional.of(adj.entrySet().stream().filter(e -> e.getValue().size() == 1).map(Map.Entry::getKey).max(Long::compare).get())
                        .ifPresent(start ->
                            System.out.println(
                                Stream.iterate(new long[]{start, -1L}, st -> st != null, st ->
                                    adj.get(st[0]).stream().filter(w -> !w.equals(st[1])).findFirst().map(w -> new long[]{w, st[0]}).orElse(null))
                                .map(st -> String.valueOf(st[0]))
                                .collect(Collectors.joining(" ")))))))));
    }
}



