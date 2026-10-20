import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer k && Long.valueOf(2L * k * k) instanceof Long lim && new ArrayList<Long>(List.of(1L)) instanceof ArrayList<Long> work
            && IntStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47).allMatch(p -> work.size() >= k
                || work.stream().flatMap(x -> LongStream.iterate(x, y -> y <= lim, y -> y * p).boxed()).toList() instanceof List<Long> nl && work.removeIf(x -> true) && work.addAll(nl))
            ? work.stream().sorted(Comparator.reverseOrder()).limit(k).sorted().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
