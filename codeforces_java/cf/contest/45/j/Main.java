import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.println(
            (Math.min(a[0], a[1]) == 1 && (a[0] * a[1] == 2 || a[0] * a[1] == 3)) || (a[0] == 2 && a[1] == 2) ? "-1"
            : IntStream.range(0, a[0]).mapToObj(i -> IntStream.range(0, a[1]).mapToObj(j -> "" + (Math.min(a[0], a[1]) == 1
                ? (a[0] * a[1] == 4 ? new int[]{3, 1, 4, 2}[i * a[1] + j] : i * a[1] + j < (a[0] * a[1] + 1) / 2 ? 2 * (i * a[1] + j) + 1 : 2 * (i * a[1] + j - (a[0] * a[1] + 1) / 2) + 2)
                : (i + j) % 2 == 0 ? (a[0] * a[1] + 1) / 2 - ((i / 2) * a[1] + (i % 2) * ((a[1] + 1) / 2) + (j + 1 - i % 2) / 2)
                : a[0] * a[1] - (i * a[1] + j - ((i / 2) * a[1] + (i % 2) * ((a[1] + 1) / 2) + (j + 1 - i % 2) / 2)))).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")))));
    }
}


