import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Double) s.nextDouble() instanceof Double x
            ? IntStream.range(0, 100).filter(i -> Math.abs((i / 10 + 1) * (i % 10 + 1) / Math.sqrt((i / 10 + 1) * (i / 10 + 1) + 4.0 * (i % 10 + 1) * (i % 10 + 1)) - x) < 1e-6).mapToObj(i -> (i / 10 + 1) + " " + (i % 10 + 1)).findFirst().orElse("1 1") : "");
    }
}
