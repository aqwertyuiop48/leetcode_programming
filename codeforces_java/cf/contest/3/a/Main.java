import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new String[]{s.next(), s.next()}).ifPresent(cells ->
            System.out.println(
                new int[]{cells[1].charAt(0) - cells[0].charAt(0), cells[1].charAt(1) - cells[0].charAt(1)} instanceof int[] d
                && new int[]{Math.max(Math.abs(d[0]), Math.abs(d[1]))} instanceof int[] n
                ? n[0] + "\n" + IntStream.range(0, n[0])
                    .mapToObj(t -> (t < Math.abs(d[0]) ? (d[0] > 0 ? "R" : "L") : "") + (t < Math.abs(d[1]) ? (d[1] < 0 ? "D" : "U") : ""))
                    .collect(Collectors.joining("\n"))
                : "")));
    }
}

