import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt()}).ifPresent(v -> System.out.print(
            v[1] == 0 ? (v[0] == 1 ? "0 0" : "-1 -1")
            : v[1] > 9 * v[0] ? "-1 -1"
            : (v[1] - Math.min(9 * (v[0] - 1), v[1] - 1))
                + IntStream.range(1, v[0]).mapToObj(p -> "" + Math.max(0, Math.min(9, v[1] - 1 - 9 * (v[0] - 1 - p)))).collect(Collectors.joining())
                + " "
                + IntStream.range(0, v[0]).mapToObj(i -> "" + Math.max(0, Math.min(9, v[1] - 9 * i))).collect(Collectors.joining()))));
    }
}
