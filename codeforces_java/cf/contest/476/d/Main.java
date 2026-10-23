import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer n
            && (Integer) sc.nextInt() instanceof Integer k
            ? k * (6 * n - 1) + "\n" + IntStream.range(0, n).mapToObj(i ->
                k * (6 * i + 1) + " " + k * (6 * i + 2) + " " + k * (6 * i + 3) + " " + k * (6 * i + 5)).collect(Collectors.joining("\n"))
            : "");
    }
}
