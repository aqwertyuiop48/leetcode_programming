import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new HashMap<String, int[]>() instanceof HashMap<String, int[]> cnt
                ? IntStream.range(0, n).mapToObj(i -> s.next())
                    .map(name -> cnt.computeIfAbsent(name, k -> new int[]{0}) instanceof int[] c
                        && new int[]{c[0]} instanceof int[] old
                        && (c[0] += 1) == c[0]
                        ? (old[0] == 0 ? "OK" : name + old[0])
                        : "")
                    .collect(Collectors.joining("\n"))
                : "")));
    }
}





