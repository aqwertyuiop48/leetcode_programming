import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(Stream.generate(() -> new Object[]{s.next(), s.nextInt()}).limit(n).collect(Collectors.toMap(o -> (String) o[0], o -> (Integer) o[1], (x, y) -> Math.min(x, y)))).ifPresent(map -> System.out.print(Stream.generate(s::next).limit(s.nextInt()).min(Comparator.comparingInt((String w) -> map.getOrDefault(w, 0)).thenComparing(Comparator.naturalOrder())).get()))));
    }
}



