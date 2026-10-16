import java.util.*;  
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(Integer.parseInt(s.nextLine().trim())).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> s.nextLine().trim().split("\\s+")).collect(Collectors.toList()) instanceof List<String[]> events
                && events.stream().collect(Collectors.groupingBy(e -> e[0], Collectors.summingLong(e -> Long.parseLong(e[1])))) instanceof Map<String, Long> totals
                && new long[]{totals.values().stream().mapToLong(Long::longValue).max().getAsLong()} instanceof long[] maxArr
                && totals.entrySet().stream().filter(e -> e.getValue() == maxArr[0]).map(Map.Entry::getKey).collect(Collectors.toSet()) instanceof Set<String> cands
                ? cands.stream().map(name ->
                    Map.entry(
                        new long[]{0} instanceof long[] acc
                            ? IntStream.range(0, n).filter(i -> events.get(i)[0].equals(name))
                                .peek(i -> acc[0] += Long.parseLong(events.get(i)[1]))
                                .filter(i -> acc[0] >= maxArr[0])
                                .findFirst().getAsInt()
                            : -1,
                        name))
                    .min(Comparator.comparingInt(Map.Entry::getKey)).get().getValue()
                : "")));
    }
}




