import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Long) Math.round(Double.parseDouble(s.next()) * 100) instanceof Long kk && IntStream.range(0, n).mapToObj(i -> new Object[] {s.next(), s.nextLong() * kk / 100}).filter(o -> (Long) o[1] >= 100).collect(Collectors.toMap(o -> (String) o[0], o -> (Long) o[1], (x, y) -> x, TreeMap<String, Long>::new)) instanceof TreeMap<String, Long> t && IntStream.range(0, m).mapToObj(i -> s.next()).allMatch(x -> t.putIfAbsent(x, 0L) == null || true) ? t.size() + "\n" + t.entrySet().stream().map(e -> e.getKey() + " " + e.getValue()).collect(Collectors.joining("\n")) : "").ifPresent(System.out::println);
    }
}

