import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> w
                && s.next() instanceof String sep
                && Integer.valueOf(w.stream().mapToInt(String::length).sum() / (n / 2)) instanceof Integer len
                && new boolean[n] instanceof boolean[] used
                ? IntStream.range(0, n).filter(i -> !used[i] && (used[i] = true))
                    .mapToObj(i -> Integer.valueOf(IntStream.range(i + 1, n).filter(q -> !used[q] && w.get(i).length() + w.get(q).length() == len).findFirst().getAsInt()) instanceof Integer j
                        && (used[j] = true)
                        ? (w.get(i) + sep + w.get(j)).compareTo(w.get(j) + sep + w.get(i)) <= 0 ? w.get(i) + sep + w.get(j) : w.get(j) + sep + w.get(i)
                        : "")
                    .collect(Collectors.joining("\n"))
                : "")));
    }
}




