import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextLong(), s.nextLong()}).ifPresent(nm ->
            Optional.of(new boolean[(int) nm[0] * 2 + 2]).ifPresent(seen ->
                Optional.of(IntStream.rangeClosed(1, (int) nm[0]).mapToLong(b ->
                    Math.min(nm[1], (long) b * b) - IntStream.range(0, b).filter(t -> (long) b * b - (long) t * t <= nm[1])
                        .filter(t -> (seen[b + t] = true) && (seen[b - t] = true)).count()).sum()).ifPresent(irr ->
                    System.out.println(2 * irr + IntStream.range(0, seen.length).filter(i -> seen[i]).count())))));
    }
}



