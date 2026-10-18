import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(4).toArray()).ifPresent(a -> System.out.print(Math.abs(a[2] - a[3]) > 1 ? "-1" : a[2] == a[3] ? (a[0] > a[2] && a[1] >= a[2] ? "4".repeat(a[0] - a[2]) + "74".repeat(a[2] - 1) + "7".repeat(a[1] - a[2] + 1) + "4" : a[0] >= a[2] && a[1] > a[2] ? "7" + "4".repeat(a[0] - a[2] + 1) + "74".repeat(a[2] - 1) + "7".repeat(a[1] - a[2]) : "-1") : a[2] == a[3] + 1 ? (a[0] >= a[2] && a[1] >= a[2] ? "4".repeat(a[0] - a[2] + 1) + "74".repeat(a[2] - 1) + "7".repeat(a[1] - a[2] + 1) : "-1") : (a[0] >= a[3] && a[1] >= a[3] ? "7" + "4".repeat(a[0] - a[3] + 1) + "74".repeat(a[3] - 2) + "7".repeat(a[1] - a[3] + 1) + "4" : "-1"))));
    }
}
