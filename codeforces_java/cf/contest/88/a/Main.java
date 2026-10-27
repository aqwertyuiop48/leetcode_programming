import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Arrays.asList("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "B", "H") instanceof List<String> nt
            && Stream.of(s.next(), s.next(), s.next()).mapToInt(nt::indexOf).toArray() instanceof int[] c
            && Arrays.stream(new int[][]{{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}})
                .map(q -> ((c[q[1]] - c[q[0]] + 12) % 12) * 100 + (c[q[2]] - c[q[1]] + 12) % 12).toList() instanceof List<Integer> ds
            ? ds.contains(403) ? "major" : ds.contains(304) ? "minor" : "strange"
            : ""));
    }
}





