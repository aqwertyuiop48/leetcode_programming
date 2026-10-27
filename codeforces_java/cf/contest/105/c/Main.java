import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).mapToObj(i -> new Object[] {s.next(), List.of("weapon", "armor", "orb").indexOf(s.next()), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).toArray(Object[][]::new) instanceof Object[][] it && IntStream.range(0, n).boxed().collect(Collectors.toMap(i -> (String) it[i][0], i -> i)) instanceof Map<String, Integer> ix && (Integer) s.nextInt() instanceof Integer k && IntStream.range(0, k).mapToObj(r -> new Object[] {s.next(), List.of("gladiator", "sentry", "physician").indexOf(s.next()), s.nextInt(), ix.get(s.next())}).toArray(Object[][]::new) instanceof Object[][] rs && (Boolean) (IntStream.range(0, n).map(i -> (int) it[i][5]).sum() > k) instanceof Boolean fr && IntStream.range(0, 3).mapToObj(c -> IntStream.range(0, k).filter(r -> (int) rs[r][1] == c).boxed().sorted(Comparator.comparingInt(r -> -(int) rs[r][2])).collect(Collectors.toList()) instanceof List<Integer> cs && (Integer) IntStream.range(0, n).filter(i -> (int) it[i][1] == c).boxed().max(Comparator.comparingInt(i -> (int) it[i][2 + c] + (fr ? cs.stream().limit((int) it[i][5]) : IntStream.range(0, k).filter(r -> (int) rs[r][3] == i && (int) rs[r][1] == c).boxed()).mapToInt(r -> (int) rs[r][2]).sum())).get() instanceof Integer bi ? Map.entry(bi, fr ? cs.stream().limit((int) it[bi][5]).collect(Collectors.toList()) : IntStream.range(0, k).filter(r -> (int) rs[r][3] == bi).boxed().collect(Collectors.toList())) : Map.entry(-1, List.<Integer>of())).collect(Collectors.toList()) instanceof List<Map.Entry<Integer, List<Integer>>> tp && tp.stream().flatMap(e -> e.getValue().stream()).collect(Collectors.toSet()) instanceof java.util.Set<Integer> used && IntStream.range(0, k).filter(r -> !used.contains(r)).iterator() instanceof java.util.PrimitiveIterator.OfInt pi ? tp.stream().map(e -> Stream.concat(e.getValue().stream(), fr ? IntStream.range(0, (int) it[e.getKey()][5] - e.getValue().size()).filter(j -> pi.hasNext()).mapToObj(j -> pi.nextInt()) : Stream.<Integer>empty()).collect(Collectors.toList()) instanceof List<Integer> all ? it[e.getKey()][0] + " " + all.size() + all.stream().map(r -> " " + rs[r][0]).collect(Collectors.joining()) : "").collect(Collectors.joining("\n")) : "").ifPresent(System.out::println);
    }
}

